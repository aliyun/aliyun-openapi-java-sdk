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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLiveStreamMonitorRequest extends RpcAcsRequest<UpdateLiveStreamMonitorResponse> {
	   

	private String monitorId;

	private String monitorConfig;

	private String monitorName;

	private String stream;

	private String outputTemplate;

	private String app;

	private String inputList;

	private String dingTalkWebHookUrl;

	private Long ownerId;

	private String domain;

	private String callbackUrl;
	public UpdateLiveStreamMonitorRequest() {
		super("live", "2016-11-01", "UpdateLiveStreamMonitor", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMonitorId() {
		return this.monitorId;
	}

	public void setMonitorId(String monitorId) {
		this.monitorId = monitorId;
		if(monitorId != null){
			putQueryParameter("MonitorId", monitorId);
		}
	}

	public String getMonitorConfig() {
		return this.monitorConfig;
	}

	public void setMonitorConfig(String monitorConfig) {
		this.monitorConfig = monitorConfig;
		if(monitorConfig != null){
			putQueryParameter("MonitorConfig", monitorConfig);
		}
	}

	public String getMonitorName() {
		return this.monitorName;
	}

	public void setMonitorName(String monitorName) {
		this.monitorName = monitorName;
		if(monitorName != null){
			putQueryParameter("MonitorName", monitorName);
		}
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
		if(stream != null){
			putQueryParameter("Stream", stream);
		}
	}

	public String getOutputTemplate() {
		return this.outputTemplate;
	}

	public void setOutputTemplate(String outputTemplate) {
		this.outputTemplate = outputTemplate;
		if(outputTemplate != null){
			putQueryParameter("OutputTemplate", outputTemplate);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getInputList() {
		return this.inputList;
	}

	public void setInputList(String inputList) {
		this.inputList = inputList;
		if(inputList != null){
			putQueryParameter("InputList", inputList);
		}
	}

	public String getDingTalkWebHookUrl() {
		return this.dingTalkWebHookUrl;
	}

	public void setDingTalkWebHookUrl(String dingTalkWebHookUrl) {
		this.dingTalkWebHookUrl = dingTalkWebHookUrl;
		if(dingTalkWebHookUrl != null){
			putQueryParameter("DingTalkWebHookUrl", dingTalkWebHookUrl);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	@Override
	public Class<UpdateLiveStreamMonitorResponse> getResponseClass() {
		return UpdateLiveStreamMonitorResponse.class;
	}

}
