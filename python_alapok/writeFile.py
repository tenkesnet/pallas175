with open("/home/bardo/repo/pallas/pallas146/magyar-szavak-kat.txt", "r") as f:
    line = f.readline()
    while line:
        if "változó" in line.lower():
            print(line)
        line = f.readline()