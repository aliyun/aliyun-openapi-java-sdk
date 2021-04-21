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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCodeCompletionRequest extends RoaAcsRequest<GetCodeCompletionResponse> {
	   

	private Boolean isEncrypted;

	private String fetchKeys;

	private String serviceName;
	public GetCodeCompletionRequest() {
		super("codeup", "2020-04-14", "GetCodeCompletion");
		setUriPattern("/api/v2/service/invoke/[ServiceName]");
		setMethod(MethodType.POST);
	}

	public Boolean getIsEncrypted() {
		return this.isEncrypted;
	}

	public void setIsEncrypted(Boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
		if(isEncrypted != null){
			putQueryParameter("IsEncrypted", isEncrypted.toString());
		}
	}

	public String getFetchKeys() {
		return this.fetchKeys;
	}

	public void setFetchKeys(String fetchKeys) {
		this.fetchKeys = fetchKeys;
		if(fetchKeys != null){
			putQueryParameter("FetchKeys", fetchKeys);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putPathParameter("ServiceName", serviceName);
		}
	}

	@Override
	public Class<GetCodeCompletionResponse> getResponseClass() {
		return GetCodeCompletionResponse.class;
	}

}
