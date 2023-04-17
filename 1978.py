n = int(input())
a = list(map(int, input().split()))
count = 0

for i in range(n):
    b = []
    for j in range(1,1001):
        if((a[i] % j) == 0):
            b.append(j)
    if(len(b) == 2):
        count += 1
print(count)
