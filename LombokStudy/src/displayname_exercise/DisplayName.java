package displayname_exercise;

import java.util.Scanner;

public class DisplayName 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        Person user = new Person(sc.nextLine());
        System.out.println("Welcome " + user.getName());

        sc.close();
    }
}
