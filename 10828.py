import sys
input = sys.stdin.readline

class Stack:
  def __init__(self):
    self.stack = []
  def push(self, data):
    self.stack.append(data)
  def pop(self):
    if not self.is_empty():
      return self.stack.pop()
    else : 
      return -1
  def size(self):
    return len(self.stack)
  def is_empty(self):
    return int(len(self.stack)==0)
  def top(self):
    if not self.is_empty():
      return self.stack[-1]
    else:
      return -1

s = Stack()
n = int(input())

for _ in range(n):
  command = input().split()
  if command[0] == "push":
      s.push(int(command[1]))
  elif command[0] == "pop":
      print(s.pop())
  elif command[0] == "size":
      print(s.size())
  elif command[0] == "empty":
      print(s.is_empty())
  elif command[0] == "top":
      print(s.top())

# import sys

# n = int(input())
# stack = []
# sp = -1

# for i in range(n) :
#   func = sys.stdin.readline().split()
#   if func[0] == 'top' :
#     if (sp == -1) :
#       print("-1")
#     else :
#       print(stack[sp])
#   elif func[0] == 'size' :
#     print(len(stack))
#   elif func[0] == 'empty' :
#     if (sp == -1) :
#       print("1")
#     else :
#       print("0")
#   elif func[0] == 'pop' :
#     if (sp == -1) :
#       print("-1")
#     else :
#       data = stack[sp]
#       stack.pop()
#       sp -= 1
#       print(data)
#   elif func[0] == 'push' :
#     sp += 1
#     stack.append(func[1])
