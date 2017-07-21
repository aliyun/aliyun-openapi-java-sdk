/*
Z * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HttpResponse extends HttpRequest {

    private int status;

    public HttpResponse(String strUrl) {
        super(strUrl);
    }

    public HttpResponse() {
    }

    @Override
    public void setHttpContent(byte[] content, String encoding, FormatType format) {
        this.httpContent = content;
        this.encoding = encoding;
        this.httpContentType = format;
    }

    @Override
    public String getHeaderValue(String name) {
        String value = this.headers.get(name);
        if (null == value) {
            value = this.headers.get(name.toLowerCase());
        }
        return value;
    }

    private static byte[] readContent(InputStream content)
        throws IOException {
        if (content == null) {
            return null;
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];

        while (true) {
            final int read = content.read(buff);
            if (read == -1) { break; }
            outputStream.write(buff, 0, read);
        }

        return outputStream.toByteArray();
    }

    private static void pasrseHttpConn(HttpResponse response, HttpURLConnection httpConn,
                                       InputStream content) throws IOException {
        byte[] buff = readContent(content);
        response.setStatus(httpConn.getResponseCode());
        Map<String, List<String>> headers = httpConn.getHeaderFields();
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            if (null == key) { continue; }
            List<String> values = entry.getValue();
            StringBuilder builder = new StringBuilder(values.get(0));
            for (int i = 1; i < values.size(); i++) {
                builder.append(",");
                builder.append(values.get(i));
            }
            response.putHeaderParameter(key, builder.toString());
        }
        String type = response.getHeaderValue("Content-Type");
        if (null != buff && null != type) {
            response.setEncoding("UTF-8");
            String[] split = type.split(";");
            response.setHttpContentType(FormatType.mapAcceptToFormat(split[0].trim()));
            if (split.length > 1 && split[1].contains("=")) {
                String[] codings = split[1].split("=");
                response.setEncoding(codings[1].trim().toUpperCase());
            }
        }
        response.setStatus(httpConn.getResponseCode());
        response.setHttpContent(buff, response.getEncoding(),
            response.getHttpContentType());
    }

    public static HttpResponse getResponse(HttpRequest request) throws IOException {
        OutputStream out = null;
        InputStream content = null;
        HttpResponse response = null;
        HttpURLConnection httpConn = request.getHttpConnection();

        try {
            httpConn.connect();
            if (null != request.getHttpContent() && request.getHttpContent().length > 0) {
                out = httpConn.getOutputStream();
                out.write(request.getHttpContent());
            }
            content = httpConn.getInputStream();
            response = new HttpResponse(httpConn.getURL().toString());
            pasrseHttpConn(response, httpConn, content);
            return response;
        } catch (IOException e) {
            content = httpConn.getErrorStream();
            response = new HttpResponse(httpConn.getURL().toString());
            pasrseHttpConn(response, httpConn, content);
            return response;
        } finally {
            if (content != null) { content.close(); }
            httpConn.disconnect();
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        if (200 <= this.status &&
            300 > this.status) { return true; }
        return false;
    }
}
