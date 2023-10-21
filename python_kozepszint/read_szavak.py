import time
from typing import List

class SzotarElem:
    def __init__(self,szo,lemma,szofaj,szotagszam,cv,szoGyak,lemmaGyak):
        self.szo=szo
        self.lemma=lemma
        self.szofaj=szofaj
        self.szotagszam=szotagszam
        self.cv=cv
        self.szGyak = szoGyak
        self.lemmaGyak = lemmaGyak


def loadSzavak():
    word_list :List[SzotarElem] = []
    for line in open("data/magyar-szavak-kat.txt","r", encoding="utf-8"):
        word = line.strip().split("\t")
        if(len(word)<8):
            break
        e = SzotarElem(word[0],word[1],word[2],word[4],word[5],word[6],word[7])
        word_list.append(e)
    return word_list


wlist =  open("data/magyar-szavak.txt","r", encoding="utf-8").read()

start = time.time()
print(len(loadSzavak()))
end = time.time()
print(f"Futási idő: {round((end-start)*1000)}")

