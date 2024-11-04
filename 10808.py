alphabet = {chr(i):0 for i in range(ord('a'), ord('z')+1)}

word = input()
for i in word:
    if i in alphabet:
        alphabet[i] += 1

for k , v in alphabet.items():
    print(v, end=" ")
