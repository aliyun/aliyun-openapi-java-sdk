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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PurchaseElasticityAssuranceRequest extends RpcAcsRequest<PurchaseElasticityAssuranceResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String startTime;

	private String privatePoolOptionsMatchCriteria;

	private String privatePoolOptionsId;

	private Integer period;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String periodUnit;
	public PurchaseElasticityAssuranceRequest() {
		super("Ecs", "2014-05-26", "PurchaseElasticityAssurance", "ecs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getPrivatePoolOptionsMatchCriteria() {
		return this.privatePoolOptionsMatchCriteria;
	}

	public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
		this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		if(privatePoolOptionsMatchCriteria != null){
			putQueryParameter("PrivatePoolOptions.MatchCriteria", privatePoolOptionsMatchCriteria);
		}
	}

	public String getPrivatePoolOptionsId() {
		return this.privatePoolOptionsId;
	}

	public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
		this.privatePoolOptionsId = privatePoolOptionsId;
		if(privatePoolOptionsId != null){
			putQueryParameter("PrivatePoolOptions.Id", privatePoolOptionsId);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	@Override
	public Class<PurchaseElasticityAssuranceResponse> getResponseClass() {
		return PurchaseElasticityAssuranceResponse.class;
	}

}
