N = int(input())
count = 0
sum = 0
for _ in range(N):
  num = str(input())
  sum = 0
  count = 0
  for i in num:
    if i == 'O':
      count += 1
      sum += count
    elif i == 'X':
      count = 0
  print(sum)
