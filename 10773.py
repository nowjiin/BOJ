class Stack:
  def __init__(self):
    self.stack = []
    
  def isEmpty(self):
    return len(self.stack) == 0
    
  def push(self, data):
    self.stack.append(data)
    
  def pop(self):
    if not self.isEmpty():
      return self.stack.pop()
    else:
      return 0
      
  def top(self):
    if not self.isEmpty:
      return self.stack[-1]
    else :
      return 0


K = int(input())
data = Stack()
sum = 0
for _ in range(K):
  num = int(input())
  if(num == 0):
    data.pop()
  else:
    data.push(num)

while not data.isEmpty():
  sum += data.pop()
  
print(sum)
