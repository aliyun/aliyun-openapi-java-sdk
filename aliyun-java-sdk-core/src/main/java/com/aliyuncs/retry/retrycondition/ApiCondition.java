package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;
import com.aliyuncs.utils.IOUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Arrays;
import java.util.List;

public class ApiCondition implements RetryCondition {
    public static final JsonObject retryApiJson= new JsonParser().
            parse(IOUtils.readFiles("retryConfig.json")).getAsJsonObject();

    @Override
    public boolean shouldRetry(RetryContext context) {
        List<String> list;
        try {
            list = getRetryApis(context.getProductCode(), context.getVersion());
            return list.contains(context.getActionName());
        } catch (Exception e) {
            return false;
        }
    }

    private List<String> getRetryApis(String productCode, String version) {
        String apis = retryApiJson.get(productCode).getAsJsonObject().get(version).getAsJsonObject().
                get("RetryableAPIs").toString();
        apis = apis.substring(1, apis.length() - 1).replaceAll("\"", "");
        return Arrays.asList(apis.split(","));
    }
}
