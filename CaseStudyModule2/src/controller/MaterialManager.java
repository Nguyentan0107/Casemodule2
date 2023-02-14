package controller;

import model.Material;
import storage.ReadWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    List<Material> materialList = ReadWriteFile.readFile();

    public MaterialManager() {
        this.materialList = materialList;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
    public void addNewMaterial(Material material) throws IOException {
        this.materialList.add(material);
        ReadWriteFile.writeFile(materialList);
    }
    public void showMaterial() {
        for (Material o: materialList) {
            System.out.println(o);
        }
                
                
    }
}
