package practice.test1;

import java.io.FileNotFoundException;

/*
需求：定义一个可以接受字符串的方法，字符不包含a.txt抛出异常
 */
public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        String string = getString("b.txt");
        System.out.println(string);

    }
    public static String getString(String s)throws FileNotFoundException {
        if (!s.equals("a/.txt")) {
            throw new FileNotFoundException("文件不存在！   请先上传文件     我要拉取");
        }
        return s;
    }
}
