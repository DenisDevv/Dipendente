public class TestDipendente {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];
        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i] = new Dipendente("0000", 0, 0);
            dipendenti[i].setStipendio(Math.floor(Math.random() * 2000) + 600);
            dipendenti[i].setStraordinario(Math.floor(Math.random() * 20));
            dipendenti[i].setMatricola("D"+Math.floor(Math.random() * 9999));
        }
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.stampa());
            System.out.println("Paga: " + dipendente.paga((int) Math.floor(Math.random() * 20)));
        }
    }
}