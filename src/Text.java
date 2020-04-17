/**
 * @Author zero愚人
 * @Description //TODO
 * @Date 18:56 2019/9/2
 * @Param 测试lambda表达式
 * @return 格式：
 * 基本语法:
 * (parameters) -> expression
 * 或
 * (parameters) ->{ statements; }
 **/
public class Text {
    public static void main(String[] args) {
        System.out.println("hello");
        TextIn in = (int a, int b) -> a + b;
        int c = in.textAdd(1, 3);
        System.out.println(c);
    }

    interface TextIn {
        int textAdd(int a, int b);
    }
}
