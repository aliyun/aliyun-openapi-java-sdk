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
import com.aliyuncs.vod.transform.v20170321.GetVideoInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVideoInfosResponse extends AcsResponse {

	private String requestId;

	private List<Video> videoList;

	private List<String> nonExistVideoIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Video> getVideoList() {
		return this.videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

	public List<String> getNonExistVideoIds() {
		return this.nonExistVideoIds;
	}

	public void setNonExistVideoIds(List<String> nonExistVideoIds) {
		this.nonExistVideoIds = nonExistVideoIds;
	}

	public static class Video {

		private String storageLocation;

		private String creationTime;

		private String status;

		private Long cateId;

		private String videoId;

		private String downloadSwitch;

		private String tags;

		private String modificationTime;

		private String regionId;

		private String customMediaInfo;

		private String cateName;

		private String description;

		private String preprocessStatus;

		private String appId;

		private Long size;

		private String coverURL;

		private String templateGroupId;

		private Float duration;

		private String title;

		private List<Thumbnail> thumbnailList;

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

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
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

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
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

		public List<Thumbnail> getThumbnailList() {
			return this.thumbnailList;
		}

		public void setThumbnailList(List<Thumbnail> thumbnailList) {
			this.thumbnailList = thumbnailList;
		}

		public List<String> getSnapshots() {
			return this.snapshots;
		}

		public void setSnapshots(List<String> snapshots) {
			this.snapshots = snapshots;
		}

		public static class Thumbnail {

			private String uRL;

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}
		}
	}

	@Override
	public GetVideoInfosResponse getInstance(UnmarshallerContext context) {
		return	GetVideoInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
