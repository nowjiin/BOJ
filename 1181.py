n = int(input())
ary = [input() for _ in range(n)]
ary = list(set(ary))
ary.sort()
ary.sort(key=len)

for i in ary:
  print(i)
