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
public class ModifyCasterLayoutRequest extends RpcAcsRequest<ModifyCasterLayoutResponse> {
	   

	private List<String> blendLists;

	private String layoutId;

	private String casterId;

	private Long ownerId;

	private List<AudioLayer> audioLayers;

	private List<VideoLayer> videoLayers;

	private List<String> mixLists;
	public ModifyCasterLayoutRequest() {
		super("live", "2016-11-01", "ModifyCasterLayout", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getBlendLists() {
		return this.blendLists;
	}

	public void setBlendLists(List<String> blendLists) {
		this.blendLists = blendLists;	
		if (blendLists != null) {
			for (int i = 0; i < blendLists.size(); i++) {
				putQueryParameter("BlendList." + (i + 1) , blendLists.get(i));
			}
		}	
	}

	public String getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
		if(layoutId != null){
			putQueryParameter("LayoutId", layoutId);
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

	public List<AudioLayer> getAudioLayers() {
		return this.audioLayers;
	}

	public void setAudioLayers(List<AudioLayer> audioLayers) {
		this.audioLayers = audioLayers;	
		if (audioLayers != null) {
			for (int depth1 = 0; depth1 < audioLayers.size(); depth1++) {
				putQueryParameter("AudioLayer." + (depth1 + 1) + ".VolumeRate" , audioLayers.get(depth1).getVolumeRate());
				putQueryParameter("AudioLayer." + (depth1 + 1) + ".FixedDelayDuration" , audioLayers.get(depth1).getFixedDelayDuration());
				putQueryParameter("AudioLayer." + (depth1 + 1) + ".ValidChannel" , audioLayers.get(depth1).getValidChannel());
			}
		}	
	}

	public List<VideoLayer> getVideoLayers() {
		return this.videoLayers;
	}

	public void setVideoLayers(List<VideoLayer> videoLayers) {
		this.videoLayers = videoLayers;	
		if (videoLayers != null) {
			for (int depth1 = 0; depth1 < videoLayers.size(); depth1++) {
				putQueryParameter("VideoLayer." + (depth1 + 1) + ".FixedDelayDuration" , videoLayers.get(depth1).getFixedDelayDuration());
				putQueryParameter("VideoLayer." + (depth1 + 1) + ".FillMode" , videoLayers.get(depth1).getFillMode());
				putQueryParameter("VideoLayer." + (depth1 + 1) + ".HeightNormalized" , videoLayers.get(depth1).getHeightNormalized());
				putQueryParameter("VideoLayer." + (depth1 + 1) + ".PositionRefer" , videoLayers.get(depth1).getPositionRefer());
				if (videoLayers.get(depth1).getPositionNormalizeds() != null) {
					for (int i = 0; i < videoLayers.get(depth1).getPositionNormalizeds().size(); i++) {
						putQueryParameter("VideoLayer." + (depth1 + 1) + ".PositionNormalized." + (i + 1) , videoLayers.get(depth1).getPositionNormalizeds().get(i));
					}
				}
				putQueryParameter("VideoLayer." + (depth1 + 1) + ".WidthNormalized" , videoLayers.get(depth1).getWidthNormalized());
			}
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

	public static class AudioLayer {

		private Float volumeRate;

		private Integer fixedDelayDuration;

		private String validChannel;

		public Float getVolumeRate() {
			return this.volumeRate;
		}

		public void setVolumeRate(Float volumeRate) {
			this.volumeRate = volumeRate;
		}

		public Integer getFixedDelayDuration() {
			return this.fixedDelayDuration;
		}

		public void setFixedDelayDuration(Integer fixedDelayDuration) {
			this.fixedDelayDuration = fixedDelayDuration;
		}

		public String getValidChannel() {
			return this.validChannel;
		}

		public void setValidChannel(String validChannel) {
			this.validChannel = validChannel;
		}
	}

	public static class VideoLayer {

		private Integer fixedDelayDuration;

		private String fillMode;

		private Float heightNormalized;

		private String positionRefer;

		private List<Float> positionNormalizeds;

		private Float widthNormalized;

		public Integer getFixedDelayDuration() {
			return this.fixedDelayDuration;
		}

		public void setFixedDelayDuration(Integer fixedDelayDuration) {
			this.fixedDelayDuration = fixedDelayDuration;
		}

		public String getFillMode() {
			return this.fillMode;
		}

		public void setFillMode(String fillMode) {
			this.fillMode = fillMode;
		}

		public Float getHeightNormalized() {
			return this.heightNormalized;
		}

		public void setHeightNormalized(Float heightNormalized) {
			this.heightNormalized = heightNormalized;
		}

		public String getPositionRefer() {
			return this.positionRefer;
		}

		public void setPositionRefer(String positionRefer) {
			this.positionRefer = positionRefer;
		}

		public List<Float> getPositionNormalizeds() {
			return this.positionNormalizeds;
		}

		public void setPositionNormalizeds(List<Float> positionNormalizeds) {
			this.positionNormalizeds = positionNormalizeds;
		}

		public Float getWidthNormalized() {
			return this.widthNormalized;
		}

		public void setWidthNormalized(Float widthNormalized) {
			this.widthNormalized = widthNormalized;
		}
	}

	@Override
	public Class<ModifyCasterLayoutResponse> getResponseClass() {
		return ModifyCasterLayoutResponse.class;
	}

}
