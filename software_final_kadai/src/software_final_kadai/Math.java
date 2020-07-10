package software_final_kadai;

public class Math extends Kougi{

	//Constrcutor
	public Math()
	{
		m_name = "Math"; //for quiz 2
		m_credit = 4;
		week = "undecided";
		period = -1;
	}

	public Math(String week, int period) {

		m_name = "Math"; //for quiz 2
		m_credit = 4;
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