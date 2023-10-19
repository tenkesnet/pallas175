tartolap_ar  = 5000
hatlap_ar = 500
class Butorlap:

    def __init__(self,tipus,hosszusag,szelesseg):
        self.tipus = tipus
        self.hosszusag=hosszusag
        self.szelesseg=szelesseg
    
    def arszamol(self):
        terulet = self.hosszusag*self.szelesseg
        if(tipus=='tartolap'):
            return terulet*hatlap_ar
        if(tipus=='')