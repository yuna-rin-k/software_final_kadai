package software_final_kadai;

public class Math extends Kougi{

	//Constrcutor
	public Math()
	{
		super.m_name = "Math"; //for quiz 2
		super.m_credit = 4;
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