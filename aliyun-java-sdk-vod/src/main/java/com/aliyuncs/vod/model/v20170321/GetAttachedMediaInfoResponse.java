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
import com.aliyuncs.vod.transform.v20170321.GetAttachedMediaInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAttachedMediaInfoResponse extends AcsResponse {

	private String requestId;

	private List<AttachedMedia> attachedMediaList;

	private List<String> nonExistMediaIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AttachedMedia> getAttachedMediaList() {
		return this.attachedMediaList;
	}

	public void setAttachedMediaList(List<AttachedMedia> attachedMediaList) {
		this.attachedMediaList = attachedMediaList;
	}

	public List<String> getNonExistMediaIds() {
		return this.nonExistMediaIds;
	}

	public void setNonExistMediaIds(List<String> nonExistMediaIds) {
		this.nonExistMediaIds = nonExistMediaIds;
	}

	public static class AttachedMedia {

		private String mediaId;

		private String title;

		private String type;

		private String tags;

		private String uRL;

		private String description;

		private Long fileSize;

		private Long storageLocation;

		private String creationTime;

		private String modificationTime;

		private String appId;

		private String status;

		private String onlineStatus;

		private String icon;

		private String regionId;

		private List<Category> categories;

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getURL() {
			return this.uRL;
		}

		public void setURL(String uRL) {
			this.uRL = uRL;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public Long getStorageLocation() {
			return this.storageLocation;
		}

		public void setStorageLocation(Long storageLocation) {
			this.storageLocation = storageLocation;
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

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOnlineStatus() {
			return this.onlineStatus;
		}

		public void setOnlineStatus(String onlineStatus) {
			this.onlineStatus = onlineStatus;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
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

	@Override
	public GetAttachedMediaInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAttachedMediaInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
