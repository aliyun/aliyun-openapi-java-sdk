package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.AttachPluginResponseUnmarshaller;
import com.aliyuncs.cloudapi.transform.v20160714.DetachPluginResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @Author: wuling
 * @Date: 2018/11/13 上午10:57
 */
public class DetachPluginResponse extends AcsResponse {

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public AcsResponse getInstance(UnmarshallerContext unmarshallerContext) throws ClientException, ServerException {
        return DetachPluginResponseUnmarshaller.unmarshall(this,unmarshallerContext);
    }
}
