/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.List;
import view.Menu;

/**
 *
 * @author Thao Chi
 */
public class WorkerManager extends Menu<String>{
    private List list= new List();
    public WorkerManager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.addWorker();
                break;
            case 2:
                list.changeSalary(1);
                break;
            case 3:
                list.changeSalary(2);
                break;
            case 4: 
                list.printListHistory();
                break;
            case 5:
                System.exit(0);        
        }
    }
}
