text = list(input())

time = 0
for i in text:
  if i >= 'A' and i<='C':
    time += 2
  elif i >= 'D' and i <='F':
    time += 3
  elif i >= 'G' and i <='I':
    time += 4
  elif i >= 'J' and i <='L':
    time += 5
  elif i >= 'M' and i <='O':
    time += 6
  elif i >= 'P' and i <='S':
    time += 7
  elif i >= 'T' and i <='V':
    time += 8
  elif i >= 'W' and i <='Z':
    time += 9
  else :
    time += 10

print(time+len(text))
