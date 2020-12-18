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
public class CreateSecretRequest extends RpcAcsRequest<CreateSecretResponse> {
	   

	private String secretType;

	private String versionId;

	private String secretData;

	private String description;

	private String rotationInterval;

	private String secretName;

	private Boolean enableAutomaticRotation;

	private String encryptionKeyId;

	private String secretDataType;

	private String tags;

	private String extendedConfig;
	public CreateSecretRequest() {
		super("Kms", "2016-01-20", "CreateSecret", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSecretType() {
		return this.secretType;
	}

	public void setSecretType(String secretType) {
		this.secretType = secretType;
		if(secretType != null){
			putQueryParameter("SecretType", secretType);
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

	public String getSecretData() {
		return this.secretData;
	}

	public void setSecretData(String secretData) {
		this.secretData = secretData;
		if(secretData != null){
			putQueryParameter("SecretData", secretData);
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

	public String getRotationInterval() {
		return this.rotationInterval;
	}

	public void setRotationInterval(String rotationInterval) {
		this.rotationInterval = rotationInterval;
		if(rotationInterval != null){
			putQueryParameter("RotationInterval", rotationInterval);
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

	public Boolean getEnableAutomaticRotation() {
		return this.enableAutomaticRotation;
	}

	public void setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
		this.enableAutomaticRotation = enableAutomaticRotation;
		if(enableAutomaticRotation != null){
			putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation.toString());
		}
	}

	public String getEncryptionKeyId() {
		return this.encryptionKeyId;
	}

	public void setEncryptionKeyId(String encryptionKeyId) {
		this.encryptionKeyId = encryptionKeyId;
		if(encryptionKeyId != null){
			putQueryParameter("EncryptionKeyId", encryptionKeyId);
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

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getExtendedConfig() {
		return this.extendedConfig;
	}

	public void setExtendedConfig(String extendedConfig) {
		this.extendedConfig = extendedConfig;
		if(extendedConfig != null){
			putQueryParameter("ExtendedConfig", extendedConfig);
		}
	}

	@Override
	public Class<CreateSecretResponse> getResponseClass() {
		return CreateSecretResponse.class;
	}

}
