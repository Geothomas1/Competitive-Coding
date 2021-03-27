class Player:
    def __init__(self,name,country,age,matchc,runsc,wicketc):
        self.name=name
        self.country=country
        self.age=age
        self.matchc=matchc
        self.runsc=runsc
        self.wicketc=wicketc
class Team:
    def __init__(self,player):
        self.player=player
    def getminruns(player):
        #complete code 

    def getmaxwicket(player):
        #complete code 
    

n=int(input())
player=[]
for i in range(n):
    name=input()
    country=input()
    age=int(input())
    matchc=int(input())
    runsc=int(input())
    wicketc=int(input())
    player.append(player(name,country,age,matchc,runsc,wicketc))

t=Team(player)
f1=t.getminruns(player)
for i in f1:
    print(i.name)
    print(i.country)
    print(i.age)
    print(i.matchc)
    print(i.runsc)
    print(i.wicketc)
f2=t.getmaxwicket(player) 
for i in f2:
    print(i.name)
    print(i.country)
    print(i.age)
    print(i.matchc)
    print(i.runsc)
    print(i.wicketc)