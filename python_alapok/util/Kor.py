import math

class Kor:
    name="Kör1"
    def __init__(self,radius,pont):
        self.radius= radius
        self.centerPont = pont
    
    def area(self):
        return math.pi * self.radius ** 2
    
    def getCenterPoint(self):
        return self.centerPont
    
    def __str__(self):
        return f"A {self.name} sugara : {self.radius} és a középpontja {self.centerPont} ."