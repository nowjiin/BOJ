import sys
input = sys.stdin.readline
word = input().strip()

croatian = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

count = 0
index = 0
length = len(word)

while index < length:
    if index + 2 < length and word[index:index+3] in croatian:
        count += 1
        index += 3
    elif index + 1 < length and word[index:index+2] in croatian:
        count += 1
        index += 2
    else:
        count += 1
        index += 1

print(count)
