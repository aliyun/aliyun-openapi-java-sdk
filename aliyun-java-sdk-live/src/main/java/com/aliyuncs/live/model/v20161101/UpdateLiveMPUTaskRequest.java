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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLiveMPUTaskRequest extends RpcAcsRequest<UpdateLiveMPUTaskResponse> {
	   

	@SerializedName("singleSubParams")
	private SingleSubParams singleSubParams;

	private String taskId;

	private String streamURL;

	@SerializedName("multiStreamURL")
	private List<MultiStreamURL> multiStreamURL;

	@SerializedName("seiParams")
	private SeiParams seiParams;

	@SerializedName("transcodeParams")
	private TranscodeParams transcodeParams;

	private String appId;

	private String mixMode;

	private String channelId;
	public UpdateLiveMPUTaskRequest() {
		super("live", "2016-11-01", "UpdateLiveMPUTask", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public SingleSubParams getSingleSubParams() {
		return this.singleSubParams;
	}

	public void setSingleSubParams(SingleSubParams singleSubParams) {
		this.singleSubParams = singleSubParams;	
		if (singleSubParams != null) {
			putQueryParameter("SingleSubParams" , new Gson().toJson(singleSubParams));
		}	
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
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

	public List<MultiStreamURL> getMultiStreamURL() {
		return this.multiStreamURL;
	}

	public void setMultiStreamURL(List<MultiStreamURL> multiStreamURL) {
		this.multiStreamURL = multiStreamURL;	
		if (multiStreamURL != null) {
			putQueryParameter("MultiStreamURL" , new Gson().toJson(multiStreamURL));
		}	
	}

	public SeiParams getSeiParams() {
		return this.seiParams;
	}

	public void setSeiParams(SeiParams seiParams) {
		this.seiParams = seiParams;	
		if (seiParams != null) {
			putQueryParameter("SeiParams" , new Gson().toJson(seiParams));
		}	
	}

	public TranscodeParams getTranscodeParams() {
		return this.transcodeParams;
	}

	public void setTranscodeParams(TranscodeParams transcodeParams) {
		this.transcodeParams = transcodeParams;	
		if (transcodeParams != null) {
			putQueryParameter("TranscodeParams" , new Gson().toJson(transcodeParams));
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

	public String getMixMode() {
		return this.mixMode;
	}

	public void setMixMode(String mixMode) {
		this.mixMode = mixMode;
		if(mixMode != null){
			putQueryParameter("MixMode", mixMode);
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

	public static class SingleSubParams {

		@SerializedName("MixAudioUserIds")
		private List<String> mixAudioUserIds;

		@SerializedName("StreamType")
		private String streamType;

		@SerializedName("SourceType")
		private String sourceType;

		@SerializedName("UserId")
		private String userId;

		public List<String> getMixAudioUserIds() {
			return this.mixAudioUserIds;
		}

		public void setMixAudioUserIds(List<String> mixAudioUserIds) {
			this.mixAudioUserIds = mixAudioUserIds;
		}

		public String getStreamType() {
			return this.streamType;
		}

		public void setStreamType(String streamType) {
			this.streamType = streamType;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	public static class MultiStreamURL {

		@SerializedName("IsAliCdn")
		private Boolean isAliCdn;

		@SerializedName("URL")
		private String uRL;

		public Boolean getIsAliCdn() {
			return this.isAliCdn;
		}

		public void setIsAliCdn(Boolean isAliCdn) {
			this.isAliCdn = isAliCdn;
		}

		public String getURL() {
			return this.uRL;
		}

		public void setURL(String uRL) {
			this.uRL = uRL;
		}
	}

	public static class SeiParams {

		@SerializedName("LayoutVolume")
		private LayoutVolume layoutVolume;

		@SerializedName("PassThrough")
		private PassThrough passThrough;

		public LayoutVolume getLayoutVolume() {
			return this.layoutVolume;
		}

		public void setLayoutVolume(LayoutVolume layoutVolume) {
			this.layoutVolume = layoutVolume;
		}

		public PassThrough getPassThrough() {
			return this.passThrough;
		}

		public void setPassThrough(PassThrough passThrough) {
			this.passThrough = passThrough;
		}

		public static class LayoutVolume {

			@SerializedName("FollowIdr")
			private String followIdr;

			@SerializedName("Interval")
			private String interval;

			public String getFollowIdr() {
				return this.followIdr;
			}

			public void setFollowIdr(String followIdr) {
				this.followIdr = followIdr;
			}

			public String getInterval() {
				return this.interval;
			}

			public void setInterval(String interval) {
				this.interval = interval;
			}
		}

		public static class PassThrough {

			@SerializedName("FollowIdr")
			private String followIdr;

			@SerializedName("PayloadContentKey")
			private String payloadContentKey;

			@SerializedName("PayloadContent")
			private String payloadContent;

			@SerializedName("Interval")
			private String interval;

			public String getFollowIdr() {
				return this.followIdr;
			}

			public void setFollowIdr(String followIdr) {
				this.followIdr = followIdr;
			}

			public String getPayloadContentKey() {
				return this.payloadContentKey;
			}

			public void setPayloadContentKey(String payloadContentKey) {
				this.payloadContentKey = payloadContentKey;
			}

			public String getPayloadContent() {
				return this.payloadContent;
			}

			public void setPayloadContent(String payloadContent) {
				this.payloadContent = payloadContent;
			}

			public String getInterval() {
				return this.interval;
			}

			public void setInterval(String interval) {
				this.interval = interval;
			}
		}
	}

	public static class TranscodeParams {

		@SerializedName("Layout")
		private Layout layout;

		@SerializedName("Background")
		private Background background;

		@SerializedName("UserInfos")
		private List<UserInfosItem> userInfos;

		@SerializedName("EncodeParams")
		private EncodeParams encodeParams;

		public Layout getLayout() {
			return this.layout;
		}

		public void setLayout(Layout layout) {
			this.layout = layout;
		}

		public Background getBackground() {
			return this.background;
		}

		public void setBackground(Background background) {
			this.background = background;
		}

		public List<UserInfosItem> getUserInfos() {
			return this.userInfos;
		}

		public void setUserInfos(List<UserInfosItem> userInfos) {
			this.userInfos = userInfos;
		}

		public EncodeParams getEncodeParams() {
			return this.encodeParams;
		}

		public void setEncodeParams(EncodeParams encodeParams) {
			this.encodeParams = encodeParams;
		}

		public static class Layout {

			@SerializedName("UserPanes")
			private List<UserPanesItem> userPanes;

			@SerializedName("LayoutMode")
			private String layoutMode;

			@SerializedName("MaxVideoUser")
			private MaxVideoUser maxVideoUser;

			public List<UserPanesItem> getUserPanes() {
				return this.userPanes;
			}

			public void setUserPanes(List<UserPanesItem> userPanes) {
				this.userPanes = userPanes;
			}

			public String getLayoutMode() {
				return this.layoutMode;
			}

			public void setLayoutMode(String layoutMode) {
				this.layoutMode = layoutMode;
			}

			public MaxVideoUser getMaxVideoUser() {
				return this.maxVideoUser;
			}

			public void setMaxVideoUser(MaxVideoUser maxVideoUser) {
				this.maxVideoUser = maxVideoUser;
			}

			public static class UserPanesItem {

				@SerializedName("BackgroundImageUrl")
				private String backgroundImageUrl;

				@SerializedName("ZOrder")
				private String zOrder;

				@SerializedName("Width")
				private String width;

				@SerializedName("X")
				private String x;

				@SerializedName("Y")
				private String y;

				@SerializedName("UserInfo")
				private UserInfo userInfo;

				@SerializedName("RenderMode")
				private String renderMode;

				@SerializedName("Height")
				private String height;

				public String getBackgroundImageUrl() {
					return this.backgroundImageUrl;
				}

				public void setBackgroundImageUrl(String backgroundImageUrl) {
					this.backgroundImageUrl = backgroundImageUrl;
				}

				public String getZOrder() {
					return this.zOrder;
				}

				public void setZOrder(String zOrder) {
					this.zOrder = zOrder;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getX() {
					return this.x;
				}

				public void setX(String x) {
					this.x = x;
				}

				public String getY() {
					return this.y;
				}

				public void setY(String y) {
					this.y = y;
				}

				public UserInfo getUserInfo() {
					return this.userInfo;
				}

				public void setUserInfo(UserInfo userInfo) {
					this.userInfo = userInfo;
				}

				public String getRenderMode() {
					return this.renderMode;
				}

				public void setRenderMode(String renderMode) {
					this.renderMode = renderMode;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public static class UserInfo {

					@SerializedName("SourceType")
					private String sourceType;

					@SerializedName("UserId")
					private String userId;

					@SerializedName("ChannelId")
					private String channelId;

					public String getSourceType() {
						return this.sourceType;
					}

					public void setSourceType(String sourceType) {
						this.sourceType = sourceType;
					}

					public String getUserId() {
						return this.userId;
					}

					public void setUserId(String userId) {
						this.userId = userId;
					}

					public String getChannelId() {
						return this.channelId;
					}

					public void setChannelId(String channelId) {
						this.channelId = channelId;
					}
				}
			}

			public static class MaxVideoUser {

				@SerializedName("StreamType")
				private String streamType;

				@SerializedName("SourceType")
				private String sourceType;

				@SerializedName("UserId")
				private String userId;

				@SerializedName("ChannelId")
				private String channelId;

				public String getStreamType() {
					return this.streamType;
				}

				public void setStreamType(String streamType) {
					this.streamType = streamType;
				}

				public String getSourceType() {
					return this.sourceType;
				}

				public void setSourceType(String sourceType) {
					this.sourceType = sourceType;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getChannelId() {
					return this.channelId;
				}

				public void setChannelId(String channelId) {
					this.channelId = channelId;
				}
			}
		}

		public static class Background {

			@SerializedName("RenderMode")
			private String renderMode;

			@SerializedName("URL")
			private String uRL;

			public String getRenderMode() {
				return this.renderMode;
			}

			public void setRenderMode(String renderMode) {
				this.renderMode = renderMode;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}
		}

		public static class UserInfosItem {

			@SerializedName("StreamType")
			private String streamType;

			@SerializedName("SourceType")
			private String sourceType;

			@SerializedName("UserId")
			private String userId;

			@SerializedName("ChannelId")
			private String channelId;

			public String getStreamType() {
				return this.streamType;
			}

			public void setStreamType(String streamType) {
				this.streamType = streamType;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}
		}

		public static class EncodeParams {

			@SerializedName("AudioOnly")
			private String audioOnly;

			@SerializedName("VideoWidth")
			private String videoWidth;

			@SerializedName("AudioBitrate")
			private String audioBitrate;

			@SerializedName("EnhancedParam")
			private String enhancedParam;

			@SerializedName("VideoFramerate")
			private String videoFramerate;

			@SerializedName("VideoHeight")
			private String videoHeight;

			@SerializedName("AudioSampleRate")
			private String audioSampleRate;

			@SerializedName("VideoBitrate")
			private String videoBitrate;

			@SerializedName("VideoCodec")
			private String videoCodec;

			@SerializedName("AudioChannels")
			private String audioChannels;

			@SerializedName("VideoGop")
			private String videoGop;

			public String getAudioOnly() {
				return this.audioOnly;
			}

			public void setAudioOnly(String audioOnly) {
				this.audioOnly = audioOnly;
			}

			public String getVideoWidth() {
				return this.videoWidth;
			}

			public void setVideoWidth(String videoWidth) {
				this.videoWidth = videoWidth;
			}

			public String getAudioBitrate() {
				return this.audioBitrate;
			}

			public void setAudioBitrate(String audioBitrate) {
				this.audioBitrate = audioBitrate;
			}

			public String getEnhancedParam() {
				return this.enhancedParam;
			}

			public void setEnhancedParam(String enhancedParam) {
				this.enhancedParam = enhancedParam;
			}

			public String getVideoFramerate() {
				return this.videoFramerate;
			}

			public void setVideoFramerate(String videoFramerate) {
				this.videoFramerate = videoFramerate;
			}

			public String getVideoHeight() {
				return this.videoHeight;
			}

			public void setVideoHeight(String videoHeight) {
				this.videoHeight = videoHeight;
			}

			public String getAudioSampleRate() {
				return this.audioSampleRate;
			}

			public void setAudioSampleRate(String audioSampleRate) {
				this.audioSampleRate = audioSampleRate;
			}

			public String getVideoBitrate() {
				return this.videoBitrate;
			}

			public void setVideoBitrate(String videoBitrate) {
				this.videoBitrate = videoBitrate;
			}

			public String getVideoCodec() {
				return this.videoCodec;
			}

			public void setVideoCodec(String videoCodec) {
				this.videoCodec = videoCodec;
			}

			public String getAudioChannels() {
				return this.audioChannels;
			}

			public void setAudioChannels(String audioChannels) {
				this.audioChannels = audioChannels;
			}

			public String getVideoGop() {
				return this.videoGop;
			}

			public void setVideoGop(String videoGop) {
				this.videoGop = videoGop;
			}
		}
	}

	@Override
	public Class<UpdateLiveMPUTaskResponse> getResponseClass() {
		return UpdateLiveMPUTaskResponse.class;
	}

}
