package com.aliyuncs.v5;

import com.aliyuncs.v5.exceptions.ClientException;
import com.aliyuncs.v5.exceptions.ServerException;
import com.aliyuncs.v5.transform.UnmarshallerContext;

public abstract class AcsResponse {

    public abstract AcsResponse getInstance(UnmarshallerContext context) throws ClientException, ServerException;

    public boolean checkShowJsonItemName() {
        return true;
    }
}
