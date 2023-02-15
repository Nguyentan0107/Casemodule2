package views;

import controller.MaterialManager;
import model.Material;
import model.Screen;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        MaterialManager materialManager = new MaterialManager();
        Menu menu = new Menu();
        menu.addScreen();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập mã sản phẩm: ");
//        String id = scanner.nextLine();
//        System.out.println("Nhập tên sản phẩm: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập hãng sản phẩm: ");
//        String manuf = scanner.nextLine();
//        System.out.println("Nhập số lượng sản phẩm: ");
//        double quantity = scanner.nextDouble();
//        System.out.println("Nhập giá sản phẩm: ");
//        double price = scanner.nextDouble();
//        System.out.println("Nhập kích thước sản phẩm: ");
//        double inch = scanner.nextDouble();
//        Material sp = new Screen(id,name,manuf,quantity,price, (int) inch);
//        try {
//            materialManager.addNewMaterial(sp);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        materialManager.showMaterial();

//        int lt = 0;
//        do {
//            System.out.println("Menu____________________");
//            System.out.println("Vui lòng chọn chức năng ?");
//            System.out.println(
//                    "1. Hiển thị sản phẩm<Sắp sếp theo>\n" +
//                     "2. Thêm sản phẩm\n" +
//                            "3. Sửa sản phẩm\n" +
//                            "4. Xóa sản phẩm\n" +
//                            "5. Tìm kiếm sản phẩm <Sửa sản phẩm>\n" +
//                            "0. Thoát khỏi chương trình" +
//                    "");
//
//        }


    }
}