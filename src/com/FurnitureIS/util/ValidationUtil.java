/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FurnitureIS.util;

import java.util.regex.Pattern;
/**
 *
 * @author Kayosh Raj Pradha,23048672
 */
public class ValidationUtil {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern FURNITURE_ID_PATTERN = Pattern.compile("^[a-zA-Z]+\\d{7}+$");
    private static final Pattern TYPE_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern BRAND_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * 
     *
     * @param FurnitureId the FurnitureId to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidFurnitureId(String FurnitureId) {
        return !isNullOrEmpty(FurnitureId) && FURNITURE_ID_PATTERN.matcher(FurnitureId).matches();
    }

    /**
     * Validates if the program is one of the allowed options.
     *
     * @param Type the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidType (String Type) {
        return !isNullOrEmpty(Type) && TYPE_PATTERN.matcher(Type).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param Brand the 
     * @return true if valid, otherwise false
     */
    public static boolean isValidBrand(String Brand) {
        return !isNullOrEmpty(Brand) && BRAND_PATTERN.matcher(Brand).matches();
    }
    
}
