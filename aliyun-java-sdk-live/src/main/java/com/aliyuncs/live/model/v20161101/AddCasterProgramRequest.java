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
public class AddCasterProgramRequest extends RpcAcsRequest<AddCasterProgramResponse> {
	   

	private List<Episode> episodes;

	private String casterId;

	private Long ownerId;
	public AddCasterProgramRequest() {
		super("live", "2016-11-01", "AddCasterProgram", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Episode> getEpisodes() {
		return this.episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;	
		if (episodes != null) {
			for (int depth1 = 0; depth1 < episodes.size(); depth1++) {
				putQueryParameter("Episode." + (depth1 + 1) + ".EndTime" , episodes.get(depth1).getEndTime());
				putQueryParameter("Episode." + (depth1 + 1) + ".StartTime" , episodes.get(depth1).getStartTime());
				putQueryParameter("Episode." + (depth1 + 1) + ".EpisodeName" , episodes.get(depth1).getEpisodeName());
				putQueryParameter("Episode." + (depth1 + 1) + ".EpisodeType" , episodes.get(depth1).getEpisodeType());
				putQueryParameter("Episode." + (depth1 + 1) + ".ResourceId" , episodes.get(depth1).getResourceId());
				if (episodes.get(depth1).getComponentIds() != null) {
					for (int i = 0; i < episodes.get(depth1).getComponentIds().size(); i++) {
						putQueryParameter("Episode." + (depth1 + 1) + ".ComponentId." + (i + 1) , episodes.get(depth1).getComponentIds().get(i));
					}
				}
				putQueryParameter("Episode." + (depth1 + 1) + ".SwitchType" , episodes.get(depth1).getSwitchType());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public static class Episode {

		private String endTime;

		private String startTime;

		private String episodeName;

		private String episodeType;

		private String resourceId;

		private List<String> componentIds;

		private String switchType;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEpisodeName() {
			return this.episodeName;
		}

		public void setEpisodeName(String episodeName) {
			this.episodeName = episodeName;
		}

		public String getEpisodeType() {
			return this.episodeType;
		}

		public void setEpisodeType(String episodeType) {
			this.episodeType = episodeType;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public List<String> getComponentIds() {
			return this.componentIds;
		}

		public void setComponentIds(List<String> componentIds) {
			this.componentIds = componentIds;
		}

		public String getSwitchType() {
			return this.switchType;
		}

		public void setSwitchType(String switchType) {
			this.switchType = switchType;
		}
	}

	@Override
	public Class<AddCasterProgramResponse> getResponseClass() {
		return AddCasterProgramResponse.class;
	}

}
