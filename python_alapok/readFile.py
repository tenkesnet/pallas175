class CustomException(Exception):
    pass

try:
    a="111"
    b=int(a)
    if b>100:
        raise CustomException("Nagyobb vol a szám 100-nál")
    with open("/home/bardo/repo/pallas/pallas146/magyar-szavak-kat2.txt", "r") as f:
        line = f.readline()
        while line:
            if "változó" in line.lower():
                print(line)
            line = f.readline()
except FileNotFoundError:
    print("File not found!")
except (ValueError,CustomException):
    b=10
    print(b)