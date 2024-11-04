original_num = int(input())

new_num = original_num
count = 0

while True:
    ten = new_num // 10
    one = new_num % 10
    new_num = one * 10 + (ten + one) % 10
    count += 1
    if new_num == original_num:
        break

print(count)
