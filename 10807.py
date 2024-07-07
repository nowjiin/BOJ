n = int(input())

ary = list(map(int, input().split()))

m = int(input())
count = 0
for i in ary:
    if i == m:
        count+=1

print(count)
