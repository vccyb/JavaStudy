package com.chen.fileDEmo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo2 {


    public static void main(String[] args) throws IOException {


        FileUtils.copyFile(new File("day-11-File/src/com/chen/fileDEmo/code3.txt"), new File("day-11-File/src/com/chen/fileDEmo/code3_copy.txt"));
    }
}
