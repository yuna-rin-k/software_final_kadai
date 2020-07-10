package software_final_kadai;

public class English extends Kougi{

	//Constrcutor
	public English()
	{
		m_name = "English"; //for quiz 2
		m_credit = 2;
		week = "undecided";
		period = -1;

	}

	public English(String week, int period) {

		m_name = "English"; //for quiz 2
		m_credit = 2;
		this.week = week;
		this.period = period;
	}

	//Concrete implementation
	public int getCredit()
	{
		return m_credit;
	}

	//for quiz [2]
	public void showCredit(){
		System.out.println("Credit (" + m_name + "): " + m_credit);
	}
}