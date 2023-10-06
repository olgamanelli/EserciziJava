package main.Collezioni;
import java.util.List;
import java.util.ArrayList;
public class TestCollezioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadro quadro = new Quadro("Notte stellata", "Van Gogh", 120, 80);
		Scultura scultura = new Scultura("Ratto di Proserpina", "Bernini", 60, 160, 50);
		
		List<OperaDArte> listaOpere = new ArrayList<>();
		listaOpere.add(quadro);
		listaOpere.add(scultura);
		
		Collezione collezione = new Collezione("nuova collezione", listaOpere);
		
		collezione.stampaCollezione();
		
	}

}
