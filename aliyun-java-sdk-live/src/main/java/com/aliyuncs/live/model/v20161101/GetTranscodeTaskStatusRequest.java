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
public class GetTranscodeTaskStatusRequest extends RpcAcsRequest<GetTranscodeTaskStatusResponse> {
	   

	private String transcodingTemplate;

	private String securityToken;

	private String pushDomain;

	private String streamName;

	private String app;
	public GetTranscodeTaskStatusRequest() {
		super("live", "2016-11-01", "GetTranscodeTaskStatus", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTranscodingTemplate() {
		return this.transcodingTemplate;
	}

	public void setTranscodingTemplate(String transcodingTemplate) {
		this.transcodingTemplate = transcodingTemplate;
		if(transcodingTemplate != null){
			putQueryParameter("TranscodingTemplate", transcodingTemplate);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getPushDomain() {
		return this.pushDomain;
	}

	public void setPushDomain(String pushDomain) {
		this.pushDomain = pushDomain;
		if(pushDomain != null){
			putQueryParameter("PushDomain", pushDomain);
		}
	}

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
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

	@Override
	public Class<GetTranscodeTaskStatusResponse> getResponseClass() {
		return GetTranscodeTaskStatusResponse.class;
	}

}
