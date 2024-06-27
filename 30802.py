N = int(input())
size = list(map(int, input().split(" ")))
T, P = map(int, input().split(" "))

tee = 0

for i in range(len(size)):
  if size[i] % T == 0:
    tee += size[i]//T
  else:
    tee += size[i]//T+1

pen_num = N//P
pen = N%P
print(tee)
print(pen_num, pen)
