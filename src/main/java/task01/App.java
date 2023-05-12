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
       while(task!="exit")
       {
            double firstNum =0;
            double secondNum =0;
            task = con.readLine(">");
            Scanner scan = new Scanner(task);
            List<String> hold = new ArrayList<>();
            while(scan.hasNext())
            {
                hold.add(scan.next());
            }
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

        }
    }
}
