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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAppSupabaseSecretRequest extends RpcAcsRequest<UpdateAppSupabaseSecretResponse> {
	   

	private String secretType;

	private String secretKey;

	private String secretValue;

	private String bizId;

	private String secretName;
	public UpdateAppSupabaseSecretRequest() {
		super("WebsiteBuild", "2025-04-29", "UpdateAppSupabaseSecret");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		if(secretKey != null){
			putQueryParameter("SecretKey", secretKey);
		}
	}

	public String getSecretValue() {
		return this.secretValue;
	}

	public void setSecretValue(String secretValue) {
		this.secretValue = secretValue;
		if(secretValue != null){
			putQueryParameter("SecretValue", secretValue);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
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
	public Class<UpdateAppSupabaseSecretResponse> getResponseClass() {
		return UpdateAppSupabaseSecretResponse.class;
	}

}
