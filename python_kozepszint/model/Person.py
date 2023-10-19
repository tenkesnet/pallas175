class Person:
    def __init__(self, name: str, osztalyzat: float) -> None:
        self.name = name
        self.osztalyzat = osztalyzat

    def __eq__(self, other) -> bool:
        return self.name == other.name

    def __hash__(self) -> int:
        return hash(self.name)

    def __str__(self) -> str:
        return f"{self.name=} , {self.osztalyzat=}"

    def __repr__(self) -> str:
        return f"{self.name=} , {self.osztalyzat=}"
