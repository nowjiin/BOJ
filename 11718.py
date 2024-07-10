while(1):
  try :
    print(input())
  except:
    break
"""------------------------"""
import sys

input_text = sys.stdin.read()

ary = input_text.split("\n")

for i in ary:
  print(i)
