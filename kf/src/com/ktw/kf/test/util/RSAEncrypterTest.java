package com.ktw.kf.test.util;

import com.ktw.kf.util.RSAEncrypter;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class RSAEncrypterTest extends TestCase {
    private String publicKey;
    private String privateKey;

    @Before
    public void setUp() throws Exception {
        Map<String, Object> keyMap = RSAEncrypter.initKey();

        publicKey = RSAEncrypter.getPublicKey(keyMap);
        privateKey = RSAEncrypter.getPrivateKey(keyMap);
        System.err.println("公钥: \n\r" + publicKey);
        System.err.println("私钥： \n\r" + privateKey);
    }

    @Test
    public void test() throws Exception {
        System.err.println("公钥加密——私钥解密");
        String inputStr = "abc";
        byte[] data = inputStr.getBytes();

        byte[] encodedData = RSAEncrypter.encryptByPublicKey(data, publicKey);

        byte[] decodedData = RSAEncrypter.decryptByPrivateKey(encodedData,
                privateKey);

        String outputStr = new String(decodedData);
        System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);
        assertEquals(inputStr, outputStr);

    }

    public void testSign() throws Exception {
        System.err.println("私钥加密——公钥解密");
        String inputStr = "sign";
        byte[] data = inputStr.getBytes();

        byte[] encodedData = RSAEncrypter.encryptByPrivateKey(data, privateKey);

        byte[] decodedData = RSAEncrypter
                .decryptByPublicKey(encodedData, publicKey);

        String outputStr = new String(decodedData);
        System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);
        assertEquals(inputStr, outputStr);

        System.err.println("私钥签名——公钥验证签名");
        // 产生签名  
        String sign = RSAEncrypter.sign(encodedData, privateKey);
        System.err.println("签名:\r" + sign);

        // 验证签名  
        boolean status = RSAEncrypter.verify(encodedData, publicKey, sign);
        System.err.println("状态:\r" + status);
        assertTrue(status);

    }
}