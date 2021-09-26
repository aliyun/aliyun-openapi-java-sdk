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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchForbidVsStreamRequest extends RpcAcsRequest<BatchForbidVsStreamResponse> {
	   

	private String channel;

	private String controlStreamAction;

	private String resumeTime;

	private String liveStreamType;

	private String domainName;

	private Long ownerId;

	private String oneshot;
	public BatchForbidVsStreamRequest() {
		super("vs", "2018-12-12", "BatchForbidVsStream");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getControlStreamAction() {
		return this.controlStreamAction;
	}

	public void setControlStreamAction(String controlStreamAction) {
		this.controlStreamAction = controlStreamAction;
		if(controlStreamAction != null){
			putQueryParameter("ControlStreamAction", controlStreamAction);
		}
	}

	public String getResumeTime() {
		return this.resumeTime;
	}

	public void setResumeTime(String resumeTime) {
		this.resumeTime = resumeTime;
		if(resumeTime != null){
			putQueryParameter("ResumeTime", resumeTime);
		}
	}

	public String getLiveStreamType() {
		return this.liveStreamType;
	}

	public void setLiveStreamType(String liveStreamType) {
		this.liveStreamType = liveStreamType;
		if(liveStreamType != null){
			putQueryParameter("LiveStreamType", liveStreamType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getOneshot() {
		return this.oneshot;
	}

	public void setOneshot(String oneshot) {
		this.oneshot = oneshot;
		if(oneshot != null){
			putQueryParameter("Oneshot", oneshot);
		}
	}

	@Override
	public Class<BatchForbidVsStreamResponse> getResponseClass() {
		return BatchForbidVsStreamResponse.class;
	}

}
