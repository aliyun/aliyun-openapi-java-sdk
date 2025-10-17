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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteCrossCloudOpenAPIRequest extends RpcAcsRequest<ExecuteCrossCloudOpenAPIResponse> {
	   

	private String proxyInfo;
	public ExecuteCrossCloudOpenAPIRequest() {
		super("polardb", "2017-08-01", "ExecuteCrossCloudOpenAPI", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProxyInfo() {
		return this.proxyInfo;
	}

	public void setProxyInfo(String proxyInfo) {
		this.proxyInfo = proxyInfo;
		if(proxyInfo != null){
			putQueryParameter("ProxyInfo", proxyInfo);
		}
	}

	@Override
	public Class<ExecuteCrossCloudOpenAPIResponse> getResponseClass() {
		return ExecuteCrossCloudOpenAPIResponse.class;
	}

}
