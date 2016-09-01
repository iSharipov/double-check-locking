package com.isharipov;

/**
 * @since 01.09.2016
 */
public class Main {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        System.out.println(firstSingleton == secondSingleton);
    }
}
