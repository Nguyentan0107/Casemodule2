package views;

import controller.MaterialManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MaterialManager materialManager = new MaterialManager();
        Menu menu = new Menu();
        menu.showMenu();
//        do {
//            menu.showMenu();
//        }

    }
}