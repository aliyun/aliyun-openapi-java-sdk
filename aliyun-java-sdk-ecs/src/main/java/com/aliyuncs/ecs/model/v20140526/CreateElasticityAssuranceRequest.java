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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateElasticityAssuranceRequest extends RpcAcsRequest<CreateElasticityAssuranceResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String description;

	private String startTime;

	private String privatePoolOptionsMatchCriteria;

	private List<String> instanceTypes;

	private Integer period;

	private String resourceOwnerAccount;

	private String privatePoolOptionsName;

	private String ownerAccount;

	private String assuranceTimes;

	private Long ownerId;

	private Integer instanceCpuCoreCount;

	private String periodUnit;

	private List<String> zoneIds;

	private Integer instanceAmount;
	public CreateElasticityAssuranceRequest() {
		super("Ecs", "2014-05-26", "CreateElasticityAssurance", "ecs");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public List<String> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<String> instanceTypes) {
		this.instanceTypes = instanceTypes;	
		if (instanceTypes != null) {
			for (int i = 0; i < instanceTypes.size(); i++) {
				putQueryParameter("InstanceType." + (i + 1) , instanceTypes.get(i));
			}
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

	public String getPrivatePoolOptionsName() {
		return this.privatePoolOptionsName;
	}

	public void setPrivatePoolOptionsName(String privatePoolOptionsName) {
		this.privatePoolOptionsName = privatePoolOptionsName;
		if(privatePoolOptionsName != null){
			putQueryParameter("PrivatePoolOptions.Name", privatePoolOptionsName);
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

	public String getAssuranceTimes() {
		return this.assuranceTimes;
	}

	public void setAssuranceTimes(String assuranceTimes) {
		this.assuranceTimes = assuranceTimes;
		if(assuranceTimes != null){
			putQueryParameter("AssuranceTimes", assuranceTimes);
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

	public Integer getInstanceCpuCoreCount() {
		return this.instanceCpuCoreCount;
	}

	public void setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
		this.instanceCpuCoreCount = instanceCpuCoreCount;
		if(instanceCpuCoreCount != null){
			putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount.toString());
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

	public List<String> getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;	
		if (zoneIds != null) {
			for (int i = 0; i < zoneIds.size(); i++) {
				putQueryParameter("ZoneId." + (i + 1) , zoneIds.get(i));
			}
		}	
	}

	public Integer getInstanceAmount() {
		return this.instanceAmount;
	}

	public void setInstanceAmount(Integer instanceAmount) {
		this.instanceAmount = instanceAmount;
		if(instanceAmount != null){
			putQueryParameter("InstanceAmount", instanceAmount.toString());
		}
	}

	@Override
	public Class<CreateElasticityAssuranceResponse> getResponseClass() {
		return CreateElasticityAssuranceResponse.class;
	}

}
