package com.aliyuncs;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

public abstract class AcsResponse {

    public abstract AcsResponse getInstance(UnmarshallerContext context) throws ClientException, ServerException;

    public boolean checkShowJsonItemName() {
        return true;
    }
}
