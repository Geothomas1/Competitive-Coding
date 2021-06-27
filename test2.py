# function which return reverse of a string
 
def isPalindrome(s):
    return s == s[::-1]
 
 
# Driver code
s = "malayalam"
ans = isPalindrome(s)
print(s[::-1])
if ans:
    print("Yes")
else:
    print("No")