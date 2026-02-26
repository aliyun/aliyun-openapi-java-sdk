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

/**
 * @author xiaohui
 * @version 1.5.3
 */
public class ResizeContainerGroupEphemeralStorageRequest extends RpcAcsRequest<ResizeContainerGroupEphemeralStorageResponse> {

    public ResizeContainerGroupEphemeralStorageRequest() {
        super("Eci", "2018-08-08", "ResizeContainerGroupEphemeralStorage", "eci");
    }

    private Long resourceOwnerId;

    private String containerGroupId;

    private String resourceOwnerAccount;

    private String ownerAccount;

    private Long ownerId;

    private String regionId;

    private Integer newSize;

    private String clientToken;

    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        if (resourceOwnerId != null) {
            putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
        }
    }

    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public void setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        if (containerGroupId != null) {
            putQueryParameter("ContainerGroupId", containerGroupId);
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

    @Override
    public String getRegionId() {
        return regionId;
    }

    @Override
    public void setRegionId(String regionId) {
        this.regionId = regionId;
        if (regionId != null) {
            putQueryParameter("RegionId", regionId);
        }
    }

    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
        if (newSize != null) {
            putQueryParameter("NewSize", newSize.toString());
        }
    }

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        if (ownerId != null) {
            putQueryParameter("OwnerId", ownerId.toString());
        }
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        if (clientToken != null) {
            putQueryParameter("ClientToken", clientToken);
        }
    }


    @Override
    public Class<ResizeContainerGroupEphemeralStorageResponse> getResponseClass() {
        return ResizeContainerGroupEphemeralStorageResponse.class;
    }
}
