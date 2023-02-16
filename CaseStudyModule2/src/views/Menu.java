package views;

import controller.MaterialManager;
import model.Iphone;
import model.Phone;
import model.Samsung;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public MaterialManager materialManager = new MaterialManager();

    public int checkID ;
    Scanner scanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println(
                """
                         ______________________________________________________
                        |********MENU *****************************************|
                        |  1. Hiển thị sản phẩm<Sắp sếp theo>                  |
                        |  2. Thêm sản phẩm                                    |
                        |  3. Sửa sản phẩm                                     |
                        |  4. Xóa sản phẩm                                     |
                        |  5. Tìm kiếm sản phẩm <Sửa sản phẩm>                 |
                        |  0. Thoát khỏi chương trình                          |
                         ______________________________________________________""");

    }
    public void addPhone () {
        System.out.println("""
                Chon 1 để thêm Samsung
                Chọn 2 để thêm Iphon
                """);
        int a = Integer.parseInt(scanner.nextLine());
        switch (a){
            case 1: addSamsung(); break;
            case 2: addIphon(); break;
        }
    }
    public void addSamsung(){
        System.out.println("Nhập mã sản phẩm Samsung : ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm Samsung : ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất Samsung :");
        String trademark = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm Samsung :");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng sản phẩm Samsung :");
        int quantity = scanner.nextInt();
        Phone s = new Samsung(id,name,trademark,price, quantity);
        try {
            materialManager.addNewMaterial(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addIphon () {
        System.out.println("Nhập mã sản phẩm iphone : ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm iphone : ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất iphone :");
        String trademark = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm iphone :");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng sản phẩm iphone :");
        int quantity = scanner.nextInt();
        Phone i = new Iphone(id, name, trademark, price, quantity);
        try {
            materialManager.addNewMaterial(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //    Xoa sản phẩm theo id
    public void deleteProduct () {
        System.out.println("Mời bạn nhập mã ID sản phẩm cần xóa");
        String string = scanner.nextLine();
        try {
            materialManager.deleteProductByID(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
