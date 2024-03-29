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
public class UpdateLiveRecordVodConfigRequest extends RpcAcsRequest<UpdateLiveRecordVodConfigResponse> {
	   

	private String autoCompose;

	private String composeVodTranscodeGroupId;

	private String appName;

	private Integer onDemand;

	private String streamName;

	private String vodTranscodeGroupId;

	private String domainName;

	private Integer cycleDuration;

	private Long ownerId;
	public UpdateLiveRecordVodConfigRequest() {
		super("live", "2016-11-01", "UpdateLiveRecordVodConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAutoCompose() {
		return this.autoCompose;
	}

	public void setAutoCompose(String autoCompose) {
		this.autoCompose = autoCompose;
		if(autoCompose != null){
			putQueryParameter("AutoCompose", autoCompose);
		}
	}

	public String getComposeVodTranscodeGroupId() {
		return this.composeVodTranscodeGroupId;
	}

	public void setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
		this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
		if(composeVodTranscodeGroupId != null){
			putQueryParameter("ComposeVodTranscodeGroupId", composeVodTranscodeGroupId);
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

	public Integer getOnDemand() {
		return this.onDemand;
	}

	public void setOnDemand(Integer onDemand) {
		this.onDemand = onDemand;
		if(onDemand != null){
			putQueryParameter("OnDemand", onDemand.toString());
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

	public String getVodTranscodeGroupId() {
		return this.vodTranscodeGroupId;
	}

	public void setVodTranscodeGroupId(String vodTranscodeGroupId) {
		this.vodTranscodeGroupId = vodTranscodeGroupId;
		if(vodTranscodeGroupId != null){
			putQueryParameter("VodTranscodeGroupId", vodTranscodeGroupId);
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

	public Integer getCycleDuration() {
		return this.cycleDuration;
	}

	public void setCycleDuration(Integer cycleDuration) {
		this.cycleDuration = cycleDuration;
		if(cycleDuration != null){
			putQueryParameter("CycleDuration", cycleDuration.toString());
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

	@Override
	public Class<UpdateLiveRecordVodConfigResponse> getResponseClass() {
		return UpdateLiveRecordVodConfigResponse.class;
	}

}
