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
    def getminruns(self,player):
         minrun=0
         for i in player:
             if i.runsc<minrun:
                 minrun=i.minrun
                 k=i
                 return k
    def getmaxwicket(self,player): 
        maxwicket=0
        for i in player:
            if i.wicketc>maxwicket:
                maxwicket=i.wicketc
                k=i
                return k    
n=int(input())
player=[]
for i in range(n):
    name=input()
    country=input()
    age=int(input())
    matchc=int(input())
    runsc=int(input())
    wicketc=int(input())
    player.append(Player(name,country,age,matchc,runsc,wicketc))

t=Team(player)
f1=t.getminruns(player)
print(f1.name)
#print player data
f2=t.getmaxwicket(player) 
print(f2.name)
#print player data
