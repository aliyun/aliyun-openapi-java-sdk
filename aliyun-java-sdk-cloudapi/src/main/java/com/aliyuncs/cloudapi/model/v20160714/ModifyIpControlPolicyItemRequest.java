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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyIpControlPolicyItemRequest extends RpcAcsRequest<ModifyIpControlPolicyItemResponse> {
	
	public ModifyIpControlPolicyItemRequest() {
		super("CloudAPI", "2016-07-14", "ModifyIpControlPolicyItem", "apigateway");
	}

	private String ipControlId;

	private String policyItemId;

	private String appId;

	private String cidrIp;

	public String getIpControlId() {
		return this.ipControlId;
	}

	public void setIpControlId(String ipControlId) {
		this.ipControlId = ipControlId;
		if(ipControlId != null){
			putQueryParameter("IpControlId", ipControlId);
		}
	}

	public String getPolicyItemId() {
		return this.policyItemId;
	}

	public void setPolicyItemId(String policyItemId) {
		this.policyItemId = policyItemId;
		if(policyItemId != null){
			putQueryParameter("PolicyItemId", policyItemId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getCidrIp() {
		return this.cidrIp;
	}

	public void setCidrIp(String cidrIp) {
		this.cidrIp = cidrIp;
		if(cidrIp != null){
			putQueryParameter("CidrIp", cidrIp);
		}
	}

	@Override
	public Class<ModifyIpControlPolicyItemResponse> getResponseClass() {
		return ModifyIpControlPolicyItemResponse.class;
	}

}
