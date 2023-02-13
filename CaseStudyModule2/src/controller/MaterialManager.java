package controller;

import model.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    List<Material> materialList = new ArrayList<>();

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
}
