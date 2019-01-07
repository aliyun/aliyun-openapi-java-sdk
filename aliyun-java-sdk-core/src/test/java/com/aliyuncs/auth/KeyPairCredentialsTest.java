package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KeyPairCredentialsTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNormal() {
        String ak = "ak";
        String sk = "sk";
        KeyPairCredentials credentials = new KeyPairCredentials(ak, sk);
        Assert.assertEquals(ak, credentials.getAccessKeyId());
        Assert.assertEquals(sk, credentials.getAccessKeySecret());
    }

    @Test
    public void constructorInvalidAK() {
        thrown.expect(IllegalArgumentException.class);
        String ak = null;
        String sk = "sk";
        KeyPairCredentials credentials = new KeyPairCredentials(ak, sk);
        Assert.assertNull(credentials);
    }

    @Test
    public void constructorInvalidSK() {
        thrown.expect(IllegalArgumentException.class);
        String ak = "ak";
        String sk = null;
        KeyPairCredentials credentials = new KeyPairCredentials(ak, sk);
        Assert.assertNull(credentials);
    }

}
