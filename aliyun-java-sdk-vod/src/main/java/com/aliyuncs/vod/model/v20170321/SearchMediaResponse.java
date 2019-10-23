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

	private String scrollToken;

	private Long total;

	private List<Media> mediaList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScrollToken() {
		return this.scrollToken;
	}

	public void setScrollToken(String scrollToken) {
		this.scrollToken = scrollToken;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Media> getMediaList() {
		return this.mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public static class Media {

		private String mediaType;

		private String creationTime;

		private String mediaId;

		private Video video;

		private Audio audio;

		private Image image;

		private AttachedMedia attachedMedia;

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
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

			private String videoId;

			private String mediaSource;

			private String mediaType;

			private String title;

			private String tags;

			private String status;

			private Long size;

			private Float duration;

			private String description;

			private String modificationTime;

			private String creationTime;

			private String coverURL;

			private Long cateId;

			private String cateName;

			private String downloadSwitch;

			private String preprocessStatus;

			private String storageLocation;

			private String regionId;

			private String transcodeMode;

			private String auditStatus;

			private String auditAIStatus;

			private String auditManualStatus;

			private String auditAIResult;

			private String auditTemplateId;

			private String customMediaInfo;

			private String appId;

			private List<PlayInfo> playInfoList;

			private List<String> snapshots;

			private List<String> spriteSnapshots;

			public String getVideoId() {
				return this.videoId;
			}

			public void setVideoId(String videoId) {
				this.videoId = videoId;
			}

			public String getMediaSource() {
				return this.mediaSource;
			}

			public void setMediaSource(String mediaSource) {
				this.mediaSource = mediaSource;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
			}

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getTranscodeMode() {
				return this.transcodeMode;
			}

			public void setTranscodeMode(String transcodeMode) {
				this.transcodeMode = transcodeMode;
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

			public String getAuditManualStatus() {
				return this.auditManualStatus;
			}

			public void setAuditManualStatus(String auditManualStatus) {
				this.auditManualStatus = auditManualStatus;
			}

			public String getAuditAIResult() {
				return this.auditAIResult;
			}

			public void setAuditAIResult(String auditAIResult) {
				this.auditAIResult = auditAIResult;
			}

			public String getAuditTemplateId() {
				return this.auditTemplateId;
			}

			public void setAuditTemplateId(String auditTemplateId) {
				this.auditTemplateId = auditTemplateId;
			}

			public String getCustomMediaInfo() {
				return this.customMediaInfo;
			}

			public void setCustomMediaInfo(String customMediaInfo) {
				this.customMediaInfo = customMediaInfo;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public List<PlayInfo> getPlayInfoList() {
				return this.playInfoList;
			}

			public void setPlayInfoList(List<PlayInfo> playInfoList) {
				this.playInfoList = playInfoList;
			}

			public List<String> getSnapshots() {
				return this.snapshots;
			}

			public void setSnapshots(List<String> snapshots) {
				this.snapshots = snapshots;
			}

			public List<String> getSpriteSnapshots() {
				return this.spriteSnapshots;
			}

			public void setSpriteSnapshots(List<String> spriteSnapshots) {
				this.spriteSnapshots = spriteSnapshots;
			}

			public static class PlayInfo {

				private String width;

				private String height;

				private String size;

				private String playURL;

				private String bitrate;

				private String definition;

				private String duration;

				private String format;

				private String fps;

				private Long encrypt;

				private String plaintext;

				private String complexity;

				private String streamType;

				private String rand;

				private String jobId;

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getPlayURL() {
					return this.playURL;
				}

				public void setPlayURL(String playURL) {
					this.playURL = playURL;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getDefinition() {
					return this.definition;
				}

				public void setDefinition(String definition) {
					this.definition = definition;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public Long getEncrypt() {
					return this.encrypt;
				}

				public void setEncrypt(Long encrypt) {
					this.encrypt = encrypt;
				}

				public String getPlaintext() {
					return this.plaintext;
				}

				public void setPlaintext(String plaintext) {
					this.plaintext = plaintext;
				}

				public String getComplexity() {
					return this.complexity;
				}

				public void setComplexity(String complexity) {
					this.complexity = complexity;
				}

				public String getStreamType() {
					return this.streamType;
				}

				public void setStreamType(String streamType) {
					this.streamType = streamType;
				}

				public String getRand() {
					return this.rand;
				}

				public void setRand(String rand) {
					this.rand = rand;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}
			}
		}

		public static class Audio {

			private String audioId;

			private String mediaSource;

			private String title;

			private String tags;

			private String status;

			private Long size;

			private Float duration;

			private String description;

			private String modificationTime;

			private String creationTime;

			private String coverURL;

			private Long cateId;

			private String cateName;

			private String downloadSwitch;

			private String preprocessStatus;

			private String storageLocation;

			private String regionId;

			private String transcodeMode;

			private String auditStatus;

			private String auditAIStatus;

			private String auditManualStatus;

			private String auditAIResult;

			private String auditTemplateId;

			private String customMediaInfo;

			private String appId;

			private List<PlayInfo4> playInfoList3;

			private List<String> snapshots1;

			private List<String> spriteSnapshots2;

			public String getAudioId() {
				return this.audioId;
			}

			public void setAudioId(String audioId) {
				this.audioId = audioId;
			}

			public String getMediaSource() {
				return this.mediaSource;
			}

			public void setMediaSource(String mediaSource) {
				this.mediaSource = mediaSource;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
			}

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getTranscodeMode() {
				return this.transcodeMode;
			}

			public void setTranscodeMode(String transcodeMode) {
				this.transcodeMode = transcodeMode;
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

			public String getAuditManualStatus() {
				return this.auditManualStatus;
			}

			public void setAuditManualStatus(String auditManualStatus) {
				this.auditManualStatus = auditManualStatus;
			}

			public String getAuditAIResult() {
				return this.auditAIResult;
			}

			public void setAuditAIResult(String auditAIResult) {
				this.auditAIResult = auditAIResult;
			}

			public String getAuditTemplateId() {
				return this.auditTemplateId;
			}

			public void setAuditTemplateId(String auditTemplateId) {
				this.auditTemplateId = auditTemplateId;
			}

			public String getCustomMediaInfo() {
				return this.customMediaInfo;
			}

			public void setCustomMediaInfo(String customMediaInfo) {
				this.customMediaInfo = customMediaInfo;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public List<PlayInfo4> getPlayInfoList3() {
				return this.playInfoList3;
			}

			public void setPlayInfoList3(List<PlayInfo4> playInfoList3) {
				this.playInfoList3 = playInfoList3;
			}

			public List<String> getSnapshots1() {
				return this.snapshots1;
			}

			public void setSnapshots1(List<String> snapshots1) {
				this.snapshots1 = snapshots1;
			}

			public List<String> getSpriteSnapshots2() {
				return this.spriteSnapshots2;
			}

			public void setSpriteSnapshots2(List<String> spriteSnapshots2) {
				this.spriteSnapshots2 = spriteSnapshots2;
			}

			public static class PlayInfo4 {

				private String width;

				private String height;

				private String size;

				private String playURL;

				private String bitrate;

				private String definition;

				private String duration;

				private String format;

				private String fps;

				private Long encrypt;

				private String plaintext;

				private String complexity;

				private String streamType;

				private String rand;

				private String jobId;

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getPlayURL() {
					return this.playURL;
				}

				public void setPlayURL(String playURL) {
					this.playURL = playURL;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getDefinition() {
					return this.definition;
				}

				public void setDefinition(String definition) {
					this.definition = definition;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public Long getEncrypt() {
					return this.encrypt;
				}

				public void setEncrypt(Long encrypt) {
					this.encrypt = encrypt;
				}

				public String getPlaintext() {
					return this.plaintext;
				}

				public void setPlaintext(String plaintext) {
					this.plaintext = plaintext;
				}

				public String getComplexity() {
					return this.complexity;
				}

				public void setComplexity(String complexity) {
					this.complexity = complexity;
				}

				public String getStreamType() {
					return this.streamType;
				}

				public void setStreamType(String streamType) {
					this.streamType = streamType;
				}

				public String getRand() {
					return this.rand;
				}

				public void setRand(String rand) {
					this.rand = rand;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}
			}
		}

		public static class Image {

			private String title;

			private String imageId;

			private Long cateId;

			private String cateName;

			private String ext;

			private String creationTime;

			private String modificationTime;

			private String tags;

			private String type;

			private String uRL;

			private String status;

			private String description;

			private String storageLocation;

			private String regionId;

			private String appId;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}
		}

		public static class AttachedMedia {

			private String title;

			private String mediaId;

			private String ext;

			private String creationTime;

			private String modificationTime;

			private String tags;

			private String businessType;

			private String uRL;

			private String status;

			private String description;

			private String storageLocation;

			private String regionId;

			private String appId;

			private String icon;

			private String onlineStatus;

			private List<Category> categories;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getMediaId() {
				return this.mediaId;
			}

			public void setMediaId(String mediaId) {
				this.mediaId = mediaId;
			}

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getBusinessType() {
				return this.businessType;
			}

			public void setBusinessType(String businessType) {
				this.businessType = businessType;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
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

				private Long cateId;

				private String cateName;

				private Long level;

				private Long parentId;

				public Long getCateId() {
					return this.cateId;
				}

				public void setCateId(Long cateId) {
					this.cateId = cateId;
				}

				public String getCateName() {
					return this.cateName;
				}

				public void setCateName(String cateName) {
					this.cateName = cateName;
				}

				public Long getLevel() {
					return this.level;
				}

				public void setLevel(Long level) {
					this.level = level;
				}

				public Long getParentId() {
					return this.parentId;
				}

				public void setParentId(Long parentId) {
					this.parentId = parentId;
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
