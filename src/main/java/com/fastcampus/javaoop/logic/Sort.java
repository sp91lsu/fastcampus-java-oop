package com.fastcampus.javaoop.logic;

import java.util.List;

/**
 * @Author dev.lsw91
 * @DateTime 2022-03-19 오후 6:38.
 */
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
