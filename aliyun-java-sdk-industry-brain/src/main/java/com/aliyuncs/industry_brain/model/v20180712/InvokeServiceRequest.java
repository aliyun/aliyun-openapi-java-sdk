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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InvokeServiceRequest extends RpcAcsRequest<InvokeServiceResponse> {
	
	public InvokeServiceRequest() {
		super("industry-brain", "2018-07-12", "InvokeService");
		setMethod(MethodType.POST);
	}

	private String requestParams;

	private String serviceId;

	private String requestData;

	private Boolean showParams;

	public String getRequestParams() {
		return this.requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
		if(requestParams != null){
			putQueryParameter("RequestParams", requestParams);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getRequestData() {
		return this.requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
		if(requestData != null){
			putQueryParameter("RequestData", requestData);
		}
	}

	public Boolean getShowParams() {
		return this.showParams;
	}

	public void setShowParams(Boolean showParams) {
		this.showParams = showParams;
		if(showParams != null){
			putQueryParameter("ShowParams", showParams.toString());
		}
	}

	@Override
	public Class<InvokeServiceResponse> getResponseClass() {
		return InvokeServiceResponse.class;
	}

}
