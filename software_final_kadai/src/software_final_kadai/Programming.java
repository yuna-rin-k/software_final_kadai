package software_final_kadai;

public class Programming extends Kougi{

	//Constrcutor
	public Programming()
	{
		m_name = "Programming"; //for quiz2
		m_credit = 2;
		week = "undecided";
		period = -1;

	}

	public Programming(String week, int period) {

		m_name = "Programming"; //for quiz 2
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
