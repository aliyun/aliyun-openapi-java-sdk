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

package com.aliyuncs.sts.model.v20150401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssumeRoleWithOIDCRequest extends RpcAcsRequest<AssumeRoleWithOIDCResponse> {
	   

	private String roleArn;

	private String roleSessionName;

	private String oIDCToken;

	private Long durationSeconds;

	private String oIDCProviderArn;

	private String policy;
	public AssumeRoleWithOIDCRequest() {
		super("Sts", "2015-04-01", "AssumeRoleWithOIDC");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRoleArn() {
		return this.roleArn;
	}

	public void setRoleArn(String roleArn) {
		this.roleArn = roleArn;
		if(roleArn != null){
			putQueryParameter("RoleArn", roleArn);
		}
	}

	public String getRoleSessionName() {
		return this.roleSessionName;
	}

	public void setRoleSessionName(String roleSessionName) {
		this.roleSessionName = roleSessionName;
		if(roleSessionName != null){
			putQueryParameter("RoleSessionName", roleSessionName);
		}
	}

	public String getOIDCToken() {
		return this.oIDCToken;
	}

	public void setOIDCToken(String oIDCToken) {
		this.oIDCToken = oIDCToken;
		if(oIDCToken != null){
			putQueryParameter("OIDCToken", oIDCToken);
		}
	}

	public Long getDurationSeconds() {
		return this.durationSeconds;
	}

	public void setDurationSeconds(Long durationSeconds) {
		this.durationSeconds = durationSeconds;
		if(durationSeconds != null){
			putQueryParameter("DurationSeconds", durationSeconds.toString());
		}
	}

	public String getOIDCProviderArn() {
		return this.oIDCProviderArn;
	}

	public void setOIDCProviderArn(String oIDCProviderArn) {
		this.oIDCProviderArn = oIDCProviderArn;
		if(oIDCProviderArn != null){
			putQueryParameter("OIDCProviderArn", oIDCProviderArn);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	@Override
	public Class<AssumeRoleWithOIDCResponse> getResponseClass() {
		return AssumeRoleWithOIDCResponse.class;
	}

}
