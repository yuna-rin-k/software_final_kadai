package software_final_kadai;

public abstract class Kougi {

	protected int m_credit;
	protected String m_name; //for quiz [2]
	protected String week;
	protected int period;

	public abstract int getCredit();

	//for quiz [2]
	public abstract void showCredit();

	//for quiz [2]
	public String toString() {

		return m_name;
	}

	public String getName() {

		return this.m_name;
	}
	//for quiz [2]
	public boolean equals(Object o) {

		if(this == o)
			return true;

		if(o instanceof Kougi) {
			Kougi k = (Kougi)o;

			if(this.m_credit == k.m_credit)
				return true;
		}

		return false;
	}
}
