package com.aliyuncs.http;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.aliyuncs.exceptions.ClientException;

public class HttpUtil {

    private final static Log log = LogFactory.getLog(HttpUtil.class);

    private static Boolean isHttpDebug;

    private static Boolean isHttpContentDebug;

    static {
        Boolean flag = "sdk".equalsIgnoreCase(System.getenv("DEBUG"));
        isHttpDebug = flag;
        isHttpContentDebug = flag;
    }

    public static Boolean getIsHttpDebug() {
        return isHttpDebug;
    }

    public static void setIsHttpDebug(Boolean isHttpDebug) {
        HttpUtil.isHttpDebug = isHttpDebug;
    }

    public static Boolean getIsHttpContentDebug() {
        return isHttpContentDebug;
    }

    public static void setIsHttpContentDebug(Boolean isHttpContentDebug) {
        HttpUtil.isHttpContentDebug = isHttpContentDebug;
    }

    public static String debugHttpRequest(HttpRequest request) throws ClientException {
        if (isHttpDebug) {
            String protocol = request.getSysUrl().split("://")[0].toUpperCase() + "/1.1";
            StringBuilder debugString = new StringBuilder("> " + request.getSysMethod() + " " + protocol + "\n> ");
            Map<String, String> requestHeaders = request.getSysHeaders();
            for (Entry<String, String> entry : requestHeaders.entrySet()) {
                debugString.append(entry.getKey() + " : " + entry.getValue() + "\n> ");
            }
            if (isHttpContentDebug) {
                debugString.append("\n" + request.getHttpContentString());
            }
            log.info("\n" + debugString);
            return debugString.toString();
        } else {
            return null;
        }
    }

    public static String debugHttpResponse(HttpResponse response) throws ClientException {
        if (isHttpDebug) {
            String protocol = "HTTP/1.1";
            StringBuilder debugString = new StringBuilder("< " + protocol + " " + response.getStatus() + "\n< ");
            Map<String, String> responseHeaders = response.getSysHeaders();
            for (Entry<String, String> entry : responseHeaders.entrySet()) {
                debugString.append(entry.getKey() + " : " + entry.getValue() + "\n< ");
            }
            if (isHttpContentDebug) {
                debugString.append("\n" + response.getHttpContentString());
            }
            log.info("\n" + debugString);
            return debugString.toString();
        } else {
            return null;
        }
    }
}
