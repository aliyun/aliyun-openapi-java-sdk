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
public class SetCasterConfigRequest extends RpcAcsRequest<SetCasterConfigResponse> {
	   

	private Integer channelEnable;

	private Integer programEffect;

	private String programName;

	private String recordConfig;

	private String urgentMaterialId;

	private String transcodeConfig;

	private String casterName;

	private String sideOutputUrl;

	private String syncGroupsConfig;

	private String sideOutputUrlList;

	private String casterId;

	private String domainName;

	private Long ownerId;

	private Float delay;

	private String callbackUrl;
	public SetCasterConfigRequest() {
		super("live", "2016-11-01", "SetCasterConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getChannelEnable() {
		return this.channelEnable;
	}

	public void setChannelEnable(Integer channelEnable) {
		this.channelEnable = channelEnable;
		if(channelEnable != null){
			putQueryParameter("ChannelEnable", channelEnable.toString());
		}
	}

	public Integer getProgramEffect() {
		return this.programEffect;
	}

	public void setProgramEffect(Integer programEffect) {
		this.programEffect = programEffect;
		if(programEffect != null){
			putQueryParameter("ProgramEffect", programEffect.toString());
		}
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
		if(programName != null){
			putQueryParameter("ProgramName", programName);
		}
	}

	public String getRecordConfig() {
		return this.recordConfig;
	}

	public void setRecordConfig(String recordConfig) {
		this.recordConfig = recordConfig;
		if(recordConfig != null){
			putQueryParameter("RecordConfig", recordConfig);
		}
	}

	public String getUrgentMaterialId() {
		return this.urgentMaterialId;
	}

	public void setUrgentMaterialId(String urgentMaterialId) {
		this.urgentMaterialId = urgentMaterialId;
		if(urgentMaterialId != null){
			putQueryParameter("UrgentMaterialId", urgentMaterialId);
		}
	}

	public String getTranscodeConfig() {
		return this.transcodeConfig;
	}

	public void setTranscodeConfig(String transcodeConfig) {
		this.transcodeConfig = transcodeConfig;
		if(transcodeConfig != null){
			putQueryParameter("TranscodeConfig", transcodeConfig);
		}
	}

	public String getCasterName() {
		return this.casterName;
	}

	public void setCasterName(String casterName) {
		this.casterName = casterName;
		if(casterName != null){
			putQueryParameter("CasterName", casterName);
		}
	}

	public String getSideOutputUrl() {
		return this.sideOutputUrl;
	}

	public void setSideOutputUrl(String sideOutputUrl) {
		this.sideOutputUrl = sideOutputUrl;
		if(sideOutputUrl != null){
			putQueryParameter("SideOutputUrl", sideOutputUrl);
		}
	}

	public String getSyncGroupsConfig() {
		return this.syncGroupsConfig;
	}

	public void setSyncGroupsConfig(String syncGroupsConfig) {
		this.syncGroupsConfig = syncGroupsConfig;
		if(syncGroupsConfig != null){
			putQueryParameter("SyncGroupsConfig", syncGroupsConfig);
		}
	}

	public String getSideOutputUrlList() {
		return this.sideOutputUrlList;
	}

	public void setSideOutputUrlList(String sideOutputUrlList) {
		this.sideOutputUrlList = sideOutputUrlList;
		if(sideOutputUrlList != null){
			putQueryParameter("SideOutputUrlList", sideOutputUrlList);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
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

	public Float getDelay() {
		return this.delay;
	}

	public void setDelay(Float delay) {
		this.delay = delay;
		if(delay != null){
			putQueryParameter("Delay", delay.toString());
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
	public Class<SetCasterConfigResponse> getResponseClass() {
		return SetCasterConfigResponse.class;
	}

}
