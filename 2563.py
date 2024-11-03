# 색종이
"""
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
"""

numbers = int(input())

skatch_book = [[0] * 100 for _ in range(100)]

count = 0

for i in range(numbers):
    x, y = map(int, input().split())
    for x1 in range(x, x+10):
        for y1 in range(y, y+10):
            skatch_book[x1][y1] = 1

for n in range(100):
        for m in range(100):
            if skatch_book[n][m] == 1:
                count += 1

print(count)
