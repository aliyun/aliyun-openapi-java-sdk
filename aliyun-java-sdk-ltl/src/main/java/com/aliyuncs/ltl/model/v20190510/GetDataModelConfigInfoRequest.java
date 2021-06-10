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

package com.aliyuncs.ltl.model.v20190510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ltl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDataModelConfigInfoRequest extends RpcAcsRequest<GetDataModelConfigInfoResponse> {
	   

	private String apiVersion;

	private String productKey;

	private String dataModelCode;
	public GetDataModelConfigInfoRequest() {
		super("ltl", "2019-05-10", "GetDataModelConfigInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		if(apiVersion != null){
			putQueryParameter("ApiVersion", apiVersion);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getDataModelCode() {
		return this.dataModelCode;
	}

	public void setDataModelCode(String dataModelCode) {
		this.dataModelCode = dataModelCode;
		if(dataModelCode != null){
			putQueryParameter("DataModelCode", dataModelCode);
		}
	}

	@Override
	public Class<GetDataModelConfigInfoResponse> getResponseClass() {
		return GetDataModelConfigInfoResponse.class;
	}

}
