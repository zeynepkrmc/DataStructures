import java.io.*;
import java.util.*;

class stack 
{
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
         System.out.println("Pop Operation:");
         for(int i = 0; i < 5; i++)
         {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
         }
    }

    // Searching element in the stack
    static void search_stack(Stack<Integer> stack, int element)
    {
        Integer find = (Integer) stack.search(element);

        if(find == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + find);
    }

    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        search_stack(stack, 2);
        search_stack(stack, 6);
    }



}