package Esercizio;

public class App {
	public static void main(String[] args) {
		Dipendente operaio1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente operaio2 = new Dipendente(2, Dipartimento.PRODUZIONE);
		Dipendente impiegato = new Dipendente(3, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente = new Dipendente(4, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

		System.out.println("Stato iniziale dei dipendenti:");
		operaio1.stampaDatiDipendente();
		operaio2.stampaDatiDipendente();
		impiegato.stampaDatiDipendente();
		dirigente.stampaDatiDipendente();

		System.out.println();

		operaio1.promuovi();
		operaio2.promuovi();
		impiegato.promuovi();
		dirigente.promuovi();

		System.out.println();

		System.out.println("Stato dei dipendenti dopo le promozioni:");
		operaio1.stampaDatiDipendente();
		operaio2.stampaDatiDipendente();
		impiegato.stampaDatiDipendente();
		dirigente.stampaDatiDipendente();

		System.out.println();

		double stipendiTotali = calcolaStipendiTotali(operaio1, 5) + calcolaStipendiTotali(operaio2, 5)
				+ calcolaStipendiTotali(impiegato, 5) + calcolaStipendiTotali(dirigente, 5);

		System.out.println("Stipendi totali comprensivi di 5 ore di straordinario: " + stipendiTotali);
	}

	public static double calcolaStipendiTotali(Dipendente dipendente, int oreStraordinario) {
		return dipendente.calcolaPaga(oreStraordinario);
	}

}
