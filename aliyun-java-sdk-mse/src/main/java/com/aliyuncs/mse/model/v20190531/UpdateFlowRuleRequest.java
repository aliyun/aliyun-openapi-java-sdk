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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateFlowRuleRequest extends RpcAcsRequest<UpdateFlowRuleResponse> {
	   

	private Integer controlBehavior;

	private Integer threshold;

	private String appName;

	private Boolean enable;

	private String appId;

	private String namespace;

	private String acceptLanguage;

	private Integer maxQueueingTimeMs;

	private Long ruleId;
	public UpdateFlowRuleRequest() {
		super("mse", "2019-05-31", "UpdateFlowRule", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getControlBehavior() {
		return this.controlBehavior;
	}

	public void setControlBehavior(Integer controlBehavior) {
		this.controlBehavior = controlBehavior;
		if(controlBehavior != null){
			putQueryParameter("ControlBehavior", controlBehavior.toString());
		}
	}

	public Integer getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public Integer getMaxQueueingTimeMs() {
		return this.maxQueueingTimeMs;
	}

	public void setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
		this.maxQueueingTimeMs = maxQueueingTimeMs;
		if(maxQueueingTimeMs != null){
			putQueryParameter("MaxQueueingTimeMs", maxQueueingTimeMs.toString());
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	@Override
	public Class<UpdateFlowRuleResponse> getResponseClass() {
		return UpdateFlowRuleResponse.class;
	}

}
