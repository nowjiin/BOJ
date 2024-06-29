n = int(input())
ary = list(map(int, input().split()))
count = 0

for i in range(n):
    num = ary[i]
    if num > 1:
        is_prime = True
        for j in range(2, int(num**0.5) + 1):
            if num % j == 0:
                is_prime = False
                break
        if is_prime:
            count += 1
print(count)


# n = int(input())
# a = list(map(int, input().split()))
# count = 0

# for i in range(n):
#     b = []
#     for j in range(1,1001):
#         if((a[i] % j) == 0):
#             b.append(j)
#     if(len(b) == 2):
#         count += 1
# print(count)
