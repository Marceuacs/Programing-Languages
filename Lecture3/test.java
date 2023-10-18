package Marko Simikj 5381;

//Kristijan Ralevski 5549

public class myNumber {

	private int num1;

		public int num2;

	



	public myNumber(int num,int num2) {

			this.num1=0;

				this.num2=100;

	}

 int getNum() {

	 return num1;

 } void description() {

	

	 System.out.print("Broj 1 : " + num1 + "\n");

	 	System.out.print("Broj 2: " + num2 + "\n");

 

 }





 public int getNum2() {

         

	 		return num2;

     }



 public float calculateAverage() {

	    

	 return (float) (num1 + num2) / 2;

	

 }

	public static void main(String[] args) {

	    myNumber number = new myNumber(5, 10); 

	    	number.description();

	    		System.out.print("\n" + "Prosek: " + number.calculateAverage());

	    				System.out.print("\n" + "Vrednost od broj2: " + number.getNum2());

	}

}
