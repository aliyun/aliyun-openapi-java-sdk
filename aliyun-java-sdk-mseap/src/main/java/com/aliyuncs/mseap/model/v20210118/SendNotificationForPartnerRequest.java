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

package com.aliyuncs.mseap.model.v20210118;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendNotificationForPartnerRequest extends RpcAcsRequest<SendNotificationForPartnerResponse> {
	   

	private String trackId;

	@SerializedName("smartSubChannels")
	private List<String> smartSubChannels;

	private String channelType;

	private String notifyType;

	private String notifycationEventType;

	private String sendTarget;

	private String bizId;

	@SerializedName("paramMap")
	private Map<String,String> paramMap;
	public SendNotificationForPartnerRequest() {
		super("mseap", "2021-01-18", "SendNotificationForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTrackId() {
		return this.trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
		if(trackId != null){
			putQueryParameter("TrackId", trackId);
		}
	}

	public List<String> getSmartSubChannels() {
		return this.smartSubChannels;
	}

	public void setSmartSubChannels(List<String> smartSubChannels) {
		this.smartSubChannels = smartSubChannels;	
		if (smartSubChannels != null) {
			putQueryParameter("SmartSubChannels" , new Gson().toJson(smartSubChannels));
		}	
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putQueryParameter("ChannelType", channelType);
		}
	}

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
		if(notifyType != null){
			putQueryParameter("NotifyType", notifyType);
		}
	}

	public String getNotifycationEventType() {
		return this.notifycationEventType;
	}

	public void setNotifycationEventType(String notifycationEventType) {
		this.notifycationEventType = notifycationEventType;
		if(notifycationEventType != null){
			putQueryParameter("NotifycationEventType", notifycationEventType);
		}
	}

	public String getSendTarget() {
		return this.sendTarget;
	}

	public void setSendTarget(String sendTarget) {
		this.sendTarget = sendTarget;
		if(sendTarget != null){
			putQueryParameter("SendTarget", sendTarget);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Map<String,String> getParamMap() {
		return this.paramMap;
	}

	public void setParamMap(Map<String,String> paramMap) {
		this.paramMap = paramMap;	
		if (paramMap != null) {
			putQueryParameter("ParamMap" , new Gson().toJson(paramMap));
		}	
	}

	@Override
	public Class<SendNotificationForPartnerResponse> getResponseClass() {
		return SendNotificationForPartnerResponse.class;
	}

}
