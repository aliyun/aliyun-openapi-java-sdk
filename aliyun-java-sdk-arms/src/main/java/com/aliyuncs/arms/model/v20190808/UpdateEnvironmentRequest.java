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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEnvironmentRequest extends RpcAcsRequest<UpdateEnvironmentResponse> {
	   

	private String aliyunLang;

	private String environmentName;

	private String environmentId;

	private String feePackage;
	public UpdateEnvironmentRequest() {
		super("ARMS", "2019-08-08", "UpdateEnvironment", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAliyunLang() {
		return this.aliyunLang;
	}

	public void setAliyunLang(String aliyunLang) {
		this.aliyunLang = aliyunLang;
		if(aliyunLang != null){
			putQueryParameter("AliyunLang", aliyunLang);
		}
	}

	public String getEnvironmentName() {
		return this.environmentName;
	}

	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
		if(environmentName != null){
			putQueryParameter("EnvironmentName", environmentName);
		}
	}

	public String getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
		if(environmentId != null){
			putQueryParameter("EnvironmentId", environmentId);
		}
	}

	public String getFeePackage() {
		return this.feePackage;
	}

	public void setFeePackage(String feePackage) {
		this.feePackage = feePackage;
		if(feePackage != null){
			putQueryParameter("FeePackage", feePackage);
		}
	}

	@Override
	public Class<UpdateEnvironmentResponse> getResponseClass() {
		return UpdateEnvironmentResponse.class;
	}

}
