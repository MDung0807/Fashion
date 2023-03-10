package com.web.fashion.fashion.Utils;

import org.springframework.data.domain.Example;

import java.lang.reflect.Type;

public class DTOAndEntity {
    public static boolean set(Example<Type> des, Example<Type> source){
        try {
            des=source;
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
