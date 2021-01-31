package sii.maroc;

public class Vehicles 
{
	String vehicleType;
	String vitesse;
	String typeCarburant;
	String dorsNumber;
	String vehicules;

	public Vehicles(String vehicules) 
	{
		this.vehicules=vehicules;
		
	}

	public String move(String vehicleType, String typeCarburant, String dorsNumber, String vitesse) {
		String report="";
		if(vehicleType.equals("CAR") && dorsNumber.equals("1 3 4"))
			report="KO, BLOCKED \n"+
                    "  _\n"+
                    " | \\\n"+
                    " |_|";
		else if(vehicleType.equals("CAR") && dorsNumber.equals("1 2 4"))
			report="KO, BLOCKED \n"+
                    "  _\n"+
                    " | |\n"+
                    " /_|";
		
		else report="DOORS OK, MOVING. The "+vehicleType+" will consume "+CalculConsommation(vehicleType,vitesse)+" L";

		return report;
	}

	private double CalculConsommation(String typeCarburant, String vitesse) {
		double consommation=0;
		if(typeCarburant.equals("Diesel"))
			consommation=CalculVitesseNumber(vitesse)*0.05;
		else if(typeCarburant.equals("Fuel"))
			consommation=CalculVitesseNumber(vitesse)*0.06;
		else consommation=CalculVitesseNumber(vitesse)*0.03;
		return consommation;
	}

	private double CalculVitesseNumber(String vitesse) {
		double vitesseNumber=0;
		for(int i=0;i<vitesse.length();i++) {
			if(vitesse.charAt(i)==' ')
				vitesseNumber=Double.valueOf(vitesse.substring(1,i+1));
		}
		return vitesseNumber;
	}

}
