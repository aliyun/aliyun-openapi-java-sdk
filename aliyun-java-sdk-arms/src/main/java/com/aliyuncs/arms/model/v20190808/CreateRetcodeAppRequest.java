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
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRetcodeAppRequest extends RpcAcsRequest<CreateRetcodeAppResponse> {
	
	public CreateRetcodeAppRequest() {
		super("ARMS", "2019-08-08", "CreateRetcodeApp", "arms");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String retcodeAppName;

	private String retcodeAppType;

	public String getRetcodeAppName() {
		return this.retcodeAppName;
	}

	public void setRetcodeAppName(String retcodeAppName) {
		this.retcodeAppName = retcodeAppName;
		if(retcodeAppName != null){
			putQueryParameter("RetcodeAppName", retcodeAppName);
		}
	}

	public String getRetcodeAppType() {
		return this.retcodeAppType;
	}

	public void setRetcodeAppType(String retcodeAppType) {
		this.retcodeAppType = retcodeAppType;
		if(retcodeAppType != null){
			putQueryParameter("RetcodeAppType", retcodeAppType);
		}
	}

	@Override
	public Class<CreateRetcodeAppResponse> getResponseClass() {
		return CreateRetcodeAppResponse.class;
	}

}
