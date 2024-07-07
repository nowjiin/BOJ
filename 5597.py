import sys
input = sys.stdin.readline
ary = [0] * 31
for _ in range(28):
  num = int(input().strip())
  ary[num] += 1

for i in range(1,31):
  if ary[i] == 0:
    print(i)
