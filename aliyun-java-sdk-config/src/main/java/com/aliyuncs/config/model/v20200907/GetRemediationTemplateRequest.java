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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetRemediationTemplateRequest extends RpcAcsRequest<GetRemediationTemplateResponse> {
	   

	private String templateIdentifier;
	public GetRemediationTemplateRequest() {
		super("Config", "2020-09-07", "GetRemediationTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateIdentifier() {
		return this.templateIdentifier;
	}

	public void setTemplateIdentifier(String templateIdentifier) {
		this.templateIdentifier = templateIdentifier;
		if(templateIdentifier != null){
			putQueryParameter("TemplateIdentifier", templateIdentifier);
		}
	}

	@Override
	public Class<GetRemediationTemplateResponse> getResponseClass() {
		return GetRemediationTemplateResponse.class;
	}

}
