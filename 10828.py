import sys

n = int(input())
stack = []
sp = -1

for i in range(n) :
  func = sys.stdin.readline().split()
  if func[0] == 'top' :
    if (sp == -1) :
      print("-1")
    else :
      print(stack[sp])
  elif func[0] == 'size' :
    print(len(stack))
  elif func[0] == 'empty' :
    if (sp == -1) :
      print("1")
    else :
      print("0")
  elif func[0] == 'pop' :
    if (sp == -1) :
      print("-1")
    else :
      data = stack[sp]
      stack.pop()
      sp -= 1
      print(data)
  elif func[0] == 'push' :
    sp += 1
    stack.append(func[1])
