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
public class OpsCreateSpotEventRequest extends RpcAcsRequest<OpsCreateSpotEventResponse> {
	   

	private String spotEventSubType;

	private String operator;

	private String extraInfo;

	private String spotEventCategory;

	private String workOrderId;

	private String instanceId;

	private String auditParamStr;
	public OpsCreateSpotEventRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateSpotEvent", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSpotEventSubType() {
		return this.spotEventSubType;
	}

	public void setSpotEventSubType(String spotEventSubType) {
		this.spotEventSubType = spotEventSubType;
		if(spotEventSubType != null){
			putQueryParameter("SpotEventSubType", spotEventSubType);
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

	public String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
		if(extraInfo != null){
			putQueryParameter("ExtraInfo", extraInfo);
		}
	}

	public String getSpotEventCategory() {
		return this.spotEventCategory;
	}

	public void setSpotEventCategory(String spotEventCategory) {
		this.spotEventCategory = spotEventCategory;
		if(spotEventCategory != null){
			putQueryParameter("SpotEventCategory", spotEventCategory);
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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
	public Class<OpsCreateSpotEventResponse> getResponseClass() {
		return OpsCreateSpotEventResponse.class;
	}

}
