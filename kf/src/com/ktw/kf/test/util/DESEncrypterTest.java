package com.ktw.kf.test.util;

import com.ktw.kf.util.DESEncrypter;
import junit.framework.TestCase;

public class DESEncrypterTest extends TestCase {

    public void test() throws Exception {
        String strInput = "DES";
        String key = DESEncrypter.initKey();
        System.err.println("原文:\t" + strInput);

        System.err.println("密钥:\t" + key);
        byte[] inputData = strInput.getBytes();
        inputData = DESEncrypter.encrypt(inputData, key);
        System.err.println("加密后:\t" + DESEncrypter.encryptBASE64(inputData));
        byte[] outputData = DESEncrypter.decrypt(inputData, key);
        String outputStr = new String(outputData);
        System.err.println("解密后:\t" + outputStr);
        assertEquals(strInput, outputStr);
    }
}