package views;

import controller.MaterialManager;
import model.Iphone;
import model.Phone;
import model.Samsung;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public MaterialManager materialManager = new MaterialManager();
    public int checkID;
    Scanner scanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println(
                " ______________________________________________________\n" +
                "|  MỜI BẠN CHON SỐ ĐỂ CHỌN CHỨC NĂNG                   |\n" +
                "|  1. Hiển thị sản phẩm<Sắp sếp theo>                  |\n" +
                "|  2. Thêm sản phẩm                                    |\n" +
                "|  3. Sửa sản phẩm                                     |\n" +
                "|  4. Xóa sản phẩm                                     |\n" +
                "|  5. Tìm kiếm sản phẩm <Sửa sản phẩm>                 |\n" +
                "|  0. Thoát khỏi chương trình                          |\n" +
                " ______________________________________________________");
    }


//    1 thêm sản phẩm man hình
    public void addSamsung() throws IOException {// Nhập sản phẩn Samsung
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String trademark = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng sản phẩm:");
        int quantity = scanner.nextInt();
        Phone s = new Samsung(id,name,trademark,price, (int) quantity);
        materialManager.addNewMaterial(s);
    }
    public void addIphon () {// Nhập sản phẩm Iphone
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String trademark = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng sản phẩm:");
        int quantity = scanner.nextInt();
        Phone i = new Iphone(id,name,trademark,price,quantity);
        try {
            materialManager.addNewMaterial(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    Xoa sản phẩm theo id
    public void deleteProduct(){
        System.out.println("Mời bạn nhập mã ID sản phẩm cần xóa");
        String string = scanner.nextLine();
    }



}
