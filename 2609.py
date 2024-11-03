a,b = map(int, input().split())
gcd = 1
for i in range(2, max(a,b)+1):
    while(a%i == 0 and b%i == 0):
        a = a // i
        b = b // i
        gcd *= i

print(gcd)
print(gcd*a*b)
#-----------------------------------
# import math

# A,B = map(int,input().split())

# print(math.gcd(A,B))
# print(math.lcm(A,B))
