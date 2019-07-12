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

/**
 * @author auto create
 * @version 
 */
public class ForbidLiveStreamRequest extends RpcAcsRequest<ForbidLiveStreamResponse> {
	
	public ForbidLiveStreamRequest() {
		super("live", "2016-11-01", "ForbidLiveStream", "live");
	}

	private String resumeTime;

	private String appName;

	private String liveStreamType;

	private String domainName;

	private Long ownerId;

	private String oneshot;

	private String streamName;

	private String controlStreamAction;

	public String getResumeTime() {
		return this.resumeTime;
	}

	public void setResumeTime(String resumeTime) {
		this.resumeTime = resumeTime;
		if(resumeTime != null){
			putQueryParameter("ResumeTime", resumeTime);
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

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
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

	@Override
	public Class<ForbidLiveStreamResponse> getResponseClass() {
		return ForbidLiveStreamResponse.class;
	}

}
