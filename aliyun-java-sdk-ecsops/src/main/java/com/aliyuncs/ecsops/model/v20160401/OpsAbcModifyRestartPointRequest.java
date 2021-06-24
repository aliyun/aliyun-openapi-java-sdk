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
public class OpsAbcModifyRestartPointRequest extends RpcAcsRequest<OpsAbcModifyRestartPointResponse> {
	   

	private String base64Data;

	private String operator;

	private String workOrderId;

	private String instanceId;

	private String auditParamStr;
	public OpsAbcModifyRestartPointRequest() {
		super("Ecsops", "2016-04-01", "OpsAbcModifyRestartPoint", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getBase64Data() {
		return this.base64Data;
	}

	public void setBase64Data(String base64Data) {
		this.base64Data = base64Data;
		if(base64Data != null){
			putQueryParameter("Base64Data", base64Data);
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
	public Class<OpsAbcModifyRestartPointResponse> getResponseClass() {
		return OpsAbcModifyRestartPointResponse.class;
	}

}
