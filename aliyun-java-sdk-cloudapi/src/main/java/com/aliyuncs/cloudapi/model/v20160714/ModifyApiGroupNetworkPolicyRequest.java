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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyApiGroupNetworkPolicyRequest extends RpcAcsRequest<ModifyApiGroupNetworkPolicyResponse> {
	   

	private Boolean innerDomainEnable;

	private String groupId;

	private Boolean vpcIntranetEnable;

	private String httpsPolicy;

	private Boolean internetIPV6Enable;

	private String securityToken;

	private Boolean vpcSlbIntranetEnable;

	private Boolean internetEnable;
	public ModifyApiGroupNetworkPolicyRequest() {
		super("CloudAPI", "2016-07-14", "ModifyApiGroupNetworkPolicy", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getInnerDomainEnable() {
		return this.innerDomainEnable;
	}

	public void setInnerDomainEnable(Boolean innerDomainEnable) {
		this.innerDomainEnable = innerDomainEnable;
		if(innerDomainEnable != null){
			putQueryParameter("InnerDomainEnable", innerDomainEnable.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Boolean getVpcIntranetEnable() {
		return this.vpcIntranetEnable;
	}

	public void setVpcIntranetEnable(Boolean vpcIntranetEnable) {
		this.vpcIntranetEnable = vpcIntranetEnable;
		if(vpcIntranetEnable != null){
			putQueryParameter("VpcIntranetEnable", vpcIntranetEnable.toString());
		}
	}

	public String getHttpsPolicy() {
		return this.httpsPolicy;
	}

	public void setHttpsPolicy(String httpsPolicy) {
		this.httpsPolicy = httpsPolicy;
		if(httpsPolicy != null){
			putQueryParameter("HttpsPolicy", httpsPolicy);
		}
	}

	public Boolean getInternetIPV6Enable() {
		return this.internetIPV6Enable;
	}

	public void setInternetIPV6Enable(Boolean internetIPV6Enable) {
		this.internetIPV6Enable = internetIPV6Enable;
		if(internetIPV6Enable != null){
			putQueryParameter("InternetIPV6Enable", internetIPV6Enable.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Boolean getVpcSlbIntranetEnable() {
		return this.vpcSlbIntranetEnable;
	}

	public void setVpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
		this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
		if(vpcSlbIntranetEnable != null){
			putQueryParameter("VpcSlbIntranetEnable", vpcSlbIntranetEnable.toString());
		}
	}

	public Boolean getInternetEnable() {
		return this.internetEnable;
	}

	public void setInternetEnable(Boolean internetEnable) {
		this.internetEnable = internetEnable;
		if(internetEnable != null){
			putQueryParameter("InternetEnable", internetEnable.toString());
		}
	}

	@Override
	public Class<ModifyApiGroupNetworkPolicyResponse> getResponseClass() {
		return ModifyApiGroupNetworkPolicyResponse.class;
	}

}
