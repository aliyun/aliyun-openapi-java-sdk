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
public class DescribeDemoAccessTokenRequest extends RpcAcsRequest<DescribeDemoAccessTokenResponse> {
	   

	private String demoAccessToken;
	public DescribeDemoAccessTokenRequest() {
		super("DemoCenter", "2020-01-21", "DescribeDemoAccessToken", "DemoCenter");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDemoAccessToken() {
		return this.demoAccessToken;
	}

	public void setDemoAccessToken(String demoAccessToken) {
		this.demoAccessToken = demoAccessToken;
		if(demoAccessToken != null){
			putBodyParameter("DemoAccessToken", demoAccessToken);
		}
	}

	@Override
	public Class<DescribeDemoAccessTokenResponse> getResponseClass() {
		return DescribeDemoAccessTokenResponse.class;
	}

}
