package com.aliyuncs.dm.simple;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.concurrent.*;

public class MailSender {
    private static final int DEFAULT_POOL_SIZE = 10;
    private static final int SHUTDOWN_WAIT_SECONDS = 5;
    private static final String EMAIL_ENCODING = "utf-8";
    private static final String X_SMTP_TRANS_PARAM = "X-SMTP-TRANS-PARAM";

    private Session session;

    public MailSender(String host, String port, final String userName, final String password) {
        final Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        session = Session.getInstance(props, authenticator);
    }

    public List<String> batchSendMail(final List<Email> emailList) {
        List<String> rtnList = new ArrayList<String>();
        ExecutorService executor = Executors.newFixedThreadPool(DEFAULT_POOL_SIZE);
        final CountDownLatch countDownLatch = new CountDownLatch(emailList.size());
        List<Future<String>> resultList = new ArrayList<Future<String>>();
        for (int i = 0; i < emailList.size(); i++) {
            Future<String> f = executor.submit(new SendTask(countDownLatch, emailList.get(i)));
            resultList.add(f);
        }

        try {
            countDownLatch.await();
            for (Future<String> f : resultList) {
                rtnList.add(f.get());
            }
            executor.shutdown();
            executor.awaitTermination(SHUTDOWN_WAIT_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
        return rtnList;
    }

    public String sendMail(Email email) {
        try {
            MimeMessage mimeMessage = getMimeMessage(email);
            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "success";
    }

    private MimeMessage getMimeMessage(Email email) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = new MimeMessage(session);
        setFrom(email, message);
        setTo(email, message);
        setCc(email, message);
        setReplyto(email, message);
        setSubject(email, message);
        setContent(email, message);
        setHeader(email, message);
        return message;
    }

    class SendTask implements Callable<String> {
        CountDownLatch latch;
        Email email;

        SendTask(CountDownLatch countDownLatch, Email email) {
            this.latch = countDownLatch;
            this.email = email;
        }

        @Override
        public String call() throws Exception {
            String result = sendMail(email);
            latch.countDown();
            return result;
        }
    }
    private void setFrom(Email email, MimeMessage message) throws UnsupportedEncodingException, MessagingException {
        InternetAddress from = null;
        from = new InternetAddress(email.getFrom().getEmail(), email.getFrom().getName(), EMAIL_ENCODING);
        message.setFrom(from);
    }
    private void setTo(Email email, MimeMessage message) throws UnsupportedEncodingException, MessagingException {
        Address[] toArr = new InternetAddress[email.getRecipients().size()];
        for (int i = 0; i < email.getRecipients().size(); i++) {
            toArr[i] = new InternetAddress(email.getRecipients().get(i).getEmail(), email.getRecipients().get(i).getName(), EMAIL_ENCODING);
        }
        message.setRecipients(MimeMessage.RecipientType.TO, toArr);
    }
    private void setCc(Email email, MimeMessage message) throws UnsupportedEncodingException, MessagingException {
        if(email.getCc() == null) {
            return ;
        }
        Address[] ccArr = new InternetAddress[email.getCc().size()];
        for (int i = 0; i < email.getCc().size(); i++) {
            ccArr[i] = new InternetAddress(email.getCc().get(i).getEmail(), email.getCc().get(i).getName(), EMAIL_ENCODING);
        }
        if(ccArr != null && ccArr.length > 0) {
            message.setRecipients(MimeMessage.RecipientType.CC, ccArr);
        }
    }
    private void setSubject(Email email, MimeMessage message) throws UnsupportedEncodingException, MessagingException {
        message.setSubject(email.getSubject());
        if (email.getHeaders() != null && email.getHeaders().size() > 0) {
            for (Map.Entry e : email.getHeaders().entrySet()) {
                message.setHeader((String) e.getKey(), (String) e.getValue());
            }
        }
    }
    private void setReplyto(Email email, MimeMessage message) throws UnsupportedEncodingException, MessagingException {
        Address[] a = new Address[1];
        a[0] = new InternetAddress(email.getReplyToAddress().getEmail(), email.getReplyToAddress().getName() == null ? "" : email.getReplyToAddress().getName());
        message.setReplyTo(a);
    }
    private void setContent(Email email, MimeMessage message) throws UnsupportedEncodingException, MessagingException {
        Multipart multipart = new MimeMultipart();
        if (email.getText() != null) {
            final MimeBodyPart messagePart = new MimeBodyPart();
            messagePart.setText(email.getText(), EMAIL_ENCODING);
            multipart.addBodyPart(messagePart);
        }
        if (email.getTextHTML() != null) {
            final MimeBodyPart messagePartHTML = new MimeBodyPart();
            messagePartHTML.setContent(email.getTextHTML(), "text/html; charset=\"" + EMAIL_ENCODING + "\"");
            multipart.addBodyPart(messagePartHTML);
        }
        // attachment
        if (email.getAttachments() != null && email.getAttachments().size() > 0) {
            for (Email.Attachment ea : email.getAttachments()) {
                BodyPart messageBodyPart = new MimeBodyPart();
                DataSource source = ea.getDataSource();
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(ea.getName());
                multipart.addBodyPart(messageBodyPart);
            }
        }
        message.setContent(multipart);
    }

    private void setHeader(Email email, Message message) throws UnsupportedEncodingException, MessagingException {
        if(email.getTemplateContent() != null && email.getTemplateContent().length() > 0) {
            email.getHeaders().put(X_SMTP_TRANS_PARAM, email.getTemplateContent());
        }
        for(Map.Entry<String, String> header : email.getHeaders().entrySet()) {
            String name = header.getKey();
            String value = MimeUtility.encodeText(header.getValue(), EMAIL_ENCODING, null);
            String foldedHeaderValue = MimeUtility.fold(name.length() + 2, value);
            message.addHeader(header.getKey(), foldedHeaderValue);
        }
    }
}
