package software_final_kadai;

public class Programming extends Kougi{

	//Constrcutor
	public Programming()
	{
		super.m_name = "Programming"; //for quiz2
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
