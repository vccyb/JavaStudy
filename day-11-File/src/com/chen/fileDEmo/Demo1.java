package com.chen.fileDEmo;

import java.io.*;

public class Demo1 {


    public static void main(String[] args) throws IOException {


        File file = new File("day-11-File/src/com/chen/fileDEmo/code.txt");
        System.out.println(file.length());
        File file2 = new File("day-11-File/src/com/chen/fileDEmo/code2.txt");
        if (!file2.exists()) {
            file2.createNewFile();
        }

        byte[] bytes = "ab你好呀".getBytes();

        FileOutputStream fileOutputStream = new FileOutputStream("day-11-File/src/com/chen/fileDEmo/code3.txt");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }


    // 写一个文件复制的函数，使用字节流实现
    public static void copyFile(String src, String dest) throws IOException {

        try (
                InputStream fileInputStream = new FileInputStream(src);
                OutputStream fileOutputStream = new FileOutputStream(dest);

        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }


    }
}
