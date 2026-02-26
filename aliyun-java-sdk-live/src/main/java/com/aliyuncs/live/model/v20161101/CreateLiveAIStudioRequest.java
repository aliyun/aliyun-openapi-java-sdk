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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLiveAIStudioRequest extends RpcAcsRequest<CreateLiveAIStudioResponse> {
	   

	private String backgroundResourceId;

	private String description;

	@SerializedName("mediaLayout")
	private MediaLayout mediaLayout;

	private String backgroundType;

	private String mattingType;

	private String mediaResourceUrl;

	private Integer height;

	private String backgroundResourceUrl;

	private String mediaResourceId;

	@SerializedName("mattingLayout")
	private MattingLayout mattingLayout;

	private Long ownerId;

	private String studioName;

	private Integer width;

	private String mediaType;
	public CreateLiveAIStudioRequest() {
		super("live", "2016-11-01", "CreateLiveAIStudio", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBackgroundResourceId() {
		return this.backgroundResourceId;
	}

	public void setBackgroundResourceId(String backgroundResourceId) {
		this.backgroundResourceId = backgroundResourceId;
		if(backgroundResourceId != null){
			putQueryParameter("BackgroundResourceId", backgroundResourceId);
		}
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

	public MediaLayout getMediaLayout() {
		return this.mediaLayout;
	}

	public void setMediaLayout(MediaLayout mediaLayout) {
		this.mediaLayout = mediaLayout;	
		if (mediaLayout != null) {
			putQueryParameter("MediaLayout" , new Gson().toJson(mediaLayout));
		}	
	}

	public String getBackgroundType() {
		return this.backgroundType;
	}

	public void setBackgroundType(String backgroundType) {
		this.backgroundType = backgroundType;
		if(backgroundType != null){
			putQueryParameter("BackgroundType", backgroundType);
		}
	}

	public String getMattingType() {
		return this.mattingType;
	}

	public void setMattingType(String mattingType) {
		this.mattingType = mattingType;
		if(mattingType != null){
			putQueryParameter("MattingType", mattingType);
		}
	}

	public String getMediaResourceUrl() {
		return this.mediaResourceUrl;
	}

	public void setMediaResourceUrl(String mediaResourceUrl) {
		this.mediaResourceUrl = mediaResourceUrl;
		if(mediaResourceUrl != null){
			putQueryParameter("MediaResourceUrl", mediaResourceUrl);
		}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height.toString());
		}
	}

	public String getBackgroundResourceUrl() {
		return this.backgroundResourceUrl;
	}

	public void setBackgroundResourceUrl(String backgroundResourceUrl) {
		this.backgroundResourceUrl = backgroundResourceUrl;
		if(backgroundResourceUrl != null){
			putQueryParameter("BackgroundResourceUrl", backgroundResourceUrl);
		}
	}

	public String getMediaResourceId() {
		return this.mediaResourceId;
	}

	public void setMediaResourceId(String mediaResourceId) {
		this.mediaResourceId = mediaResourceId;
		if(mediaResourceId != null){
			putQueryParameter("MediaResourceId", mediaResourceId);
		}
	}

	public MattingLayout getMattingLayout() {
		return this.mattingLayout;
	}

	public void setMattingLayout(MattingLayout mattingLayout) {
		this.mattingLayout = mattingLayout;	
		if (mattingLayout != null) {
			putQueryParameter("MattingLayout" , new Gson().toJson(mattingLayout));
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

	public String getStudioName() {
		return this.studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
		if(studioName != null){
			putQueryParameter("StudioName", studioName);
		}
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width.toString());
		}
	}

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
		if(mediaType != null){
			putQueryParameter("MediaType", mediaType);
		}
	}

	public static class MediaLayout {

		@SerializedName("PositionX")
		private Float positionX;

		@SerializedName("PositionY")
		private Float positionY;

		@SerializedName("HeightNormalized")
		private Float heightNormalized;

		public Float getPositionX() {
			return this.positionX;
		}

		public void setPositionX(Float positionX) {
			this.positionX = positionX;
		}

		public Float getPositionY() {
			return this.positionY;
		}

		public void setPositionY(Float positionY) {
			this.positionY = positionY;
		}

		public Float getHeightNormalized() {
			return this.heightNormalized;
		}

		public void setHeightNormalized(Float heightNormalized) {
			this.heightNormalized = heightNormalized;
		}
	}

	public static class MattingLayout {

		@SerializedName("PositionX")
		private Float positionX;

		@SerializedName("PositionY")
		private Float positionY;

		@SerializedName("HeightNormalized")
		private Float heightNormalized;

		public Float getPositionX() {
			return this.positionX;
		}

		public void setPositionX(Float positionX) {
			this.positionX = positionX;
		}

		public Float getPositionY() {
			return this.positionY;
		}

		public void setPositionY(Float positionY) {
			this.positionY = positionY;
		}

		public Float getHeightNormalized() {
			return this.heightNormalized;
		}

		public void setHeightNormalized(Float heightNormalized) {
			this.heightNormalized = heightNormalized;
		}
	}

	@Override
	public Class<CreateLiveAIStudioResponse> getResponseClass() {
		return CreateLiveAIStudioResponse.class;
	}

}
