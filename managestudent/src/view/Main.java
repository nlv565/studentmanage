/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;

import controller.Manage;
import model.Student;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Nguyen Bui Quoc Viet", "Summer", "java"));
        ls.add(new Student("2", "Nguyen Le", "Summer", ".net"));
        ls.add(new Student("3", "Le Nguyen", "Spring", "c/c++"));
        int count = 3;
        //loop until user want to exit program
        while (true) {
            //Show menu option
            Manage.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manage.createStudent(count, ls);
                    break;
                case 2:
                    Manage.findAndSort(ls);
                    break;
                case 3:
                    Manage.updateOrDelete(count, ls);
                    break;
                case 4:
                    Manage.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }
}
