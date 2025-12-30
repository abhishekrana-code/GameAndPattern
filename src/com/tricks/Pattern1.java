package com.tricks;

public class Pattern1 {
    public static void main(String[] args) {
        pattern6(5 );
    }
    static void pattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int s=0;s<n-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>0;col--)
            {
                System.out.print(col);
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern1(int n)
    {
        for(int row=0;row<n*2;row++)
        {
            int totalRow = row>n ? 2*n - row: row;
            for(int col=0;col<totalRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
        for(int row=0;row<n;row++)
        {
            for (int s=0;s<n-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                if(col==0||col==row-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int s=n-row;s>0;s--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < totalColsInRow; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for (int row=n;row>0;row--)
        {
            for(int s=0;s<n-row;s++)
            {
                System.out.print(" ");
            }

            for(int col=row;col>0;col--)
            {
                System.out.print("*");
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        int c=0;
        for(int row =1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
