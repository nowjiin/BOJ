import math

n,k= map(int, input().split())
print(int(math.factorial(n) / (math.factorial(k) * math.factorial(n-k))))
