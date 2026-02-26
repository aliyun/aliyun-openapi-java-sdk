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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLiveMessageAppRequest extends RpcAcsRequest<CreateLiveMessageAppResponse> {
	   

	private String appName;

	private Integer auditType;

	private String auditUrl;

	private String eventCallbackUrl;

	private String dataCenter;

	private Integer msgLifeCycle;
	public CreateLiveMessageAppRequest() {
		super("live", "2016-11-01", "CreateLiveMessageApp", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getAuditType() {
		return this.auditType;
	}

	public void setAuditType(Integer auditType) {
		this.auditType = auditType;
		if(auditType != null){
			putQueryParameter("AuditType", auditType.toString());
		}
	}

	public String getAuditUrl() {
		return this.auditUrl;
	}

	public void setAuditUrl(String auditUrl) {
		this.auditUrl = auditUrl;
		if(auditUrl != null){
			putQueryParameter("AuditUrl", auditUrl);
		}
	}

	public String getEventCallbackUrl() {
		return this.eventCallbackUrl;
	}

	public void setEventCallbackUrl(String eventCallbackUrl) {
		this.eventCallbackUrl = eventCallbackUrl;
		if(eventCallbackUrl != null){
			putQueryParameter("EventCallbackUrl", eventCallbackUrl);
		}
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putQueryParameter("DataCenter", dataCenter);
		}
	}

	public Integer getMsgLifeCycle() {
		return this.msgLifeCycle;
	}

	public void setMsgLifeCycle(Integer msgLifeCycle) {
		this.msgLifeCycle = msgLifeCycle;
		if(msgLifeCycle != null){
			putQueryParameter("MsgLifeCycle", msgLifeCycle.toString());
		}
	}

	@Override
	public Class<CreateLiveMessageAppResponse> getResponseClass() {
		return CreateLiveMessageAppResponse.class;
	}

}
