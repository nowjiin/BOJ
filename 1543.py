document = input().strip()
word = input().strip()
count = 0
index = 0

while index <= len(document) - len(word):
    # 현재 위치에서 단어가 발견되면
    if document[index:index + len(word)] == word:
        count += 1
        # 단어의 길이만큼 인덱스를 증가시켜서 중복을 피함
        index += len(word)
    else:
        # 그렇지 않으면 인덱스를 한 칸만 이동
        index += 1
print(count)
