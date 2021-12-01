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

package com.aliyuncs.saf.model.v20190521;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.saf.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RequestDecisionRequest extends RpcAcsRequest<RequestDecisionResponse> {
	   

	private String serviceParameters;

	private String eventCode;
	public RequestDecisionRequest() {
		super("saf", "2019-05-21", "RequestDecision");
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

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
		if(eventCode != null){
			putQueryParameter("EventCode", eventCode);
		}
	}

	@Override
	public Class<RequestDecisionResponse> getResponseClass() {
		return RequestDecisionResponse.class;
	}

}
