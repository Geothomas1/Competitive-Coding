class container:
    def __init__(self,cid,length,breadth,height,pricepersqrft):
        self.cid=cid;
        self.length=length;
        self.breadth=breadth;
        self.height=height;
        self.pricepersqrft=pricepersqrft;
        
    def findvolume(self):
        return self.length*self.breadth*self.height;
        
        

class packagingcompany:
    def __init__(self,containerlist):
        self.containerlist=containerlist;
        
        
    def findcontainercost(self,iid):
        
        for con in (self.containerlist):
            if(con.cid==iid):
                return con.findvolume()*con.pricepersqrft;
        
        return None
        
    def largestcontainer(self):
        
        vol = 0;
        obj = None;
        
        for con in (self.containerlist):
            if(con.findvolume()>vol):
                vol = con.findvolume()
                obj = con;
                
        return obj
        
        
        
containerlist = []     
n = int(input())

for i in range(n):
    
    cid = int(input())
    length = int(input())
    breadth = int(input())
    height = int(input())
    pricepersqrft = int(input())
    containerlist.append(container(cid,length,breadth,height,pricepersqrft))
    
pc = packagingcompany(containerlist)
iid = int(input())

x = pc.findcontainercost(iid)

if(x!=None) : 
    print(x)
    
else :
    print("no container found")
    
y = pc.largestcontainer()

print(y.cid,end=" ")
print(y.findvolume())