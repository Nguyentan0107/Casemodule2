package views;

import controller.MaterialManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.showMenu();
        System.out.println("MỜI BẠN CHON SỐ ĐỂ CHỌN CHỨC NĂNG");
        int a = scanner.nextInt();
        switch (a) {
            case 1 :
                System.out.println("Hiển thị sản phẩm<Sắp sếp theo>");
                break;
            case 2 : menu.addPhone();break;
            case 3 : System.out.println("3"); break;
            case 4 : menu.deleteProduct();
            case 5 : menu.findProductMN();
            case 0 : System.out.println("[ Bạn đã thoát khỏi chương trình. ]"); break;
        }
        materialManager.showMaterial();
    }
}