N, B = map(int, input().split())

result = []

while N > 0:
    remainder = N % B
    if remainder >= 10:
        result.append(chr(remainder - 10 + ord('A')))
    else:
        result.append(str(remainder))
    N //= B

print(''.join(result[::-1]))
