package com.aliyuncs.utils;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import lombok.Getter;
import lombok.Setter;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogUtils {
    public final static String REQUEST = "{request}";
    public final static String RESPONSE = "{response}";
    public final static String TS = "{ts}";
    public final static String DATE_ISO_8601 = "{date_iso_8601}";
    public final static String DATE_COMMON_LOG = "{date_common_log}";
    public final static String HOST = "{host}";
    public final static String METHOD = "{method}";
    public final static String URI = "{uri}";
    public final static String VERSION = "{version}";
    public final static String TARGET = "{target}";
    public final static String HOSTNAME = "{hostname}";
    public final static String CODE = "{code}";
    public final static String PHRASE = "{phrase}";
    public final static String REQ_HEADERS = "{req_headers}";
    public final static String RES_HEADERS = "{res_headers}";
    public final static String REQ_BODY = "{req_body}";
    public final static String RES_BODY = "{res_body}";
    public final static String PID = "{pid}";
    public final static String COST = "{cost}";
    public final static String START_TIME = "{start_time}";
    public final static String TIME = "{time}";
    public final static String ERROR = "{error}";
    public final static String DEFAULT_LOG_FORMAT =
            "{method} {uri} HTTP/{version} {code} {cost} {hostname} {pid} {error}";
    public final static Pattern reqHeaderPattern = Pattern.compile("\\{req_header_(.*?)\\}");
    public final static Pattern resHeaderPattern = Pattern.compile("\\{res_header_(.*?)\\}");

    public static String fillContent(String format, LogUnit logUnit) {
        String content = format.replace(REQUEST, logUnit.getHttpRequest().toString())
                .replace(TS, logUnit.getTs())
                .replace(DATE_ISO_8601, logUnit.getTs())
                .replace(DATE_COMMON_LOG, logUnit.getTs())
                .replace(HOST, logUnit.getHost())
                .replace(METHOD, logUnit.getMethod())
                .replace(URI, logUnit.getUrl())
                .replace(VERSION, logUnit.getVersion())
                .replace(TARGET, logUnit.getTarget())
                .replace(HOSTNAME, logUnit.getHostname())
                .replace(ERROR, logUnit.getError())
                .replace(REQ_HEADERS, logUnit.getReqHeaders())
                .replace(RES_HEADERS, logUnit.getResHeaders())
                .replace(REQ_BODY, logUnit.getReqBody())
                .replace(PID, logUnit.getPid())
                .replace(COST, logUnit.getCost())
                .replace(START_TIME, logUnit.getStartTime())
                .replace(TIME, logUnit.getTime());
        if (null != logUnit.getHttpResponse()) {
            content = content.replace(RESPONSE, logUnit.getHttpResponse().toString()).
                    replace(RES_BODY, logUnit.getResBody()).
                    replace(PHRASE, logUnit.getPhrase()).
                    replace(CODE, logUnit.getCode());
        }
        Matcher m = reqHeaderPattern.matcher(content);
        while (m.find()) {
            String headerKey = m.group(1);
            if (null != logUnit.getHttpRequest().getHeaderValue(headerKey)) {
                content = content.replace(m.group(), logUnit.getHttpRequest().getHeaderValue(headerKey));
            }
        }
        m = resHeaderPattern.matcher(content);
        while (m.find()) {
            String headerKey = m.group(1);
            if (null != logUnit.getHttpResponse().getHeaderValue(headerKey)) {
                content = content.replace(m.group(), logUnit.getHttpResponse().getHeaderValue(headerKey));
            }
        }
        return content;
    }

    public static String utcNow() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        df.setTimeZone(tz);
        return df.format(new Date());
    }

    public static String localeNow() {
        TimeZone tz = TimeZone.getDefault();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        df.setTimeZone(tz);
        return df.format(new Date());
    }

    public static long getCurrentPID() {
        String processName =
                java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        return Long.parseLong(processName.split("@")[0]);
    }

    public static String getLocalHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "unknown host name";
    }

    public static LogUnit createLogUnit(HttpRequest httpRequest, HttpResponse httpResponse) {
        return new LogUnit(httpRequest, httpResponse);
    }

    @Getter
    @Setter
    public static class LogUnit {
        private HttpRequest httpRequest;
        private HttpResponse httpResponse;
        private String ts;
        private String host;
        private String method;
        private String url;
        private String version = "1.1";
        private String target;
        private String hostname;
        private String code;
        private String phrase;
        private String reqHeaders;
        private String resHeaders;
        private String reqBody;
        private String resBody;
        private String pid;
        private String cost;
        private String startTime;
        private String time;
        private String error;

        public HttpRequest getHttpRequest() {
            return httpRequest;
        }

        public void setHttpRequest(HttpRequest httpRequest) {
            this.httpRequest = httpRequest;
        }

        public HttpResponse getHttpResponse() {
            return httpResponse;
        }

        public void setHttpResponse(HttpResponse httpResponse) {
            this.httpResponse = httpResponse;
        }

        public String getTs() {
            return ts;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getPhrase() {
            return phrase;
        }

        public void setPhrase(String phrase) {
            this.phrase = phrase;
        }

        public String getReqHeaders() {
            return reqHeaders;
        }

        public void setReqHeaders(String reqHeaders) {
            this.reqHeaders = reqHeaders;
        }

        public String getResHeaders() {
            return resHeaders;
        }

        public void setResHeaders(String resHeaders) {
            this.resHeaders = resHeaders;
        }

        public String getReqBody() {
            return reqBody;
        }

        public void setReqBody(String reqBody) {
            this.reqBody = reqBody;
        }

        public String getResBody() {
            return resBody;
        }

        public void setResBody(String resBody) {
            this.resBody = resBody;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getCost() {
            return cost;
        }

        public void setCost(String cost) {
            this.cost = cost;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public LogUnit(HttpRequest httpRequest, HttpResponse httpResponse) {
            this.httpRequest = httpRequest;
            this.httpResponse = httpResponse;
            this.ts = utcNow();
            try {
                URL url = new URL(httpRequest.getSysUrl());
                this.host = url.getHost();
                this.target = "";
                String path = url.getPath();
                String query = url.getQuery();
                String ref = url.getRef();
                if (null != path) {
                    this.target += path;
                }
                if (null != query) {
                    this.target += "?" + query;
                }
                if (null != ref) {
                    this.target += "#" + ref;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            this.method = httpRequest.getSysMethod().name();
            this.url = httpRequest.getSysUrl();
            this.hostname = getLocalHostName();
            this.reqHeaders = httpRequest.getSysHeaders().toString();
            try {
                this.reqBody = httpRequest.getHttpContentString();
                if (null != httpResponse) {
                    this.resHeaders = httpResponse.getSysHeaders().toString();
                    this.code = String.valueOf(httpResponse.getStatus());
                    this.phrase = (httpResponse.getReasonPhrase() != null ? httpResponse.getReasonPhrase() : "");
                    this.resBody = httpResponse.getHttpContentString();
                }
            } catch (ClientException e) {
                e.printStackTrace();
            }

            this.pid = String.valueOf(getCurrentPID());
            this.time = localeNow();
        }
    }
}
