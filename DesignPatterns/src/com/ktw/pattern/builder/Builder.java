package com.ktw.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2014/11/4.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++)
            list.add(new MailSender());
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++)
            list.add(new SmsSender());
    }

    public void send() {
        for (Sender sender : list)
            sender.send();
    }
}
