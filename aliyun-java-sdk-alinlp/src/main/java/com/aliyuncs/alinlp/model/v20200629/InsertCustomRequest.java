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

package com.aliyuncs.alinlp.model.v20200629;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertCustomRequest extends RpcAcsRequest<InsertCustomResponse> {
	   

	private String customUrl;

	private String regUrl;

	private String serviceCode;

	private String regFileName;

	private String customFileName;

	private Integer apiId;
	public InsertCustomRequest() {
		super("alinlp", "2020-06-29", "InsertCustom", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCustomUrl() {
		return this.customUrl;
	}

	public void setCustomUrl(String customUrl) {
		this.customUrl = customUrl;
		if(customUrl != null){
			putBodyParameter("CustomUrl", customUrl);
		}
	}

	public String getRegUrl() {
		return this.regUrl;
	}

	public void setRegUrl(String regUrl) {
		this.regUrl = regUrl;
		if(regUrl != null){
			putBodyParameter("RegUrl", regUrl);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public String getRegFileName() {
		return this.regFileName;
	}

	public void setRegFileName(String regFileName) {
		this.regFileName = regFileName;
		if(regFileName != null){
			putBodyParameter("RegFileName", regFileName);
		}
	}

	public String getCustomFileName() {
		return this.customFileName;
	}

	public void setCustomFileName(String customFileName) {
		this.customFileName = customFileName;
		if(customFileName != null){
			putBodyParameter("CustomFileName", customFileName);
		}
	}

	public Integer getApiId() {
		return this.apiId;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putBodyParameter("ApiId", apiId.toString());
		}
	}

	@Override
	public Class<InsertCustomResponse> getResponseClass() {
		return InsertCustomResponse.class;
	}

}
