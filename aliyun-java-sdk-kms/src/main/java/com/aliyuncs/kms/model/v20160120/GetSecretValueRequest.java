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
public class GetSecretValueRequest extends RpcAcsRequest<GetSecretValueResponse> {
	   

	private String dryRun;

	private String versionId;

	private String versionStage;

	private String secretName;

	private Boolean fetchExtendedConfig;
	public GetSecretValueRequest() {
		super("Kms", "2016-01-20", "GetSecretValue", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(String dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun);
		}
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

	public String getVersionStage() {
		return this.versionStage;
	}

	public void setVersionStage(String versionStage) {
		this.versionStage = versionStage;
		if(versionStage != null){
			putQueryParameter("VersionStage", versionStage);
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

	public Boolean getFetchExtendedConfig() {
		return this.fetchExtendedConfig;
	}

	public void setFetchExtendedConfig(Boolean fetchExtendedConfig) {
		this.fetchExtendedConfig = fetchExtendedConfig;
		if(fetchExtendedConfig != null){
			putQueryParameter("FetchExtendedConfig", fetchExtendedConfig.toString());
		}
	}

	@Override
	public Class<GetSecretValueResponse> getResponseClass() {
		return GetSecretValueResponse.class;
	}

}
