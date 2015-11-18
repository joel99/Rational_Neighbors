public class Rational {

    private int num;
    private int den;

    public Rational(){
		num = 0;
		den = 1;
    }
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
	
    public String toString(){
		return num +
	    "\n" + "-" +
	    "\n" + den;
    }
	
    public float floatValue(){
		return (float)(num)/(demon); 		//Casting has precedence to division.
    }
	
    public void multiply (Rational n){
        num *= n.num;
		den *= n.den;		//Needn't worry about division by 0, param is also rational.
    }
	
	public void divide(Rational n){
		if (n.num == 0){
			System.out.println("MathError: Division by 0");
			return;
		}
		num *= n.den;
		den *= n.num;
	}
}
