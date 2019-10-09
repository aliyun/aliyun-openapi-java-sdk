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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyCustomOcrTemplateRequest extends RpcAcsRequest<VerifyCustomOcrTemplateResponse> {
	   

	private String testImgUrl;

	private Long id;
	public VerifyCustomOcrTemplateRequest() {
		super("Green", "2017-08-23", "VerifyCustomOcrTemplate", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTestImgUrl() {
		return this.testImgUrl;
	}

	public void setTestImgUrl(String testImgUrl) {
		this.testImgUrl = testImgUrl;
		if(testImgUrl != null){
			putQueryParameter("TestImgUrl", testImgUrl);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<VerifyCustomOcrTemplateResponse> getResponseClass() {
		return VerifyCustomOcrTemplateResponse.class;
	}

}
