package org.example;

public class Calculate{
  public int sumAB(int x, int y){
    return x + y;
  }

  public double aveAB(int sum){
    return (double)sum/2;
  }

  public int sumA2B(int a, int b){
    int sum = 0;
    for(int i = a; i <= b; i++){
      sum += i;
    }
    return sum;
  }

  public double aveA2B(int sum, int a, int b){
    return (double)sum / ((b - a) + 1);
  }

  public int sumOfoddA2B(int a, int b){
    int sum = 0;
    for(int i = a; i <= b; i++){
      if(i % 2 != 0){
        sum += i;
      }
    }
    return sum;
  }

  public int sumOfevenA2B(int a, int b){
    int sum = 0;
    for(int i = a; i <= b; i++){
      if(i % 2 == 0){
        sum += i;
      }
    }
    return sum;
  }
}
