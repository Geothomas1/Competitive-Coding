class Document:
    def __init__(self,docid,docname,docdetails):
        self.docid=docid
        self.docname=docname
        self.docdetails=docdetails
class DocumentArchive:
    def __init__(self,archiveid,documentlist):
        self.archiveid=archiveid
        self.documentlist=documentlist
    def findDateFromDocumentDetails(self):
        ans=[]
        for document in self.documentlist:
            temp=(document.docdetails).split(",")
            for i in range(len(temp)):
                temp[i]=temp[i].strip()
                if(len(temp[i])==10):
                    if(temp[i][2]=='/' and temp[i][5]=='/'):
                        t=(document.docid,temp[i])
                        ans.append(t)
        
        return ans
    
    def countDocumentsOfGivenType(self,doctype):
        count=0
        for document in self.documentlist:
            temp=(document.docname).split('.')
            if(temp[0].lower()==doctype.lower()):
                count=count+1
        return count


n=int(input())
documentlist=[]
for i in range(n):
    docid=int(input())
    docname=input()
    docdetails=input()
    documentlist.append(Document(docid,docname,documentlist))

obj=DocumentArchive(12,documentlist)
doctype=input()
ans=obj.findDateFromDocumentDetails()
for i in ans:
    print(i[0],end='')
    print(i[1])

print("Document Count",obj.countDocumentsOfGivenType(doctype))


