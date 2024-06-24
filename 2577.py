A = int(input())
B = int(input())
C = int(input())
             
sum = str(A*B*C)
count = [0] * 10

for i in sum:
  count[int(i)] += 1

for i in range(10):
  print(count[i])
