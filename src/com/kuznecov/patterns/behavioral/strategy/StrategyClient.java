package com.kuznecov.patterns.behavioral.strategy;

public class StrategyClient {
    Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void executeStrategy(int[] arr){
        sorting.sort(arr);
    }
}
