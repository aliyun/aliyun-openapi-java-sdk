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
public class ModifyLosslessRuleRequest extends RpcAcsRequest<ModifyLosslessRuleResponse> {
	   

	private String mseSessionId;

	private Long delayTime;

	private String source;

	private Long warmupTime;

	private String appName;

	private Boolean related;

	private Boolean enable;

	private Boolean aligned;

	private Integer shutdownWaitSeconds;

	private Long funcType;

	private String appId;

	private String acceptLanguage;
	public ModifyLosslessRuleRequest() {
		super("mse", "2019-05-31", "ModifyLosslessRule", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMseSessionId() {
		return this.mseSessionId;
	}

	public void setMseSessionId(String mseSessionId) {
		this.mseSessionId = mseSessionId;
		if(mseSessionId != null){
			putQueryParameter("MseSessionId", mseSessionId);
		}
	}

	public Long getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(Long delayTime) {
		this.delayTime = delayTime;
		if(delayTime != null){
			putQueryParameter("DelayTime", delayTime.toString());
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Long getWarmupTime() {
		return this.warmupTime;
	}

	public void setWarmupTime(Long warmupTime) {
		this.warmupTime = warmupTime;
		if(warmupTime != null){
			putQueryParameter("WarmupTime", warmupTime.toString());
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

	public Boolean getRelated() {
		return this.related;
	}

	public void setRelated(Boolean related) {
		this.related = related;
		if(related != null){
			putQueryParameter("Related", related.toString());
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

	public Boolean getAligned() {
		return this.aligned;
	}

	public void setAligned(Boolean aligned) {
		this.aligned = aligned;
		if(aligned != null){
			putQueryParameter("Aligned", aligned.toString());
		}
	}

	public Integer getShutdownWaitSeconds() {
		return this.shutdownWaitSeconds;
	}

	public void setShutdownWaitSeconds(Integer shutdownWaitSeconds) {
		this.shutdownWaitSeconds = shutdownWaitSeconds;
		if(shutdownWaitSeconds != null){
			putQueryParameter("ShutdownWaitSeconds", shutdownWaitSeconds.toString());
		}
	}

	public Long getFuncType() {
		return this.funcType;
	}

	public void setFuncType(Long funcType) {
		this.funcType = funcType;
		if(funcType != null){
			putQueryParameter("FuncType", funcType.toString());
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

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<ModifyLosslessRuleResponse> getResponseClass() {
		return ModifyLosslessRuleResponse.class;
	}

}
