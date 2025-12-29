package Kotlinとの比較.null_safety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String city = null;
        // 条件分岐を書くか？ Kotlinの?:のような構文はない
        if(city == null){
            System.out.println("Nullです");
        }else{
            System.out.println("Nullではないです。");
        }

        // Optionalを使う方法もあるが、Optional というオブジェクトを作るため、わずかにコストがかかるため、主に関数の戻り値で使用されている
        Optional.ofNullable(city).map(String::length).orElse(0);

        // Streamを使う方法
        List<String> names = Arrays.asList(null, "Alice", "Bob");

        // 1. nullを除外して新しいリストを作る
        List<String> cleanedList = names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        // 2. 最初の要素を取り出す（なければ "Unknown"）
        String firstName = names.stream()
                .filter(Objects::nonNull)
                .findFirst()         // これが Kotlin の firstOrNull() に近い
                .orElse("Unknown");  // これが Elvis演算子 (?:) の役割

        // Kotlin: val length = b!!.length() 共通点: null の場合に NullPointerException を投げる
        String b = "b";
        int length = Objects.requireNonNull(b, "bはnullであってはなりません").length();

        // Kotlin: val aInt: Int? = a as? Int
        Integer a = 1;
        Integer aInt = (a instanceof Integer) ? (Integer) a : null;
    }
}
