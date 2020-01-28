
public class Ch1_11other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cPop = 312032486;
		double secYear = 31536000;
		double change = (secYear / 7) + (secYear / 45) - (secYear / 13);
		
		double y1 = cPop + change;
		double y2 = y1 + change;
		double y3 = y2 + change;
		double y4 = y3 + change;
		double y5 = y4 + change;
		
		System.out.println("The population for year one would be: " +y1);
		System.out.println("The population for year two would be: " +y2);
		System.out.println("The population for year three would be: " +y3);
		System.out.println("The population for year four would be: " +y4);
		System.out.println("The population for year five would be: " +y5);
	}

}
