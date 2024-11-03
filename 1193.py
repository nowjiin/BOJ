# 분수 찾기

"""
1. X가 있는 대각선의 시작 위치 찾기
2. n번째 대각선에서 X번째 분수의 위치
"""
X = int(input())

# 1. X가 있는 대각선의 시작 위치 찾기
n = 1
while (n*(n+1)) // 2 < X :
    n+=1

# n번째 대각선에서 X번째 분수의 위치
position = X - ( n * (n-1) ) // 2

# 홀수 대각선, 짝수 대각선에 따른 분자, 분모 계산
if n%2 == 1:
    numerator = n - position + 1
    denominator = position
else:
    numerator = position
    denominator = n - position + 1

print(f"{numerator}/{denominator}")
