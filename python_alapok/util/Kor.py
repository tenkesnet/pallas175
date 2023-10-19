import math

class Kor:
    name="Kör1"
    def __init__(self,name: str,radius: float,pont:tuple):
        """
        Parameters
        name: String 
        radius: number
        pont: any
        """
        self.radius= radius
        self.centerPont = pont
        self.name=name
    
    def area(self):
        return math.pi * self.radius ** 2
    
    def getCenterPoint(self):
        return self.centerPont
    
    def __str__(self):
        return f"A {self.name} sugara : {self.radius} és a középpontja {self.centerPont} ."