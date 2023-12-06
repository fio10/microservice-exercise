package com.optasia.microservicesexercise.other;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IdsList {

//    private List<String> idsList = Arrays.asList("1","345","3993","3949");

    private List<Integer> idsList = IntStream.range(0,100).boxed().toList();

    public IdsList() {
    }

    public Integer getRandomQuote() {
        return this.idsList.get(ThreadLocalRandom.current().nextInt(0, this.idsList.size()));
    }

}