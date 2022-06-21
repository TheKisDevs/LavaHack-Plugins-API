package com.kisman.cc.util;

import org.cubic.loader.reflect.Instantiator;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:21 of 15.06.2022
 */
public class ReflectUtil {
    public static Class<?> getCallerClass(){return null;}
    public static Class<?> getCallerClass(int depth){return null;}
    public static <T> T createInstance(Class<T> cls){return null;}
    public static <T> T createInstance(Class<T> cls, Instantiator instantiator){return null;}
    public static <T> List<T> load(Class<T> cls, String pkg){return null;}
    public static <T> List<T> load(Class<T> cls, String pkg, Instantiator instantiator){return null;}
    public static <T> List<T> loadAll(Class<T> cls, String pkg){return null;}
    public static <T> List<T> loadAll(Class<T> cls, String pkg, Instantiator instantiator){return null;}
    public static Object getObjectFieldVal(Class<?> cls, String name, Object instance){return null;}
    public static Object getStaticFieldVal(Class<?> cls, String name){return null;}
    public static Object invoke(Class<?> cls, Object instance, String method, Class<?>[] paramTypes,Object... args){return null;}
    public static Object invoke(Method method, Object instance, Object... args){return null;}
    public static Method getMethod(Class<?> cls, String methodName, Class<?>[] paramTypes){return null;}
    public static Package getPackage(ClassLoader cl, String pkg){return null;}
    public static Class<?> findLoadedClass(ClassLoader cl, String cls){return null;}
    public static Class<?> findClass(ClassLoader cl, String name) throws ClassNotFoundException {return null;}
    public static Class<?> classForName(ClassLoader cl, String name, boolean initialize) throws ClassNotFoundException {return null;}
}
