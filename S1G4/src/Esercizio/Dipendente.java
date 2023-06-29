package Esercizio;

public class Dipendente {
	private static double stipendioBase = 1000;

	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

	public Dipendente(int matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = calcolaStipendioIniziale(Livello.OPERAIO);
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.dipartimento = dipartimento;
	}

	public Dipendente(int matricola, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
		this.stipendio = calcolaStipendioIniziale(livello);
	}

	// prova con getter e setter

//
//	public int getMatricola() {
//		return matricola;
//	}
//
//	public double getStipendio() {
//		return stipendio;
//	}
//
//	public double getImportoOrarioStraordinario() {
//		return importoOrarioStraordinario;
//	}
//
//	public Livello getLivello() {
//		return livello;
//	}
//
//	public Dipartimento getDipartimento() {
//		return dipartimento;
//	}
//
//	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
//		this.importoOrarioStraordinario = importoOrarioStraordinario;
//	}
//
//	public void setDipartimento(Dipartimento dipartimento) {
//		this.dipartimento = dipartimento;
//	}

	public void stampaDatiDipendente() {
		System.out.println("Matricola: " + matricola);
		System.out.println("Stipendio: " + stipendio);
		System.out.println("Stipendio straordinari: " + calcolaPaga(5));
		System.out.println("Importo orario straordinario: " + importoOrarioStraordinario);
		System.out.println("Livello: " + livello);
		System.out.println("Dipartimento: " + dipartimento);

	}

	private double calcolaStipendioIniziale(Livello livello) {
		switch (livello) {
		case OPERAIO:
			return stipendioBase;
		case IMPIEGATO:
			return stipendioBase * 1.2;
		case QUADRO:
			return stipendioBase * 1.5;
		case DIRIGENTE:
			return stipendioBase * 2;
		default:
			return 0;
		}
	}

	public void promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			break;
		case IMPIEGATO:
			livello = Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
			break;
		case QUADRO:
			livello = Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
			break;
		case DIRIGENTE:
			System.out.println("Errore: Il dipendente è già un dirigente.");
			break;
		}
	}

	public double calcolaPaga() {
		return stipendio;
	}

	public double calcolaPaga(int oreStraordinario) {
		return stipendio + (importoOrarioStraordinario * oreStraordinario);
	}

}
