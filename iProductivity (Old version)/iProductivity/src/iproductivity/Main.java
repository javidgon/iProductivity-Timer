package iproductivity;

import java.util.ArrayList;
import java.util.List;
import controller.*;
import model.*;
import view.task.TaskView;
import view.task.TaskViewImpl;
import view.GlobalView;
import view.options.OptionsViewImpl;
import view.tasksAccomplished.TasksAccomplishedViewImpl;
import view.welcome.WelcomeFrame;
import view.welcome.WelcomeViewImpl;




public class Main {

    public static void main(String[] args) {


        //Cliente
        TaskModel taskModel = new TaskModelImpl();


        TaskView taskView1 =new TaskViewImpl();
        WelcomeViewImpl welcomeView = new WelcomeViewImpl(taskView1);
        TasksAccomplishedViewImpl tasksAccomplished= new TasksAccomplishedViewImpl(taskView1);
        OptionsViewImpl optionsView = new OptionsViewImpl(taskView1);
        List<TaskView> taskViews= new ArrayList<TaskView>();
        taskViews.add(taskView1);


        TaskController taskController = new TaskControllerImpl();

        taskController.setup(taskModel,taskViews);

        WelcomeFrame welcomeFrame = new WelcomeFrame(taskView1,tasksAccomplished,optionsView);

        welcomeFrame.setVisible(true);


    }

}
