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
public class CreateRtcAsrTaskRequest extends RpcAcsRequest<CreateRtcAsrTaskResponse> {
	   

	private String authKey;

	private String language;

	private String mode;

	private Boolean translateEnabled;

	private String tag;

	private String streamURL;

	private String targetLanguages;

	private Boolean autoTerminateEnabled;

	private Long ownerId;

	private String rtcUserId;

	private Long reportInterval;

	private Long autoTerminateDelay;

	private String sDKAppID;

	private String callbackURL;

	private String channelID;
	public CreateRtcAsrTaskRequest() {
		super("live", "2016-11-01", "CreateRtcAsrTask", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public Boolean getTranslateEnabled() {
		return this.translateEnabled;
	}

	public void setTranslateEnabled(Boolean translateEnabled) {
		this.translateEnabled = translateEnabled;
		if(translateEnabled != null){
			putQueryParameter("TranslateEnabled", translateEnabled.toString());
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public String getStreamURL() {
		return this.streamURL;
	}

	public void setStreamURL(String streamURL) {
		this.streamURL = streamURL;
		if(streamURL != null){
			putQueryParameter("StreamURL", streamURL);
		}
	}

	public String getTargetLanguages() {
		return this.targetLanguages;
	}

	public void setTargetLanguages(String targetLanguages) {
		this.targetLanguages = targetLanguages;
		if(targetLanguages != null){
			putQueryParameter("TargetLanguages", targetLanguages);
		}
	}

	public Boolean getAutoTerminateEnabled() {
		return this.autoTerminateEnabled;
	}

	public void setAutoTerminateEnabled(Boolean autoTerminateEnabled) {
		this.autoTerminateEnabled = autoTerminateEnabled;
		if(autoTerminateEnabled != null){
			putQueryParameter("AutoTerminateEnabled", autoTerminateEnabled.toString());
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

	public String getRtcUserId() {
		return this.rtcUserId;
	}

	public void setRtcUserId(String rtcUserId) {
		this.rtcUserId = rtcUserId;
		if(rtcUserId != null){
			putQueryParameter("RtcUserId", rtcUserId);
		}
	}

	public Long getReportInterval() {
		return this.reportInterval;
	}

	public void setReportInterval(Long reportInterval) {
		this.reportInterval = reportInterval;
		if(reportInterval != null){
			putQueryParameter("ReportInterval", reportInterval.toString());
		}
	}

	public Long getAutoTerminateDelay() {
		return this.autoTerminateDelay;
	}

	public void setAutoTerminateDelay(Long autoTerminateDelay) {
		this.autoTerminateDelay = autoTerminateDelay;
		if(autoTerminateDelay != null){
			putQueryParameter("AutoTerminateDelay", autoTerminateDelay.toString());
		}
	}

	public String getSDKAppID() {
		return this.sDKAppID;
	}

	public void setSDKAppID(String sDKAppID) {
		this.sDKAppID = sDKAppID;
		if(sDKAppID != null){
			putQueryParameter("SDKAppID", sDKAppID);
		}
	}

	public String getCallbackURL() {
		return this.callbackURL;
	}

	public void setCallbackURL(String callbackURL) {
		this.callbackURL = callbackURL;
		if(callbackURL != null){
			putQueryParameter("CallbackURL", callbackURL);
		}
	}

	public String getChannelID() {
		return this.channelID;
	}

	public void setChannelID(String channelID) {
		this.channelID = channelID;
		if(channelID != null){
			putQueryParameter("ChannelID", channelID);
		}
	}

	@Override
	public Class<CreateRtcAsrTaskResponse> getResponseClass() {
		return CreateRtcAsrTaskResponse.class;
	}

}
