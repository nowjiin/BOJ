n = int(input())

for i in range(1, n + 1):
  print(' ' * (n - i) + '*' * (2 * i - 1))

for i in range(n - 1, 0, -1):
  print(' ' * (n - i) + '*' * (2 * i - 1))

# N = int(input())

# for i in range(1, N + 1):
#   str = "*" * (2 * i - 1)
#   print(str.center(2 * N - 1).rstrip())

# for i in range(N - 1, 0, -1):
#   str = "*" * (2 * i - 1)
#   print(str.center(2 * N - 1).rstrip())
