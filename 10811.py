import sys
input = sys.stdin.readline

N, M = map(int, input().split())

baskets = list(range(1, N+1))

for _ in range(M):
    i, j = map(int, input().split())
    # i-1부터 j까지의 부분을 역순으로 바꾸기
    baskets[i-1:j] = baskets[i-1:j][::-1]

for i in baskets:
  print(i)
