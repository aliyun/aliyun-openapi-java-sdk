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
import com.aliyuncs.vod.transform.v20170321.BatchGetMediaInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetMediaInfosResponse extends AcsResponse {

	private String requestId;

	private List<MediaBasicInfo> mediaInfos;

	private List<String> nonExistMediaIds;

	private List<String> forbiddenMediaIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MediaBasicInfo> getMediaInfos() {
		return this.mediaInfos;
	}

	public void setMediaInfos(List<MediaBasicInfo> mediaInfos) {
		this.mediaInfos = mediaInfos;
	}

	public List<String> getNonExistMediaIds() {
		return this.nonExistMediaIds;
	}

	public void setNonExistMediaIds(List<String> nonExistMediaIds) {
		this.nonExistMediaIds = nonExistMediaIds;
	}

	public List<String> getForbiddenMediaIds() {
		return this.forbiddenMediaIds;
	}

	public void setForbiddenMediaIds(List<String> forbiddenMediaIds) {
		this.forbiddenMediaIds = forbiddenMediaIds;
	}

	public static class MediaBasicInfo {

		private String mediaId;

		private MediaInfo mediaInfo;

		private MezzanineInfo mezzanineInfo;

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public MediaInfo getMediaInfo() {
			return this.mediaInfo;
		}

		public void setMediaInfo(MediaInfo mediaInfo) {
			this.mediaInfo = mediaInfo;
		}

		public MezzanineInfo getMezzanineInfo() {
			return this.mezzanineInfo;
		}

		public void setMezzanineInfo(MezzanineInfo mezzanineInfo) {
			this.mezzanineInfo = mezzanineInfo;
		}

		public static class MediaInfo {

			private String storageLocation;

			private String creationTime;

			private String status;

			private Long cateId;

			private String mediaId;

			private String downloadSwitch;

			private String tags;

			private String modificationTime;

			private String regionId;

			private String cateName;

			private String description;

			private String preprocessStatus;

			private String appId;

			private String coverURL;

			private String templateGroupId;

			private String title;

			private String storageClass;

			private String restoreStatus;

			private String restoreExpiration;

			private String userData;

			private List<String> snapshots;

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

			public String getMediaId() {
				return this.mediaId;
			}

			public void setMediaId(String mediaId) {
				this.mediaId = mediaId;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
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

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
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

			public String getTemplateGroupId() {
				return this.templateGroupId;
			}

			public void setTemplateGroupId(String templateGroupId) {
				this.templateGroupId = templateGroupId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getStorageClass() {
				return this.storageClass;
			}

			public void setStorageClass(String storageClass) {
				this.storageClass = storageClass;
			}

			public String getRestoreStatus() {
				return this.restoreStatus;
			}

			public void setRestoreStatus(String restoreStatus) {
				this.restoreStatus = restoreStatus;
			}

			public String getRestoreExpiration() {
				return this.restoreExpiration;
			}

			public void setRestoreExpiration(String restoreExpiration) {
				this.restoreExpiration = restoreExpiration;
			}

			public String getUserData() {
				return this.userData;
			}

			public void setUserData(String userData) {
				this.userData = userData;
			}

			public List<String> getSnapshots() {
				return this.snapshots;
			}

			public void setSnapshots(List<String> snapshots) {
				this.snapshots = snapshots;
			}
		}

		public static class MezzanineInfo {

			private String creationTime;

			private String status;

			private String fileURL;

			private String mediaId;

			private Long height;

			private String bitrate;

			private String fileName;

			private Long width;

			private Long size;

			private String cRC64;

			private String duration;

			private String fps;

			private List<AudioStream> audioStreamList;

			private List<VideoStream> videoStreamList;

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

			public String getFileURL() {
				return this.fileURL;
			}

			public void setFileURL(String fileURL) {
				this.fileURL = fileURL;
			}

			public String getMediaId() {
				return this.mediaId;
			}

			public void setMediaId(String mediaId) {
				this.mediaId = mediaId;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getCRC64() {
				return this.cRC64;
			}

			public void setCRC64(String cRC64) {
				this.cRC64 = cRC64;
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

			public List<AudioStream> getAudioStreamList() {
				return this.audioStreamList;
			}

			public void setAudioStreamList(List<AudioStream> audioStreamList) {
				this.audioStreamList = audioStreamList;
			}

			public List<VideoStream> getVideoStreamList() {
				return this.videoStreamList;
			}

			public void setVideoStreamList(List<VideoStream> videoStreamList) {
				this.videoStreamList = videoStreamList;
			}

			public static class AudioStream {

				private String index;

				private String timebase;

				private String sampleFmt;

				private String sampleRate;

				private String channelLayout;

				private String lang;

				private String codecLongName;

				private String channels;

				private String numFrames;

				private String bitrate;

				private String codecTagString;

				private String startTime;

				private String codecName;

				private String duration;

				private String codecTag;

				private String codecTimeBase;

				public String getIndex() {
					return this.index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getTimebase() {
					return this.timebase;
				}

				public void setTimebase(String timebase) {
					this.timebase = timebase;
				}

				public String getSampleFmt() {
					return this.sampleFmt;
				}

				public void setSampleFmt(String sampleFmt) {
					this.sampleFmt = sampleFmt;
				}

				public String getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(String sampleRate) {
					this.sampleRate = sampleRate;
				}

				public String getChannelLayout() {
					return this.channelLayout;
				}

				public void setChannelLayout(String channelLayout) {
					this.channelLayout = channelLayout;
				}

				public String getLang() {
					return this.lang;
				}

				public void setLang(String lang) {
					this.lang = lang;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getChannels() {
					return this.channels;
				}

				public void setChannels(String channels) {
					this.channels = channels;
				}

				public String getNumFrames() {
					return this.numFrames;
				}

				public void setNumFrames(String numFrames) {
					this.numFrames = numFrames;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}
			}

			public static class VideoStream {

				private String timebase;

				private String index;

				private String avgFPS;

				private String pixFmt;

				private String lang;

				private String sar;

				private String height;

				private String codecLongName;

				private String numFrames;

				private String bitrate;

				private String rotate;

				private String codecTagString;

				private String hasBFrames;

				private String profile;

				private String startTime;

				private String dar;

				private String codecName;

				private String width;

				private String duration;

				private String fps;

				private String codecTag;

				private String codecTimeBase;

				private String level;

				private String hDRType;

				public String getTimebase() {
					return this.timebase;
				}

				public void setTimebase(String timebase) {
					this.timebase = timebase;
				}

				public String getIndex() {
					return this.index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getAvgFPS() {
					return this.avgFPS;
				}

				public void setAvgFPS(String avgFPS) {
					this.avgFPS = avgFPS;
				}

				public String getPixFmt() {
					return this.pixFmt;
				}

				public void setPixFmt(String pixFmt) {
					this.pixFmt = pixFmt;
				}

				public String getLang() {
					return this.lang;
				}

				public void setLang(String lang) {
					this.lang = lang;
				}

				public String getSar() {
					return this.sar;
				}

				public void setSar(String sar) {
					this.sar = sar;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getNumFrames() {
					return this.numFrames;
				}

				public void setNumFrames(String numFrames) {
					this.numFrames = numFrames;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getRotate() {
					return this.rotate;
				}

				public void setRotate(String rotate) {
					this.rotate = rotate;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getHasBFrames() {
					return this.hasBFrames;
				}

				public void setHasBFrames(String hasBFrames) {
					this.hasBFrames = hasBFrames;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getDar() {
					return this.dar;
				}

				public void setDar(String dar) {
					this.dar = dar;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
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

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public String getHDRType() {
					return this.hDRType;
				}

				public void setHDRType(String hDRType) {
					this.hDRType = hDRType;
				}
			}
		}
	}

	@Override
	public BatchGetMediaInfosResponse getInstance(UnmarshallerContext context) {
		return	BatchGetMediaInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
