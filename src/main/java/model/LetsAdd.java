/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Feb 10, 2022
 */
package model;


public class LetsAdd {
	private int termOne, termTwo, sum;

	public LetsAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LetsAdd(int termOne, int termTwo) {
		super();
		this.termOne = termOne;
		this.termTwo = termTwo;
		setSum(termOne,termTwo);
	}
	
	public void setSum(int termOne, int termTwo) {
		this.sum = termOne + termTwo;
	}
    
	public int getSum() {
		return sum;
	}
	
	
	public int getTermOne() {
		return termOne;
	}

	public void setTermOne(int termOne) {
		this.termOne = termOne;
	}

	public int getTermTwo() {
		return termTwo;
	}

	public void setTermTwo(int termTwo) {
		this.termTwo = termTwo;
	}
	
	

	@Override
	public String toString() {
		return "LetsAdd: " + termOne + " + " + termTwo + " = " + getSum();
	}

	
} 
		
		
	
	
	


