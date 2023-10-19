tartolap_ar  = 5000
hatlap_ar = 500

class Butorlap:
    """
    Ez egy bútorlap osztály, amit a butorokhoz adunk hozzá.
    parameter:
    tipus: tartolap vagy hatlap
    hosszusag: int
    szelesseg: int
    """
    def __init__(self,tipus,hosszusag,szelesseg):
        self.tipus = tipus
        self.hosszusag=hosszusag
        self.szelesseg=szelesseg
    
    def arSzamol(self):
        terulet = self.hosszusag*self.szelesseg
        if(self.tipus=='tartolap'):
            return terulet*hatlap_ar
        if(self.tipus=='hatlap'):
            return terulet*hatlap_ar
        else:
            return 0 