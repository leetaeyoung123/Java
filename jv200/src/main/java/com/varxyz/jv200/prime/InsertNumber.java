package com.varxyz.jv200.prime;

public class InsertNumber {
   public boolean InsertNum (int insert) {
      int x = 0;
      boolean y = false;
      try {
         for(int i = 2; i<=insert; i++) {
            for(int j = 2; j<=i; j++) {
               if(i % j == 0) {
                  x++;
               }
            }
            if(x == 1 && i == insert) {
               System.out.println("소수: " + insert);
               y = true;
            }
            else {
               throw new MyException();
            }
            x = 0;
         }
      } catch(MyException e) {
         if(insert % 2 == 0) {
            int result = insert / 2;
            System.out.println("2 x " + result + " = " + insert + " 이므로 소수가 아니다");
         }
         else if (insert % 3 == 0){
            int result2 = insert /3;
            System.out.println("3 x " +  result2 + " = " + insert + "이므로 소수가 아니다");
         }
         y = false;
      }
      System.out.println(y);
      return y;
   }
}
