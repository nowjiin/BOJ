sum= 0

for i in map(int, input().split()):
    sum += i**2

print(sum % 10)
