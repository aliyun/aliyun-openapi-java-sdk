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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteSecretRequest extends RpcAcsRequest<DeleteSecretResponse> {
	   

	private String forceDeleteWithoutRecovery;

	private String recoveryWindowInDays;

	private String secretName;
	public DeleteSecretRequest() {
		super("Kms", "2016-01-20", "DeleteSecret", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getForceDeleteWithoutRecovery() {
		return this.forceDeleteWithoutRecovery;
	}

	public void setForceDeleteWithoutRecovery(String forceDeleteWithoutRecovery) {
		this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
		if(forceDeleteWithoutRecovery != null){
			putQueryParameter("ForceDeleteWithoutRecovery", forceDeleteWithoutRecovery);
		}
	}

	public String getRecoveryWindowInDays() {
		return this.recoveryWindowInDays;
	}

	public void setRecoveryWindowInDays(String recoveryWindowInDays) {
		this.recoveryWindowInDays = recoveryWindowInDays;
		if(recoveryWindowInDays != null){
			putQueryParameter("RecoveryWindowInDays", recoveryWindowInDays);
		}
	}

	public String getSecretName() {
		return this.secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
		if(secretName != null){
			putQueryParameter("SecretName", secretName);
		}
	}

	@Override
	public Class<DeleteSecretResponse> getResponseClass() {
		return DeleteSecretResponse.class;
	}

}
