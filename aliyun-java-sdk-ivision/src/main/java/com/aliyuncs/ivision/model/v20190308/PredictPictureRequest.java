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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivision.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PredictPictureRequest extends RpcAcsRequest<PredictPictureResponse> {
	   

	private String ossPath;

	private String resourceUrl;

	private String customerData;

	private String algorithmCode;
	public PredictPictureRequest() {
		super("ivision", "2019-03-08", "PredictPicture");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
		if(ossPath != null){
			putBodyParameter("OssPath", ossPath);
		}
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
		if(resourceUrl != null){
			putBodyParameter("ResourceUrl", resourceUrl);
		}
	}

	public String getCustomerData() {
		return this.customerData;
	}

	public void setCustomerData(String customerData) {
		this.customerData = customerData;
		if(customerData != null){
			putBodyParameter("CustomerData", customerData);
		}
	}

	public String getAlgorithmCode() {
		return this.algorithmCode;
	}

	public void setAlgorithmCode(String algorithmCode) {
		this.algorithmCode = algorithmCode;
		if(algorithmCode != null){
			putBodyParameter("AlgorithmCode", algorithmCode);
		}
	}

	@Override
	public Class<PredictPictureResponse> getResponseClass() {
		return PredictPictureResponse.class;
	}

}
