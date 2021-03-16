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
public class OpsAcceptInquiredSystemEventRequest extends RpcAcsRequest<OpsAcceptInquiredSystemEventResponse> {
	   

	private String eventId;

	private String sourceOwnerBid;

	private String operator;

	private String workOrderId;

	private Long sourceOwnerAliUid;

	private String auditParamStr;
	public OpsAcceptInquiredSystemEventRequest() {
		super("Ecsops", "2016-04-01", "OpsAcceptInquiredSystemEvent", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
		if(eventId != null){
			putQueryParameter("EventId", eventId);
		}
	}

	public String getSourceOwnerBid() {
		return this.sourceOwnerBid;
	}

	public void setSourceOwnerBid(String sourceOwnerBid) {
		this.sourceOwnerBid = sourceOwnerBid;
		if(sourceOwnerBid != null){
			putQueryParameter("SourceOwnerBid", sourceOwnerBid);
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

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public Long getSourceOwnerAliUid() {
		return this.sourceOwnerAliUid;
	}

	public void setSourceOwnerAliUid(Long sourceOwnerAliUid) {
		this.sourceOwnerAliUid = sourceOwnerAliUid;
		if(sourceOwnerAliUid != null){
			putQueryParameter("SourceOwnerAliUid", sourceOwnerAliUid.toString());
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
	public Class<OpsAcceptInquiredSystemEventResponse> getResponseClass() {
		return OpsAcceptInquiredSystemEventResponse.class;
	}

}
