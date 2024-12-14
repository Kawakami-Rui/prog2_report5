public class Main {
    public static void main(String[] args) {
        String str = null;

        try {
        System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。エラー内容: " + e.getMessage());
        }
    }
}