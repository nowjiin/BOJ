# 중앙 이동 알고리즘

N = int(input())

answer = (2**N+1)*(2**N+1)
if N == 0:
    answer = 4
print(answer)
