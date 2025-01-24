package org.example;

import io.cucumber.java.en.When;

public class Steps {

    @When("test {string}")
    public void test(String s) {
        System.err.println(s);
    }
}