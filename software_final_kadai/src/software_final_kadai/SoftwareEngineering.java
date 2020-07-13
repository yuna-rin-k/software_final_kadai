package software_final_kadai;

public class SoftwareEngineering extends Kougi{

	//Constrcutor
	public SoftwareEngineering()
	{
		m_name = "SoftwareEngineering"; //for quiz2
		m_credit = 3;
		week = "undecided";
		period = -1;

	}

	public SoftwareEngineering(String week, int period) {

		m_name = "SoftwareEngineering"; //for quiz 2
		m_credit = 3;
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