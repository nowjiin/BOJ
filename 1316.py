n = int(input())
count = 0

for _ in range(n):
  word_input = input().strip()
  word_set = set()  # 각 단어에 대해 문자 저장을 위한 set
  previous_char = ''  # 이전 문자를 저장하기 위한 변수
  is_group_word = True  # 그룹 단어 여부를 나타내는 플래그

  for char in word_input:
    if char != previous_char:  # 현재 문자가 이전 문자와 다르면
      if char in word_set:  # 이미 등장한 문자라면
        is_group_word = False  # 그룹 단어가 아님을 표시
        break
      word_set.add(char)  # 새로운 문자를 set에 추가
    previous_char = char  # 이전 문자를 현재 문자로 갱신

  if is_group_word:
    count += 1  # 그룹 단어일 경우 카운트 증가

print(count)
