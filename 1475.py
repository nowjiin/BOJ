from math import ceil

number = input()

plastic_set = {i:0 for i in range(10)}

for i in number:
    plastic_set[int(i)] += 1

answer=[]

plastic_set[6] = ceil((plastic_set[6]+plastic_set[9])/2)
plastic_set[9] = 0

print(max(plastic_set.values()))
