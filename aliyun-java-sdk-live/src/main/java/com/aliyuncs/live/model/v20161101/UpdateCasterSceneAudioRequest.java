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
public class UpdateCasterSceneAudioRequest extends RpcAcsRequest<UpdateCasterSceneAudioResponse> {
	   

	private String casterId;

	private Long ownerId;

	private List<AudioLayer> audioLayers;

	private String sceneId;

	private List<String> mixLists;

	private Integer followEnable;
	public UpdateCasterSceneAudioRequest() {
		super("live", "2016-11-01", "UpdateCasterSceneAudio");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<AudioLayer> getAudioLayers() {
		return this.audioLayers;
	}

	public void setAudioLayers(List<AudioLayer> audioLayers) {
		this.audioLayers = audioLayers;	
		if (audioLayers != null) {
			for (int depth1 = 0; depth1 < audioLayers.size(); depth1++) {
				putQueryParameter("AudioLayer." + (depth1 + 1) + ".VolumeRate" , audioLayers.get(depth1).getVolumeRate());
				putQueryParameter("AudioLayer." + (depth1 + 1) + ".ValidChannel" , audioLayers.get(depth1).getValidChannel());
				putQueryParameter("AudioLayer." + (depth1 + 1) + ".FixedDelayDuration" , audioLayers.get(depth1).getFixedDelayDuration());
			}
		}	
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public List<String> getMixLists() {
		return this.mixLists;
	}

	public void setMixLists(List<String> mixLists) {
		this.mixLists = mixLists;	
		if (mixLists != null) {
			for (int i = 0; i < mixLists.size(); i++) {
				putQueryParameter("MixList." + (i + 1) , mixLists.get(i));
			}
		}	
	}

	public Integer getFollowEnable() {
		return this.followEnable;
	}

	public void setFollowEnable(Integer followEnable) {
		this.followEnable = followEnable;
		if(followEnable != null){
			putQueryParameter("FollowEnable", followEnable.toString());
		}
	}

	public static class AudioLayer {

		private Float volumeRate;

		private String validChannel;

		private Integer fixedDelayDuration;

		public Float getVolumeRate() {
			return this.volumeRate;
		}

		public void setVolumeRate(Float volumeRate) {
			this.volumeRate = volumeRate;
		}

		public String getValidChannel() {
			return this.validChannel;
		}

		public void setValidChannel(String validChannel) {
			this.validChannel = validChannel;
		}

		public Integer getFixedDelayDuration() {
			return this.fixedDelayDuration;
		}

		public void setFixedDelayDuration(Integer fixedDelayDuration) {
			this.fixedDelayDuration = fixedDelayDuration;
		}
	}

	@Override
	public Class<UpdateCasterSceneAudioResponse> getResponseClass() {
		return UpdateCasterSceneAudioResponse.class;
	}

}
