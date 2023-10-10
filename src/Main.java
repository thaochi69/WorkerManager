
import controller.WorkerManager;
import java.util.ArrayList;
import model.History;
import model.Worker;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        String title = "Worker Management ";
        String[] s = new String[]{"Add Worker ", "Up Salary",
            "Down Salary ", "Display Information salary ", "Exit"};
        Menu<String> menu = new WorkerManager(title, s);
        menu.run();
    }
}
