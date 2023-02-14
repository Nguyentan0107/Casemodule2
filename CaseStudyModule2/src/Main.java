import controller.MaterialManager;
import model.Material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản phẩm: ");
        String manuf = scanner.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        double quantity = scanner.nextDouble();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập kích thước sản phẩm: ");
        double inch = scanner.nextDouble();
        Material sp = new Material(id,name,manuf,quantity,price);
        materialManager.addNewMaterial(sp);
        materialManager.showMaterial();


    }
}