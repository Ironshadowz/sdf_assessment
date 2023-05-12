package task01;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Welcome.");
       Console con = System.console();
       String task = "";
       double last =0;
       while(!task.equals("exit"))
       {
            double firstNum =0;
            double secondNum =0;
            task = con.readLine("> ");
            if(task.equals("exit"))
                break;
            Scanner scan = new Scanner(task);
            List<String> hold = new ArrayList<>();
            while(scan.hasNext())
            {
                hold.add(scan.next());
            }
            try 
            {
            if(hold.get(0).equals("last"))
            {
                firstNum=last;
            } else 
            {
                 firstNum = Double.parseDouble(hold.get(0));
            }
            if(hold.get(2).equals("last"))
            {
                secondNum=last;
            } else 
            {
                secondNum = Double.parseDouble(hold.get(2));
            }
            } catch(Exception e)
            {
                System.err.println("Incorrect input or spacing");
                continue;
            }
            if(hold.get(1).equals("+"))
            {
                last = firstNum + secondNum;
            } else if(hold.get(1).equals("-"))
            {
                last = firstNum - secondNum;
            } else if(hold.get(1).equals("/"))
            {
                last = firstNum / secondNum;
            } else if(hold.get(1).equals("*"))
            {
                last = firstNum * secondNum;
            } 
            if(last%1 !=0)
            {
                System.out.println(last);
            } else 
            {
                int x = (int)last;
                System.out.println(x);
            } 
        }
        System.out.println("Bye bye");
    }
}
