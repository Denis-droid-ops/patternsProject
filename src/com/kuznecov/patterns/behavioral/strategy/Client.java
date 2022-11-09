package com.kuznecov.patterns.behavioral.strategy;

public class Client {
    public static void main(String[] args){
        StrategyClient strategyClient = new StrategyClient();
        Sorting sorting = new BubbleSort();
        Sorting sorting1 = new MergeSort();
        Sorting sorting2 = new RecursionSort();
        strategyClient.setSorting(sorting);
        strategyClient.executeStrategy(new int[]{1,2,44,55});
        strategyClient.setSorting(sorting1);
        strategyClient.executeStrategy(new int[]{1,2,44,55});
        strategyClient.setSorting(sorting2);
        strategyClient.executeStrategy(new int[]{1,2,44,55});
    }
}
