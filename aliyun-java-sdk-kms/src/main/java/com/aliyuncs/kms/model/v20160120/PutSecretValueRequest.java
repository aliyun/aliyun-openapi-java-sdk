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
public class PutSecretValueRequest extends RpcAcsRequest<PutSecretValueResponse> {
	   

	private String versionId;

	private String versionStages;

	private String secretData;

	private String secretName;

	private String secretDataType;
	public PutSecretValueRequest() {
		super("Kms", "2016-01-20", "PutSecretValue", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getVersionStages() {
		return this.versionStages;
	}

	public void setVersionStages(String versionStages) {
		this.versionStages = versionStages;
		if(versionStages != null){
			putQueryParameter("VersionStages", versionStages);
		}
	}

	public String getSecretData() {
		return this.secretData;
	}

	public void setSecretData(String secretData) {
		this.secretData = secretData;
		if(secretData != null){
			putQueryParameter("SecretData", secretData);
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

	public String getSecretDataType() {
		return this.secretDataType;
	}

	public void setSecretDataType(String secretDataType) {
		this.secretDataType = secretDataType;
		if(secretDataType != null){
			putQueryParameter("SecretDataType", secretDataType);
		}
	}

	@Override
	public Class<PutSecretValueResponse> getResponseClass() {
		return PutSecretValueResponse.class;
	}

}
