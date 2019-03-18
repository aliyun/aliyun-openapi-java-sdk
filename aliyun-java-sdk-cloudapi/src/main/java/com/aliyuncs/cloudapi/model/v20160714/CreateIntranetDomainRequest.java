package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

public class CreateIntranetDomainRequest extends RpcAcsRequest<CreateIntranetDomainResponse> {

    public CreateIntranetDomainRequest() {
        super("CloudAPI", "2016-07-14", "CreateIntranetDomain", "apigateway");
    }

    private String GroupId;

    private Boolean DeleteInternetDomain;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
        putQueryParameter("GroupId", groupId);
    }

    public Boolean getDeleteInternetDomain() {
        return DeleteInternetDomain;
    }

    public void setDeleteInternetDomain(Boolean deleteInternetDomain) {
        DeleteInternetDomain = deleteInternetDomain;
        putQueryParameter("DeleteInternetDomain", deleteInternetDomain);
    }

    @Override
    public Class<CreateIntranetDomainResponse> getResponseClass() {
        return CreateIntranetDomainResponse.class;
    }
}
