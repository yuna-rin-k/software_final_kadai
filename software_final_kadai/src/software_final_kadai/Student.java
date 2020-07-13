package software_final_kadai;

public class Student {
	private String m_name; //name
	private int m_totalCredit; //total credits gained
	private Kougi[] m_classes; //classes taken
	private String[] m_grades; //grades
	private int[] m_scores;//seiseki A=4,B=3,C=2,D=1,X(failed)=0

	//Constrcutor
	public Student (Kougi [] classes, String name)
	{
		this.m_name = name;
		int numClass = classes.length;
		m_totalCredit = 0;
		m_classes = new Kougi [numClass] ;
		m_grades = new String[numClass];
		m_scores = new int[numClass];
		for(int i=0;i<numClass;i++) {
			m_classes[i] = classes[i];
			m_grades[i] = "undefined";
		}
	}

	//calculate the total credits gained
	public void calcTotalCredits()
	{
		for(int i=0;i<m_classes.length;i++)
			m_totalCredit += m_classes[i].getCredit();
	}

	//show the gained credits
	public void showTotalCredits()
	{
		System.out.println(this.m_name + "'s total Credit is: "+m_totalCredit);
	}


	public boolean canTake(Kougi kougi) {

		for (Kougi eachKougi : m_classes) {
			if (kougi.week.equals(eachKougi.week) && kougi.period == eachKougi.period)
				return false;
		}
		return true;
	}

	public String getName() {

		return this.m_name;
	}
	public void setGrade(String class_name,String grade) {
		int index = -1;
		for (int i=0; i<m_classes.length; i++) {
			if (m_classes[i].toString().equals(class_name)) {
				index = i;
				break;
			}
		}
//		if (index != -1 && (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("X"))) {
//			m_grades[index] = grade;
//		}
		if (index != -1){
			if(grade.equals("A")){
				m_grades[index] = grade;
				m_scores[index] = 4;
			}else if(grade.equals("B")){
				m_grades[index] = grade;
				m_scores[index] = 3;
			}else if(grade.equals("C")){
				m_grades[index] = grade;
				m_scores[index] = 2;
			}else if(grade.equals("D")){
				m_grades[index] = grade;
				m_scores[index] = 3;
			}else if(grade.equals("X")){
				m_grades[index] = grade;
				m_scores[index] = 0;
			}
		}
	}
	public void showGrade() {
		for (int i=0; i<m_grades.length; i++)
			System.out.println(m_name + "'s " + m_classes[i].toString() + " grade: " + m_grades[i]);
	}
	public void showGPA(){
		float gpa=0;
		for (int i=0; i<m_scores.length;i++){
			gpa += m_scores[i];
		}
		gpa /= m_scores.length;
		System.out.println(m_name + "'s " + "GPA: " + gpa);
	}
}
