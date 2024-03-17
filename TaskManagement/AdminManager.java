package Weekly_Assignment.TaskManagement;

import java.util.ArrayList;
import java.util.List;

import static Weekly_Assignment.TaskManagement.Main.adminMenu;
import static Weekly_Assignment.TaskManagement.Main.scanner;

public class AdminManager
{
    List <Admin> adminList;
    AdminManager()
    {
        adminList = new ArrayList<>();
    }

//    add admin
      public void registerAdmin()
      {
          System.out.println("Enter the username of admin");
          String adminUsername= scanner.next();
          System.out.println("Enter the Password of admin");
          String adminPassword= scanner.next();
          for(Admin admin: adminList)
          {
              if(admin.getUsername().equals(adminUsername))
              {
                  System.out.println("Admin with this username is already exits");
                  return;
              }
          }
          Admin newAdmin= new Admin(adminUsername,adminPassword);
          adminList.add(newAdmin);
          System.out.println("Admin is added");
      }
      //registration

}
