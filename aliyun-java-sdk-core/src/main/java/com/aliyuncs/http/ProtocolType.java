package com.aliyuncs.http;

public enum ProtocolType {

    HTTP("http"),

    HTTPS("https");

    private final String protocol;

    private ProtocolType(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return protocol;
    }
}