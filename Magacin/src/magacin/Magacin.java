package magacin;

import java.util.LinkedList;
import java.util.List;

import magacininterfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	private List<Artikal> artikli = new LinkedList<>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		for(Artikal a:artikli) {
			if(a.getSifra() == artikal.getSifra()) {
				a.setKolicina(a.getKolicina()+1);
				break;
			}
			else {
				artikli.add(artikal);
				break;
			}
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		artikli.remove(artikal);
	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		for(Artikal a:artikli) {
			if(a.getSifra() == sifra) {
			return a;
			}
		}
		return null;
	}

}
