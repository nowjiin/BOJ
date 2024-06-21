n = map(int,input().split(" "))

print(sum(map(lambda x: x*x, n)) % 10)
