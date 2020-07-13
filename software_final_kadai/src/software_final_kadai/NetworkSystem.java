package software_final_kadai;

public class NetworkSystem extends Kougi{

	//Constrcutor
	public NetworkSystem()
	{
		m_name = "NetworkSystem"; //for quiz2
		m_credit = 1;
		week = "undecided";
		period = -1;

	}

	public NetworkSystem(String week, int period) {

		m_name = "NetworkSystem"; //for quiz 2
		m_credit = 1;
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
