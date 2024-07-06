import sys

input = sys.stdin.read

# 입력
data = input().split()
a = int(data[0])
b = int(data[1])

print(a * (b % 10))
print(a * ((b // 10) % 10))
print(a * (b // 100))
print(a * b)
