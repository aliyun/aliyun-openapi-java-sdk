package com.aliyuncs.dm.simple;

import javax.activation.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author libingkui
 */
public class Email {
    private final Address replyToAddress;
    private final Address from;
    private final String text;
    private final String textHTML;
    private final String subject;
    private final List<Address> recipients;
    private final List<Attachment> attachments;
    private final Map<String, String> headers;
    private final String templateId;
    private final String templateContent;
    private final List<Address> cc;

    public String getTemplateContent() {
        return templateContent;
    }

    public Address getReplyToAddress() {
        return replyToAddress;
    }

    public Address getFrom() {
        return from;
    }

    public String getText() {
        return text;
    }

    public String getTextHTML() {
        return textHTML;
    }

    public String getSubject() {
        return subject;
    }

    public List<Address> getRecipients() {
        return recipients;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getTemplateId() {
        return templateId;
    }

    public List<Address> getCc() {
        return cc;
    }

    private Email(Address replyToAddress, Address from, String text, String textHTML, String subject, List<Address> recipients, List<Attachment> attachments, Map<String, String> headers, String templateId, String templateContent, List<Address> cc) {
        this.replyToAddress = replyToAddress;
        this.from = from;
        this.text = text;
        this.textHTML = textHTML;
        this.subject = subject;
        this.recipients = recipients;
        this.cc = cc;
        this.attachments = attachments;
        this.headers = headers;
        this.templateId = templateId;
        this.templateContent = templateContent;
    }

    public static class Address {
        private String email;
        private String name;

        public Address(String email, String name) {
            this.email = email;
            this.name = name;
        }

        public Address(String email) {
            this.email = email;
            this.name = "";
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }

    public static class Attachment {
        private final String name;
        private final DataSource dataSource;

        public String getName() {
            return name;
        }

        public DataSource getDataSource() {
            return dataSource;
        }

        public Attachment(String name, DataSource dataSource) {
            this.name = name;
            this.dataSource = dataSource;
        }
    }

    public static From builder() {
        return new EmailBuilder();
    }

    public static class EmailBuilder implements From, Recipients, Build {
        private Address replyToAddress;
        private Address from;
        private String text;
        private String textHTML;
        private String subject;
        private List<Address> recipients;
        private List<Attachment> attachments;
        private Map<String, String> headers = new HashMap<String, String>();
        private String templateId;
        private String templateContent;
        private List<Address> cc;

        private EmailBuilder() {
        }

        public EmailBuilder replyToAddress(Address replyToAddress) {
            this.replyToAddress = replyToAddress;
            return this;
        }

        public Recipients from(String... str) {
            Address a = null;
            if (str.length == 1) {
                a = new Address(str[0], "");
            } else if (str.length == 2) {
                a = new Address(str[0], str[1]);
            }
            this.from = a;
            return this;
        }

        public EmailBuilder text(String text) {
            this.text = text;
            return this;
        }

        public EmailBuilder textHTML(String textHTML) {
            this.textHTML = textHTML;
            return this;
        }

        public EmailBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder recipients(List<Address> recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
         * 逗号隔开收信人地址的格式,适应少数几个收件人
         *
         * @param to aaa@aaa.com,bbb@bbb.com,ccc@ccc.com格式
         * @return
         */
        public EmailBuilder to(String to) {
            List<Address> addressList = new ArrayList<Address>();
            String[] strArr = to.split(",");
            for (String s : strArr) {
                addressList.add(new Address(s));
            }
            this.recipients = addressList;
            return this;
        }

        /**
         * 大量收件人时，可在程序中构造arraylist
         *
         * @param toList
         * @return
         */
        public EmailBuilder to(List<String> toList) {
            List<Address> addressList = new ArrayList<Address>();
            for (String s : toList) {
                addressList.add(new Address(s));
            }
            this.recipients = addressList;
            return this;
        }

        public EmailBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public EmailBuilder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public EmailBuilder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public EmailBuilder templateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public EmailBuilder cc(List<Address> cc) {
            this.cc = cc;
            return this;
        }

        public Email build() {
            return new Email(
                    replyToAddress, from, text, textHTML,
                    subject, recipients, attachments, headers,
                    templateId, templateContent, cc);
        }
    }

    public interface Build {
        EmailBuilder replyToAddress(Address replyToAddress);

        EmailBuilder subject(String subject);

        EmailBuilder text(String text);

        EmailBuilder textHTML(String textHtml);

        EmailBuilder attachments(List<Attachment> attachments);

        EmailBuilder headers(Map<String, String> headers);

        EmailBuilder templateId(String templateId);

        EmailBuilder templateContent(String json);

        EmailBuilder cc(List<Address> cc);

        Email build();
    }

    public interface Recipients {
        EmailBuilder recipients(List<Address> recipients);

        EmailBuilder to(String to);

        EmailBuilder to(List<String> toList);
    }

    public interface From {
        Recipients from(String... from);
    }
}
