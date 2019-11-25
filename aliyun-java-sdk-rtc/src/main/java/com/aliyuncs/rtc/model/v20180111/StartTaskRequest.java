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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartTaskRequest extends RpcAcsRequest<StartTaskResponse> {
	   

	private List<MixPanes> mixPaness;

	private String idempotentId;

	private Long ownerId;

	private Long templateId;

	private String appId;

	private String channelId;
	public StartTaskRequest() {
		super("rtc", "2018-01-11", "StartTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<MixPanes> getMixPaness() {
		return this.mixPaness;
	}

	public void setMixPaness(List<MixPanes> mixPaness) {
		this.mixPaness = mixPaness;	
		if (mixPaness != null) {
			for (int depth1 = 0; depth1 < mixPaness.size(); depth1++) {
				putQueryParameter("MixPanes." + (depth1 + 1) + ".PaneId" , mixPaness.get(depth1).getPaneId());
				putQueryParameter("MixPanes." + (depth1 + 1) + ".UserId" , mixPaness.get(depth1).getUserId());
				putQueryParameter("MixPanes." + (depth1 + 1) + ".SourceType" , mixPaness.get(depth1).getSourceType());
			}
		}	
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}

	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
		if(idempotentId != null){
			putQueryParameter("IdempotentId", idempotentId);
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

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
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

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	public static class MixPanes {

		private Integer paneId;

		private String userId;

		private String sourceType;

		public Integer getPaneId() {
			return this.paneId;
		}

		public void setPaneId(Integer paneId) {
			this.paneId = paneId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
	}

	@Override
	public Class<StartTaskResponse> getResponseClass() {
		return StartTaskResponse.class;
	}

}
