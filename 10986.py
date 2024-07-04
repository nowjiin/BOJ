n, m = map(int, input().split(" "))

#원본 배열
A = list(map(int, input().split(" ")))
# 합 배열
S = [0] * n
S[0] = A[0]
# 나머지가 같은 인덱스를 카운트할 배열
C = [0] * m

count = 0

for i in range(1,n):
  S[i] = S[i-1] + A[i]

for i in range(n):
  # 합 배열을 M으로 나눈 나머지 값
  remainder = S[i] % m
  if remainder == 0:
    count += 1
  C[remainder] += 1

for i in range(m):
  # 나머자가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
  if C[i] > 1:
    count += C[i] * (C[i]-1) // 2
    
print(count)
