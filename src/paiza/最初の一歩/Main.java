package paiza.最初の一歩;

import java.util.Scanner;

/**
 * 問題
 * "名前", "言語", "一言"を以下のフォーマットで出力してください。
 * <p>
 * name: 名前
 * language: 言語
 * hitokoto: 一言
 */


public class Main {
    public static void main(String[] args) {
        String name = "名前";
        String language = "言語";
        String hitokoto = "一言";
        Person person = new Person(name,language,hitokoto);
        System.out.println(person);
    }
}

class Person {

    private String name;
    private String language;
    private String hitokoto;


    public Person(String name, String language, String hitokoto) {
        this.name = name;
        this.language = language;
        this.hitokoto = hitokoto;
    }

    @Override
    public String toString() {
        return "name: " + this.name +
                "\n" +
                "language: " + this.language +
                "\n" +
                "hitokoto: " + this.hitokoto;
    }
}
