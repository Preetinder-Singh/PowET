/*
 * 
 *@author Preetinder Singh
   date: 09/03/18
**/
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PowET
{
              
public static void main(String[] args)
{

double  Vet, v,  ppp; 
DecimalFormat javaa=new DecimalFormat(); 

Scanner java= new Scanner(System.in);  //to take the value from the console

System.out.println("enter number");

v=java.nextDouble();

System.out.println("enter error term");

Vet=java.nextDouble();

javaa.format(ppp= Vet/v);                  
double super1=Math.pow(v, 0.5);                        
double V=(0.5*ppp*super1);

javaa.format(ppp= Vet/v);                  
double super2=Math.pow(v,2);                        
double V1=(2*ppp*super2);

javaa.format(ppp= Vet/v);                  
double super3=Math.pow(v, 0.333333333);                        
double V2=(0.333333333*ppp*super3);


System.out.println(getSignificant(super1, 6) + "±" + getSignificant(V, 1));
System.out.println("");


System.out.println(getSignificant(super2, 6) + "±" + getSignificant(V1, 1));
System.out.println("");


System.out.println(getSignificant(super3, 6) + "±" + getSignificant(V2, 1));
System.out.println("");



java.close();

	
}
public static String getSignificant(double value, int sigFigs) {
    MathContext mc = new MathContext(sigFigs, RoundingMode.DOWN);
    BigDecimal bigDecimal = new BigDecimal(value, mc);
    return bigDecimal.toPlainString();



}
}



