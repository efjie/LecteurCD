package datas;

/**
*Class Duree
*@author Faustine RENARD
*@version 1.0
*/
public class Duree{

	//attributs
	//La durée s'exprime en millisecondes
	private long leTemps;

	//Constructeur
	/**
	*Le type Duree permet la manipulation
	*/
	public Duree(long millisec){
		this.leTemps = millisec;
	}

	/**
	*@param heures durée en heures
	*@param minutes durée en minutes
	*@param secondes durée en secondes
	*/
	public Duree(int heures, int minutes, int secondes){
		
	}

	/**
	* Effectue une comparaison entre la durée courante
	* et une autre durée
	*@param autreDuree durée à comparer à la durée courante
	*@return
	*/
	public Duree(Duree autreDuree){

	}
	
	/**
	*Retourne la valeur de la durée courante en millisecondes
	*/
	public long getLeTemps(){
		return this.leTemps;
	}

	/**
	*Comparaison entre la durée courante et une autre durée
	*@param autreDuree à comparer à la durée courante
	*/
	public int compareA(Duree autreDuree){
		int res;
		if(autreDuree.getLeTemps() - this.leTemps < 0){
			res = 1;
		}
		else if(autreDuree.getLeTemps() - this.leTemps == 0){
			res = 0;
		}
		else{
			res = -1;
		}
		return res;
	}
	
	/**
	*Renvoie sous la forme d'une chaîne de caractères
	*la durée courante
	*@param mode décide de la forme donnée à la chaîne de caractères
	*/
	public java.lang.String enTexte(char mode){
		int tab[] = this.enJHMS();
		int heure;
		int seconde;
		String res = new String("calcul du temps!");

		heure = ((tab[0]*24)+tab[1]);
		seconde = (int)(this.leTemps / 1000);

		if (mode == 'J'){
			res = (tab[0]+" jours "+ tab[1] +"h");
		}
		if (mode == 'H'){
			res = (heure+":"+ tab[2] +":"+ tab[3]);
		}
		if (mode == 'S'){
			res = (seconde+"."+ tab[4] +" sec");
		}
		if (mode == 'M'){
			res = (this.leTemps+"millisec");
		}
	return res;
		
	}
	public void ajoute(Duree autreDuree){
		this.leTemps += autreDuree.getLeTemps();
	}

	private int[] enJHMS(){
		int tabRes[] = new int[5];
		int reste;
			
			//nb Jour
			tabRes[0] = (int)(this.leTemps / (3600*1000*24));
			
			//Division nb jour
			reste = (int)(this.leTemps%(3600*1000*24));

			//nb heure
			tabRes[1] = (int)(reste / (3600*1000));

			//Division nb heure
			reste = (int)(reste % (3600*1000));

			//nb minutes
			tabRes[2] = (int)(reste / (60*1000));

			//Division nb minutes
			reste = (int)(reste%(60*1000));

			//nb seconde
			tabRes[3] = (int)(reste / 1000);

			//nb milliseconde'
			tabRes[4] = (int)(reste%(1000));

		return tabRes;
	}
}	


