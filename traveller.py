class Traveller:
	def  __init__(self,travelerName,traveledCountry,travelerAge,countryFrom):
		self.travelerName=travelerName
		self.traveledCountry=traveledCountry
		self.travelerAge=travelerAge
		self.countryFrom=countryFrom
   
class TravelAgency:
	def __init__(self,traveller_list):
		self.travelerList=traveller_list

	def countTravelersTraveledCountry(self,country):
		count=0
		for i in self.travelerList:
			for j in i.traveledCountry:
				if j==country:
					count+=1
		return count

	def getTravelerTravelledMaxCountry(self):
		max1=0
		name=""
		for i in self.travelerList:
			if(len(i.traveledCountry)>max1):
				max1=len(i.traveledCountry)
				name=i.travelerName
		return name    
                
                
if __name__== "__main__":

	n=int(input())
	traveller_list=[]
	
	for i in range(n):
		traveledCountry=[]
		travelerName=input()
		traveledCountrycount=int(input())
		for j in range(traveledCountrycount):
			traveledCountry.append(input())
		
		travelerAge=int(input())
		countryFrom=input()
		traveller_list.append(Traveller(travelerName,traveledCountry,travelerAge,countryFrom))
	
	obj=TravelAgency(traveller_list)
	nameofcountry=input()
	print(obj.countTravelersTraveledCountry(nameofcountry))
	print(obj.getTravelerTravelledMaxCountry())

