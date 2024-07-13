import sys
input = sys.stdin.read
data = input().split()

N = data[0]
B = int(data[1])

decimal_value = 0
power = 1

for char in reversed(N):
    if '0' <= char <= '9':
        value = ord(char) - ord('0')
    else:
        value = ord(char) - ord('A') + 10
    decimal_value += value * power
    power *= B

print(decimal_value)
