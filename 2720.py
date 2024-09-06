T = int(input())

for _ in range(T):
    C = int(input()) 

    quarters = C // 25
    C %= 25
    dimes = C // 10
    C %= 10
    nickels = C // 5
    C %= 5
    pennies = C // 1

    print(quarters, dimes, nickels, pennies)
