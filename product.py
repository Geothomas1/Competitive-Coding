class ProductC:
    def __init__(self,productName,productType,unitPrice,qtyOnHand):
        self.productName=productName
        self.productType=productType
        self.unitPrice=unitPrice
        self.qtyOnHand=qtyOnHand
        
        
class Store:
    def __init__(self,productList):
        self.productList=productList
        
    def purchaseproduct(self,name,quantity):
        
        bill = 0
        for product in self.productList:
            if(product.productName.lower()==name.lower() and product.qtyOnHand==0):
                return None
            elif(product.productName.lower()==name.lower() and product.qtyOnHand<quantity):
                bill = product.qtyOnHand*product.unitPrice
                product.qtyOnHand=0
                return bill
            elif(product.productName.lower()==name.lower() and product.qtyOnHand>quantity):
                bill = quantity*product.unitPrice
                product.qtyOnHand=product.qtyOnHand-quantity
                return bill
        return None
        

if __name__ == '__main__':
    
    n = int(input())
    
    productList=[]
    
    for i in range(n):
        productName=input()
        productType=input()
        unitPrice=int(input())
        qtyOnHand=int(input())
        p = ProductC(productName,productType,unitPrice,qtyOnHand)
        productList.append(p)
        
    
    name = input()
    quantity = int(input())
    s = Store(productList)
    
    
    
    bill = s.purchaseproduct(name,quantity)
    
    if(bill==None):
        print("Product Not Available")
        for p in s.productList:
            print(p.productName,end=" ")
            print(p.qtyOnHand)
    
    
    else:
        print(bill)
        for p in s.productList:
            print(p.productName,end=" ")
            print(p.qtyOnHand)