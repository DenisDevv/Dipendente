public class TestDipendente {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("00309", 1000, 7.5);
        double d1Stipendio  = d1.getStipendio();
        double d1Paga = d1.paga(10);
        System.out.println("Stipendio: " + d1Stipendio + ", paga: " + d1Paga);
        System.out.println(d1.stampa());
    }
}