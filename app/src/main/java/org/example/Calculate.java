package org.example;

public class Calculate{
  public int sum(int x, int y){
    return x + y;
  }

  public float sumAB(int a, int b){
    float sum = a + b;
    return sum;
  }

  public float aveAB(float sum){
    float ave = sum / 2;
    return ave;
  }

  public float sumA2B(int a, int b){
    float sum = 0;
    for(int i = a; i <= b; i++){
      sum += i;
    }
    return sum;
  }

  public float aveA2B(float sum, int a, int b){
    int n = (b - a) + 1;
    float ave = sum / n;
    return ave;
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
