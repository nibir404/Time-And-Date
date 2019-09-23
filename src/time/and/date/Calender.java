
package time.and.date;

public class Calender {
    public static void main(String[] args) {
       
        	String a ="sat   sun   mon   tue   wed   thu   fri ";
		String month = "September";
		int days = 30;
		int startingdays = 0;
		System.out.print("\n\n Calender of "+month+"\n");
		System.out.println("\n"+a);
		for (int i = 0;i<5 ;i++ ){
		    String dayflow ="";
		    for (int j = 1 ; j <=7 ; j++ ) {
		        int CurrDay = 7*i+j;
		        
		        if(CurrDay> days){
		            break;
		        }
		        if (CurrDay > 9){
		            dayflow += CurrDay + "    ";
		        } 
		        else {
		            dayflow += CurrDay +"     ";
		        }
		    }
		    System.out.println(dayflow);
		}
    }
    
}
