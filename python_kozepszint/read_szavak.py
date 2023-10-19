word_list = []
for line in open("data/magyar-szavak.txt","r", encoding="utf-8"):
    word = line.strip()
    word_list.append(word)

print(len(word_list))

wlist =  open("data/magyar-szavak.txt","r", encoding="utf-8").read()

print(len(wlist))
