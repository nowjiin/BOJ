N, M = map(str, input().split())

N = N[::-1]
M = M[::-1]

print(max(int(N), int(M)))
