current_hour, current_minute = map(int, input().strip().split())
cooking_time = int(input().strip())

# 현재 시간에 요리 시간을 더하기
total_minutes = current_minute + cooking_time
additional_hours = total_minutes // 60
final_minutes = total_minutes % 60

final_hour = (current_hour + additional_hours) % 24

print(final_hour, final_minutes)
