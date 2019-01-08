package com.tensquare.common.utils;

import java.util.ResourceBundle;

/**
 * @auther tangh
 * @date 2019/1/7 0007 20:28
 */
public class PropertiesFileUtil {

    private static ResourceBundle resourceBundle;

    private static String defaultResource = "config";

    public static PropertiesFileUtil getInstance() {
        resourceBundle = ResourceBundle.getBundle(defaultResource);
        return new PropertiesFileUtil();
    }

    public static PropertiesFileUtil getInstance(String resource) {
        resourceBundle = ResourceBundle.getBundle(resource);
        return new PropertiesFileUtil();
    }

    public String get(String key) {
        if (resourceBundle == null) {
            getInstance();
        }
        return resourceBundle.getString(key);
    }
}
