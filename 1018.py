N, M = map(int, input().split())
data = [list(input()) for _ in range(N)]

result = []
for i in range(N):
    for j in range(M):
        if (i+7 < N) and (j+7 < M):
            count1 = 0
            count2 = 0
            for a in range(i, i+8):
                for b in range(j, j+8):
                    if (a + b) % 2 == 0:
                        if data[a][b] != 'B':
                            count1 += 1
                        elif data[a][b] != 'W':
                            count2 += 1
                    else:
                        if data[a][b] != 'W':
                            count1 += 1
                        elif data[a][b] != 'B':
                            count2 += 1
            result.append(count1)
            result.append(count2)

print(min(result))
