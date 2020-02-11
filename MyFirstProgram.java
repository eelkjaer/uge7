import java.time.LocalDate;

class MyFirstProgram {
	public static void main(String[] args){

		//Variabler til programmer
		String msg = "Hej store flotte verden!";
		Boolean writeDate = true;
		LocalDate date = LocalDate.now();


		//Print til terminal
		System.out.println(msg);

		if(writeDate) { //Skriver til terminal såfremt writeData er sand
			System.out.println("År " + date.getYear() + " bliver helt fantastisk!");
		};
	}
}