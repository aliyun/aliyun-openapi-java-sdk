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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDiagnosisOperateRecordsRequest extends RpcAcsRequest<CreateDiagnosisOperateRecordsResponse> {
	   

	private Long resourceOwnerId;

	private String operateRecordType;

	private String instanceType;

	private String errorCode;

	private String resourceOwnerAccount;

	private String newZoneId;

	private String newInstanceType;

	private Long ownerId;

	private String zoneId;

	private String payType;
	public CreateDiagnosisOperateRecordsRequest() {
		super("Ecs", "2016-03-14", "CreateDiagnosisOperateRecords", "ecs");
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

	public String getOperateRecordType() {
		return this.operateRecordType;
	}

	public void setOperateRecordType(String operateRecordType) {
		this.operateRecordType = operateRecordType;
		if(operateRecordType != null){
			putQueryParameter("OperateRecordType", operateRecordType);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
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

	public String getNewZoneId() {
		return this.newZoneId;
	}

	public void setNewZoneId(String newZoneId) {
		this.newZoneId = newZoneId;
		if(newZoneId != null){
			putQueryParameter("NewZoneId", newZoneId);
		}
	}

	public String getNewInstanceType() {
		return this.newInstanceType;
	}

	public void setNewInstanceType(String newInstanceType) {
		this.newInstanceType = newInstanceType;
		if(newInstanceType != null){
			putQueryParameter("NewInstanceType", newInstanceType);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	@Override
	public Class<CreateDiagnosisOperateRecordsResponse> getResponseClass() {
		return CreateDiagnosisOperateRecordsResponse.class;
	}

}
