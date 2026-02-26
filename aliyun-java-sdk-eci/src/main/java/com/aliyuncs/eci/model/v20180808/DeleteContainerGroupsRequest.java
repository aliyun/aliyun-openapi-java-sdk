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

/**
 * @author xiaohui
 * @version 1.3.9
 */
public class DeleteContainerGroupsRequest extends RpcAcsRequest<DeleteContainerGroupsResponse> {

    public DeleteContainerGroupsRequest() {
        super("Eci", "2018-08-08", "DeleteContainerGroups", "eci");
        setMethod(MethodType.POST);
    }

    private Long resourceOwnerId;

    private String resourceOwnerAccount;

    private String ownerAccount;

    private Long ownerId;

    private String containerGroupIds;

    public Long getResourceOwnerId() {
        return resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        if(resourceOwnerId != null){
            putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
        }
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        if(resourceOwnerAccount != null){
            putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
        }
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        if(ownerAccount != null){
            putQueryParameter("OwnerAccount", ownerAccount);
        }
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        if(ownerId != null){
            putQueryParameter("OwnerId", ownerId);
        }
    }

    public String getContainerGroupIds() {
        return containerGroupIds;
    }

    public void setContainerGroupIds(String containerGroupIds) {
        this.containerGroupIds = containerGroupIds;
        if(containerGroupIds != null){
            putQueryParameter("ContainerGroupIds", containerGroupIds);
        }
    }

    @Override
    public Class<DeleteContainerGroupsResponse> getResponseClass() {
        return DeleteContainerGroupsResponse.class;
    }


}
