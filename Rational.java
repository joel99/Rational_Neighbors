//Team Neighbors - Joel Ye and Bayle Smith-Salzberg
//APCS1 pd10
//HW32 -- Irrationality Stops Here
//2015 - 11 - 17

public class Rational {

    private int num;
    private int den;

	//default constructor
    public Rational(){
		num = 0;
		den = 1;
    }
	
	//overload constructor: checks for division by 0
    public Rational(int n, int d){
	if (d == 0){
		this();
		System.out.print ("MathError: Division by 0.");
	}
	else {
	    num = n;
	    den = d;
	}
    }
	
	//prints rational number with newlines
    public String toString(){
		return num +
	    "\n" + "-" +
	    "\n" + den;
    }
	
	//float approximation of rational number
    public float floatValue(){
		return (float)(num)/(demon); 		//Casting has precedence to division.
    }
	
	//multiplication
    public void multiply (Rational n){
        num *= n.num;
		den *= n.den;		//Needn't worry about division by 0, param is also rational.
    }
	
	//division
	public void divide(Rational n){
		if (n.num == 0){
			System.out.println("MathError: Division by 0");
			return;
		}
		num *= n.den;
		den *= n.num;
	}
}
