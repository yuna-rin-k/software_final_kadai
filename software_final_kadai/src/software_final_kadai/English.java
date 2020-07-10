package software_final_kadai;

public class English extends Kougi{

	//Constrcutor
	public English()
	{
		super.m_name = "English"; //for quiz 2
		super.m_credit = 2;

	}

	//Concrete implementation
	public int getCredit()
	{
		return super.m_credit;
	}

	//for quiz [2]
	public void showCredit(){
		System.out.println("Credit (" + super.m_name + "): " + super.m_credit);
	}
}