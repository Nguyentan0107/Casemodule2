package controller;

import model.Phone;
import model.Samsung;
import storage.ReadWriteFile;
import java.io.IOException;
import java.util.List;

public class MaterialManager {
    List<Phone> materialList = ReadWriteFile.readFile();

    public MaterialManager() {
        this.materialList = materialList;
    }

    public List<Phone> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Phone> materialList) {
        this.materialList = materialList;
    }
//Thêm sản phẩm vào arraylist.
    public void addNewMaterial(Phone material) throws IOException {
        this.materialList.add(material);
        ReadWriteFile.writeFile(materialList);
    }
//Hiển thị sản phẩm.
    public void showMaterial() {
        for (Phone o: materialList) {
            System.out.println(o);
        }
    }
//Xóa sản phẩm.
    public void deleteProductByID(String id) throws IOException {
        for (Phone o : materialList) {
            if (id.equals(o.getId())) {
                materialList.remove(o);
                ReadWriteFile.writeFile(materialList);
                break;
            }else {
                System.out.println("Không có mã sản phẩm nào trùng mã bạn vừa nhập");
            }
        }
    }

//Tìm sản phẩm theo id.
    public void findProduct(String id) throws IOException {
        for (Phone o : materialList) {
            if (id.equals(o.getId())) {
                System.out.println(o);
            }
        }
    }
//Sửa sản phẩm.
//    public void editProduct(String id) throws IOException {
//        for (Samsung o : materialList) {
//            if (id.equals(o.getId())) {
//                materialList.get(o).setName();
//                materialList.get(o).setTrademark();
//                materialList.get(o.getQuantity()).setPrice();
//                materialList.get(o.getQuantity()).();
//        }
//    }
//}




}
