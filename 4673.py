self_number = 0
count = 0

def d(n):
    # # 각 자리수를 합산할 변수
    # total = 0
    #
    # # n을 문자열로 변환하여 각 자리수를 처리
    # for digit in str(n):
    #     total += int(digit)  # 각 자리수를 정수로 변환하여 total에 더함
    #
    # # n과 자리수의 합을 더한 결과를 반환
    # return n + total
    return n + sum(int(digit) for digit in str(n))


def find_self_number(limit):
    # 0부터 limit까지의 생성자 목록을 저장할 리스트
    generated = [False] * (limit + 1)

    #모든 숫자에 대해 d(n)계산
    for i in range(1, limit + 1):
        gen_number = d(i)
        if gen_number <= limit:
            generated[gen_number] = True
    for i in range(1, limit + 1):
        if not generated[i]:
            print(i)


find_self_number(10000)
