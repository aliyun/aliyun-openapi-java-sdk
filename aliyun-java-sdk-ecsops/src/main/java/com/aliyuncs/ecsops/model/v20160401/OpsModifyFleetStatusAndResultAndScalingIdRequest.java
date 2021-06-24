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

/**
 * @author auto create
 * @version 
 */
public class OpsModifyFleetStatusAndResultAndScalingIdRequest extends RpcAcsRequest<OpsModifyFleetStatusAndResultAndScalingIdResponse> {
	   

	private String scalingTaskId;

	private String fleetId;

	private String fleetTaskId;

	private String operator;

	private String result;

	private String id;

	private String status;

	private String auditParamStr;
	public OpsModifyFleetStatusAndResultAndScalingIdRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyFleetStatusAndResultAndScalingId", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getScalingTaskId() {
		return this.scalingTaskId;
	}

	public void setScalingTaskId(String scalingTaskId) {
		this.scalingTaskId = scalingTaskId;
		if(scalingTaskId != null){
			putQueryParameter("ScalingTaskId", scalingTaskId);
		}
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

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
		if(result != null){
			putQueryParameter("Result", result);
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
	public Class<OpsModifyFleetStatusAndResultAndScalingIdResponse> getResponseClass() {
		return OpsModifyFleetStatusAndResultAndScalingIdResponse.class;
	}

}
