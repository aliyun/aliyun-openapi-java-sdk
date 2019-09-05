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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIpControlRequest extends RpcAcsRequest<CreateIpControlResponse> {
	
	public CreateIpControlRequest() {
		super("CloudAPI", "2016-07-14", "CreateIpControl", "apigateway");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String ipControlName;

	private List<IpControlPolicys> ipControlPolicyss;

	private String description;

	private String securityToken;

	private String ipControlType;

	public String getIpControlName() {
		return this.ipControlName;
	}

	public void setIpControlName(String ipControlName) {
		this.ipControlName = ipControlName;
		if(ipControlName != null){
			putQueryParameter("IpControlName", ipControlName);
		}
	}

	public List<IpControlPolicys> getIpControlPolicyss() {
		return this.ipControlPolicyss;
	}

	public void setIpControlPolicyss(List<IpControlPolicys> ipControlPolicyss) {
		this.ipControlPolicyss = ipControlPolicyss;	
		if (ipControlPolicyss != null) {
			for (int depth1 = 0; depth1 < ipControlPolicyss.size(); depth1++) {
				putQueryParameter("IpControlPolicys." + (depth1 + 1) + ".AppId" , ipControlPolicyss.get(depth1).getAppId());
				putQueryParameter("IpControlPolicys." + (depth1 + 1) + ".CidrIp" , ipControlPolicyss.get(depth1).getCidrIp());
			}
		}	
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getIpControlType() {
		return this.ipControlType;
	}

	public void setIpControlType(String ipControlType) {
		this.ipControlType = ipControlType;
		if(ipControlType != null){
			putQueryParameter("IpControlType", ipControlType);
		}
	}

	public static class IpControlPolicys {

		private String appId;

		private String cidrIp;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}
	}

	@Override
	public Class<CreateIpControlResponse> getResponseClass() {
		return CreateIpControlResponse.class;
	}

}
