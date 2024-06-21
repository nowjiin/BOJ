n = int(input())

for i in range(n):
  for _ in range(n-1, i, -1):
   print(" ", end="")
  for _ in range(i+1):
    print("*", end="")
  print("")
