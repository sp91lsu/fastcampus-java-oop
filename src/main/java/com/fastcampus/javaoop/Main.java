package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

/**
 * @Author dev.lsw91
 * @DateTime 2022-03-18 오후 7:49.
 */
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
