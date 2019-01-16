package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreateIntranetDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;

public class CreateIntranetDomainResponseUnmarshaller {

    public static CreateIntranetDomainResponse unmarshall(CreateIntranetDomainResponse createIntranetDomainResponse, UnmarshallerContext context) {

        createIntranetDomainResponse.setRequestId(context.stringValue("CreateIntranetDomainResponse.RequestId"));
        createIntranetDomainResponse.setDomainName(context.stringValue("CreateIntranetDomainResponse.DomainName"));

        return createIntranetDomainResponse;
    }
}
