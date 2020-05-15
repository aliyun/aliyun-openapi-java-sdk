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

package com.aliyuncs.alimt.model.v20181012;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alimt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDetectLanguageRequest extends RpcAcsRequest<GetDetectLanguageResponse> {
	   

	private String sourceText;
	public GetDetectLanguageRequest() {
		super("alimt", "2018-10-12", "GetDetectLanguage", "alimt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceText() {
		return this.sourceText;
	}

	public void setSourceText(String sourceText) {
		this.sourceText = sourceText;
		if(sourceText != null){
			putBodyParameter("SourceText", sourceText);
		}
	}

	@Override
	public Class<GetDetectLanguageResponse> getResponseClass() {
		return GetDetectLanguageResponse.class;
	}

}
