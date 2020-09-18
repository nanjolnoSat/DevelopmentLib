package com.mishaki.lib.roomlib;

import java.io.*;

public class Rename {
    public static void main(String[] args) {
        String path = "G:\\aaa";
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File videoFile : files) {
                String fileName = videoFile.getName();
                if (fileName.lastIndexOf("download") != -1) {
                    continue;
                }
                int pIndex = fileName.indexOf("P");
                int chapterIndex = fileName.indexOf(" ",pIndex);
                String newFileName = fileName.substring(chapterIndex + 1);
                File newFile = new File(videoFile.getParent(), newFileName);
                System.out.println(newFile);
                videoFile.renameTo(newFile);
            }
        }
    }
}