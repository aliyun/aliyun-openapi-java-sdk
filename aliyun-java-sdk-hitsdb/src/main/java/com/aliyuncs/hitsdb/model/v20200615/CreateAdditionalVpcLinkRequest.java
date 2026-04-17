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

package com.aliyuncs.hitsdb.model.v20200615;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hitsdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAdditionalVpcLinkRequest extends RpcAcsRequest<CreateAdditionalVpcLinkResponse> {
	   

	private String additionalVpcId;

	private String securityToken;

	private String additionalVswitchId;

	private String instanceId;
	public CreateAdditionalVpcLinkRequest() {
		super("hitsdb", "2020-06-15", "CreateAdditionalVpcLink", "hitsdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAdditionalVpcId() {
		return this.additionalVpcId;
	}

	public void setAdditionalVpcId(String additionalVpcId) {
		this.additionalVpcId = additionalVpcId;
		if(additionalVpcId != null){
			putQueryParameter("AdditionalVpcId", additionalVpcId);
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

	public String getAdditionalVswitchId() {
		return this.additionalVswitchId;
	}

	public void setAdditionalVswitchId(String additionalVswitchId) {
		this.additionalVswitchId = additionalVswitchId;
		if(additionalVswitchId != null){
			putQueryParameter("AdditionalVswitchId", additionalVswitchId);
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
	public Class<CreateAdditionalVpcLinkResponse> getResponseClass() {
		return CreateAdditionalVpcLinkResponse.class;
	}

}
