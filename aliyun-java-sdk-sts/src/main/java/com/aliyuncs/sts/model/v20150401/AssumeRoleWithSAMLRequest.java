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
public class AssumeRoleWithSAMLRequest extends RpcAcsRequest<AssumeRoleWithSAMLResponse> {
	   

	private String sAMLAssertion;

	private String roleArn;

	private String sAMLProviderArn;

	private Long durationSeconds;

	private String policy;
	public AssumeRoleWithSAMLRequest() {
		super("Sts", "2015-04-01", "AssumeRoleWithSAML", "sts");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSAMLAssertion() {
		return this.sAMLAssertion;
	}

	public void setSAMLAssertion(String sAMLAssertion) {
		this.sAMLAssertion = sAMLAssertion;
		if(sAMLAssertion != null){
			putQueryParameter("SAMLAssertion", sAMLAssertion);
		}
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

	public String getSAMLProviderArn() {
		return this.sAMLProviderArn;
	}

	public void setSAMLProviderArn(String sAMLProviderArn) {
		this.sAMLProviderArn = sAMLProviderArn;
		if(sAMLProviderArn != null){
			putQueryParameter("SAMLProviderArn", sAMLProviderArn);
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
	public Class<AssumeRoleWithSAMLResponse> getResponseClass() {
		return AssumeRoleWithSAMLResponse.class;
	}

}
