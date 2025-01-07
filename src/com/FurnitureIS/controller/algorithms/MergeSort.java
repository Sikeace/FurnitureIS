/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FurnitureIS.controller.algorithms;
import com.FurnitureIS.model.Furnituremodel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kayosh Raj Pradha,23048672
 */
public class MergeSort {
   public void performMergeSortByType(List<Furnituremodel> furnitureList) {
        if (furnitureList.size() <= 1) return;

        int mid = furnitureList.size() / 2;
        List<Furnituremodel> left = new ArrayList<>(furnitureList.subList(0, mid));
        List<Furnituremodel> right = new ArrayList<>(furnitureList.subList(mid, furnitureList.size()));

        performMergeSortByType(left);
        performMergeSortByType(right);

        merge(furnitureList, left, right);
    }

    private void merge(List<Furnituremodel> furnitureList, List<Furnituremodel> left, List<Furnituremodel> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getType().compareToIgnoreCase(right.get(j).getType()) <= 0) {
                furnitureList.set(k++, left.get(i++));
            } else {
                furnitureList.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            furnitureList.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            furnitureList.set(k++, right.get(j++));
        }
    }
}
