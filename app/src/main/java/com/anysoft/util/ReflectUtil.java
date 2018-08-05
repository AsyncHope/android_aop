package com.anysoft.util;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lty
 */

public class ReflectUtil {

    public static String getDeclaredField(Class clazz, String fileName) {

        Field f;
        String name = null;
        try {
            f = clazz.getDeclaredField(fileName);
            f.setAccessible(true);
            return name = (String) f.getName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获取所有的属性名称
     *
     * @param clazz
     */
    public static ArrayList<String> getFieldNames(Class clazz) {
        ArrayList<String> strings = new ArrayList<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            strings.add(declaredFields[i].getName());
        }
        return strings;
    }

    /**
     * 获取所有的属性class名称
     *
     * @param clazz
     */
    public static ArrayList<Class> getFieldClassType(Class clazz) {
        ArrayList<Class> strings = new ArrayList<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            strings.add(declaredFields[i].getGenericType().getClass());
        }
        return strings;
    }

    /**
     * 获取所有的属性类型
     *
     * @param clazz
     */
    public static ArrayList<Type> getFieldType(Class clazz) {
        ArrayList<Type> strings = new ArrayList<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            strings.add(declaredFields[i].getGenericType());
        }
        return strings;
    }

    /**
     * 获取所有的属性名称及值的键值对
     */
    public static Map<String, Object> getFieldNameMap(Object thisClass) {
        Map<String, Object> stringMap = new HashMap<>();
        try {
            Field[] fields = thisClass.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                stringMap.put(fields[i].getName(), fields[i].get(thisClass.getClass().newInstance()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringMap;
    }

    /**
     * 获取所有的属性值
     */
    public static Object getFieldValueByName(Object thisClass, String fieldName) {
        try {
            Field field = thisClass.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(thisClass.getClass().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 把一个字符串的第一个字母大写、效率是最高的、
    public static String getMethodName(String fildeName) throws Exception {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }
}
