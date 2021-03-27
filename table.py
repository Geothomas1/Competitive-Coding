class Table:
    def __init__(self,tableno,waitername,status):
        self.tableno=tableno
        self.waitername=waitername
        self.status=status
def function1(table):
    dic={}
    for i in table:
        dic[i.waitername]=0
    for i in table:
        dic[i.waitername]+=1    
    return dic


def function2(table,tno):
    for i in table:
        if(i.tableno==tno):
            return i.waitername
    return None

n=int(input())
table=[]
for i in range(n):
    tableno=int(input())
    waitername=input()
    status=input()
    table.append(Table(tableno,waitername,status))
tno=int(input())
dic=function1(table)
for key in sorted(dic.keys()):
    print(key+'-'+str(dic[key]))
name=function2(table,tno)
if(name==None):
    print("No waiter found")
else:
    print(name)



