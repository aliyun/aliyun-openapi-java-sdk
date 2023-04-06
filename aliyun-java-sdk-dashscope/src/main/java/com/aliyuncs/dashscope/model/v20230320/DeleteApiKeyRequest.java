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

package com.aliyuncs.dashscope.model.v20230320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteApiKeyRequest extends RpcAcsRequest<DeleteApiKeyResponse> {
	   

	private Long apiKeyId;
	public DeleteApiKeyRequest() {
		super("dashscope", "2023-03-20", "DeleteApiKey");
		setMethod(MethodType.POST);
	}

	public Long getApiKeyId() {
		return this.apiKeyId;
	}

	public void setApiKeyId(Long apiKeyId) {
		this.apiKeyId = apiKeyId;
		if(apiKeyId != null){
			putBodyParameter("ApiKeyId", apiKeyId.toString());
		}
	}

	@Override
	public Class<DeleteApiKeyResponse> getResponseClass() {
		return DeleteApiKeyResponse.class;
	}

}
