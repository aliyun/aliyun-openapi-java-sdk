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

package com.aliyuncs.democenter.model.v20200121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.democenter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDemoAccessTokenRequest extends RpcAcsRequest<CreateDemoAccessTokenResponse> {
	   

	private Long demoId;
	public CreateDemoAccessTokenRequest() {
		super("DemoCenter", "2020-01-21", "CreateDemoAccessToken", "DemoCenter");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDemoId() {
		return this.demoId;
	}

	public void setDemoId(Long demoId) {
		this.demoId = demoId;
		if(demoId != null){
			putBodyParameter("DemoId", demoId.toString());
		}
	}

	@Override
	public Class<CreateDemoAccessTokenResponse> getResponseClass() {
		return CreateDemoAccessTokenResponse.class;
	}

}
