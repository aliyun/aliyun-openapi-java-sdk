/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

import java.util.List;


/**
 * @author xiaohui
 * @version 1.3.0
 */

public class DescribeContainerGroupStatusRequest extends RpcAcsRequest<DescribeContainerGroupStatusResponse> {

    public DescribeContainerGroupStatusRequest() {
        super("Eci", "2018-08-08", "DescribeContainerGroupStatus", "eci");
        setMethod(MethodType.POST);
    }

    private Long resourceOwnerId;

    private String resourceOwnerAccount;

    private String ownerAccount;

    private Long ownerId;

    private String zoneId;

    private String vSwitchId;

    private String resourceGroupId;

    private String nextToken;

    private List<Tag> tags;

    private String containerGroupIds;

    private Integer sinceSecond;

    private Integer limit;


    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        if (resourceOwnerId != null) {
            putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
        }
    }

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        if (resourceOwnerAccount != null) {
            putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
        }
    }

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        if (ownerAccount != null) {
            putQueryParameter("OwnerAccount", ownerAccount);
        }
    }

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        if (ownerId != null) {
            putQueryParameter("OwnerId", ownerId);
        }
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
        if (zoneId != null) {
            putQueryParameter("ZoneId", zoneId);
        }
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        if (vSwitchId != null) {
            putQueryParameter("VSwitchId", vSwitchId);
        }
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        if (resourceGroupId != null) {
            putQueryParameter("ResourceGroupId", resourceGroupId);
        }
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
        if (nextToken != null) {
            putQueryParameter("NextToken", nextToken);
        }
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
        if (tags != null) {
            for (int depth = 0; depth < tags.size(); depth++) {
                putQueryParameter("Tag." + (depth + 1) + ".Key" , tags.get(depth).getKey());
                putQueryParameter("Tag." + (depth + 1) + ".Value" , tags.get(depth).getValue());
            }
        }
    }

    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    public void setContainerGroupIds(String containerGroupIds) {
        this.containerGroupIds = containerGroupIds;
        if (containerGroupIds != null) {
            putQueryParameter("ContainerGroupIds", containerGroupIds);
        }
    }

    public Integer getSinceSecond() {
        return this.sinceSecond;
    }

    public void setSinceSecond(Integer sinceSecond) {
        this.sinceSecond = sinceSecond;
        if (sinceSecond != null) {
            putQueryParameter("SinceSecond", sinceSecond.toString());
        }
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
        if (limit != null) {
            putQueryParameter("Limit", limit.toString());
        }
    }

    public static class Tag {

        private String key;

        private String value;

        public String getKey() {
            return this.key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @Override
    public Class<DescribeContainerGroupStatusResponse> getResponseClass() {
        return DescribeContainerGroupStatusResponse.class;
    }
}
