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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InsertFlowControlRequest extends RoaAcsRequest<InsertFlowControlResponse> {
	
	public InsertFlowControlRequest() {
		super("Edas", "2017-08-01", "InsertFlowControl", "edas");
		setUriPattern("/pop/v5/flowControl");
		setMethod(MethodType.POST);
	}

	private String consumerAppId;

	private String granularity;

	private String ruleType;

	private String appId;

	private String urlVar;

	private String serviceName;

	private Integer threshold;

	private String strategy;

	private String methodName;

	public String getConsumerAppId() {
		return this.consumerAppId;
	}

	public void setConsumerAppId(String consumerAppId) {
		this.consumerAppId = consumerAppId;
		if(consumerAppId != null){
			putQueryParameter("ConsumerAppId", consumerAppId);
		}
	}

	public String getGranularity() {
		return this.granularity;
	}

	public void setGranularity(String granularity) {
		this.granularity = granularity;
		if(granularity != null){
			putQueryParameter("Granularity", granularity);
		}
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType);
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

	public String getUrlVar() {
		return this.urlVar;
	}

	public void setUrlVar(String urlVar) {
		this.urlVar = urlVar;
		if(urlVar != null){
			putQueryParameter("UrlVar", urlVar);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
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

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
		if(strategy != null){
			putQueryParameter("Strategy", strategy);
		}
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
		if(methodName != null){
			putQueryParameter("MethodName", methodName);
		}
	}

	@Override
	public Class<InsertFlowControlResponse> getResponseClass() {
		return InsertFlowControlResponse.class;
	}

}
