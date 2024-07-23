package edu.java.lang;

public class StringMain {
    static  String nullStr;
    static String emptyStr = "";

    public static void main(String[] args) {
        System.out.println("nullStr: " + nullStr);
        System.out.println("emptyStr: " + emptyStr);

        System.out.println(emptyStr.toString());

        String pw1 = "top secret  ";
        String pw2 = "Top secret  ";
        System.out.println(pw1.length());
        System.out.println(pw2.length());

        System.out.println(pw1.equals(pw2));
        System.out.println(pw1.equalsIgnoreCase(pw2));

        System.out.println(pw1.indexOf("t"));
        System.out.println(pw1.lastIndexOf("t"));

        // 일치하는 값이 없으면 -1 반환
        System.out.println(pw1.indexOf("x"));
        System.out.println(pw1.lastIndexOf("x"));

        System.out.println();
        System.out.println(pw1.charAt(4));
        System.out.println(pw1.substring(4));
        System.out.println(pw1.substring(0,4));
        System.out.println("=========");
        String[] result = pw1.split(" ");
        System.out.println(result.length);

        for (String r : result)
            System.out.println(r);

        System.out.println(pw1.replace("Top", "one"));
        System.out.println(pw1.toUpperCase());
        System.out.println(pw1.length());
        System.out.println(pw1.trim().length()); // 앞뒤 공백 제거

        String  str = String.valueOf(123);
        str = String.valueOf(1>2);
        str = 123 + "";

        StringBuffer sb = new StringBuffer("asdsadassa");
        StringBuilder sbl = new StringBuilder("asdsadas");
        sb.append("asd");
        sb.insert(3, "sasdas");
        // 스트링 버퍼가 가장 많이 쓰이고, 문자열 메소드들 따로 공부하ㅣ 기
    }
}
