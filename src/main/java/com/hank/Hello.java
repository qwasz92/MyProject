package com.hank;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));

        Person p =new Person("Tom",66.5f,1.7f);
        p.hello();
        p.bmi();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score< 80 || score > 90);
        char c = 'A';
        System.out.println(c>'a');

        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        Character c2 ='A';
        byte b = 120;
        float weight =66.5f;
        double height = 1.7;
        boolean adult = true;
        String name = "Tom";*/
    }
}
