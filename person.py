class Person:
    def __init__(self,name,height,weight):
        self.name=name
        self.height=height
        self.weight=weight
        self.bmi=0
        self.bmi_status=0
    def calculatebmi(self):
        self.bmi=round(self.weight/(self.height*self.height))

class Sociey:
    def __init__(self,bmi_status,person_list):
        self.bmi_status=bmi_status
        self.person_list=person_list
    
