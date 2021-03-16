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
public class OpsBindFunctionGroupRequest extends RpcAcsRequest<OpsBindFunctionGroupResponse> {
	   

	private Long functionId;

	private Long functionGroupId;

	private String auditParamStr;
	public OpsBindFunctionGroupRequest() {
		super("Ecsops", "2016-04-01", "OpsBindFunctionGroup", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
		if(functionId != null){
			putQueryParameter("FunctionId", functionId.toString());
		}
	}

	public Long getFunctionGroupId() {
		return this.functionGroupId;
	}

	public void setFunctionGroupId(Long functionGroupId) {
		this.functionGroupId = functionGroupId;
		if(functionGroupId != null){
			putQueryParameter("FunctionGroupId", functionGroupId.toString());
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
	public Class<OpsBindFunctionGroupResponse> getResponseClass() {
		return OpsBindFunctionGroupResponse.class;
	}

}
