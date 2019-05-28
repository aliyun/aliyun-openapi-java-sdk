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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MigrateToOtherRegionRequest extends RpcAcsRequest<MigrateToOtherRegionResponse> {
	
	public MigrateToOtherRegionRequest() {
		super("Rds", "2014-08-15", "MigrateToOtherRegion", "Rds");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String targetVSwitchId;

	private Long ownerId;

	private String targetVpcId;

	private String targetZoneId;

	private String effectiveTime;

	private String dBInstanceId;

	private String targetRegionId;

	private String switchTime;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getTargetVSwitchId() {
		return this.targetVSwitchId;
	}

	public void setTargetVSwitchId(String targetVSwitchId) {
		this.targetVSwitchId = targetVSwitchId;
		if(targetVSwitchId != null){
			putQueryParameter("TargetVSwitchId", targetVSwitchId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTargetVpcId() {
		return this.targetVpcId;
	}

	public void setTargetVpcId(String targetVpcId) {
		this.targetVpcId = targetVpcId;
		if(targetVpcId != null){
			putQueryParameter("TargetVpcId", targetVpcId);
		}
	}

	public String getTargetZoneId() {
		return this.targetZoneId;
	}

	public void setTargetZoneId(String targetZoneId) {
		this.targetZoneId = targetZoneId;
		if(targetZoneId != null){
			putQueryParameter("TargetZoneId", targetZoneId);
		}
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putQueryParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getTargetRegionId() {
		return this.targetRegionId;
	}

	public void setTargetRegionId(String targetRegionId) {
		this.targetRegionId = targetRegionId;
		if(targetRegionId != null){
			putQueryParameter("TargetRegionId", targetRegionId);
		}
	}

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
		}
	}

	@Override
	public Class<MigrateToOtherRegionResponse> getResponseClass() {
		return MigrateToOtherRegionResponse.class;
	}

}
