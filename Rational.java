// Team Neighbors - Joel Ye and Jannie Li
// APCS1 pd10
// HW33 -- Do You Even Add, Bro?
// 2015-11-18


public class Rational {

    private int num;
    private int den;


    // CONSTRUCTORS
    // ===========================================
    //default constructor
    public Rational(){
	num = 0;
	den = 1;
    }
	
    //overloaded constructor: checks for division by 0
    public Rational(int n, int d){
	this();
	if (d == 0) {
	    System.out.print ("MathError: Division by 0.");
	}
	else {
	    num = n;
	    den = d;
	}
    }




    // METHODS
    // ===========================================
	
    //prints rational number with newlines
    public String toString(){
	return num +
	    "\n" + "-" +
	    "\n" + den +
	    "\n";
    }

    
    //float approximation of rational number
    public float floatValue(){
	return (float)(num)/(den);
	//Casting has precedence to division.
    }

    
    //multiplication
    public void multiply (Rational n){
        num *= n.num;
	den *= n.den;
	//Needn't worry about division by 0, param is also rational.
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


    
    
    // HW33 ADDITIONS
    // ===========================================

    // calc gcd of two ints
    public static int gcd(int a, int b){
	// deal with negatives
	if (a < 0) {
	    a *= -1;
	}
	if (b < 0) {
	    a *= -1;
	}
	
        while (b != 0) {
            int num = b;
            b = a % b;
            a = num;
        }
        return a;
    }


    // return gcd of numerator and denominator
    public int gcd(){
	return gcd(num,den);
    }


    // simplify the numerator and denominator of a Rational object
    public static void reduce(Rational n){
	int gcd = gcd(n.num, n.den);
	n.num /= gcd;
	n.den /= gcd;
    }


    // add to another Rational object
    public void add(Rational a){
	num = num * a.den + den * a.num;
	den *= a.den;
	reduce(this);
    }

    public void subtract(Rational a){
	num = num * a.den - den * a.num;
	den *= a.den;
	reduce(this);
    }

    public int compareTo(Rational a){
	Rational c = new Rational(num,den);
	reduce(c);
	reduce(a);
	c.subtract(a);
	if (c.num > 0) 
	    return 1;
	if (c.num == 0)
	    return 0;
	if (c.num < 0)
	    return -1;
	return -1;
    }

    public static void main(String[] args){
	/*
	Rational a = new Rational(1,2);
	Rational b = new Rational(1,3);
	Rational c = new Rational(6,9);
	reduce(c);
	System.out.println(c);
	a.add(b);
	System.out.println(a);
	a.subtract(b);
	System.out.println(a);

	Rational d = new Rational(2,4);
	Rational e = new Rational(3,6);
	System.out.println(d.compareTo(e));
	*/
	System.out.println(gcd(3,6));
	System.out.println(gcd(-3,6));

	

    }

}
