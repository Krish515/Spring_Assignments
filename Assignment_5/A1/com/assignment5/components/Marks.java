package com.assignment5.components;

public class Marks {  
	  
    private int scienceMarks;  
    private int mathsMarks;
    private int englishMarks;
    private int total;
    
    public Marks()  
    {         
    }

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	
	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	} 
    public int getResult(){
    	total=scienceMarks+mathsMarks+englishMarks;
    	return total;
    }
}  
