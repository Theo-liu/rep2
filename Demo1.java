package practice.test1;
/*
需求:
			定义一个接受字符串的方法, 在方法中判断, 如果这个字符串为null,
			不允许调用此方法, 抛出一个空指针的错误
 */
public class Demo1 {
    public static void main(String[] args) {
        getString(null);
    }
    public static void getString(String s)throws NullPointerException{
        if(s == null){
            throw new NullPointerException("不能为空!");
        }
    }
}
