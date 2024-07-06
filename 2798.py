import sys
from itertools import combinations

input = sys.stdin.readline

# 입력 받기
n, m = map(int, input().strip().split())
cards = list(map(int, input().strip().split()))

answer = 0

# 모든 3장의 조합을 확인
for combo in combinations(cards, 3):
    temp = sum(combo)
    if temp <= m and temp > answer:
        answer = temp

# 결과 출력
print(answer)
