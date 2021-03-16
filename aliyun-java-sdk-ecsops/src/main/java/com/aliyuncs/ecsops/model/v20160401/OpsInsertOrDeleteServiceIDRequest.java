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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsInsertOrDeleteServiceIDRequest extends RpcAcsRequest<OpsInsertOrDeleteServiceIDResponse> {
	   

	private String description;

	private String effectiveOwnerType;

	private String operator;

	private Boolean supportTrunking;

	private String operate;

	private String resourceOwnerIds;

	private String productName;

	private String serviceId;

	private String resourceTotal;

	private String auditParamStr;
	public OpsInsertOrDeleteServiceIDRequest() {
		super("Ecsops", "2016-04-01", "OpsInsertOrDeleteServiceID", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getEffectiveOwnerType() {
		return this.effectiveOwnerType;
	}

	public void setEffectiveOwnerType(String effectiveOwnerType) {
		this.effectiveOwnerType = effectiveOwnerType;
		if(effectiveOwnerType != null){
			putQueryParameter("EffectiveOwnerType", effectiveOwnerType);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Boolean getSupportTrunking() {
		return this.supportTrunking;
	}

	public void setSupportTrunking(Boolean supportTrunking) {
		this.supportTrunking = supportTrunking;
		if(supportTrunking != null){
			putQueryParameter("SupportTrunking", supportTrunking.toString());
		}
	}

	public String getOperate() {
		return this.operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
		if(operate != null){
			putQueryParameter("Operate", operate);
		}
	}

	public String getResourceOwnerIds() {
		return this.resourceOwnerIds;
	}

	public void setResourceOwnerIds(String resourceOwnerIds) {
		this.resourceOwnerIds = resourceOwnerIds;
		if(resourceOwnerIds != null){
			putQueryParameter("ResourceOwnerIds", resourceOwnerIds);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getResourceTotal() {
		return this.resourceTotal;
	}

	public void setResourceTotal(String resourceTotal) {
		this.resourceTotal = resourceTotal;
		if(resourceTotal != null){
			putQueryParameter("ResourceTotal", resourceTotal);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsInsertOrDeleteServiceIDResponse> getResponseClass() {
		return OpsInsertOrDeleteServiceIDResponse.class;
	}

}
