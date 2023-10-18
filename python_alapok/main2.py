import sys

while True:
    line = sys.stdin.readline().strip()
    if line == "quit":
        break
    print("You entered:", line)