//Calculate if a given year is a leap year or not 

import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter Year : ");
     int year=sc.nextInt();
     if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is  leap year.");
        } else {
            System.out.println(year + " is not  leap year.");
        }
     sc.close();
    }
}

//sequence print with loop

import java.util.Scanner;
public class PrintSeries
{
    public static void main(String[] args)
    {
        int i;
        //for loop
        for(i=2;i<=20;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
       // do while loop
        i=2;
        do {
            System.out.print(i+" ");
            i+=2;
        }

        while(i<=20);
        System.out.println();
        //while loop
        i=2;
        while(i<=20)
        {
            System.out.print(i+" ");
            i+=2;
        }
System.out.println();
//for loop
        for( i=1;i<=20;i+=2)
    {
        System.out.print(i+" ");
    }
        System.out.println();
        //do while loop
    i=1;
        do {
    System.out.print(i+" ");
    i+=2;
}
//while loop
        while(i<=20);
        System.out.println();
    i=1;
        while(i<=20)
    {
        System.out.print(i+" ");
        i+=2;
    }
System.out.println();
}
}

//  Calculate the sum of the series

public class SumOfSeries {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 2;i<=20;i+=2){
            sum1 +=i;
        }
        System.out.println("Sum of the first series is " + sum1);

        for(int i =1;i<20;i+=2){
            sum2+=i;
        }
        System.out.println("Sum  of the second series is "+ sum2);
    }
}
