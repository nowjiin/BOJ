"""
정확히 N킬로그램
3킬로그램 봉지와 5킬로그램 봉지
만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
"""
N = int(input())
count = 0

while N >= 0:
    if N % 5 == 0:
        count += N // 5
        print(count)
        break
    N -= 3
    count += 1
if N < 0:
    print("-1")
