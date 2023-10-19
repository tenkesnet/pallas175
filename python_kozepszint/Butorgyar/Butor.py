from typing import List
from Butorgyar.Butorlap import Butorlap as Butorlap 

class Butor:

    def __init__(self):
        self.butorlapok : List[Butorlap] = []
        self.butorlapokszama=0
    
    
    def lapHozzaad(self,butorlap:Butorlap):
        """
        parameter:
        butorlap: Butorlap
        """
        self.butorlapok.append(butorlap)
        self.butorlapokszama+=1

    def arSzamol(self):
        osszar=0
        for item in self.butorlapok:
            osszar+=item.arSzamol()
        return osszar
    
    def __str__(self):
        return f"Botor - lapok szama: {self.butorlapokszama} Ára: {self.arSzamol()} Ft"