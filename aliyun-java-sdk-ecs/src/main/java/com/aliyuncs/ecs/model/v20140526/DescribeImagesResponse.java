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

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private String regionId;

	private List<Image> images;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public static class Image {

		private String imageOwnerAlias;

		private String isSelfShared;

		private String description;

		private String resourceGroupId;

		private String platform;

		private Integer size;

		private Boolean isSubscribed;

		private String bootMode;

		private String oSName;

		private String licenseType;

		private Boolean isPublic;

		private Boolean usable;

		private String imageId;

		private String oSNameEn;

		private Boolean loginAsNonRootSupported;

		private String status;

		private String progress;

		private String usage;

		private String architecture;

		private String productCode;

		private Long imageOwnerId;

		private Boolean isCopied;

		private String imageFamily;

		private Boolean isSupportIoOptimized;

		private Boolean isSupportCloudinit;

		private String imageName;

		private String imageVersion;

		private String supplierName;

		private String oSType;

		private String creationTime;

		private List<Tag> tags;

		private List<DiskDeviceMapping> diskDeviceMappings;

		private DetectionOptions detectionOptions;

		private Features features;

		private SecureBootOptions secureBootOptions;

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public Boolean getIsSubscribed() {
			return this.isSubscribed;
		}

		public void setIsSubscribed(Boolean isSubscribed) {
			this.isSubscribed = isSubscribed;
		}

		public String getBootMode() {
			return this.bootMode;
		}

		public void setBootMode(String bootMode) {
			this.bootMode = bootMode;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getLicenseType() {
			return this.licenseType;
		}

		public void setLicenseType(String licenseType) {
			this.licenseType = licenseType;
		}

		public Boolean getIsPublic() {
			return this.isPublic;
		}

		public void setIsPublic(Boolean isPublic) {
			this.isPublic = isPublic;
		}

		public Boolean getUsable() {
			return this.usable;
		}

		public void setUsable(Boolean usable) {
			this.usable = usable;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getOSNameEn() {
			return this.oSNameEn;
		}

		public void setOSNameEn(String oSNameEn) {
			this.oSNameEn = oSNameEn;
		}

		public Boolean getLoginAsNonRootSupported() {
			return this.loginAsNonRootSupported;
		}

		public void setLoginAsNonRootSupported(Boolean loginAsNonRootSupported) {
			this.loginAsNonRootSupported = loginAsNonRootSupported;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Long getImageOwnerId() {
			return this.imageOwnerId;
		}

		public void setImageOwnerId(Long imageOwnerId) {
			this.imageOwnerId = imageOwnerId;
		}

		public Boolean getIsCopied() {
			return this.isCopied;
		}

		public void setIsCopied(Boolean isCopied) {
			this.isCopied = isCopied;
		}

		public String getImageFamily() {
			return this.imageFamily;
		}

		public void setImageFamily(String imageFamily) {
			this.imageFamily = imageFamily;
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

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<DiskDeviceMapping> getDiskDeviceMappings() {
			return this.diskDeviceMappings;
		}

		public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
			this.diskDeviceMappings = diskDeviceMappings;
		}

		public DetectionOptions getDetectionOptions() {
			return this.detectionOptions;
		}

		public void setDetectionOptions(DetectionOptions detectionOptions) {
			this.detectionOptions = detectionOptions;
		}

		public Features getFeatures() {
			return this.features;
		}

		public void setFeatures(Features features) {
			this.features = features;
		}

		public SecureBootOptions getSecureBootOptions() {
			return this.secureBootOptions;
		}

		public void setSecureBootOptions(SecureBootOptions secureBootOptions) {
			this.secureBootOptions = secureBootOptions;
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

		public static class DiskDeviceMapping {

			private String snapshotId;

			private String type;

			private String progress;

			private String format;

			private String device;

			private String size;

			private Boolean encrypted;

			private String importOSSBucket;

			private String importOSSObject;

			private Integer remainTime;

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public Boolean getEncrypted() {
				return this.encrypted;
			}

			public void setEncrypted(Boolean encrypted) {
				this.encrypted = encrypted;
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

			public Integer getRemainTime() {
				return this.remainTime;
			}

			public void setRemainTime(Integer remainTime) {
				this.remainTime = remainTime;
			}
		}

		public static class DetectionOptions {

			private String status;

			private List<Item> items;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<Item> getItems() {
				return this.items;
			}

			public void setItems(List<Item> items) {
				this.items = items;
			}

			public static class Item {

				private String riskCode;

				private String value;

				private String riskLevel;

				private String name;

				public String getRiskCode() {
					return this.riskCode;
				}

				public void setRiskCode(String riskCode) {
					this.riskCode = riskCode;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getRiskLevel() {
					return this.riskLevel;
				}

				public void setRiskLevel(String riskLevel) {
					this.riskLevel = riskLevel;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class Features {

			private String memoryOnlineUpgrade;

			private String nvmeSupport;

			private String cpuOnlineDowngrade;

			private String imdsSupport;

			private String cpuOnlineUpgrade;

			private String memoryOnlineDowngrade;

			public String getMemoryOnlineUpgrade() {
				return this.memoryOnlineUpgrade;
			}

			public void setMemoryOnlineUpgrade(String memoryOnlineUpgrade) {
				this.memoryOnlineUpgrade = memoryOnlineUpgrade;
			}

			public String getNvmeSupport() {
				return this.nvmeSupport;
			}

			public void setNvmeSupport(String nvmeSupport) {
				this.nvmeSupport = nvmeSupport;
			}

			public String getCpuOnlineDowngrade() {
				return this.cpuOnlineDowngrade;
			}

			public void setCpuOnlineDowngrade(String cpuOnlineDowngrade) {
				this.cpuOnlineDowngrade = cpuOnlineDowngrade;
			}

			public String getImdsSupport() {
				return this.imdsSupport;
			}

			public void setImdsSupport(String imdsSupport) {
				this.imdsSupport = imdsSupport;
			}

			public String getCpuOnlineUpgrade() {
				return this.cpuOnlineUpgrade;
			}

			public void setCpuOnlineUpgrade(String cpuOnlineUpgrade) {
				this.cpuOnlineUpgrade = cpuOnlineUpgrade;
			}

			public String getMemoryOnlineDowngrade() {
				return this.memoryOnlineDowngrade;
			}

			public void setMemoryOnlineDowngrade(String memoryOnlineDowngrade) {
				this.memoryOnlineDowngrade = memoryOnlineDowngrade;
			}
		}

		public static class SecureBootOptions {

			private String secureBootSupport;

			public String getSecureBootSupport() {
				return this.secureBootSupport;
			}

			public void setSecureBootSupport(String secureBootSupport) {
				this.secureBootSupport = secureBootSupport;
			}
		}
	}

	@Override
	public DescribeImagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
