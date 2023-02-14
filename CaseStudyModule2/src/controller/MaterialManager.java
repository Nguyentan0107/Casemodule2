package controller;

import model.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    List<Material> materialList = new ArrayList<>();

    public MaterialManager() {
        this.materialList = materialList;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
    public void addNewMaterial(Material material) {
        this.materialList.add(material);
    }
    public void showMaterial() {
        for (Material o: materialList) {
            System.out.println(materialList);
        }
                
                
    }
}
