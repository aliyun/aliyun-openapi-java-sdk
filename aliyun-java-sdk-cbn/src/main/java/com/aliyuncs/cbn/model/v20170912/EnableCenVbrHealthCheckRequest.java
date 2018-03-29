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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class EnableCenVbrHealthCheckRequest extends RpcAcsRequest<EnableCenVbrHealthCheckResponse> {
	
	public EnableCenVbrHealthCheckRequest() {
		super("Cbn", "2017-09-12", "EnableCenVbrHealthCheck", "cbn");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String cenId;

	private String healthCheckSourceIp;

	private Long vbrInstanceOwnerId;

	private String ownerAccount;

	private String vbrInstanceId;

	private String healthCheckTargetIp;

	private Long ownerId;

	private String vbrInstanceRegionId;

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

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getHealthCheckSourceIp() {
		return this.healthCheckSourceIp;
	}

	public void setHealthCheckSourceIp(String healthCheckSourceIp) {
		this.healthCheckSourceIp = healthCheckSourceIp;
		if(healthCheckSourceIp != null){
			putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
		}
	}

	public Long getVbrInstanceOwnerId() {
		return this.vbrInstanceOwnerId;
	}

	public void setVbrInstanceOwnerId(Long vbrInstanceOwnerId) {
		this.vbrInstanceOwnerId = vbrInstanceOwnerId;
		if(vbrInstanceOwnerId != null){
			putQueryParameter("VbrInstanceOwnerId", vbrInstanceOwnerId.toString());
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

	public String getVbrInstanceId() {
		return this.vbrInstanceId;
	}

	public void setVbrInstanceId(String vbrInstanceId) {
		this.vbrInstanceId = vbrInstanceId;
		if(vbrInstanceId != null){
			putQueryParameter("VbrInstanceId", vbrInstanceId);
		}
	}

	public String getHealthCheckTargetIp() {
		return this.healthCheckTargetIp;
	}

	public void setHealthCheckTargetIp(String healthCheckTargetIp) {
		this.healthCheckTargetIp = healthCheckTargetIp;
		if(healthCheckTargetIp != null){
			putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
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

	public String getVbrInstanceRegionId() {
		return this.vbrInstanceRegionId;
	}

	public void setVbrInstanceRegionId(String vbrInstanceRegionId) {
		this.vbrInstanceRegionId = vbrInstanceRegionId;
		if(vbrInstanceRegionId != null){
			putQueryParameter("VbrInstanceRegionId", vbrInstanceRegionId);
		}
	}

	@Override
	public Class<EnableCenVbrHealthCheckResponse> getResponseClass() {
		return EnableCenVbrHealthCheckResponse.class;
	}

}
