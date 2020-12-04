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
 * @author auto create
 */
public class DescribeContainerGroupPriceRequest extends RpcAcsRequest<DescribeContainerGroupPriceResponse> {

    public DescribeContainerGroupPriceRequest() {
        super("Eci", "2018-08-08", "DescribeContainerGroupPrice", "eci");
    }

    private Float spotPriceLimit;

    private String instanceType;

    private String spotStrategy;

    private String zoneId;

    private Long resourceOwnerId;

    private Float memory;

    private String resourceOwnerAccount;

    private String ownerAccount;

    private Float cpu;

    private Long ownerId;

    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public void setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        if (null != spotPriceLimit) {
            putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
        }
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        if (null != instanceType) {
            putQueryParameter("InstanceType", instanceType.toString());
        }
    }

    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public void setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        if (null != spotStrategy) {
            putQueryParameter("SpotStrategy", spotStrategy.toString());
        }
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
        if (null != zoneId) {
            putQueryParameter("ZoneId", zoneId.toString());
        }
    }

    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        if (resourceOwnerId != null) {
            putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
        }
    }

    public Float getMemory() {
        return this.memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
        if (memory != null) {
            putQueryParameter("Memory", memory.toString());
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

    public Float getCpu() {
        return this.cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
        if (cpu != null) {
            putQueryParameter("Cpu", cpu.toString());
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

    @Override
    public Class<DescribeContainerGroupPriceResponse> getResponseClass() {
        return DescribeContainerGroupPriceResponse.class;
    }

}
