T = int(input())

for _ in range(T):
  R, S = input().split(" ")
  R = int(R)
  result = ""
  for i in range(len(S)):
    result += S[i] * R
  print(result)
