package datas;

public class DureeT{

	public static void main (String [] args){
		// Test des constructeurs & accesseurs
		Duree d1 = new Duree((3600*1000)*28);
		System.out.println("Durée = " + d1.getLeTemps());
		Duree d2 = new Duree(2000);

		//Test compareA()
		System.out.println(d1.getLeTemps()+"  "+ d2.getLeTemps());
		System.out.println(d2.compareA(d1));

		//Test enTexte() et enJHMS()
		System.out.println (d1.enTexte('J'));
		System.out.println (d1.enTexte('H'));
		System.out.println (d1.enTexte('M'));
		System.out.println (d1.enTexte('S'));

		//Test ajoute()
		d2.ajoute(d2);
		System.out.println(d2.getLeTemps());

	}

}



