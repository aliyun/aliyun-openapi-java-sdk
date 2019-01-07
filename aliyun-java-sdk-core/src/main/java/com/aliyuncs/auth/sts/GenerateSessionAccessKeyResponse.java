package com.aliyuncs.auth.sts;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GenerateSessionAccessKeyResponse")
public class GenerateSessionAccessKeyResponse extends AcsResponse {

    @SerializedName("RequestId")
    private String requestId;

    @SerializedName("SessionAccessKey")
    private SessionAccessKey sessionAccessKey;

    public String getRequestId() {
        return requestId;
    }

    @XmlElement(name = "RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @XmlElement(name = "SessionAccessKey")
    public SessionAccessKey getSessionAccessKey() {
        return sessionAccessKey;
    }

    public void setSessionAccessKey(SessionAccessKey sessionAccessKey) {
        this.sessionAccessKey = sessionAccessKey;
    }

    @Override
    public GenerateSessionAccessKeyResponse getInstance(UnmarshallerContext context) {
        return GetSessionAccessKeyResponseUnmarshaller.unmarshall(this, context);
    }

    public static class SessionAccessKey {

        @SerializedName("SessionAccessKeyId")
        private String sessionAccessKeyId;

        @SerializedName("SessionAccessKeySecret")
        private String sessionAccessKeySecret;

        @SerializedName("Expiration")
        private String expiration;

        public String getSessionAccessKeyId() {
            return sessionAccessKeyId;
        }

        @XmlElement(name = "SessionAccessKeyId")
        public void setSessionAccessKeyId(String sessionAccessKeyId) {
            this.sessionAccessKeyId = sessionAccessKeyId;
        }

        public String getSessionAccessKeySecert() {
            return sessionAccessKeySecret;
        }

        @XmlElement(name = "SessionAccessKeySecret")
        public void setSessionAccessKeySecert(String sessionAccessKeySecert) {
            this.sessionAccessKeySecret = sessionAccessKeySecert;
        }

        public String getExpiration() {
            return expiration;
        }

        @XmlElement(name = "Expiration")
        public void setExpiration(String expiration) {
            this.expiration = expiration;
        }
    }
}
