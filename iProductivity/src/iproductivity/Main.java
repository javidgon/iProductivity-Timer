package iproductivity;

import java.util.ArrayList;
import java.util.List;
import controller.*;
import model.*;
import view.task.TaskView;
import view.task.TaskViewImpl;
import view.options.OptionsViewImpl;
import view.tasksAccomplished.TasksAccomplishedViewImpl;
import view.welcome.WelcomeFrame;




public class Main {

    public static void main(String[] args) {

    // MAIN de la explicación.

        //--------------Definiciones----------------

        // Creamos el modelo de la aplicación.
        
        TaskModel taskModel = new TaskModelImpl();
        
        // Creamos el controlador de la aplicación.
        
        TaskController taskController = new TaskControllerImpl();

        // Creamos la lista de vistas.

        List<TaskView> taskViews= new ArrayList<TaskView>();

        // Creamos la vista 1.

        TaskView taskView1 =new TaskViewImpl();

        // La introducimos en la lista de vistas.

        taskViews.add(taskView1);

        // Creamos los siguientes paneles.

        TasksAccomplishedViewImpl tasksAccomplished= new TasksAccomplishedViewImpl(taskView1);

        OptionsViewImpl optionsView = new OptionsViewImpl(taskView1);

        // Creamos el FRAME de inicio, es decir, el que nos va a dar acceso a la aplicación.

        WelcomeFrame welcomeFrame = new WelcomeFrame(taskView1,tasksAccomplished,optionsView);


        //---------------Configuración-------------------

        // Configuramos el controlador pasándole el modelo y la lista de vistas.

        taskController.setup(taskModel,taskViews);

        // Le decimos que lo muestre.

        welcomeFrame.setVisible(true);


    }

}
