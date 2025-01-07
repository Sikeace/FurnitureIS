/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FurnitureIS.controller.algorithms;
import com.FurnitureIS.model.Furnituremodel;
import java.util.List;
/**
 *
 * @author Kayosh Raj Pradha,23048672
 */
public class InsertionSort {
     public void performInsertionSortByFurnitureID(List<Furnituremodel> furnitureList) {
        int listSize = furnitureList.size();
        
        // Insertion Sort logic
        for (int i = 1; i < listSize; i++) {
            Furnituremodel current = furnitureList.get(i);
            int j = i - 1;
            
            // Move elements of furnitureList[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (j >= 0 && furnitureList.get(j).getFurnitureID().compareTo(current.getFurnitureID()) > 0) {
                furnitureList.set(j + 1, furnitureList.get(j));
                j = j - 1;
            }
            
            // Place current at its correct position
            furnitureList.set(j + 1, current);
        }
    }
}
