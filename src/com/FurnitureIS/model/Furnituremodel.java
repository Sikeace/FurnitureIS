/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FurnitureIS.model;

/**
 *
 * @author Kayosh Raj Pradha,23048672
 */
public class Furnituremodel {
    private String FurnitureID;
    private String Name;
    private String Type;
    private String Brand;
    private String Material;

    public Furnituremodel(String FurnitureID, String Name, String Type, String Brand, String Material) {
        this.FurnitureID = FurnitureID;
        this.Name = Name;
        this.Type = Type;
        this.Brand = Brand;
        this.Material = Material;
    }

    public String getFurnitureID() {
        return FurnitureID;
    }

    public void setFurnitureID(String FurnitureID) {
        this.FurnitureID = FurnitureID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
}
