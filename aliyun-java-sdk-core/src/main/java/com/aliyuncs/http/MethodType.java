package com.aliyuncs.http;

public enum MethodType {
    /**
     * GET
     * PUT
     * POST
     * PATCH
     * DELETE
     * HEAD
     * OPTIONS
     */
    GET(false),
    PUT(true),
    POST(true),
    PATCH(true),
    DELETE(true),
    HEAD(false),
    OPTIONS(false);

    private boolean hasContent;

    MethodType(boolean hasContent) {
        this.hasContent = hasContent;
    }

    public boolean hasContent() {
        return hasContent;
    }
}