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
public class OpsSubmitModifyHostNumaFeatureTaskRequest extends RpcAcsRequest<OpsSubmitModifyHostNumaFeatureTaskResponse> {
	   

	private String instanceType;

	private Boolean numaSwitch;

	private String instanceId;

	private String auditParamStr;
	public OpsSubmitModifyHostNumaFeatureTaskRequest() {
		super("Ecsops", "2016-04-01", "OpsSubmitModifyHostNumaFeatureTask", "ecsops");
		setMethod(MethodType.POST);
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

	public Boolean getNumaSwitch() {
		return this.numaSwitch;
	}

	public void setNumaSwitch(Boolean numaSwitch) {
		this.numaSwitch = numaSwitch;
		if(numaSwitch != null){
			putQueryParameter("NumaSwitch", numaSwitch.toString());
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
	public Class<OpsSubmitModifyHostNumaFeatureTaskResponse> getResponseClass() {
		return OpsSubmitModifyHostNumaFeatureTaskResponse.class;
	}

}
