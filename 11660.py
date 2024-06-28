import sys
input = sys.stdin.readline

n, m = map(int, input().split(" "))

# 0행 없다 생각 하고 1행부터 시작
ary = [[0] * (n + 1)]
D = [[0] * (n + 1) for _ in range(n + 1)]
for i in range(n):
    row = [0] + [int(x) for x in input().split(" ")]
    ary.append(row)

for i in range(1, n+1):
    for j in range(1, n+1):
        # 부분 합 배열 계산
        D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + ary[i][j]

for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split(" "))
    # 구간합 구하기
    result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
    print(result)
