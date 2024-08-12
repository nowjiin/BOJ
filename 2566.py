import sys

# 9행 9열 2차원 배열 생성
matrix = []
for i in range(9):
    # 배열에 값 입력
    row = list(map(int, sys.stdin.readline().split()))
    matrix.append(row)

# 100개의 숫자 중 최대값을 찾고
# 최대 값의 행 번호와 열 번호를 빈칸사이에 차례로 출력
max_val = -sys.maxsize - 1  # 가능한 가장 작은 값으로 초기화
max_row = 0
max_col = 0

for i in range(9):
    for j in range(9):
        # max를 가장 작은 수로 설정 후 배열 모든 칸 돌며 비교
        if matrix[i][j] >= max_val:
            max_val = matrix[i][j]
            max_row = i + 1
            max_col = j + 1

print(max_val)
print(max_row, max_col)
