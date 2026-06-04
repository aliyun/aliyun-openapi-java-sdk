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
public class SaveAppSupabaseSecretsRequest extends RpcAcsRequest<SaveAppSupabaseSecretsResponse> {
	   

	private String secretsJson;

	private String bizId;
	public SaveAppSupabaseSecretsRequest() {
		super("WebsiteBuild", "2025-04-29", "SaveAppSupabaseSecrets");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getSecretsJson() {
		return this.secretsJson;
	}

	public void setSecretsJson(String secretsJson) {
		this.secretsJson = secretsJson;
		if(secretsJson != null){
			putQueryParameter("SecretsJson", secretsJson);
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

	@Override
	public Class<SaveAppSupabaseSecretsResponse> getResponseClass() {
		return SaveAppSupabaseSecretsResponse.class;
	}

}
