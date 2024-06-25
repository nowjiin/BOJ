S = input()

aList = [chr(i) for i in range(ord('a'),ord('z')+1)]

for i in aList:
  if i in S:
    print(S.index(i), end=" ")
  else:
    print(-1, end=" ")
