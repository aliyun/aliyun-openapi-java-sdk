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

import java.util.List;


public class UntagResourcesRequest extends RpcAcsRequest<UntagResourcesResponse> {
    public UntagResourcesRequest() {
        super("Eci", "2018-08-08", "UntagResources", "eci");
    }

    private Long resourceOwnerId;

    private String resourceOwnerAccount;

    private Long ownerId;

    private String ownerAccount;

    private List<String> resourceId;

    private List<String> tagKeys;

    private String resourceType;

    private Boolean all;

    private String clientToken;

    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
        if (resourceId != null) {
            for (int i = 0; i < resourceId.size(); i++) {
                putQueryParameter("ResourceId." + (i + 1) , resourceId.get(i));
            }
        }
    }

    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
        if (tagKeys != null) {
            for (int i = 0; i < tagKeys.size(); i++) {
                putQueryParameter("TagKey." + (i + 1) , tagKeys.get(i));
            }
        }
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
        if (resourceType != null) {
            putQueryParameter("ResourceType", resourceType);
        }
    }

    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
        if (all != null) {
            putQueryParameter("All", all.toString());
        }
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        if (clientToken != null) {
            putQueryParameter("ClientToken", clientToken);
        }
    }

    public Long getResourceOwnerId() {
        return resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        if (resourceOwnerId != null) {
            putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
        }
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        if (resourceOwnerAccount != null) {
            putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
        }
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        if (ownerId != null) {
            putQueryParameter("OwnerId", ownerId.toString());
        }
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        if (ownerAccount != null) {
            putQueryParameter("OwnerAccount", ownerAccount);
        }
    }


    @Override
    public Class<UntagResourcesResponse> getResponseClass() {
        return UntagResourcesResponse.class;
    }

}

