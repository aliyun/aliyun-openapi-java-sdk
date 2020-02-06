package com.aliyuncs;

import com.aliyuncs.transform.UnmarshallerContext;

import java.util.Map;

public class AcsErrorUnmarshaller {
    public static AcsError unmarshall(AcsError error, UnmarshallerContext context) {
        Map<String, String> map = context.getResponseMap();
        error.setStatusCode(context.getHttpStatus());
        error.setRequestId(map.get("Error.RequestId") == null ? map.get("Error.requestId") : map.get("Error.RequestId"));
        error.setErrorCode(map.get("Error.Code") == null ? map.get("Error.code") : map.get("Error.Code"));
        error.setErrorMessage(map.get("Error.Message") == null ? map.get("Error.message") : map.get("Error.Message"));
        error.setErrorDescription(map.get("Error.Description") == null ? map.get("Error.description") : map.get("Error.Description"));
        return error;
    }
}
