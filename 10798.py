words = [input() for _ in range(5)]

max_length = max(len(word) for word in words)

result = []

for i in range(max_length):
    for word in words:
        if i < len(word):
            result.append(word[i])

print(''.join(result))
