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
public class OpsOrderAndRenewEcsRequest extends RpcAcsRequest<OpsOrderAndRenewEcsResponse> {
	   

	private String operator;

	private String paramJsonString;

	private String workOrderId;

	private String auditParamStr;
	public OpsOrderAndRenewEcsRequest() {
		super("Ecsops", "2016-04-01", "OpsOrderAndRenewEcs", "ecsops");
		setMethod(MethodType.POST);
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

	public String getParamJsonString() {
		return this.paramJsonString;
	}

	public void setParamJsonString(String paramJsonString) {
		this.paramJsonString = paramJsonString;
		if(paramJsonString != null){
			putQueryParameter("ParamJsonString", paramJsonString);
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
	public Class<OpsOrderAndRenewEcsResponse> getResponseClass() {
		return OpsOrderAndRenewEcsResponse.class;
	}

}
