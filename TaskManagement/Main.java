package Weekly_Assignment.TaskManagement;

import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("Welcome");
        System.out.println("Select one Option");
        System.out.println("1. Admin");
        System.out.println("2. User");
        int option=scanner.nextInt();
        switch (option)
        {
            case 1:
            {
                System.out.println("You want to login or register? ");
                System.out.println("1. Login");
                System.out.println("2. Register");
                int credentialOption= scanner.nextInt();
                switch (credentialOption)
                {
                    case 1:
                    {

                    }
                    case 2:
                    {

                    }
                    default:
                        System.out.println("Select valid option");
                }
            }
            case 2:
            {
//                userMenu();
            }
            default:
                System.out.println("Please Enter a valid option");
        }
    }

    public static void adminMenu()
    {
        while(true)
        {
            System.out.println("Select the option that you want to select ");
            System.out.println("0. Exit");
            System.out.println("1. Add Classroom");
            System.out.println("2. Delete Classroom");
            System.out.println("3. Add User");
            System.out.println("4. Delete User");
            System.out.println("5. Assign Task ");
            System.out.println("6. Delete Task");
            System.out.println("7. View Users(or Student) in a Classroom");
            System.out.println("8. View Tasks that are assigned to User in a classrooms");
            System.out.println("9. View All Users");
            System.out.println("10. View Submitted Task of Users");
            System.out.println("11. View Missing Tasks");
            System.out.println("12. Add admin");
            System.out.println("13. Show Admin");
            int adminOption = scanner.nextInt();
            if(adminOption==0)
            {
                System.out.println("Exited");
                break;
            }
            switch (adminOption)
            {
                case 1:
                {

                }
            }
        }
    }

}
