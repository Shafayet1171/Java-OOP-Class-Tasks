//Store some values (integer or floating point) and print the average of them

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        double []a=new double[n];
        double s=0.0;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextDouble();
            s+=a[i];
        }
        double average=(double)(s/n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(average);
    }
}



//A program to give medal  OR not


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      double grade=obj.nextDouble();
      boolean graduation_cmplt=obj.nextBoolean();
      if(graduation_cmplt)
      {
          if(grade>=3.5)
          {
              System.out.println("Student will get medal");
          }
          else  System.out.println("Student will not get medal");
      }
      else System.out.println("Student will not get medal");
    }
}



//Bonus part :


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int tsale =obj.nextInt();
      int attendance=obj.nextInt();
      if(tsale>=95 )
      {
          if(attendance==100)
          {
              System.out.println("BONUS:"+" "+60);
          }
          else if(attendance>=90)
          {
              System.out.println("BONUS:"+" "+40);
          }
      }
      else if(tsale>=80)
      {
          if(attendance==100)
          {
              System.out.println("BONUS:"+" "+40);
          }
          else if(attendance>=90)
          {
              System.out.println("BONUS:"+" "+20);
          }
      }
      else System.out.println("BONUS:"+" "+5);

    }
}



//Greatest number of a given series:


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int []arr=new int[n];
      int max=-1000000;
      for(int i=0;i<n;i++)
      {
          arr[i]=obj.nextInt();
          if(arr[i]>max) {
              max = arr[i];
          }
      }
      System.out.println(max);

    }
}


// Check a given number is a prime number or not.


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();

      boolean isprime=true;
      for(int i=2;i*i<=n;i++)
      {
if(n%i==0)
{
    isprime=false;
    break;
}
      }
     if(isprime) System.out.println("IT IS A PRIME NUMBER");
     else System.out.println("IT IS NOT A PRIME NUMBER");

    }
}


//Reverse a given series using Arrays and loops:


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=obj.nextInt();
      }
      for(int i=n-1;i>=0;i--)
      {
          System.out.print(arr[i]+" ");
      }
      System.out.println();

    }
}


//store and count the number of odd and even number present in array:


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=obj.nextInt();
      }
      int odd=0,even=0;
      for(int i=n-1;i>=0;i--)
      {
          if(arr[i]%2==1)odd++;
          else even++;
      }
      System.out.println("NUMBER OF ODD: "+" "+odd);
      System.out.println("NUMBER OF EVEN: "+" "+even);

    }
}


//Print the following Fibonacci series:


import java.util.Scanner;
public class Main
{
    public static int fibonacci(int n)
    {
        if(n==0)return 0;
        else if(n==1)return 1;
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);

        }
    }
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int n=15;
      for(int i=0;i<=n;i++)
      {
          System.out.print(fibonacci(i));
          if(i<n)System.out.print(",");
      }

    }
}
