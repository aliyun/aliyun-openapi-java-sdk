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
import com.aliyuncs.ecs.transform.v20140526.DescribeImageFromFamilyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageFromFamilyResponse extends AcsResponse {

	private String requestId;

	private Image image;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public static class Image {

		private String creationTime;

		private String status;

		private String imageFamily;

		private String progress;

		private Boolean isCopied;

		private Boolean isSupportIoOptimized;

		private String imageOwnerAlias;

		private Boolean isSupportCloudinit;

		private String imageVersion;

		private String usage;

		private String isSelfShared;

		private String description;

		private Integer size;

		private String platform;

		private String imageName;

		private String oSName;

		private String imageId;

		private String oSType;

		private Boolean isSubscribed;

		private String productCode;

		private String architecture;

		private List<DiskDeviceMapping> diskDeviceMappings;

		private List<Tag> tags;

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

		public String getImageFamily() {
			return this.imageFamily;
		}

		public void setImageFamily(String imageFamily) {
			this.imageFamily = imageFamily;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public Boolean getIsCopied() {
			return this.isCopied;
		}

		public void setIsCopied(Boolean isCopied) {
			this.isCopied = isCopied;
		}

		public Boolean getIsSupportIoOptimized() {
			return this.isSupportIoOptimized;
		}

		public void setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
			this.isSupportIoOptimized = isSupportIoOptimized;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public Boolean getIsSupportCloudinit() {
			return this.isSupportCloudinit;
		}

		public void setIsSupportCloudinit(Boolean isSupportCloudinit) {
			this.isSupportCloudinit = isSupportCloudinit;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public String getIsSelfShared() {
			return this.isSelfShared;
		}

		public void setIsSelfShared(String isSelfShared) {
			this.isSelfShared = isSelfShared;
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

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public Boolean getIsSubscribed() {
			return this.isSubscribed;
		}

		public void setIsSubscribed(Boolean isSubscribed) {
			this.isSubscribed = isSubscribed;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
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

			private String type;

			private String importOSSBucket;

			private String snapshotId;

			private String importOSSObject;

			private String size;

			private String device;

			private String format;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getImportOSSBucket() {
				return this.importOSSBucket;
			}

			public void setImportOSSBucket(String importOSSBucket) {
				this.importOSSBucket = importOSSBucket;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getImportOSSObject() {
				return this.importOSSObject;
			}

			public void setImportOSSObject(String importOSSObject) {
				this.importOSSObject = importOSSObject;
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

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}
	}

	@Override
	public DescribeImageFromFamilyResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageFromFamilyResponseUnmarshaller.unmarshall(this, context);
	}
}
