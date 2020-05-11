package com.aliyuncs.v5.http;

public enum ProtocolType {
    /**
     * Define HTTP、HTTPS
     */

    HTTP("http"),

    HTTPS("https");

    private final String protocol;

        ProtocolType(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return protocol;
    }
}