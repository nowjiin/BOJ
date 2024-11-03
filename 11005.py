# 진법 변환2
"""
10진법 수 N을 B진법으로 출력
"""

N, B = map(int, input().split())

answer = ""
digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

while N>0:
    remainder = N % B
    answer = digits[remainder] + answer
    N //= B

print(answer)

