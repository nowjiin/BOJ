import sys
input = sys.stdin.read

stack = []

def command_func(command):
    parts = command.split()
    if parts[0] == '1':
        stack.append(int(parts[1]))
    elif parts[0] == '2':
        if stack:
            print(stack.pop())
        else:
            print('-1')
    elif parts[0] == '3':
        print(len(stack))
    elif parts[0] == '4':
        if stack:
            print('0')
        else:
            print('1')
    elif parts[0] == '5':
        if stack:
            print(stack[-1])
        else:
            print('-1')

# 입력을 한 번에 모두 읽기
commands = input().splitlines()
N = int(commands[0])

for i in range(1, N + 1):
    command_func(commands[i])
