package software_final_kadai;

public class Main {

	public static void main(String[] args) {

		Kougi[] classes_A = new Kougi[2]; //for Aさん
		Kougi[] classes_B = new Kougi[2]; //for Bさん
		Kougi[] classes_C = new Kougi[1];

		classes_A[0] = new Math();
		classes_A[1] = new English();
		classes_B[0] = new Math();
		classes_B[1] = new Programming();
		classes_C[0] = new English("Mon.", 1);

		Student personA = new Student(classes_A, "A");
		Student personB = new Student(classes_B, "B");
		Student personC = new Student(classes_C, "C");

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

		Kougi kougi1 = new Math("Mon.", 1);
		if (personC.canTake(kougi1)) {
			System.out.println(personC.getName()+" can take a " + kougi1.getName()+" class.");
		} else {
			System.out.println(personC.getName()+" cannot take a " + kougi1.getName()+" class.");
		}
		
		personA.setGrade("English","C");
		personA.setGrade("Math", "A");
		personA.showGrade();
	}
}
