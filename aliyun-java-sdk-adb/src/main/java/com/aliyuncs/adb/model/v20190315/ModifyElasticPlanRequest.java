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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyElasticPlanRequest extends RpcAcsRequest<ModifyElasticPlanResponse> {
	   

	private Long resourceOwnerId;

	private String elasticPlanTimeStart;

	private String elasticPlanEndDay;

	private String elasticPlanWeeklyRepeat;

	private Boolean elasticPlanEnable;

	private String elasticPlanTimeEnd;

	private String elasticPlanStartDay;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String elasticPlanName;

	private String resourcePoolName;

	private Integer elasticPlanNodeNum;
	public ModifyElasticPlanRequest() {
		super("adb", "2019-03-15", "ModifyElasticPlan", "ads");
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

	public String getElasticPlanTimeStart() {
		return this.elasticPlanTimeStart;
	}

	public void setElasticPlanTimeStart(String elasticPlanTimeStart) {
		this.elasticPlanTimeStart = elasticPlanTimeStart;
		if(elasticPlanTimeStart != null){
			putQueryParameter("ElasticPlanTimeStart", elasticPlanTimeStart);
		}
	}

	public String getElasticPlanEndDay() {
		return this.elasticPlanEndDay;
	}

	public void setElasticPlanEndDay(String elasticPlanEndDay) {
		this.elasticPlanEndDay = elasticPlanEndDay;
		if(elasticPlanEndDay != null){
			putQueryParameter("ElasticPlanEndDay", elasticPlanEndDay);
		}
	}

	public String getElasticPlanWeeklyRepeat() {
		return this.elasticPlanWeeklyRepeat;
	}

	public void setElasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
		this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
		if(elasticPlanWeeklyRepeat != null){
			putQueryParameter("ElasticPlanWeeklyRepeat", elasticPlanWeeklyRepeat);
		}
	}

	public Boolean getElasticPlanEnable() {
		return this.elasticPlanEnable;
	}

	public void setElasticPlanEnable(Boolean elasticPlanEnable) {
		this.elasticPlanEnable = elasticPlanEnable;
		if(elasticPlanEnable != null){
			putQueryParameter("ElasticPlanEnable", elasticPlanEnable.toString());
		}
	}

	public String getElasticPlanTimeEnd() {
		return this.elasticPlanTimeEnd;
	}

	public void setElasticPlanTimeEnd(String elasticPlanTimeEnd) {
		this.elasticPlanTimeEnd = elasticPlanTimeEnd;
		if(elasticPlanTimeEnd != null){
			putQueryParameter("ElasticPlanTimeEnd", elasticPlanTimeEnd);
		}
	}

	public String getElasticPlanStartDay() {
		return this.elasticPlanStartDay;
	}

	public void setElasticPlanStartDay(String elasticPlanStartDay) {
		this.elasticPlanStartDay = elasticPlanStartDay;
		if(elasticPlanStartDay != null){
			putQueryParameter("ElasticPlanStartDay", elasticPlanStartDay);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getElasticPlanName() {
		return this.elasticPlanName;
	}

	public void setElasticPlanName(String elasticPlanName) {
		this.elasticPlanName = elasticPlanName;
		if(elasticPlanName != null){
			putQueryParameter("ElasticPlanName", elasticPlanName);
		}
	}

	public String getResourcePoolName() {
		return this.resourcePoolName;
	}

	public void setResourcePoolName(String resourcePoolName) {
		this.resourcePoolName = resourcePoolName;
		if(resourcePoolName != null){
			putQueryParameter("ResourcePoolName", resourcePoolName);
		}
	}

	public Integer getElasticPlanNodeNum() {
		return this.elasticPlanNodeNum;
	}

	public void setElasticPlanNodeNum(Integer elasticPlanNodeNum) {
		this.elasticPlanNodeNum = elasticPlanNodeNum;
		if(elasticPlanNodeNum != null){
			putQueryParameter("ElasticPlanNodeNum", elasticPlanNodeNum.toString());
		}
	}

	@Override
	public Class<ModifyElasticPlanResponse> getResponseClass() {
		return ModifyElasticPlanResponse.class;
	}

}
