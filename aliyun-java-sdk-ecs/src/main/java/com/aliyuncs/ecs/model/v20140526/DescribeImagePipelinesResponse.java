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
import com.aliyuncs.ecs.transform.v20140526.DescribeImagePipelinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImagePipelinesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<ImagePipelineSet> imagePipeline;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ImagePipelineSet> getImagePipeline() {
		return this.imagePipeline;
	}

	public void setImagePipeline(List<ImagePipelineSet> imagePipeline) {
		this.imagePipeline = imagePipeline;
	}

	public static class ImagePipelineSet {

		private String creationTime;

		private Boolean deleteInstanceOnFailure;

		private String instanceType;

		private Integer internetMaxBandwidthOut;

		private String imagePipelineId;

		private String vSwitchId;

		private Integer systemDiskSize;

		private String description;

		private String baseImage;

		private String resourceGroupId;

		private String imageName;

		private String baseImageType;

		private String name;

		private String buildContent;

		private String repairMode;

		private String testContent;

		private String imageFamily;

		private String nvmeSupport;

		private List<Tag> tags;

		private List<String> toRegionIds;

		private List<String> addAccounts;

		private ImportImageOptions importImageOptions;

		private AdvancedOptions advancedOptions;

		private ImageOptions imageOptions;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Boolean getDeleteInstanceOnFailure() {
			return this.deleteInstanceOnFailure;
		}

		public void setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
			this.deleteInstanceOnFailure = deleteInstanceOnFailure;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getImagePipelineId() {
			return this.imagePipelineId;
		}

		public void setImagePipelineId(String imagePipelineId) {
			this.imagePipelineId = imagePipelineId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBaseImage() {
			return this.baseImage;
		}

		public void setBaseImage(String baseImage) {
			this.baseImage = baseImage;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getBaseImageType() {
			return this.baseImageType;
		}

		public void setBaseImageType(String baseImageType) {
			this.baseImageType = baseImageType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBuildContent() {
			return this.buildContent;
		}

		public void setBuildContent(String buildContent) {
			this.buildContent = buildContent;
		}

		public String getRepairMode() {
			return this.repairMode;
		}

		public void setRepairMode(String repairMode) {
			this.repairMode = repairMode;
		}

		public String getTestContent() {
			return this.testContent;
		}

		public void setTestContent(String testContent) {
			this.testContent = testContent;
		}

		public String getImageFamily() {
			return this.imageFamily;
		}

		public void setImageFamily(String imageFamily) {
			this.imageFamily = imageFamily;
		}

		public String getNvmeSupport() {
			return this.nvmeSupport;
		}

		public void setNvmeSupport(String nvmeSupport) {
			this.nvmeSupport = nvmeSupport;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getToRegionIds() {
			return this.toRegionIds;
		}

		public void setToRegionIds(List<String> toRegionIds) {
			this.toRegionIds = toRegionIds;
		}

		public List<String> getAddAccounts() {
			return this.addAccounts;
		}

		public void setAddAccounts(List<String> addAccounts) {
			this.addAccounts = addAccounts;
		}

		public ImportImageOptions getImportImageOptions() {
			return this.importImageOptions;
		}

		public void setImportImageOptions(ImportImageOptions importImageOptions) {
			this.importImageOptions = importImageOptions;
		}

		public AdvancedOptions getAdvancedOptions() {
			return this.advancedOptions;
		}

		public void setAdvancedOptions(AdvancedOptions advancedOptions) {
			this.advancedOptions = advancedOptions;
		}

		public ImageOptions getImageOptions() {
			return this.imageOptions;
		}

		public void setImageOptions(ImageOptions imageOptions) {
			this.imageOptions = imageOptions;
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

		public static class ImportImageOptions {

			private String architecture;

			private String oSType;

			private String platform;

			private String bootMode;

			private String licenseType;

			private Boolean retainImportedImage;

			private String retentionStrategy;

			private String imageName;

			private String description;

			private String roleName;

			private List<DiskDeviceMapping> diskDeviceMappings;

			private List<ImportImageTag> importImageTags;

			private Features features;

			public String getArchitecture() {
				return this.architecture;
			}

			public void setArchitecture(String architecture) {
				this.architecture = architecture;
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

			public String getBootMode() {
				return this.bootMode;
			}

			public void setBootMode(String bootMode) {
				this.bootMode = bootMode;
			}

			public String getLicenseType() {
				return this.licenseType;
			}

			public void setLicenseType(String licenseType) {
				this.licenseType = licenseType;
			}

			public Boolean getRetainImportedImage() {
				return this.retainImportedImage;
			}

			public void setRetainImportedImage(Boolean retainImportedImage) {
				this.retainImportedImage = retainImportedImage;
			}

			public String getRetentionStrategy() {
				return this.retentionStrategy;
			}

			public void setRetentionStrategy(String retentionStrategy) {
				this.retentionStrategy = retentionStrategy;
			}

			public String getImageName() {
				return this.imageName;
			}

			public void setImageName(String imageName) {
				this.imageName = imageName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public List<DiskDeviceMapping> getDiskDeviceMappings() {
				return this.diskDeviceMappings;
			}

			public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
				this.diskDeviceMappings = diskDeviceMappings;
			}

			public List<ImportImageTag> getImportImageTags() {
				return this.importImageTags;
			}

			public void setImportImageTags(List<ImportImageTag> importImageTags) {
				this.importImageTags = importImageTags;
			}

			public Features getFeatures() {
				return this.features;
			}

			public void setFeatures(Features features) {
				this.features = features;
			}

			public static class DiskDeviceMapping {

				private String oSSBucket;

				private String oSSObject;

				private String format;

				private Integer diskImageSize;

				public String getOSSBucket() {
					return this.oSSBucket;
				}

				public void setOSSBucket(String oSSBucket) {
					this.oSSBucket = oSSBucket;
				}

				public String getOSSObject() {
					return this.oSSObject;
				}

				public void setOSSObject(String oSSObject) {
					this.oSSObject = oSSObject;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public Integer getDiskImageSize() {
					return this.diskImageSize;
				}

				public void setDiskImageSize(Integer diskImageSize) {
					this.diskImageSize = diskImageSize;
				}
			}

			public static class ImportImageTag {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Features {

				private String nvmeSupport;

				private String imdsSupport;

				public String getNvmeSupport() {
					return this.nvmeSupport;
				}

				public void setNvmeSupport(String nvmeSupport) {
					this.nvmeSupport = nvmeSupport;
				}

				public String getImdsSupport() {
					return this.imdsSupport;
				}

				public void setImdsSupport(String imdsSupport) {
					this.imdsSupport = imdsSupport;
				}
			}
		}

		public static class AdvancedOptions {

			private Boolean retainCloudAssistant;

			private Boolean skipBuildImage;

			private Boolean skipCheckImage;

			private String imageNameSuffix;

			public Boolean getRetainCloudAssistant() {
				return this.retainCloudAssistant;
			}

			public void setRetainCloudAssistant(Boolean retainCloudAssistant) {
				this.retainCloudAssistant = retainCloudAssistant;
			}

			public Boolean getSkipBuildImage() {
				return this.skipBuildImage;
			}

			public void setSkipBuildImage(Boolean skipBuildImage) {
				this.skipBuildImage = skipBuildImage;
			}

			public Boolean getSkipCheckImage() {
				return this.skipCheckImage;
			}

			public void setSkipCheckImage(Boolean skipCheckImage) {
				this.skipCheckImage = skipCheckImage;
			}

			public String getImageNameSuffix() {
				return this.imageNameSuffix;
			}

			public void setImageNameSuffix(String imageNameSuffix) {
				this.imageNameSuffix = imageNameSuffix;
			}
		}

		public static class ImageOptions {

			private String imageName;

			private String imageFamily;

			private String description;

			private List<ImageTag> imageTags;

			private ImageFeatures imageFeatures;

			public String getImageName() {
				return this.imageName;
			}

			public void setImageName(String imageName) {
				this.imageName = imageName;
			}

			public String getImageFamily() {
				return this.imageFamily;
			}

			public void setImageFamily(String imageFamily) {
				this.imageFamily = imageFamily;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<ImageTag> getImageTags() {
				return this.imageTags;
			}

			public void setImageTags(List<ImageTag> imageTags) {
				this.imageTags = imageTags;
			}

			public ImageFeatures getImageFeatures() {
				return this.imageFeatures;
			}

			public void setImageFeatures(ImageFeatures imageFeatures) {
				this.imageFeatures = imageFeatures;
			}

			public static class ImageTag {

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

			public static class ImageFeatures {

				private String nvmeSupport;

				public String getNvmeSupport() {
					return this.nvmeSupport;
				}

				public void setNvmeSupport(String nvmeSupport) {
					this.nvmeSupport = nvmeSupport;
				}
			}
		}
	}

	@Override
	public DescribeImagePipelinesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImagePipelinesResponseUnmarshaller.unmarshall(this, context);
	}
}
