// // a method areEqualByThreeDecimalPlaces with two parameters of type double.

// The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a , double b){
        a = (int)(a*1000);
        b = (int)(b*1000);
        if(a==b){
            return true;
        }
        else {
            return false;
        }
    }
 
}
