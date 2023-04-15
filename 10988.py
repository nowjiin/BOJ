word = input()

def palindrome(x):
    left, right = 0, len(word) - 1
    while(True):
        if word[left] == word[right]:
            if (left == right) or (right - left == 1):
                return 1
            left += 1
            right -= 1
        else:
            return 0

print(palindrome(word))
