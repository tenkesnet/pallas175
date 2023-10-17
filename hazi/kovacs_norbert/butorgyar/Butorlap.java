package butorgyar;

class Butorlap {
    private int hosszusag;
    private int szelesseg;
    private String tipus; 
    private static final int TAROLAP_AR = 5000;
    private static final int HATLAP_AR = 500;

    public Butorlap(String tipus, int hosszusag, int szelesseg) {
        this.tipus = tipus;
        this.hosszusag = hosszusag;
        this.szelesseg = szelesseg;
    }

    public int arSzamol() {
        int terulet = hosszusag * szelesseg;
        if ("tartolap".equals(tipus)) {
            return terulet * TAROLAP_AR;
        } else if ("hatlap".equals(tipus)) {
            return terulet * HATLAP_AR;
        } else 
            return 0;
    }}
    