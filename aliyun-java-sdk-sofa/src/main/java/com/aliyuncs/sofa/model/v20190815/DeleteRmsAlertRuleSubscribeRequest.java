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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteRmsAlertRuleSubscribeRequest extends RpcAcsRequest<DeleteRmsAlertRuleSubscribeResponse> {
	   

	private String subscriptionTargetType;

	private String subscriptionTargetId;

	private String envJsonStr;

	private String monitorTargetType;
	public DeleteRmsAlertRuleSubscribeRequest() {
		super("SOFA", "2019-08-15", "DeleteRmsAlertRuleSubscribe", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubscriptionTargetType() {
		return this.subscriptionTargetType;
	}

	public void setSubscriptionTargetType(String subscriptionTargetType) {
		this.subscriptionTargetType = subscriptionTargetType;
		if(subscriptionTargetType != null){
			putBodyParameter("SubscriptionTargetType", subscriptionTargetType);
		}
	}

	public String getSubscriptionTargetId() {
		return this.subscriptionTargetId;
	}

	public void setSubscriptionTargetId(String subscriptionTargetId) {
		this.subscriptionTargetId = subscriptionTargetId;
		if(subscriptionTargetId != null){
			putBodyParameter("SubscriptionTargetId", subscriptionTargetId);
		}
	}

	public String getEnvJsonStr() {
		return this.envJsonStr;
	}

	public void setEnvJsonStr(String envJsonStr) {
		this.envJsonStr = envJsonStr;
		if(envJsonStr != null){
			putBodyParameter("EnvJsonStr", envJsonStr);
		}
	}

	public String getMonitorTargetType() {
		return this.monitorTargetType;
	}

	public void setMonitorTargetType(String monitorTargetType) {
		this.monitorTargetType = monitorTargetType;
		if(monitorTargetType != null){
			putBodyParameter("MonitorTargetType", monitorTargetType);
		}
	}

	@Override
	public Class<DeleteRmsAlertRuleSubscribeResponse> getResponseClass() {
		return DeleteRmsAlertRuleSubscribeResponse.class;
	}

}
