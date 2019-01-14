package com.aliyuncs.auth;

import java.security.InvalidKeyException;

@Deprecated
public interface ISigner {

    public String getSignerName();

    public String getSignerVersion();

    public String signString(String source, String accessSecret) throws InvalidKeyException, IllegalStateException;

}
