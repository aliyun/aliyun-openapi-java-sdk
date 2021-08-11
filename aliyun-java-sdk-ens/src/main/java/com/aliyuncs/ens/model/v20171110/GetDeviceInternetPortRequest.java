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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceInternetPortRequest extends RpcAcsRequest<GetDeviceInternetPortResponse> {
	   

	private String natType;

	private String instanceId;

	private String ruleId;
	public GetDeviceInternetPortRequest() {
		super("Ens", "2017-11-10", "GetDeviceInternetPort", "ens");
		setMethod(MethodType.GET);
	}

	public String getNatType() {
		return this.natType;
	}

	public void setNatType(String natType) {
		this.natType = natType;
		if(natType != null){
			putQueryParameter("NatType", natType);
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

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	@Override
	public Class<GetDeviceInternetPortResponse> getResponseClass() {
		return GetDeviceInternetPortResponse.class;
	}

}
