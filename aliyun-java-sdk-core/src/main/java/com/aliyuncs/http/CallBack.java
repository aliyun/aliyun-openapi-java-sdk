package com.aliyuncs.http;

/**
 * 用于异步调用时的回调逻辑
 *
 * @author VK.Gao
 * @date 2017/03/02
 */
public interface CallBack {

    /**
     * 请求失败
     *
     * @param request 封装后的请求对象，包含部分http相关信息
     * @param e       导致失败的异常
     */
    void onFailure(HttpRequest request, Exception e);

    /**
     * 收到应答
     *
     * @param request  封装后的请求对象，包含部分http相关信息
     * @param response 封装后的应答对象，包含部分http相关信息，可以调用.getBody()获取content
     */
    void onResponse(HttpRequest request, HttpResponse response);
}
