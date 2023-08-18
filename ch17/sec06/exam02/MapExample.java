package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
    }

}
//자바에서 래퍼(wrapper) 클래스는 기본 데이터 타입(primitive data type)을 객체로 래핑(wrapping)한 클래스를 말합니다.
// 기본 데이터 타입은 int, double, char, boolean 등과 같은 것들을 말하며, 이러한 데이터 타입을 객체로 다루어야 할 때 래퍼 클래스를 사용합니다.
// 래퍼 클래스는 해당 기본 데이터 타입을 객체 지향적인 방식으로 다루기 위해 제공되며, 자바의 객체 지향적인 특징을 활용할 수 있도록 도와줍니다.
//
//래퍼 클래스에는 다음과 같은 클래스들이 있습니다:
//
//Integer: int의 래퍼 클래스
//Double: double의 래퍼 클래스
//Character: char의 래퍼 클래스
//Boolean: boolean의 래퍼 클래스
//Byte: byte의 래퍼 클래스
//Short: short의 래퍼 클래스
//Long: long의 래퍼 클래스
//Float: float의 래퍼 클래스