package com.cn.transport.config;

/**
 * @author:HuMin Date:2019/4/4
 * Time:16:27
 */

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Code
 * @Date: 2018/9/9 18:02
 * @Description: 批量重命名文件
 */
public class test {
    static String dir = "C:\\Users\\min.hu\\Desktop\\img - 副本";
    //文件所在路径，所有文件的根目录，记得修改为你电脑上的文件所在路径

    public static void main(String[] args) throws IOException {
        recursiveTraversalFolder(dir);
        //递归遍历此路径下所有文件夹
    }

    /**
     * 递归遍历文件夹获取文件
     */
    public static void recursiveTraversalFolder(String path) {
        File folder = new File(path);
        if (folder.exists()) {
            File[] fileArr = folder.listFiles();
            if (null == fileArr || fileArr.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                File newDir = null;
                //文件所在文件夹路径+新文件名
                String newName = "";
                //新文件名
                String fileName = null;
                //旧文件名
                File parentPath = new File("");
                //文件所在父级路径
                for (File file : fileArr) {
                    if (file.isDirectory()) {
                        //是文件夹，继续递归，如果需要重命名文件夹，这里可以做处理
                        System.out.println("文件夹:" + file.getAbsolutePath() + "，继续递归！");
                        recursiveTraversalFolder(file.getAbsolutePath());
                    } else {//是文件，判断是否需要重命名
                        fileName = file.getName();
                        parentPath = file.getParentFile();
                        fileName=fileName.replace(" ", "");
                        fileName = fileName.substring(fileName.indexOf("1")+1);
                        fileName = fileName.substring(0, fileName.indexOf("."));
                        fileName="1"+fileName+".jpg";
                        //新名字
                        newDir = new File("C:\\Users\\min.hu\\Desktop\\img" + "/" + fileName);
                        //文件所在文件夹路径+新文件名
                        file.renameTo(newDir);
                        //重命名
                        System.out.println("修改后：" + newDir);
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }
}
