package com.bitcamp.api.common.proxy;

import java.io.File;
import java.util.HashMap;

public class FileProxy<T> {
    private File file;
    public File make(String s, T t){
        HashMap<String, T> m = new HashMap<>();
        m.put("T", t);
        return m.get("T") instanceof String
                ? new File((String) m.get("T"), s)
                : new File((File) m.get("T"), s);
    }
    /**
     *  File uploadPath = new FileProxy<String>().make(uploadFolder, getFolder());
     *  System.out.print("파일경로 :"+uploadPath.getPath())
     *  File savedFile = new FileProxy<File>().make(uploadPath, "")
     *  System.out.print("파일경로 :"+savedPath.getPath())
     * */

}
