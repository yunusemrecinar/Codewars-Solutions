public class BuyCar {

  public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
     int countM = 0;
     double sumMoney = startPriceOld - startPriceNew;
     double startO = startPriceOld;
     double startN = startPriceNew;
     
     while(sumMoney < 0) {
       
       
       if(countM %2 == 0) {
         double temp1 = (startO*percentLossByMonth)/100.0;
         startO -=  temp1;
         double temp2 = (startN*percentLossByMonth)/100.0;
         startN -= temp2;
         
      
         
         sumMoney += temp2;
         sumMoney -= temp1;
         sumMoney += savingperMonth;
         countM++;
         

      
       }else {
         percentLossByMonth += 0.5;
         
         double temp1 = (startO*percentLossByMonth)/100.0;
         startO -=  temp1;
         double temp2 = (startN*percentLossByMonth)/100.0;
         startN -= temp2;
         
      
         
         sumMoney += temp2;
         sumMoney -= temp1;
         sumMoney += savingperMonth;
         countM++;
         
        
       }
     }
     
     
      return new int[] {countM,(int)Math.round(sumMoney)};
  }
}