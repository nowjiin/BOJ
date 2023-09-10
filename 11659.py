import sys
input = sys.stdin.readline
# sys.stdin.readline 과 input()의 차이
# input은 prompt message를 받을 수 있기 때문에 message를 출력하고 입력받음
# 받은 input에서 '\n' 개행문자를 제거하고 값을 return 함
# sys.stdin.readline은 \n을 제거 안하고 그대로 반환하기 때문에 더 빠르다.
a, b = map(int, input().split())
ary = list(map(int, input().split()))

sum = [0]
temp = 0

for i in ary:
	temp = temp + i
	sum.append(temp)
for i in range(b):
	x,y = map(int, input().split())
	print(sum[y] - sum[x-1])
