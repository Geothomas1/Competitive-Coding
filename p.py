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
        n = len(player)
        for i in n:
            for j in range(i,n):
                if player[i].runsc>player[j].runsc:
                    temp=player[i]
                    player[i]=player[j]
                    player[j]=temp
        self.player=player
    def getminruns(player):
        return player[0]

    def getmaxwicket(player):
        return player[len(player) - 1]


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
print(f1)
f2=t.getmaxwicket(player)
print(f2)