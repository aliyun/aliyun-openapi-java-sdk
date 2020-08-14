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
public class GetWsChGeneralRequest extends RpcAcsRequest<GetWsChGeneralResponse> {
	   

	private String serviceCode;

	private String tokenizerId;

	private String text;

	private String outType;
	public GetWsChGeneralRequest() {
		super("alinlp", "2020-06-29", "GetWsChGeneral", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getTokenizerId() {
		return this.tokenizerId;
	}

	public void setTokenizerId(String tokenizerId) {
		this.tokenizerId = tokenizerId;
		if(tokenizerId != null){
			putBodyParameter("TokenizerId", tokenizerId);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	public String getOutType() {
		return this.outType;
	}

	public void setOutType(String outType) {
		this.outType = outType;
		if(outType != null){
			putBodyParameter("OutType", outType);
		}
	}

	@Override
	public Class<GetWsChGeneralResponse> getResponseClass() {
		return GetWsChGeneralResponse.class;
	}

}
