
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mtech
 */
interface shape { 

    void area(int i);
}

class circle implements shape {

    float pi = (float) 3.14;

    @Override
    public void area(int i) {
        System.out.println("Area of Circle is=" + i * i * pi);

    }

}

class square implements shape {

    @Override
    public void area(int i) {
        System.out.println("Area of Square is=" + i * i);
    }
    public void side(int i)
    {
         System.out.println("Side of Square is=" + i );
    }

}

class rectangle extends square {

    public void area(int i) {
        System.out.println("Area of Rectangle  is=" + i * 2 * i);
    }
public void side(int i, int j)
    {
         System.out.println("width of Rectangle is=" + i );
         System.out.println("height of Rectangle is=" + j );
           
    }
}

public class oop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        square s = new square();
        square r = new rectangle(); // methodoverriding 
        rectangle r1=new rectangle();
        
        System.out.println("enter some value");
        int n = sc.nextInt();
        short sh=(short) n;//downcasting   int to short
        long l=n; //upcasting
        c.area(n);
        s.area(n);
        r.area(n);
        r1.side(n);//inheritance
        r1.side(n, 2*n); //overloading
    }

}
