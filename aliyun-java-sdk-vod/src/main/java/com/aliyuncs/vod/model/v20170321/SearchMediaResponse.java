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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.SearchMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchMediaResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private String scrollToken;

	private List<Media> mediaList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getScrollToken() {
		return this.scrollToken;
	}

	public void setScrollToken(String scrollToken) {
		this.scrollToken = scrollToken;
	}

	public List<Media> getMediaList() {
		return this.mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public static class Media {

		private String creationTime;

		private String mediaType;

		private String mediaId;

		private Video video;

		private Audio audio;

		private Image image;

		private AttachedMedia attachedMedia;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public Video getVideo() {
			return this.video;
		}

		public void setVideo(Video video) {
			this.video = video;
		}

		public Audio getAudio() {
			return this.audio;
		}

		public void setAudio(Audio audio) {
			this.audio = audio;
		}

		public Image getImage() {
			return this.image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public AttachedMedia getAttachedMedia() {
			return this.attachedMedia;
		}

		public void setAttachedMedia(AttachedMedia attachedMedia) {
			this.attachedMedia = attachedMedia;
		}

		public static class Video {

			private String status;

			private String creationTime;

			private String storageLocation;

			private Long cateId;

			private String auditTemplateId;

			private String tags;

			private String modificationTime;

			private String auditManualStatus;

			private String mediaType;

			private String mediaSource;

			private String description;

			private String appId;

			private String coverURL;

			private String auditStatus;

			private String auditAIStatus;

			private String videoId;

			private String auditLabel;

			private String downloadSwitch;

			private String regionId;

			private String auditAbnormalModules;

			private String customMediaInfo;

			private String cateName;

			private String transcodeMode;

			private String auditAIResult;

			private String preprocessStatus;

			private Long size;

			private Float duration;

			private String title;

			private List<PlayInfo> playInfoList;

			private List<String> spriteSnapshots;

			private List<String> snapshots;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getAuditTemplateId() {
				return this.auditTemplateId;
			}

			public void setAuditTemplateId(String auditTemplateId) {
				this.auditTemplateId = auditTemplateId;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getAuditManualStatus() {
				return this.auditManualStatus;
			}

			public void setAuditManualStatus(String auditManualStatus) {
				this.auditManualStatus = auditManualStatus;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public String getMediaSource() {
				return this.mediaSource;
			}

			public void setMediaSource(String mediaSource) {
				this.mediaSource = mediaSource;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public String getAuditStatus() {
				return this.auditStatus;
			}

			public void setAuditStatus(String auditStatus) {
				this.auditStatus = auditStatus;
			}

			public String getAuditAIStatus() {
				return this.auditAIStatus;
			}

			public void setAuditAIStatus(String auditAIStatus) {
				this.auditAIStatus = auditAIStatus;
			}

			public String getVideoId() {
				return this.videoId;
			}

			public void setVideoId(String videoId) {
				this.videoId = videoId;
			}

			public String getAuditLabel() {
				return this.auditLabel;
			}

			public void setAuditLabel(String auditLabel) {
				this.auditLabel = auditLabel;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAuditAbnormalModules() {
				return this.auditAbnormalModules;
			}

			public void setAuditAbnormalModules(String auditAbnormalModules) {
				this.auditAbnormalModules = auditAbnormalModules;
			}

			public String getCustomMediaInfo() {
				return this.customMediaInfo;
			}

			public void setCustomMediaInfo(String customMediaInfo) {
				this.customMediaInfo = customMediaInfo;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getTranscodeMode() {
				return this.transcodeMode;
			}

			public void setTranscodeMode(String transcodeMode) {
				this.transcodeMode = transcodeMode;
			}

			public String getAuditAIResult() {
				return this.auditAIResult;
			}

			public void setAuditAIResult(String auditAIResult) {
				this.auditAIResult = auditAIResult;
			}

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public Float getDuration() {
				return this.duration;
			}

			public void setDuration(Float duration) {
				this.duration = duration;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public List<PlayInfo> getPlayInfoList() {
				return this.playInfoList;
			}

			public void setPlayInfoList(List<PlayInfo> playInfoList) {
				this.playInfoList = playInfoList;
			}

			public List<String> getSpriteSnapshots() {
				return this.spriteSnapshots;
			}

			public void setSpriteSnapshots(List<String> spriteSnapshots) {
				this.spriteSnapshots = spriteSnapshots;
			}

			public List<String> getSnapshots() {
				return this.snapshots;
			}

			public void setSnapshots(List<String> snapshots) {
				this.snapshots = snapshots;
			}

			public static class PlayInfo {

				private String complexity;

				private String height;

				private String bitrate;

				private Long encrypt;

				private String definition;

				private String rand;

				private String streamType;

				private String jobId;

				private String width;

				private String size;

				private String plaintext;

				private String playURL;

				private String duration;

				private String fps;

				private String format;

				public String getComplexity() {
					return this.complexity;
				}

				public void setComplexity(String complexity) {
					this.complexity = complexity;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public Long getEncrypt() {
					return this.encrypt;
				}

				public void setEncrypt(Long encrypt) {
					this.encrypt = encrypt;
				}

				public String getDefinition() {
					return this.definition;
				}

				public void setDefinition(String definition) {
					this.definition = definition;
				}

				public String getRand() {
					return this.rand;
				}

				public void setRand(String rand) {
					this.rand = rand;
				}

				public String getStreamType() {
					return this.streamType;
				}

				public void setStreamType(String streamType) {
					this.streamType = streamType;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getPlaintext() {
					return this.plaintext;
				}

				public void setPlaintext(String plaintext) {
					this.plaintext = plaintext;
				}

				public String getPlayURL() {
					return this.playURL;
				}

				public void setPlayURL(String playURL) {
					this.playURL = playURL;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}
			}
		}

		public static class Audio {

			private String status;

			private String creationTime;

			private String storageLocation;

			private Long cateId;

			private String auditTemplateId;

			private String tags;

			private String modificationTime;

			private String auditManualStatus;

			private String mediaSource;

			private String description;

			private String appId;

			private String coverURL;

			private String audioId;

			private String auditStatus;

			private String auditAIStatus;

			private String downloadSwitch;

			private String regionId;

			private String cateName;

			private String transcodeMode;

			private String customMediaInfo;

			private String auditAIResult;

			private String preprocessStatus;

			private Long size;

			private Float duration;

			private String title;

			private List<PlayInfo4> playInfoList3;

			private List<String> spriteSnapshots1;

			private List<String> snapshots2;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getAuditTemplateId() {
				return this.auditTemplateId;
			}

			public void setAuditTemplateId(String auditTemplateId) {
				this.auditTemplateId = auditTemplateId;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getAuditManualStatus() {
				return this.auditManualStatus;
			}

			public void setAuditManualStatus(String auditManualStatus) {
				this.auditManualStatus = auditManualStatus;
			}

			public String getMediaSource() {
				return this.mediaSource;
			}

			public void setMediaSource(String mediaSource) {
				this.mediaSource = mediaSource;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public String getAudioId() {
				return this.audioId;
			}

			public void setAudioId(String audioId) {
				this.audioId = audioId;
			}

			public String getAuditStatus() {
				return this.auditStatus;
			}

			public void setAuditStatus(String auditStatus) {
				this.auditStatus = auditStatus;
			}

			public String getAuditAIStatus() {
				return this.auditAIStatus;
			}

			public void setAuditAIStatus(String auditAIStatus) {
				this.auditAIStatus = auditAIStatus;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getTranscodeMode() {
				return this.transcodeMode;
			}

			public void setTranscodeMode(String transcodeMode) {
				this.transcodeMode = transcodeMode;
			}

			public String getCustomMediaInfo() {
				return this.customMediaInfo;
			}

			public void setCustomMediaInfo(String customMediaInfo) {
				this.customMediaInfo = customMediaInfo;
			}

			public String getAuditAIResult() {
				return this.auditAIResult;
			}

			public void setAuditAIResult(String auditAIResult) {
				this.auditAIResult = auditAIResult;
			}

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public Float getDuration() {
				return this.duration;
			}

			public void setDuration(Float duration) {
				this.duration = duration;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public List<PlayInfo4> getPlayInfoList3() {
				return this.playInfoList3;
			}

			public void setPlayInfoList3(List<PlayInfo4> playInfoList3) {
				this.playInfoList3 = playInfoList3;
			}

			public List<String> getSpriteSnapshots1() {
				return this.spriteSnapshots1;
			}

			public void setSpriteSnapshots1(List<String> spriteSnapshots1) {
				this.spriteSnapshots1 = spriteSnapshots1;
			}

			public List<String> getSnapshots2() {
				return this.snapshots2;
			}

			public void setSnapshots2(List<String> snapshots2) {
				this.snapshots2 = snapshots2;
			}

			public static class PlayInfo4 {

				private String complexity;

				private String height;

				private String bitrate;

				private Long encrypt;

				private String definition;

				private String rand;

				private String streamType;

				private String jobId;

				private String width;

				private String size;

				private String plaintext;

				private String playURL;

				private String duration;

				private String fps;

				private String format;

				public String getComplexity() {
					return this.complexity;
				}

				public void setComplexity(String complexity) {
					this.complexity = complexity;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public Long getEncrypt() {
					return this.encrypt;
				}

				public void setEncrypt(Long encrypt) {
					this.encrypt = encrypt;
				}

				public String getDefinition() {
					return this.definition;
				}

				public void setDefinition(String definition) {
					this.definition = definition;
				}

				public String getRand() {
					return this.rand;
				}

				public void setRand(String rand) {
					this.rand = rand;
				}

				public String getStreamType() {
					return this.streamType;
				}

				public void setStreamType(String streamType) {
					this.streamType = streamType;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getPlaintext() {
					return this.plaintext;
				}

				public void setPlaintext(String plaintext) {
					this.plaintext = plaintext;
				}

				public String getPlayURL() {
					return this.playURL;
				}

				public void setPlayURL(String playURL) {
					this.playURL = playURL;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}
			}
		}

		public static class Image {

			private String storageLocation;

			private String creationTime;

			private String type;

			private String status;

			private Long cateId;

			private String tags;

			private String modificationTime;

			private String regionId;

			private String cateName;

			private String description;

			private String appId;

			private String uRL;

			private String title;

			private String ext;

			private String imageId;

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}
		}

		public static class AttachedMedia {

			private String creationTime;

			private String status;

			private String storageLocation;

			private String icon;

			private String tags;

			private String modificationTime;

			private String mediaId;

			private String businessType;

			private String regionId;

			private String description;

			private String appId;

			private String uRL;

			private String title;

			private String ext;

			private String onlineStatus;

			private List<Category> categories;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getMediaId() {
				return this.mediaId;
			}

			public void setMediaId(String mediaId) {
				this.mediaId = mediaId;
			}

			public String getBusinessType() {
				return this.businessType;
			}

			public void setBusinessType(String businessType) {
				this.businessType = businessType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public String getOnlineStatus() {
				return this.onlineStatus;
			}

			public void setOnlineStatus(String onlineStatus) {
				this.onlineStatus = onlineStatus;
			}

			public List<Category> getCategories() {
				return this.categories;
			}

			public void setCategories(List<Category> categories) {
				this.categories = categories;
			}

			public static class Category {

				private Long parentId;

				private String cateName;

				private Long cateId;

				private Long level;

				public Long getParentId() {
					return this.parentId;
				}

				public void setParentId(Long parentId) {
					this.parentId = parentId;
				}

				public String getCateName() {
					return this.cateName;
				}

				public void setCateName(String cateName) {
					this.cateName = cateName;
				}

				public Long getCateId() {
					return this.cateId;
				}

				public void setCateId(Long cateId) {
					this.cateId = cateId;
				}

				public Long getLevel() {
					return this.level;
				}

				public void setLevel(Long level) {
					this.level = level;
				}
			}
		}
	}

	@Override
	public SearchMediaResponse getInstance(UnmarshallerContext context) {
		return	SearchMediaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
