from collections import Counter

text = input().strip().upper()

counter = Counter(text)

most_common = counter.most_common()

max_frequency = most_common[0][1]

if len(most_common) > 1 and most_common[1][1] == max_frequency:
    print("?")
else:
    print(most_common[0][0])

# text = input().upper()

# unique_chars = list(set(text))

# char_count = []

# for i in unique_chars:
#   cnt = text.count(i)
#   char_count.append(cnt)

# if char_count.count(max(char_count)) >= 2:
#   print("?")
# else:
#   print(unique_chars[char_count.index(max(char_count))])
