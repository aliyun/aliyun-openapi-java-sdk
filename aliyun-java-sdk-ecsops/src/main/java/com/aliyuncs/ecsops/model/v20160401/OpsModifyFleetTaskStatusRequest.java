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
public class OpsModifyFleetTaskStatusRequest extends RpcAcsRequest<OpsModifyFleetTaskStatusResponse> {
	   

	private String fleetId;

	private String fleetTaskId;

	private String operator;

	private String id;

	private String status;

	private String auditParamStr;
	public OpsModifyFleetTaskStatusRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyFleetTaskStatus", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFleetId() {
		return this.fleetId;
	}

	public void setFleetId(String fleetId) {
		this.fleetId = fleetId;
		if(fleetId != null){
			putQueryParameter("FleetId", fleetId);
		}
	}

	public String getFleetTaskId() {
		return this.fleetTaskId;
	}

	public void setFleetTaskId(String fleetTaskId) {
		this.fleetTaskId = fleetTaskId;
		if(fleetTaskId != null){
			putQueryParameter("FleetTaskId", fleetTaskId);
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
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
	public Class<OpsModifyFleetTaskStatusResponse> getResponseClass() {
		return OpsModifyFleetTaskStatusResponse.class;
	}

}
