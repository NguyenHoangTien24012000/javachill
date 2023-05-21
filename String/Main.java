package String;

public class Main {
    public static void main(String[] args) {
        String test1 = "Print bulleted list:\n" +
                "\t\u2022 First point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(test1);
        String test2 = """
                Print First point:
                    \u2022 First point
                        \u2022 Sub point""";
        System.out.println(test2);
    }
}
