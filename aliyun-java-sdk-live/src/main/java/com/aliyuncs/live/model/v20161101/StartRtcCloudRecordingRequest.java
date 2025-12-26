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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartRtcCloudRecordingRequest extends RpcAcsRequest<StartRtcCloudRecordingResponse> {
	   

	@SerializedName("storageParams")
	private StorageParams storageParams;

	private String notifyUrl;

	@SerializedName("subscribeParams")
	private SubscribeParams subscribeParams;

	@SerializedName("recordParams")
	private RecordParams recordParams;

	private Long maxIdleTime;

	@SerializedName("mixTranscodeParams")
	private MixTranscodeParams mixTranscodeParams;

	private List<String> notifyFileUploadedFormats;

	private String notifyAuthKey;

	private String appId;

	private String channelId;

	@SerializedName("mixLayoutParams")
	private MixLayoutParams mixLayoutParams;
	public StartRtcCloudRecordingRequest() {
		super("live", "2016-11-01", "StartRtcCloudRecording", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public StorageParams getStorageParams() {
		return this.storageParams;
	}

	public void setStorageParams(StorageParams storageParams) {
		this.storageParams = storageParams;	
		if (storageParams != null) {
			putQueryParameter("StorageParams" , new Gson().toJson(storageParams));
		}	
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		if(notifyUrl != null){
			putQueryParameter("NotifyUrl", notifyUrl);
		}
	}

	public SubscribeParams getSubscribeParams() {
		return this.subscribeParams;
	}

	public void setSubscribeParams(SubscribeParams subscribeParams) {
		this.subscribeParams = subscribeParams;	
		if (subscribeParams != null) {
			putQueryParameter("SubscribeParams" , new Gson().toJson(subscribeParams));
		}	
	}

	public RecordParams getRecordParams() {
		return this.recordParams;
	}

	public void setRecordParams(RecordParams recordParams) {
		this.recordParams = recordParams;	
		if (recordParams != null) {
			putQueryParameter("RecordParams" , new Gson().toJson(recordParams));
		}	
	}

	public Long getMaxIdleTime() {
		return this.maxIdleTime;
	}

	public void setMaxIdleTime(Long maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
		if(maxIdleTime != null){
			putQueryParameter("MaxIdleTime", maxIdleTime.toString());
		}
	}

	public MixTranscodeParams getMixTranscodeParams() {
		return this.mixTranscodeParams;
	}

	public void setMixTranscodeParams(MixTranscodeParams mixTranscodeParams) {
		this.mixTranscodeParams = mixTranscodeParams;	
		if (mixTranscodeParams != null) {
			putQueryParameter("MixTranscodeParams" , new Gson().toJson(mixTranscodeParams));
		}	
	}

	public List<String> getNotifyFileUploadedFormats() {
		return this.notifyFileUploadedFormats;
	}

	public void setNotifyFileUploadedFormats(List<String> notifyFileUploadedFormats) {
		this.notifyFileUploadedFormats = notifyFileUploadedFormats;	
		if (notifyFileUploadedFormats != null) {
			for (int i = 0; i < notifyFileUploadedFormats.size(); i++) {
				putQueryParameter("NotifyFileUploadedFormat." + (i + 1) , notifyFileUploadedFormats.get(i));
			}
		}	
	}

	public String getNotifyAuthKey() {
		return this.notifyAuthKey;
	}

	public void setNotifyAuthKey(String notifyAuthKey) {
		this.notifyAuthKey = notifyAuthKey;
		if(notifyAuthKey != null){
			putQueryParameter("NotifyAuthKey", notifyAuthKey);
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

	public MixLayoutParams getMixLayoutParams() {
		return this.mixLayoutParams;
	}

	public void setMixLayoutParams(MixLayoutParams mixLayoutParams) {
		this.mixLayoutParams = mixLayoutParams;	
		if (mixLayoutParams != null) {
			putQueryParameter("MixLayoutParams" , new Gson().toJson(mixLayoutParams));
		}	
	}

	public static class StorageParams {

		@SerializedName("VodParams")
		private VodParams vodParams;

		@SerializedName("FileInfo")
		private List<FileInfoItem> fileInfo;

		@SerializedName("StorageType")
		private Integer storageType;

		@SerializedName("OSSParams")
		private OSSParams oSSParams;

		public VodParams getVodParams() {
			return this.vodParams;
		}

		public void setVodParams(VodParams vodParams) {
			this.vodParams = vodParams;
		}

		public List<FileInfoItem> getFileInfo() {
			return this.fileInfo;
		}

		public void setFileInfo(List<FileInfoItem> fileInfo) {
			this.fileInfo = fileInfo;
		}

		public Integer getStorageType() {
			return this.storageType;
		}

		public void setStorageType(Integer storageType) {
			this.storageType = storageType;
		}

		public OSSParams getOSSParams() {
			return this.oSSParams;
		}

		public void setOSSParams(OSSParams oSSParams) {
			this.oSSParams = oSSParams;
		}

		public static class VodParams {

			@SerializedName("AutoCompose")
			private Integer autoCompose;

			@SerializedName("ComposeVodTranscodeGroupId")
			private String composeVodTranscodeGroupId;

			@SerializedName("VodTranscodeGroupId")
			private String vodTranscodeGroupId;

			@SerializedName("StorageLocation")
			private String storageLocation;

			public Integer getAutoCompose() {
				return this.autoCompose;
			}

			public void setAutoCompose(Integer autoCompose) {
				this.autoCompose = autoCompose;
			}

			public String getComposeVodTranscodeGroupId() {
				return this.composeVodTranscodeGroupId;
			}

			public void setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
				this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
			}

			public String getVodTranscodeGroupId() {
				return this.vodTranscodeGroupId;
			}

			public void setVodTranscodeGroupId(String vodTranscodeGroupId) {
				this.vodTranscodeGroupId = vodTranscodeGroupId;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}
		}

		public static class FileInfoItem {

			@SerializedName("SliceDuration")
			private Long sliceDuration;

			@SerializedName("FileNamePattern")
			private String fileNamePattern;

			@SerializedName("Format")
			private String format;

			@SerializedName("SliceNamePattern")
			private String sliceNamePattern;

			@SerializedName("FilePathPrefix")
			private List<String> filePathPrefix;

			public Long getSliceDuration() {
				return this.sliceDuration;
			}

			public void setSliceDuration(Long sliceDuration) {
				this.sliceDuration = sliceDuration;
			}

			public String getFileNamePattern() {
				return this.fileNamePattern;
			}

			public void setFileNamePattern(String fileNamePattern) {
				this.fileNamePattern = fileNamePattern;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getSliceNamePattern() {
				return this.sliceNamePattern;
			}

			public void setSliceNamePattern(String sliceNamePattern) {
				this.sliceNamePattern = sliceNamePattern;
			}

			public List<String> getFilePathPrefix() {
				return this.filePathPrefix;
			}

			public void setFilePathPrefix(List<String> filePathPrefix) {
				this.filePathPrefix = filePathPrefix;
			}
		}

		public static class OSSParams {

			@SerializedName("OSSBucket")
			private String oSSBucket;

			@SerializedName("OSSEndpoint")
			private String oSSEndpoint;

			public String getOSSBucket() {
				return this.oSSBucket;
			}

			public void setOSSBucket(String oSSBucket) {
				this.oSSBucket = oSSBucket;
			}

			public String getOSSEndpoint() {
				return this.oSSEndpoint;
			}

			public void setOSSEndpoint(String oSSEndpoint) {
				this.oSSEndpoint = oSSEndpoint;
			}
		}
	}

	public static class SubscribeParams {

		@SerializedName("SubscribeUserIdList")
		private List<SubscribeUserIdListItem> subscribeUserIdList;

		public List<SubscribeUserIdListItem> getSubscribeUserIdList() {
			return this.subscribeUserIdList;
		}

		public void setSubscribeUserIdList(List<SubscribeUserIdListItem> subscribeUserIdList) {
			this.subscribeUserIdList = subscribeUserIdList;
		}

		public static class SubscribeUserIdListItem {

			@SerializedName("StreamType")
			private Integer streamType;

			@SerializedName("SourceType")
			private Integer sourceType;

			@SerializedName("UserId")
			private String userId;

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public Integer getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(Integer sourceType) {
				this.sourceType = sourceType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	public static class RecordParams {

		@SerializedName("MaxFileDuration")
		private Long maxFileDuration;

		@SerializedName("StreamType")
		private Integer streamType;

		@SerializedName("RecordMode")
		private Integer recordMode;

		public Long getMaxFileDuration() {
			return this.maxFileDuration;
		}

		public void setMaxFileDuration(Long maxFileDuration) {
			this.maxFileDuration = maxFileDuration;
		}

		public Integer getStreamType() {
			return this.streamType;
		}

		public void setStreamType(Integer streamType) {
			this.streamType = streamType;
		}

		public Integer getRecordMode() {
			return this.recordMode;
		}

		public void setRecordMode(Integer recordMode) {
			this.recordMode = recordMode;
		}
	}

	public static class MixTranscodeParams {

		@SerializedName("VideoWidth")
		private Integer videoWidth;

		@SerializedName("AudioBitrate")
		private Long audioBitrate;

		@SerializedName("VideoFramerate")
		private Integer videoFramerate;

		@SerializedName("VideoHeight")
		private Integer videoHeight;

		@SerializedName("AudioSampleRate")
		private Long audioSampleRate;

		@SerializedName("VideoBitrate")
		private Integer videoBitrate;

		@SerializedName("FrameFillType")
		private Integer frameFillType;

		@SerializedName("VideoCodec")
		private String videoCodec;

		@SerializedName("AudioChannels")
		private Integer audioChannels;

		@SerializedName("VideoGop")
		private Integer videoGop;

		public Integer getVideoWidth() {
			return this.videoWidth;
		}

		public void setVideoWidth(Integer videoWidth) {
			this.videoWidth = videoWidth;
		}

		public Long getAudioBitrate() {
			return this.audioBitrate;
		}

		public void setAudioBitrate(Long audioBitrate) {
			this.audioBitrate = audioBitrate;
		}

		public Integer getVideoFramerate() {
			return this.videoFramerate;
		}

		public void setVideoFramerate(Integer videoFramerate) {
			this.videoFramerate = videoFramerate;
		}

		public Integer getVideoHeight() {
			return this.videoHeight;
		}

		public void setVideoHeight(Integer videoHeight) {
			this.videoHeight = videoHeight;
		}

		public Long getAudioSampleRate() {
			return this.audioSampleRate;
		}

		public void setAudioSampleRate(Long audioSampleRate) {
			this.audioSampleRate = audioSampleRate;
		}

		public Integer getVideoBitrate() {
			return this.videoBitrate;
		}

		public void setVideoBitrate(Integer videoBitrate) {
			this.videoBitrate = videoBitrate;
		}

		public Integer getFrameFillType() {
			return this.frameFillType;
		}

		public void setFrameFillType(Integer frameFillType) {
			this.frameFillType = frameFillType;
		}

		public String getVideoCodec() {
			return this.videoCodec;
		}

		public void setVideoCodec(String videoCodec) {
			this.videoCodec = videoCodec;
		}

		public Integer getAudioChannels() {
			return this.audioChannels;
		}

		public void setAudioChannels(Integer audioChannels) {
			this.audioChannels = audioChannels;
		}

		public Integer getVideoGop() {
			return this.videoGop;
		}

		public void setVideoGop(Integer videoGop) {
			this.videoGop = videoGop;
		}
	}

	public static class MixLayoutParams {

		@SerializedName("UserPanes")
		private List<UserPanesItem> userPanes;

		@SerializedName("MixBackground")
		private MixBackground mixBackground;

		public List<UserPanesItem> getUserPanes() {
			return this.userPanes;
		}

		public void setUserPanes(List<UserPanesItem> userPanes) {
			this.userPanes = userPanes;
		}

		public MixBackground getMixBackground() {
			return this.mixBackground;
		}

		public void setMixBackground(MixBackground mixBackground) {
			this.mixBackground = mixBackground;
		}

		public static class UserPanesItem {

			@SerializedName("ZOrder")
			private Integer zOrder;

			@SerializedName("Width")
			private String width;

			@SerializedName("X")
			private String x;

			@SerializedName("Y")
			private String y;

			@SerializedName("SourceType")
			private Integer sourceType;

			@SerializedName("UserId")
			private String userId;

			@SerializedName("Height")
			private String height;

			@SerializedName("SubBackground")
			private SubBackground subBackground;

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
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

			public Integer getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(Integer sourceType) {
				this.sourceType = sourceType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public SubBackground getSubBackground() {
				return this.subBackground;
			}

			public void setSubBackground(SubBackground subBackground) {
				this.subBackground = subBackground;
			}

			public static class SubBackground {

				@SerializedName("RenderMode")
				private Integer renderMode;

				@SerializedName("Url")
				private String url;

				public Integer getRenderMode() {
					return this.renderMode;
				}

				public void setRenderMode(Integer renderMode) {
					this.renderMode = renderMode;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}
			}
		}

		public static class MixBackground {

			@SerializedName("RenderMode")
			private Integer renderMode;

			@SerializedName("Url")
			private String url;

			public Integer getRenderMode() {
				return this.renderMode;
			}

			public void setRenderMode(Integer renderMode) {
				this.renderMode = renderMode;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public Class<StartRtcCloudRecordingResponse> getResponseClass() {
		return StartRtcCloudRecordingResponse.class;
	}

}
