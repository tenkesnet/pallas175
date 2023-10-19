from Butorgyar.Butor import Butor as Butor
from Butorgyar.Butorlap import Butorlap as Butorlap

butorlap1 = Butorlap("hatlap",3,5)
butorlap2 = Butorlap("hatlap",3,5)
butorlap3 = Butorlap("tartolap",1,4)
butorlap4 = Butorlap("tartolap",3,5)
butorlap5 = Butorlap("hatlap",3,5)
butorlap6 = Butorlap("hatlap",3,10)

butor01 = Butor()

butor01.lapHozzaad(butorlap1)
butor01.lapHozzaad(butorlap2)
butor01.lapHozzaad(butorlap3)
butor01.lapHozzaad(butorlap4)
butor01.lapHozzaad(butorlap5)
butor01.lapHozzaad(butorlap6)


print(butor01)

