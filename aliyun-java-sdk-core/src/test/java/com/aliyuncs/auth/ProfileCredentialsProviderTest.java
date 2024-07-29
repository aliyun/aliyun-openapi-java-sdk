package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import org.ini4j.Wini;
import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class ProfileCredentialsProviderTest {
    @Test
    public void constructorTest() {
        ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
        Assert.assertNotNull(pcp);
    }

    @Test
    public void loadIniTest() throws NoSuchMethodException, IOException, InvocationTargetException, IllegalAccessException {
        Method loadIni = ProfileCredentialsProvider.class.getDeclaredMethod("loadIni", Wini.class);
        loadIni.setAccessible(true);
        String filePath = ProfileCredentialsProviderTest.class.getClassLoader().getResource("configTest.ini").getPath();
        Map<String, Map<String, String>> client = (Map<String, Map<String, String>>)loadIni.invoke(ProfileCredentialsProvider.class, new Wini(new File(filePath)));
        Assert.assertNotNull(client);
        Assert.assertEquals("access_key", client.get("default").get("type"));
    }

    @Test
    public void getIniTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getIni = ProfileCredentialsProvider.class.getDeclaredMethod("getIni", String.class);
        getIni.setAccessible(true);
        String filePath = ProfileCredentialsProviderTest.class.getClassLoader().getResource("configTest.ini").getPath();
        ProfileCredentialsProvider pcp = new ProfileCredentialsProvider(filePath);
        Wini ini = (Wini)getIni.invoke(pcp, filePath);
        Assert.assertEquals(5, ini.entrySet().size());
    }

    @Test
    public void getCredentialsProvider() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Method getCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getCredentialsProvider", Map.class);
        getCredentialsProvider.setAccessible(true);
        InvocationTargetException ex = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
                getCredentialsProvider.invoke(pcp, (Map)null);
            }
        });
        Assert.assertEquals("Client is not open in the specified credentials file", ex.getCause().getLocalizedMessage());

        InvocationTargetException ex1 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
                Map<String, String> cc = new HashMap<String, String>();
                getCredentialsProvider.invoke(pcp, cc);
            }
        });
        Assert.assertEquals("The configured client type is empty", ex1.getCause().getLocalizedMessage());

        ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
        Map<String, String> cc = new HashMap<String, String>();

        // STSAssumeRoleSessionCredentialsProvider
        cc.clear();
        cc.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_ARN);
        cc.put(AuthConstant.INI_ACCESS_KEY_ID, AuthConstant.INI_TYPE_ARN);
        cc.put(AuthConstant.INI_ACCESS_KEY_IDSECRET, AuthConstant.INI_TYPE_ARN);
        cc.put(AuthConstant.INI_ROLE_SESSION_NAME, AuthConstant.INI_TYPE_ARN);
        cc.put(AuthConstant.INI_ROLE_ARN, AuthConstant.INI_TYPE_ARN);
        cc.put(AuthConstant.DEFAULT_REGION, AuthConstant.INI_TYPE_ARN);
        Assert.assertTrue(getCredentialsProvider.invoke(pcp, cc) instanceof STSAssumeRoleSessionCredentialsProvider);

        // STSGetSessionAccessKeyCredentialsProvider
        cc.clear();
        cc.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_KEY_PAIR);
        cc.put(AuthConstant.INI_PUBLIC_KEY_ID, "pkid");
        cc.put(AuthConstant.INI_PRIVATE_KEY, "pk");
        cc.put(AuthConstant.INI_PRIVATE_KEY_FILE, AuthConstant.INI_TYPE_KEY_PAIR);
        Assert.assertTrue(getCredentialsProvider.invoke(pcp, cc) instanceof STSGetSessionAccessKeyCredentialsProvider);
        // InstanceProfileCredentialsProvider
        cc.clear();
        cc.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_RAM);
        cc.put(AuthConstant.INI_ROLE_NAME, "role_name");
        Assert.assertTrue(getCredentialsProvider.invoke(pcp, cc) instanceof InstanceProfileCredentialsProvider);

        cc.clear();
        cc.put(AuthConstant.INI_TYPE, "access_key");
        cc.put(AuthConstant.INI_ACCESS_KEY_ID, "akid");
        cc.put(AuthConstant.INI_ACCESS_KEY_IDSECRET, "aksecret");
        Assert.assertTrue(getCredentialsProvider.invoke(pcp, cc) instanceof StaticCredentialsProvider);
        InvocationTargetException ex4 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
                Map<String, String> cc = new HashMap<String, String>();
                cc.put(AuthConstant.INI_TYPE, "invalid_type");
                getCredentialsProvider.invoke(pcp, cc);
            }
        });
        Assert.assertEquals("The configured client type invalid_type is not supported", ex4.getCause().getLocalizedMessage());
    }

    @Test
    public void getSTSAssumeRoleSessionCredentialsProviderTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getSTSAssumeRoleSessionCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getSTSAssumeRoleSessionCredentialsProvider", Map.class);
        getSTSAssumeRoleSessionCredentialsProvider.setAccessible(true);
        Map<String, String> client = new HashMap<String, String>();
        client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_ARN);
        client.put(AuthConstant.INI_ACCESS_KEY_ID, AuthConstant.INI_TYPE_ARN);
        client.put(AuthConstant.INI_ACCESS_KEY_IDSECRET, AuthConstant.INI_TYPE_ARN);
        client.put(AuthConstant.INI_ROLE_SESSION_NAME, AuthConstant.INI_TYPE_ARN);
        client.put(AuthConstant.INI_ROLE_ARN, AuthConstant.INI_TYPE_ARN);
        client.put(AuthConstant.DEFAULT_REGION, AuthConstant.INI_TYPE_ARN);

        AlibabaCloudCredentialsProvider p = (AlibabaCloudCredentialsProvider) getSTSAssumeRoleSessionCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
        Assert.assertTrue(p instanceof STSAssumeRoleSessionCredentialsProvider);
    }

    @Test
    public void getSTSAssumeRoleSessionCredentialsProviderTestCase1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Method getSTSAssumeRoleSessionCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getSTSAssumeRoleSessionCredentialsProvider", Map.class);
        getSTSAssumeRoleSessionCredentialsProvider.setAccessible(true);

        InvocationTargetException ex = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_ARN);
                getSTSAssumeRoleSessionCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured access_key_id is empty", ex.getCause().getLocalizedMessage());

        InvocationTargetException ex1 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_ARN);
                client.put(AuthConstant.INI_ACCESS_KEY_ID, "akid");
                getSTSAssumeRoleSessionCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured access_key_secret is empty", ex1.getCause().getLocalizedMessage());


        InvocationTargetException ex2 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_ARN);
                client.put(AuthConstant.INI_ACCESS_KEY_ID, "akid");
                client.put(AuthConstant.INI_ACCESS_KEY_IDSECRET, "aksecret");
                getSTSAssumeRoleSessionCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured role_session_name is empty", ex2.getCause().getLocalizedMessage());

        InvocationTargetException ex3 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_ARN);
                client.put(AuthConstant.INI_ACCESS_KEY_ID, "akid");
                client.put(AuthConstant.INI_ACCESS_KEY_IDSECRET, "aksecret");
                client.put(AuthConstant.INI_ROLE_SESSION_NAME, "rsn");
                getSTSAssumeRoleSessionCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured role_arn is empty", ex3.getCause().getLocalizedMessage());
    }

    @Test
    public void getSTSGetSessionAccessKeyCredentialsTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getSTSGetSessionAccessKeyCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getSTSGetSessionAccessKeyCredentialsProvider", Map.class);
        getSTSGetSessionAccessKeyCredentialsProvider.setAccessible(true);
        Map<String, String> client = new HashMap<String, String>();
        client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_KEY_PAIR);
        client.put(AuthConstant.INI_PUBLIC_KEY_ID, "pkid");
        client.put(AuthConstant.INI_PRIVATE_KEY, "pk");
        client.put(AuthConstant.INI_PRIVATE_KEY_FILE, AuthConstant.INI_TYPE_KEY_PAIR);
        AuthUtils.setPrivateKey("test");
        AlibabaCloudCredentialsProvider p = (AlibabaCloudCredentialsProvider) getSTSGetSessionAccessKeyCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
        Assert.assertTrue(p instanceof STSGetSessionAccessKeyCredentialsProvider);
        AuthUtils.setPrivateKey(null);
    }

    @Test
    public void getSTSGetSessionAccessKeyCredentialsTestCase1() throws NoSuchMethodException {
        final Method getSTSGetSessionAccessKeyCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getSTSGetSessionAccessKeyCredentialsProvider", Map.class);
        getSTSGetSessionAccessKeyCredentialsProvider.setAccessible(true);

        InvocationTargetException ex = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_KEY_PAIR);
                getSTSGetSessionAccessKeyCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured public_key_id is empty", ex.getCause().getLocalizedMessage());

        InvocationTargetException ex2 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_KEY_PAIR);
                client.put(AuthConstant.INI_PUBLIC_KEY_ID, "pkid");

                getSTSGetSessionAccessKeyCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured private_key_file is empty", ex2.getCause().getLocalizedMessage());

        InvocationTargetException ex3 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_KEY_PAIR);
                client.put(AuthConstant.INI_PUBLIC_KEY_ID, "pkid");
                client.put(AuthConstant.INI_PRIVATE_KEY_FILE, "pkfile");
                getSTSGetSessionAccessKeyCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured private_key_file content is empty", ex3.getCause().getLocalizedMessage());
    }

    @Test
    public void getInstanceProfileCredentialsProviderTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getInstanceProfileCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getInstanceProfileCredentialsProvider", Map.class);
        getInstanceProfileCredentialsProvider.setAccessible(true);
        Map<String, String> client = new HashMap<String, String>();
        client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_RAM);
        client.put(AuthConstant.INI_ROLE_NAME, AuthConstant.INI_TYPE_KEY_PAIR);
        AlibabaCloudCredentialsProvider p = (AlibabaCloudCredentialsProvider) getInstanceProfileCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
        Assert.assertTrue(p instanceof InstanceProfileCredentialsProvider);
    }

    @Test
    public void getInstanceProfileCredentialsProviderTestCase1() throws NoSuchMethodException {
        final Method getInstanceProfileCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getInstanceProfileCredentialsProvider", Map.class);
        getInstanceProfileCredentialsProvider.setAccessible(true);

        InvocationTargetException ex = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                Map<String, String> client = new HashMap<String, String>();
                client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_RAM);
                getInstanceProfileCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
            }
        });
        Assert.assertEquals("The configured role_name is empty", ex.getCause().getLocalizedMessage());
    }

    public void getStaticCredentialsProviderTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getStaticCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getStaticCredentialsProvider", Map.class);
        getStaticCredentialsProvider.setAccessible(true);
        Map<String, String> client = new HashMap<String, String>();
        client.put(AuthConstant.INI_TYPE, AuthConstant.INI_TYPE_RAM);
        client.put(AuthConstant.INI_ROLE_NAME, AuthConstant.INI_TYPE_KEY_PAIR);
        AlibabaCloudCredentialsProvider p = (AlibabaCloudCredentialsProvider) getStaticCredentialsProvider.invoke(ProfileCredentialsProvider.class, client);
        Assert.assertTrue(p instanceof InstanceProfileCredentialsProvider);
    }

    @Test
    public void getStaticCredentialsProviderTestCase1() throws NoSuchMethodException {
        final Method getStaticCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getStaticCredentialsProvider", Map.class);
        getStaticCredentialsProvider.setAccessible(true);

        InvocationTargetException ex2 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
        @Override
        public void run() throws Throwable {
                ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
                Map<String, String> cc = new HashMap<String, String>();
                cc.put(AuthConstant.INI_TYPE, "access_key");
                getStaticCredentialsProvider.invoke(pcp, cc);
            }
        });
        Assert.assertEquals("The configured access_key_id is empty", ex2.getCause().getLocalizedMessage());
    }

    @Test
    public void getStaticCredentialsProviderTestCase2() throws NoSuchMethodException {
        final Method getStaticCredentialsProvider = ProfileCredentialsProvider.class.getDeclaredMethod("getStaticCredentialsProvider", Map.class);
        getStaticCredentialsProvider.setAccessible(true);

        InvocationTargetException ex2 = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                ProfileCredentialsProvider pcp = new ProfileCredentialsProvider();
                Map<String, String> cc = new HashMap<String, String>();
                cc.put(AuthConstant.INI_TYPE, "access_key");
                cc.put(AuthConstant.INI_ACCESS_KEY_ID, "akid");
                getStaticCredentialsProvider.invoke(pcp, cc);
            }
        });
        Assert.assertEquals("The configured access_key_secret is empty", ex2.getCause().getLocalizedMessage());
    }

    @Test
    public void getCredentialsTest() throws ClientException {
        String filePath = ProfileCredentialsProviderTest.class.getClassLoader().getResource("configTest.ini").getPath();
        ProfileCredentialsProvider pcp = new ProfileCredentialsProvider(filePath);
        AlibabaCloudCredentials c = pcp.getCredentials();
        Assert.assertEquals("foo", c.getAccessKeyId());
        Assert.assertEquals("bar", c.getAccessKeySecret());
        AlibabaCloudCredentials c1 = pcp.getCredentials();
        Assert.assertEquals("foo", c1.getAccessKeyId());
        Assert.assertEquals("bar", c1.getAccessKeySecret());
    }

    @Test
    public void getCredentialsTestCase1() throws ClientException {
        final ProfileCredentialsProvider pcp = new ProfileCredentialsProvider("/path/to/invalid.ini");
        ClientException ce = Assert.assertThrows(ClientException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                pcp.getCredentials();
            }
        });
        Assert.assertEquals("Client is not open in the specified credentials file", ce.getMessage());
    }
}
