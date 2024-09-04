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
            
N = int(input())

for i in range(N):
    command_func(input())
