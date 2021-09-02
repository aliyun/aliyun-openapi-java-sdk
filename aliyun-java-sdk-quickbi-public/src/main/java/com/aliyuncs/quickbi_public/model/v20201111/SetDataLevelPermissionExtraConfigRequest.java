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

package com.aliyuncs.quickbi_public.model.v20201111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDataLevelPermissionExtraConfigRequest extends RpcAcsRequest<SetDataLevelPermissionExtraConfigResponse> {
	   

	private String missHitPolicy;

	private String ruleType;

	private String cubeId;
	public SetDataLevelPermissionExtraConfigRequest() {
		super("quickbi-public", "2020-11-11", "SetDataLevelPermissionExtraConfig", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMissHitPolicy() {
		return this.missHitPolicy;
	}

	public void setMissHitPolicy(String missHitPolicy) {
		this.missHitPolicy = missHitPolicy;
		if(missHitPolicy != null){
			putQueryParameter("MissHitPolicy", missHitPolicy);
		}
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType);
		}
	}

	public String getCubeId() {
		return this.cubeId;
	}

	public void setCubeId(String cubeId) {
		this.cubeId = cubeId;
		if(cubeId != null){
			putQueryParameter("CubeId", cubeId);
		}
	}

	@Override
	public Class<SetDataLevelPermissionExtraConfigResponse> getResponseClass() {
		return SetDataLevelPermissionExtraConfigResponse.class;
	}

}
