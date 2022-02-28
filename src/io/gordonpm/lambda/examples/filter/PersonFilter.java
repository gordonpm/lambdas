package io.gordonpm.lambda.examples.filter;

import io.gordonpm.lambda.examples.Person;

@FunctionalInterface
public interface PersonFilter {
    boolean filter(Person person);
}
