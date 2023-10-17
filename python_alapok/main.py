from math import pow as hatvany


def udvozold(message="Cső",tipus="világ"):
    print(f"{message} {tipus}")

def osszeadEsSzoroz(szam1,szam2):
    return szam1+szam2,szam1*szam2
#welcome_message  = input("Kérem add meg az üdvözlő szöveget: ")

udvozold(tipus=" word!",message="Üdvözöllek ")

osszeg,szorzat = osszeadEsSzoroz(10,20)

print(f"Összeg: {osszeg} , Szorzat: {szorzat} Az összeg négyzete {hatvany(osszeg,2)}")




#print(): Prints text to the console.
#input(): Reads input from the user.
#len(): Returns the length of an iterable, such as a string or
#list.
#range(): Generates a sequence of numbers.
#sum(): Returns the sum of a list of numbers.
#max(): Returns the maximum value in a list of numbers.
#min(): Returns the minimum value in a list of numbers.
#str(): Converts an object to a string.
#int(): Converts a string or float to an integer.
#float(): Converts a string or integer to a float.
#bool(): Converts a value to a Boolean (True or False).
#type(): Returns the type of an object.
#help(): Displays documentation for an object.