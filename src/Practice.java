public class Practice {


    public static void main(String[]args){
        System.out.println(toMilesPerHour(140.6786893));
        //Conversion conversion=new Conversion();
    }
    static double toMilesPerHour(double kmPH){
        double mPH;
if (kmPH<0)return -1;

else
    mPH=kmPH/1.609344;
return Math.round(mPH);
    }




}
