n,m = map(int,input().split())

ary = [0]*(n+1)

for _ in range(1, m + 1):
    i,j,k = map(int, input().split())
    for x in range(i, j+1):
        ary[x] = k

for i in range(1, len(ary)):
    print(ary[i], end=" ")
