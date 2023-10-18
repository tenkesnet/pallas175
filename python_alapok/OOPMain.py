from util.Kor import Kor as Kor

center1 = (10,1)
center2 = [1,1]

center2.append("10")
kor01 = Kor(5,center1)
kor02 = Kor(10,center2)

kor02.name = "Kör 2"

print(kor01)
print(kor02)