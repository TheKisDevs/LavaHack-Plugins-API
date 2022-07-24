package org.cubic.loader.reflect;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:23 of 15.06.2022
 */
public interface Instantiator {
    Object instantiate(Class<?> cls) throws Exception;

    static Instantiator getDefault(){
        return null;
    }
}
