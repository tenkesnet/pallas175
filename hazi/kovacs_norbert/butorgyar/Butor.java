package butorgyar;

class Butor {
    private Butorlap[] butorlapok;
    private int butorlapokSzama;

    public Butor() {
        butorlapok = new Butorlap[100]; 
        butorlapokSzama = 0;
    }

    public void lapHozzaad(Butorlap lap) {
        if (butorlapokSzama < butorlapok.length) {
            butorlapok[butorlapokSzama] = lap;
            butorlapokSzama++;
        }
    }

    public int arSzamol() {
        int teljesAr = 0;
        for (int i = 0; i < butorlapokSzama; i++) {
            teljesAr += butorlapok[i].arSzamol();
        }
        return teljesAr;
    }

    
    public String toString() {
        return "Butor - lapok: " + butorlapokSzama + ", ar " + arSzamol() + " Ft";
    }
}

