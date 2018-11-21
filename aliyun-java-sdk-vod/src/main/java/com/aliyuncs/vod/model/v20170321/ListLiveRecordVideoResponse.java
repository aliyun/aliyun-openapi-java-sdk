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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListLiveRecordVideoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveRecordVideoResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<LiveRecordVideo> liveRecordVideoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<LiveRecordVideo> getLiveRecordVideoList() {
		return this.liveRecordVideoList;
	}

	public void setLiveRecordVideoList(List<LiveRecordVideo> liveRecordVideoList) {
		this.liveRecordVideoList = liveRecordVideoList;
	}

	public static class LiveRecordVideo {

		private String streamName;

		private String domainName;

		private String appName;

		private String playlistId;

		private String recordStartTime;

		private String recordEndTime;

		private List<PlayInfo> playInfoList;

		private Video video;

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getPlaylistId() {
			return this.playlistId;
		}

		public void setPlaylistId(String playlistId) {
			this.playlistId = playlistId;
		}

		public String getRecordStartTime() {
			return this.recordStartTime;
		}

		public void setRecordStartTime(String recordStartTime) {
			this.recordStartTime = recordStartTime;
		}

		public String getRecordEndTime() {
			return this.recordEndTime;
		}

		public void setRecordEndTime(String recordEndTime) {
			this.recordEndTime = recordEndTime;
		}

		public List<PlayInfo> getPlayInfoList() {
			return this.playInfoList;
		}

		public void setPlayInfoList(List<PlayInfo> playInfoList) {
			this.playInfoList = playInfoList;
		}

		public Video getVideo() {
			return this.video;
		}

		public void setVideo(Video video) {
			this.video = video;
		}

		public static class PlayInfo {

			private Long width;

			private Long height;

			private Long size;

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

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
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

		public static class Video {

			private String videoId;

			private String title;

			private String tags;

			private String status;

			private Long size;

			private Integer privilege;

			private Float duration;

			private String description;

			private Long customerId;

			private String createTime;

			private String creationTime;

			private String modifyTime;

			private String coverURL;

			private Integer cateId;

			private String cateName;

			private String downloadSwitch;

			private String templateGroupId;

			private List<String> snapshots;

			public String getVideoId() {
				return this.videoId;
			}

			public void setVideoId(String videoId) {
				this.videoId = videoId;
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

			public Integer getPrivilege() {
				return this.privilege;
			}

			public void setPrivilege(Integer privilege) {
				this.privilege = privilege;
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

			public Long getCustomerId() {
				return this.customerId;
			}

			public void setCustomerId(Long customerId) {
				this.customerId = customerId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public Integer getCateId() {
				return this.cateId;
			}

			public void setCateId(Integer cateId) {
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

			public String getTemplateGroupId() {
				return this.templateGroupId;
			}

			public void setTemplateGroupId(String templateGroupId) {
				this.templateGroupId = templateGroupId;
			}

			public List<String> getSnapshots() {
				return this.snapshots;
			}

			public void setSnapshots(List<String> snapshots) {
				this.snapshots = snapshots;
			}
		}
	}

	@Override
	public ListLiveRecordVideoResponse getInstance(UnmarshallerContext context) {
		return	ListLiveRecordVideoResponseUnmarshaller.unmarshall(this, context);
	}
}
