package Weekly_Assignment.TaskManagement;

import java.util.ArrayList;
import java.util.List;

public class Classroom
{
    private final String classroomId;
    private String classroomName;
    List<User> userList;
    List<Task> taskList;

    Classroom(String classsroomId, String classroomId, String classroomName)
    {
        this.classroomId = classroomId;
        this.classroomName= classroomName;
        userList= new ArrayList<>();
        taskList = new ArrayList<>();
    }

}
