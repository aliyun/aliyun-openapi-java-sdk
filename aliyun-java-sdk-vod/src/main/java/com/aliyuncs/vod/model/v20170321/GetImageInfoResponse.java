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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetImageInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageInfoResponse extends AcsResponse {

	private String requestId;

	private ImageInfo imageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImageInfo getImageInfo() {
		return this.imageInfo;
	}

	public void setImageInfo(ImageInfo imageInfo) {
		this.imageInfo = imageInfo;
	}

	public static class ImageInfo {

		private String imageId;

		private String title;

		private String creationTime;

		private String imageType;

		private String tags;

		private String uRL;

		private Long cateId;

		private String cateName;

		private String description;

		private String storageLocation;

		private String status;

		private String appId;

		private String regionId;

		private String auditStatus;

		private Mezzanine mezzanine;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public Mezzanine getMezzanine() {
			return this.mezzanine;
		}

		public void setMezzanine(Mezzanine mezzanine) {
			this.mezzanine = mezzanine;
		}

		public static class Mezzanine {

			private String originalFileName;

			private String fileSize;

			private Integer width;

			private Integer height;

			private String fileURL;

			public String getOriginalFileName() {
				return this.originalFileName;
			}

			public void setOriginalFileName(String originalFileName) {
				this.originalFileName = originalFileName;
			}

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public String getFileURL() {
				return this.fileURL;
			}

			public void setFileURL(String fileURL) {
				this.fileURL = fileURL;
			}
		}
	}

	@Override
	public GetImageInfoResponse getInstance(UnmarshallerContext context) {
		return	GetImageInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
