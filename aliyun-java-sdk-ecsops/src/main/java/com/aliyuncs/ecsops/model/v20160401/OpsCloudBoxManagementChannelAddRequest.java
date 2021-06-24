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
public class OpsCloudBoxManagementChannelAddRequest extends RpcAcsRequest<OpsCloudBoxManagementChannelAddResponse> {
	   

	private String cbManageType;

	private String operator;

	private String requestParamStr;

	private String workOrderId;

	private String auditParamStr;
	public OpsCloudBoxManagementChannelAddRequest() {
		super("Ecsops", "2016-04-01", "OpsCloudBoxManagementChannelAdd", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getCbManageType() {
		return this.cbManageType;
	}

	public void setCbManageType(String cbManageType) {
		this.cbManageType = cbManageType;
		if(cbManageType != null){
			putQueryParameter("CbManageType", cbManageType);
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

	public String getRequestParamStr() {
		return this.requestParamStr;
	}

	public void setRequestParamStr(String requestParamStr) {
		this.requestParamStr = requestParamStr;
		if(requestParamStr != null){
			putQueryParameter("RequestParamStr", requestParamStr);
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
	public Class<OpsCloudBoxManagementChannelAddResponse> getResponseClass() {
		return OpsCloudBoxManagementChannelAddResponse.class;
	}

}
