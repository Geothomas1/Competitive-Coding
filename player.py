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
    #     complete code 
    

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
#print player data
f2=t.getmaxwicket(player) 
#print player data
