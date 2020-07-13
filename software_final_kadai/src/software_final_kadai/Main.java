package software_final_kadai;

import testFinal.English;
import testFinal.Kougi;
import testFinal.Math;
import testFinal.NetworkSystem;
import testFinal.Programming;
import testFinal.SoftwareEngineering;
import testFinal.Student;

public class Main {

	public static void main(String[] args) {

		/*
		Kougi[] classes_A = new Kougi[2]; //for Aã•ã‚“
		Kougi[] classes_B = new Kougi[2]; //for Bã•ã‚“
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
		*/

		//*****************************************************

		//Quiz [2]
		System.out.println("ŠJu’†‰È–Ú‚Æ‚»‚Ì’PˆÊ‚ÌƒŠƒXƒgF");
		Kougi[] classes = new Kougi[5];
		classes[0] = new Math();
		classes[1] = new English();
		classes[2] = new Programming();
		classes[3] = new SoftwareEngineering();
		classes[4] = new NetworkSystem();

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

		System.out.println(); //‰üs
		System.out.println("¶“kA,B,C‚Ì’PˆÊæ“¾ó‹µF");
		//
		Kougi[] classes_A = new Kougi[3]; //for Aã•ã‚“
		Kougi[] classes_B = new Kougi[2]; //for Bã•ã‚“
		Kougi[] classes_C = new Kougi[2];

		classes_A[0] = new Math();
		classes_A[1] = new English();
		classes_A[2] = new SoftwareEngineering();
		classes_B[0] = new Math();
		classes_B[1] = new Programming();
		classes_C[0] = new English("Mon.", 1);
		classes_C[1] = new NetworkSystem();

		Student personA = new Student(classes_A, "A");
		Student personB = new Student(classes_B, "B");
		Student personC = new Student(classes_C, "C");

		personA.calcTotalCredits();
		personB.calcTotalCredits();
		personC.calcTotalCredits();

		personA.showTotalCredits();
		personB.showTotalCredits();
		personC.showTotalCredits();
		//

		Kougi kougi1 = new Math("Mon.", 1);
		if (personC.canTake(kougi1)) {
			System.out.println(personC.getName()+" can take a " + kougi1.getName()+" class.");
		} else {
			System.out.println(personC.getName()+" cannot take a " + kougi1.getName()+" class.");
		}

		System.out.println();
		System.out.println("¶“kA‚Ì¬ÑÚ×");
		personA.setGrade("English","C");
		personA.setGrade("Math", "A");
		personA.setGrade("SoftwareEngineering","B");
		personA.showGrade();
		personA.showGPA();

		System.out.println();
		System.out.println("¶“kB‚Ì¬ÑÚ×");
		personB.setGrade("Math", "B");
		personB.setGrade("Programming", "A");
		personB.showGrade();
		personB.showGPA();

		System.out.println();
		System.out.println("¶“kC‚Ì¬ÑÚ×");
		personC.setGrade("English", "C");
		personC.setGrade("NetworkSystem", "A");
		personC.showGrade();
		personC.showGPA();

	}
}
