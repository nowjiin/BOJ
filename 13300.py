import math

N, K = map(int, input().split())
# N = 총학생수
# K = 최대 들어 갈 수 있는 방수
"""
학년별 (1~6) 성별 0,1로 학생수를 저장
[ [남자 ,1명], INDEX = 0학년
  [여자, 1명], INDEX = 1학년
  [여자, 2명], INDEX = 2학년
  [여자, 2명], INDEX = 3학년
  [여자, 2명], INDEX = 4학년 .. 이런식으로
]
"""

students=[[0,0] for _ in range(6)]

for i in range(N):
    sex, grade = map(int, input().split())
    students[grade - 1][sex] += 1

room_count = 0

for grade in range(6):
    for sex in range(2):
        count = students[grade][sex]
        if count > 0:
            room_count += math.ceil(count / K)

print(room_count)
