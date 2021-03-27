class Player:
    def __init__(self, name, country, age, matchc, runsc, wicketc):
        self.name = name
        self.country = country
        self.age = age
        self.matchc = matchc
        self.runsc = runsc
        self.wicketc = wicketc


class Team:
    def __init__(self, player):
        self.player = player

    def getminruns(self, player):
         minrun = self.player[0]
         for i in range(1, len(self.player)):
             if minrun.runsc > self.player[i].runsc:
                 minrun = self.player[i]
         return minrun
    

    def getmaxwicket(self,player):
         maxw=self.player[0]
         for i in range(1,len(self.player)):
             if maxw.wicketc>self.player[i].wicketc:
                 maxw=self.player[i]
         return maxw

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
# print player data
f2=t.getmaxwicket(player) 
print(f2.name)
# print player data
