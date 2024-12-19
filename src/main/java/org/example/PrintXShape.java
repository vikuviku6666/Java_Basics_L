package org.example;

public class PrintXShape
{
    void draw(int size, char pen){
        for (int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                if(j==i || j==size-i+1)
                    System.out.print(pen);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        PrintXShape print = new PrintXShape();
        print.draw(9, 'X');
    }
}
