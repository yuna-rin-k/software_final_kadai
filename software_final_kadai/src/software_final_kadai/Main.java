package software_final_kadai;

public class Main {

	public static void main(String[] args) {

		Kougi[] classes_A = new Kougi[2]; //for Aさん
		Kougi[] classes_B = new Kougi[2]; //for Bさん

		classes_A[0] = new Math();
		classes_A[1] = new English();
		classes_B[0] = new Math();
		classes_B[1] = new Programming();

		Student personA = new Student(classes_A, "A");
		Student personB = new Student(classes_B, "B");

		personA.calcTotalCredits();
		personB.calcTotalCredits();

		personA.showTotalCredits();
		personB.showTotalCredits();

		//*****************************************************

		//Quiz [2]
		Kougi[] classes = new Kougi[3];
		classes[0] = new Math();
		classes[1] = new English();
		classes[2] = new Programming();

		//Quiz [2]-(1)
		for (int i = 0; i < classes.length; i++)
			classes[i].showCredit();

		//Quiz [2]-(2)
		for (int i = 0; i < classes.length; i++) {
			for (int j = i+1; j < classes.length; j++) {

				if(classes[i].equals(classes[j])) {

					System.out.println("The following two are the same credits:");
					System.out.println(classes[i].toString());
					System.out.println(classes[j].toString());
				}
			}
		}

	}

}
