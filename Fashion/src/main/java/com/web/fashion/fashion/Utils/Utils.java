package com.web.fashion.fashion.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Utils {
    public static String toString(MultipartFile fileInput){
        try{
            return new String(Base64.getEncoder().encode(fileInput.getBytes()), StandardCharsets.UTF_8);
        }
        catch (Exception ex){
            return null;
        }
    }
}
