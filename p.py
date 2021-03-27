class Player:
    def _init_(self,name,country,age,matchc,runsc,wicketc):
        self.name=name
        self.country=country
        self.age=age
        self.matchc=matchc
        self.runsc=runsc
        self.wicketc=wicketc
class Team:
    def _init_(self,player):
        self.player=player
    def getminruns(self):
        min=self.player[0]
        for i in range(1, len(self.player)):
            if min.runsc>self.player[i].runsc:
                min = self.player[i]
        return min

    def getmaxwicket(self):
        max=self.player[0]
        for i in range(1, len(self.player)):
            if max.runsc<self.player[i].runsc:
                min = self.player[i]
        return min


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
f1=t.getminruns()
print(f1.name)
f2=t.getmaxwicket()
print(f2)