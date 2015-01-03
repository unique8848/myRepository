package com.ktw.pattern.builder;

/**
 * Created by Kevin on 2014/11/4.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(20);
        builder.produceSmsSender(20);
        builder.send();
    }
}
