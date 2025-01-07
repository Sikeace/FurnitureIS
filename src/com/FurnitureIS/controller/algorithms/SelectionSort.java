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



    
public class SelectionSort {
    public void performSelectionSort(List<Furnituremodel> furnitureList) {
        int listSize = furnitureList.size();

        for (int step = 0; step < listSize - 1; step++) {
            int minIndex = step;

            for (int next = step + 1; next < listSize; next++) {
                // Compare string properties (e.g., modelName) lexicographically
                if (furnitureList.get(next).getName().compareTo(furnitureList.get(minIndex).getName()) < 0) {
                    minIndex = next;
                }
            }

            // Swap
            Furnituremodel tefurnimodel = furnitureList.get(step);
            furnitureList.set(step, furnitureList.get(minIndex));
            furnitureList.set(minIndex, tefurnimodel);
        }
    }
}

