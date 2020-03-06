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

package com.aliyuncs.saf.model.v20180919;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.saf.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteRequestRequest extends RpcAcsRequest<ExecuteRequestResponse> {
	   

	private String serviceParameters;

	private String service;
	public ExecuteRequestRequest() {
		super("saf", "2018-09-19", "ExecuteRequest", "saf");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceParameters() {
		return this.serviceParameters;
	}

	public void setServiceParameters(String serviceParameters) {
		this.serviceParameters = serviceParameters;
		if(serviceParameters != null){
			putQueryParameter("ServiceParameters", serviceParameters);
		}
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
		if(service != null){
			putQueryParameter("Service", service);
		}
	}

	@Override
	public Class<ExecuteRequestResponse> getResponseClass() {
		return ExecuteRequestResponse.class;
	}

}
