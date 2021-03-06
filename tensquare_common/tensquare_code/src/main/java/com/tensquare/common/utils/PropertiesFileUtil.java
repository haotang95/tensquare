package com.tensquare.common.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @auther tangh
 * @date 2019/1/7 0007 20:28
 */
public class PropertiesFileUtil {

    private static InputStream inputStream;

    private static Map<String,Object> map;

    private static String defaultResource = "bootstrap.yml";

    public static synchronized PropertiesFileUtil getInstance() {
        if(map == null){
            inputStream = ClassLoader.getSystemResourceAsStream(defaultResource);
            Yaml yaml = new Yaml();
            map = (Map<String,Object>) yaml.loadAs(inputStream, Map.class);
        }
        return new PropertiesFileUtil();
    }

    public static synchronized PropertiesFileUtil getInstance(String resource) {
        if(map == null){
            inputStream = File.class.getClassLoader().getResourceAsStream(resource);
            Yaml yaml = new Yaml();
            map = (Map<String,Object>) yaml.load(inputStream);
        }
        return new PropertiesFileUtil();
    }

    public synchronized String get(String key){
        if (map == null) {
            getInstance();
        }
        Map<String,Object> temp = map;
        List<String> list = Arrays.asList(key.split("\\."));
        for (String str:list){
            Object o = temp.get(str);
            if(o instanceof Map)
                temp = (Map<String, Object>) o;
        }
        return String.valueOf(temp.get(list.get(list.size() - 1)));
    }
}
