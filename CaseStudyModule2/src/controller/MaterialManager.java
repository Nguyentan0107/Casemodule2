package controller;

import model.Phone;
import storage.ReadWriteFile;

import java.io.IOException;
import java.util.Comparator;
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
//    Thêm sản phẩm vào arraylist
    public void addNewMaterial(Phone material) throws IOException {
        this.materialList.add(material);
        ReadWriteFile.writeFile(materialList);
    }
//    Hiển thị sản phẩm.
    public void showMaterial() {
        for (Phone o: materialList) {
            System.out.println(o);
        }
    }
//    Xóa sản phẩm.
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
//    public void sortM(){
//        materialList.sort(new Comparator<Phone>() {
//            @Override
//            public int compare(Phone o1, Phone o2) {
//              return   o1.getId().compareTo(o2.getId());
//            }
//        });
//    }
//    Sửa sản phẩm
//    public void editProduct(String id) throws IOException {
//        for (Phone o : materialList) {
//            if (id.equals(o.getId())) {
//                for (Phone i:materialList) {
//                    i.getId() = ;
//
//                }
//                ReadWriteFile.writeFile(materialList);
//                break;
//            }else {
//                System.out.println("Không có mã sản phẩm nào trùng mã bạn vừa nhập");
//            }
//        }
//    }




}
