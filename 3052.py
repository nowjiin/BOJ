num = []
for _ in range(10):
  N = int(input())
  num.append(N%42)

print(len(set(num)))
