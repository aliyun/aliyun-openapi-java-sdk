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
public class InsertDegradeControlRequest extends RoaAcsRequest<InsertDegradeControlResponse> {
	
	public InsertDegradeControlRequest() {
		super("Edas", "2017-08-01", "InsertDegradeControl");
		setUriPattern("/pop/v5/degradeControl");
		setMethod(MethodType.POST);
	}

	private Integer duration;

	private String ruleType;

	private String appId;

	private String urlVar;

	private Integer rtThreshold;

	private String serviceName;

	private String methodName;

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
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

	public Integer getRtThreshold() {
		return this.rtThreshold;
	}

	public void setRtThreshold(Integer rtThreshold) {
		this.rtThreshold = rtThreshold;
		if(rtThreshold != null){
			putQueryParameter("RtThreshold", rtThreshold.toString());
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
	public Class<InsertDegradeControlResponse> getResponseClass() {
		return InsertDegradeControlResponse.class;
	}

}
