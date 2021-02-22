class A {
    int x = 10;

    void print() {
        System.out.println(x);
    }
}

class B extends A {
    int x = 20;

    void print() {
        System.out.println(x);
    }
}

public class Test {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("SB");
        String s2 = "STR1";
        modify(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void modify(StringBuilder sb, String str){
        sb.append("SB2");
        str = str.concat("STR2");
        sb = null;
        str = null;
    }

}

