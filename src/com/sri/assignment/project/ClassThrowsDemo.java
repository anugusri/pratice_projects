package com.sri.assignment.project;

public class ClassThrowsDemo {
	
    
        void Division() throws ArithmeticException
        {
            int a=45,b=0,rs;
rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
         public static void main(String[] args)
        {
ClassThrowsDemo T = new ClassThrowsDemo();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\tEnd of program.");
        }
    }


