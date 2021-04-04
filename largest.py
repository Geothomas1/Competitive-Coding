num=input()
largest=0
for i in range(0,len(num)-2):
     temp=int(num[i:i+3])
     #print(temp)
     if(temp>largest):
         largest=temp
print(largest)


