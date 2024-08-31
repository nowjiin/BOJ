n, m = map(int, input().split())

A = []
for _ in range(n):
    row = list(map(int, input().split()))
    A.append(row)

B = []
for _ in range(n):
    row = list(map(int, input().split()))
    B.append(row)

result = []
for i in range(n):
    result_row = []
    for j in range(m):
        result_row.append(A[i][j] + B[i][j])
    result.append(result_row)

for row in result:
    print(' '.join(map(str, row)))
