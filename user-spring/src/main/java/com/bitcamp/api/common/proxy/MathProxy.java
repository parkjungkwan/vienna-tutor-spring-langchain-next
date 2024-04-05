package com.bitcamp.api.common.proxy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MathProxy {
    // Math.abs
    public static Function<Integer, Integer> absInt = Math::abs;


    // Math.ceil


    // Math.floor


    // Math.round


    // Math.min
    public static BiFunction<Integer, Integer, Integer> maxInt = Math::max;

    public static Supplier<Double> randomDouble = Math::random;
    public static BiFunction<Integer, Integer, Integer>  randomInt = (a, b) -> (int) (Math.random() * (b-a) + a);

    // Integer.parseInt
}
