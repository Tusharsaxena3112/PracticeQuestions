package endTerm.question3;

//Create class Number with only one private instance variable as a double primitive type.
// To include the following methods (include respective constructors) isZero( ),
// isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong()
// the above methods return boolean primitive type.
// getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above methods
// return double primitive type. void listFactor(), void dispBinary().
public class Question3 {
    private double var;

    public Question3(double number) {
        this.var = number;
    }

    public boolean isZero() {
        if (this.var == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPositive() {
        if (this.var > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative() {
        if (this.var < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (this.var % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven() {
        if (this.var % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        int c = 0;
        int v = (int) this.var;
        for (int i = 1; i <= v; i++) {
            if (v % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

//    public boolean isArmstrong(){
//        int rem=0;
//        int copy = (int)this.var;
//        int sum=0;
//        while((int)this.var >0){
//            rem=(int)this.var%10;
//            sum=sum+rem;
//            this.var=(int)this.var /10;
//        }
//        if(sum==)
//    }

}
