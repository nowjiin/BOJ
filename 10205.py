T = int(input())
for _ in range(T):
  H,W,N = map(int, input().split())
  floor = N%H
  W = N//H + 1
  if floor == 0:
    floor = H
    W = N // H
  print(f"{floor*100+W}")
