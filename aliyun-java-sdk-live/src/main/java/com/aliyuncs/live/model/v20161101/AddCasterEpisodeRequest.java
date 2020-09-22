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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddCasterEpisodeRequest extends RpcAcsRequest<AddCasterEpisodeResponse> {
	   

	private String episodeName;

	private String startTime;

	private String resourceId;

	private List<String> componentIds;

	private String casterId;

	private String episodeType;

	private String endTime;

	private Long ownerId;

	private String switchType;
	public AddCasterEpisodeRequest() {
		super("live", "2016-11-01", "AddCasterEpisode", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEpisodeName() {
		return this.episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
		if(episodeName != null){
			putQueryParameter("EpisodeName", episodeName);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public List<String> getComponentIds() {
		return this.componentIds;
	}

	public void setComponentIds(List<String> componentIds) {
		this.componentIds = componentIds;	
		if (componentIds != null) {
			for (int i = 0; i < componentIds.size(); i++) {
				putQueryParameter("ComponentId." + (i + 1) , componentIds.get(i));
			}
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

	public String getEpisodeType() {
		return this.episodeType;
	}

	public void setEpisodeType(String episodeType) {
		this.episodeType = episodeType;
		if(episodeType != null){
			putQueryParameter("EpisodeType", episodeType);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public String getSwitchType() {
		return this.switchType;
	}

	public void setSwitchType(String switchType) {
		this.switchType = switchType;
		if(switchType != null){
			putQueryParameter("SwitchType", switchType);
		}
	}

	@Override
	public Class<AddCasterEpisodeResponse> getResponseClass() {
		return AddCasterEpisodeResponse.class;
	}

}
