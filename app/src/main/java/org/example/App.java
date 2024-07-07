/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        float sumAB = new Calculate().sumAB(2, 3);
        float aveAB = new Calculate().aveAB(sumAB);

        float sumA2B = new Calculate().sumA2B(1, 10);
        float aveA2B = new Calculate().aveA2B(sumA2B, 1, 10);

        int odd = new Calculate().sumOfoddA2B(1, 10);
        int even = new Calculate().sumOfevenA2B(1, 10);

        System.out.println("Sum of 2 and 3 is " + sumAB + ". Average is " + aveAB + ".");
        System.out.println("Sum of 1 to 10 is " + sumA2B + ". Average is " + aveA2B + ".");
        System.out.println("Sum of odd of 1 to 10 is " + odd + ". Sum of even is " + even + ".");
    }
}
