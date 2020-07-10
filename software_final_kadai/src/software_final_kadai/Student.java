package software_final_kadai;

public class Student {
	private String m_name; //name
	private int m_totalCredit; //total credits gained
	private Kougi[] m_classes; //classes taken

	//Constrcutor
	public Student (Kougi [] classes, String name)
	{
		this.m_name = name;
		int numClass = classes.length;
		m_totalCredit = 0;
		m_classes = new Kougi [numClass] ;
		for(int i=0;i<numClass;i++)
			m_classes[i] = classes[i];
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
}
