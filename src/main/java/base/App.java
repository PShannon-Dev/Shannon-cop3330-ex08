package base;

import java.util.Scanner;

public class App
{
    //class scanner
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App pizza = new App();

        //input all required data
        int people = pizza.total_People();
        int pizzaPie = pizza.pizza_Total();
        int per = pizza.slices_per();

        //calculate most amount of slices people can make with remainder
        int total = pizza.total(pizzaPie,per);
        int even_slice = pizza.distribute(total,people);
        int leftover = pizza.leftover(total, even_slice, people);

        //output
        pizza.print_output(people, pizzaPie, total, even_slice, leftover);
    }

    public int total_People()
    {
        System.out.print("How many people? ");
        return in.nextInt();
    }

    public int pizza_Total()
    {
        System.out.print("How many pizzas do you have? ");
        return in.nextInt();
    }

    public int slices_per()
    {
        System.out.print("How many slices per pizza? ");
        return in.nextInt();
    }

    public int total(int pies, int slicesPer)
    {
        return pies * slicesPer;
    }

    public int distribute(int total, int people)
    {
        return total / people;
    }

    public int leftover(int total, int evenSlices, int people)
    {
        //find total slices eaten
        int eaten = evenSlices * people;
        return total - eaten;
    }

    public void print_output(int people, int pies, int totalSlices, int portion, int leftovers)
    {
        //concatenating the strings
        System.out.print(people + " people with " + pies + " pizzas (" + totalSlices + " slices)\n" +
                "Each person gets " + portion + " pieces of pizza.\nThere are " + leftovers + " leftover pieces.\n");
    }

}
