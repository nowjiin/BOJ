import sys

input = sys.stdin.readline
score_table = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'P': 0.0, 'F': 0.0}
total_score = 0
total_grade = 0

for _ in range(20):
    title, grade, score = input().split()
    grade = float(grade)
    if score == 'P':
        grade = 0

    total_grade += grade
    total_score += grade * score_table[score]

result =  total_score / total_grade
print(result)
