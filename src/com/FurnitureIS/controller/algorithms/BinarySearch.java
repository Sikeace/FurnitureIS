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
public class BinarySearch {
     public Furnituremodel searchByName(String searchValue, List<Furnituremodel> furnitureList,
            int left, int right) {

        if (right < left) {
            return null;
        }

        int mid = (left + right) / 2;

        if (searchValue.toLowerCase().equals(furnitureList.get(mid).getName().toLowerCase())) {
            return furnitureList.get(mid);
        } else if (searchValue.compareToIgnoreCase(furnitureList.get(mid).getName()) < 0) {
            return searchByName(searchValue, furnitureList, left, mid - 1);
        } else {
            return searchByName(searchValue, furnitureList, mid + 1, right);
        }

    }
}



