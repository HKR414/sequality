package org.example;

public class Calculate{
  public int sum(int x, int y){
    return x + y;
  }

  public void sumAB(int a, int b){
    float sum=a+b;
    float ave=sum/2;
    System.out.println("Sum of " + a + " and " + b + " is " + sum + ". Average is " + ave + ".");
  }

  public void sumA2B(int a, int b){
    float sum=0;
    float ave=0;
    for(int i=a; i<=b; i++){
      sum+=i;
    }
    ave=sum/(b-a+1);
    System.out.println("Sum of " + a + " to " + b + " is " + sum + ". Average is " + ave + ".");
  }

  public void sumOfoddAndevenA2B(int a, int b){
    int odd=0, even=0;
    for(int i=a; i<=b; i++){
      if(i%2==0){
        even+=i;
      }else{
        odd+=i;
      }
    }
    System.out.println("Sum of odd of " + a + " to " + b + " is " + odd + ". Sum of even is " + even + ".");
  }
}
