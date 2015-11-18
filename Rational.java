public class Rational {

    private int numer;
    private int demon;

    public Rational(){
	numer = 0;
	demon = 1;
    }
    public Rational(int n, int d){
	if (d == 0){
	    numer = 0;
	    demon = 1;
	    System.out.print ("you can't divide by 0 silly!");
	}
	else if (!(d == (int)(d)&& n == (int)(n))){
	    numer = 0;
	    demon = 1;
	    System.out.print ("numerator and denominator must be integers!");}
	else {
	    numer = n;
	    demon = d;
	}

    }
    public String toString(){
	return "" + numer +
	    "\n" + "-" +
	    "\n" + demon;
    }
    public float floatValue(){
	return (float)(numer)/(float)(demon);
    }
    public void multiply (Rational num){
        double n = num.numer * this.numer;
	double d = num.demon * this.demon;
	numer = (int) n;
	demon = (int) d;
    }
}
