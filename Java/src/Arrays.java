public class Arrays {
public static void main(String []args){
    int month_days[];
    month_days = new int[12];
    month_days[0]=31;
    month_days[1]=28;
    month_days[2]=31;
    month_days[3]=30;
    month_days[4]=31;
    month_days[5]=30;
    month_days[6]=31;
    month_days[7]=31;
    month_days[8]=30;
    month_days[9]=31;
    month_days[10]=30;
    month_days[11]=31;
    int i;
    for(i=0;i<12;i++){
System.out.println("The array is "+month_days[i]);
    }
}
}