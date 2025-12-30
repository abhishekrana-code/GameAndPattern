package com.tricks;
class Printing extends Thread{
    public void run()
    {
        try
        {
            for(int row=0;row<5;row++)
            {
                for (int s=0;s<5-row;s++)
                {
                    System.out.print(" ");
                }
                for(int col=0;col<row;col++)
                {
                    if(col==0||col==row-1) {
                        System.out.print("* ");
                        Thread.sleep(300);
                    }
                    else {
                        System.out.print("  ");
                        Thread.sleep(300);
                    }
                }
                for (int s=5-row;s>0;s--)
                {
                    System.out.print(" ");
                    Thread.sleep(300);
                }
                System.out.println();
                Thread.sleep(300);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class MainPrinting
{
    public static void main(String[] args) {
        Printing t=new Printing();
        t.start();
    }
}
