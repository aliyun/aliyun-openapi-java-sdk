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

package com.aliyuncs.industry_brain.model.v20180712;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InvokeServiceAsyncRequest extends RpcAcsRequest<InvokeServiceAsyncResponse> {
	
	public InvokeServiceAsyncRequest() {
		super("industry-brain", "2018-07-12", "InvokeServiceAsync");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String serviceId;

	private String params;

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putBodyParameter("Params", params);
		}
	}

	@Override
	public Class<InvokeServiceAsyncResponse> getResponseClass() {
		return InvokeServiceAsyncResponse.class;
	}

}
