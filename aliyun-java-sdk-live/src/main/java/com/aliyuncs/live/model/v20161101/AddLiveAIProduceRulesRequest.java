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
public class AddLiveAIProduceRulesRequest extends RpcAcsRequest<AddLiveAIProduceRulesResponse> {
	   

	private String description;

	private String suffix;

	private String subtitleName;

	private String app;

	private Long ownerId;

	private Boolean isLazy;

	private String studioName;

	private String liveTemplate;

	private String domain;
	public AddLiveAIProduceRulesRequest() {
		super("live", "2016-11-01", "AddLiveAIProduceRules", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
		if(suffix != null){
			putQueryParameter("Suffix", suffix);
		}
	}

	public String getSubtitleName() {
		return this.subtitleName;
	}

	public void setSubtitleName(String subtitleName) {
		this.subtitleName = subtitleName;
		if(subtitleName != null){
			putQueryParameter("SubtitleName", subtitleName);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getIsLazy() {
		return this.isLazy;
	}

	public void setIsLazy(Boolean isLazy) {
		this.isLazy = isLazy;
		if(isLazy != null){
			putQueryParameter("IsLazy", isLazy.toString());
		}
	}

	public String getStudioName() {
		return this.studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
		if(studioName != null){
			putQueryParameter("StudioName", studioName);
		}
	}

	public String getLiveTemplate() {
		return this.liveTemplate;
	}

	public void setLiveTemplate(String liveTemplate) {
		this.liveTemplate = liveTemplate;
		if(liveTemplate != null){
			putQueryParameter("LiveTemplate", liveTemplate);
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

	@Override
	public Class<AddLiveAIProduceRulesResponse> getResponseClass() {
		return AddLiveAIProduceRulesResponse.class;
	}

}
