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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCustomPrivacyPolicyRequest extends RpcAcsRequest<GetCustomPrivacyPolicyResponse> {
	   

	private String customPrivacyPolicyId;

	private String instanceId;
	public GetCustomPrivacyPolicyRequest() {
		super("Eiam", "2021-12-01", "GetCustomPrivacyPolicy", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getCustomPrivacyPolicyId() {
		return this.customPrivacyPolicyId;
	}

	public void setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
		this.customPrivacyPolicyId = customPrivacyPolicyId;
		if(customPrivacyPolicyId != null){
			putQueryParameter("CustomPrivacyPolicyId", customPrivacyPolicyId);
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

	@Override
	public Class<GetCustomPrivacyPolicyResponse> getResponseClass() {
		return GetCustomPrivacyPolicyResponse.class;
	}

}
