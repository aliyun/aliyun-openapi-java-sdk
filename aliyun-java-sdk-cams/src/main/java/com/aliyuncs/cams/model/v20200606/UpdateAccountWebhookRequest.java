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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAccountWebhookRequest extends RpcAcsRequest<UpdateAccountWebhookResponse> {
	   

	private String queueFlag;

	private String httpFlag;

	private String statusCallbackUrl;

	private String custSpaceId;
	public UpdateAccountWebhookRequest() {
		super("cams", "2020-06-06", "UpdateAccountWebhook");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueueFlag() {
		return this.queueFlag;
	}

	public void setQueueFlag(String queueFlag) {
		this.queueFlag = queueFlag;
		if(queueFlag != null){
			putQueryParameter("QueueFlag", queueFlag);
		}
	}

	public String getHttpFlag() {
		return this.httpFlag;
	}

	public void setHttpFlag(String httpFlag) {
		this.httpFlag = httpFlag;
		if(httpFlag != null){
			putQueryParameter("HttpFlag", httpFlag);
		}
	}

	public String getStatusCallbackUrl() {
		return this.statusCallbackUrl;
	}

	public void setStatusCallbackUrl(String statusCallbackUrl) {
		this.statusCallbackUrl = statusCallbackUrl;
		if(statusCallbackUrl != null){
			putQueryParameter("StatusCallbackUrl", statusCallbackUrl);
		}
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putQueryParameter("CustSpaceId", custSpaceId);
		}
	}

	@Override
	public Class<UpdateAccountWebhookResponse> getResponseClass() {
		return UpdateAccountWebhookResponse.class;
	}

}
