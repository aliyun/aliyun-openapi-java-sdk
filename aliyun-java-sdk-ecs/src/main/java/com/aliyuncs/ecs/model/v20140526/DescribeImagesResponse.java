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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImagesResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Image> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public static class Image {

		private String progress;

		private String imageId;

		private String imageName;

		private String imageVersion;

		private String description;

		private Integer size;

		private String imageOwnerAlias;

		private Boolean isSupportIoOptimized;

		private Boolean isSupportCloudinit;

		private String oSName;

		private String oSNameEn;

		private String architecture;

		private String status;

		private String productCode;

		private Boolean isSubscribed;

		private String creationTime;

		private String isSelfShared;

		private String oSType;

		private String platform;

		private String usage;

		private Boolean isCopied;

		private String resourceGroupId;

		private List<DiskDeviceMapping> diskDeviceMappings;

		private List<Tag> tags;

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public Boolean getIsSupportIoOptimized() {
			return this.isSupportIoOptimized;
		}

		public void setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
			this.isSupportIoOptimized = isSupportIoOptimized;
		}

		public Boolean getIsSupportCloudinit() {
			return this.isSupportCloudinit;
		}

		public void setIsSupportCloudinit(Boolean isSupportCloudinit) {
			this.isSupportCloudinit = isSupportCloudinit;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getOSNameEn() {
			return this.oSNameEn;
		}

		public void setOSNameEn(String oSNameEn) {
			this.oSNameEn = oSNameEn;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Boolean getIsSubscribed() {
			return this.isSubscribed;
		}

		public void setIsSubscribed(Boolean isSubscribed) {
			this.isSubscribed = isSubscribed;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getIsSelfShared() {
			return this.isSelfShared;
		}

		public void setIsSelfShared(String isSelfShared) {
			this.isSelfShared = isSelfShared;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public Boolean getIsCopied() {
			return this.isCopied;
		}

		public void setIsCopied(Boolean isCopied) {
			this.isCopied = isCopied;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<DiskDeviceMapping> getDiskDeviceMappings() {
			return this.diskDeviceMappings;
		}

		public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
			this.diskDeviceMappings = diskDeviceMappings;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class DiskDeviceMapping {

			private String snapshotId;

			private String size;

			private String device;

			private String type;

			private String format;

			private String importOSSBucket;

			private String importOSSObject;

			private String progress;

			private Integer remainTime;

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getImportOSSBucket() {
				return this.importOSSBucket;
			}

			public void setImportOSSBucket(String importOSSBucket) {
				this.importOSSBucket = importOSSBucket;
			}

			public String getImportOSSObject() {
				return this.importOSSObject;
			}

			public void setImportOSSObject(String importOSSObject) {
				this.importOSSObject = importOSSObject;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}

			public Integer getRemainTime() {
				return this.remainTime;
			}

			public void setRemainTime(Integer remainTime) {
				this.remainTime = remainTime;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeImagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
