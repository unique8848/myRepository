package com.ktw.designpatterns.factory;

/**
 * Created by Kevin on 12/21/14.
 */
public interface PersonFactory {
    //男孩接口
    public IBoy getBoy();

    //女孩接口
    public IGirl getGirl();
}
