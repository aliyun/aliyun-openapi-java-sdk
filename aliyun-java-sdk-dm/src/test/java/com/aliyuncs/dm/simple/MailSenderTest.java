package com.aliyuncs.dm.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by libingkui on 2017/9/5.
 */
public class MailSenderTest {
    Properties properties = new Properties();
    MailSender mailSender = null;

    @Before
    public void setup() {
        InputStream inputStream = null;
        try {
            inputStream = MailSenderTest.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(inputStream);

            mailSender = new MailSender("smtp-inc.ocm.aliyun.com", "25",
                    properties.getProperty("smtp.username"),
                    properties.getProperty("smtp.password"));
        } catch (final IOException e) {
            throw new IllegalStateException("error reading properties file from inputstream", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (final IOException e) {
                }
            }
        }
    }

    @Test
    public void testBuilderFromAddress() {
        List<Email.Address> addressList = new ArrayList<Email.Address>();
        addressList.add(new Email.Address(properties.getProperty("smtp.password"), "ssss"));
        Email email = Email.builder()
                .from(properties.getProperty("smtp.username"), "dmtest")
                .recipients(addressList)
                .subject("test subject")
                .text("hello")
                .replyToAddress(new Email.Address(properties.getProperty("smtp.username"), ""))
                .build();

        String result = mailSender.sendMail(email);
        Assert.assertEquals("success", result);
    }

    @Test
    public void testBatchSendMail() {
        long start = System.currentTimeMillis() / 1000;
        List<Email.Address> addressList = new ArrayList<Email.Address>();
        addressList.add(new Email.Address(properties.getProperty("smtp.password"), ""));
        List<Email.Attachment> attachmentList = new ArrayList<Email.Attachment>();
        for (int i = 0; i < 2; i++) {
            Email.Attachment ea = new Email.Attachment("aaa.txt", new FileDataSource("/Users/libingkui/account.txt"));
            attachmentList.add(ea);
        }
        List<Email> emailList = new ArrayList<Email>();
        for (int i = 0; i < 2; i++) {
            Email email = Email.builder()
                    .from(properties.getProperty("smtp.username"), "dm")
                    .to(properties.getProperty("test.to.address"))
                    .subject("测试邮件test subject" + i)
                    .textHTML("<font color='red'>你好</font>")
                    .replyToAddress(new Email.Address(properties.getProperty("test.to.address")))
                    .attachments(attachmentList)
                    .build();
            emailList.add(email);
        }

        List<String> result = mailSender.batchSendMail(emailList);
        String allResult = "";
        for (String s : result) {
            allResult = allResult + s;
        }
        long end = System.currentTimeMillis() / 1000;
        System.out.println("seconds:" + (end - start));
        Assert.assertEquals(allResult.length() / 7, 10);
    }

    @Test
    public void testTextContent() {
        Email email = Email.builder()
                .from(properties.getProperty("smtp.username"), "dm测试账号")
                .to(properties.getProperty("smtp.password"))
                .subject("test text")
                .text("")
                .replyToAddress(new Email.Address(properties.getProperty("smtp.username")))
                .build();

        String result = mailSender.sendMail(email);
        Assert.assertEquals("success", result);
    }

    @Test
    public void testTextHtml() {
        List<Email.Address> cc = new ArrayList<Email.Address>();
        cc.add(new Email.Address(properties.getProperty("test.to.address"), "cc测试"));
        Email email = Email.builder()
                .from(properties.getProperty("smtp.username"), "dm测试账号")
                .to(properties.getProperty("test.to.address"))
                .cc(cc)
                .subject("test text")
                .textHTML("hello")
                .replyToAddress(new Email.Address(properties.getProperty("smtp.username")))
                .build();

        String result = mailSender.sendMail(email);
        Assert.assertEquals("success", result);
    }

    @Test
    public void testSingleSendMail() {
        long start = System.currentTimeMillis() / 1000;
        for (int i = 0; i < 10; i++) {
            Email email = Email.builder()
                    .from(properties.getProperty("smtp.username"), "dm测试账号")
                    .to(properties.getProperty("smtp.password"))
                    .subject("test text")
                    .text("")
                    .replyToAddress(new Email.Address(properties.getProperty("smtp.username")))
                    .build();
            String result = mailSender.sendMail(email);
        }
        long end = System.currentTimeMillis() / 1000;
        System.out.println("seconds:" + (end - start));
    }

    @Test
    public void testXSMTPHEADER() {
        List<Email.Address> cc = new ArrayList<Email.Address>();
        cc.add(new Email.Address(properties.getProperty("test.to.address"), "cc测试"));

        Email email = Email.builder()
                .from(properties.getProperty("smtp.username"), "dm测试账号")
                .to(properties.getProperty("test.to.address"))
                .cc(cc)
                .subject("test text")
                .textHTML("hello")
                .replyToAddress(new Email.Address(properties.getProperty("smtp.username")))
                .templateContent("{\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\",\"sss\":\"sssss\" }")
                .build();
        String result = mailSender.sendMail(email);
        Assert.assertEquals("success", result);
    }
}
