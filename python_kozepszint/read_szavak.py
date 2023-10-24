import time
from typing import List
import gc


def get_max_length(lst):
    return len(max(lst, key=len))


class SzotarElem:
    def __init__(
        self, szo="", lemma="", szofaj="", szotagszam=0, cv="", szoGyak=0, lemmaGyak=0
    ):
        self.__szo = szo
        self.__lemma = lemma
        self.__szofaj = szofaj
        self.__szotagszam = szotagszam
        self.__cv = cv
        self.__szGyak = szoGyak
        self.__lemmaGyak = lemmaGyak

    def __str__(self):
        return f"{self.__szo},{self.__lemma},{self.__cv}"


def loadSzavak():
    word_list: List[SzotarElem] = []
    mxcv = 0
    maxelem = SzotarElem()
    for line in open("data/magyar-szavak-kat.txt", "r", encoding="utf-8"):
        if line.strip() == "":
            break
        (
            szo,
            lemma,
            szofaj,
            _,
            szotagszam,
            cv,
            szoGyak,
            lemmaGyak,
        ) = line.strip().split("\t")

        e = SzotarElem(szo, lemma, szofaj, szotagszam, cv, szoGyak, lemmaGyak)
        # word_list.append(e)
        lst = cv.split("c")
        if get_max_length(lst) > mxcv:
            mxcv = get_max_length(lst)
            maxelem = e
    return maxelem


a = {1, 2, 3}
b = a
b.remove(3)

wlist = open("data/magyar-szavak.txt", "r", encoding="utf-8").read()

start = time.time()
gc.disable()
v1 = loadSzavak()
print(v1)
gc.enable()
end = time.time()
print(f"Futási idő: {round((end-start)*1000)}")
