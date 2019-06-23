import org.junit.Test;

public class StringTest {
    @Test
    public void test1() {
        String str1 = "zhangyuming";
        /**
         * 输出:h
         * 说明:返回字符串对应下标的字符
         */
        System.out.println(str1.charAt(1));
        /**
         * 输出:97
         * 说明:返回对应下标的char对应的ASCII码值
         */
        System.out.println(str1.codePointAt(2));
        /**
         * 输出:104
         * 说明:'h'(char)--对应的值104,所以这个方法的返回值为当前字符之前的字符的值
         */
        System.out.println(str1.codePointBefore(2));

        /**
         * 输出:10   ('z' - 'p' = 10)
         * 说明: 查看源码,会发现,这个方法会先取得这两个字符串中
         */
        System.out.println(str1.compareTo("pengjie"));
        System.out.println('z' - 'p');
    }

    @Test
    public void testComareTo() {
        String str1 = "zahngyuming";
        System.out.println(str1.compareTo("pengjie"));
        System.out.println('z' - 'p');
    }

    @Test
    public void test() {
        String str1 = "zahngyuming";
        System.out.println(str1.compareToIgnoreCase("PENGJIE"));
    }
}
