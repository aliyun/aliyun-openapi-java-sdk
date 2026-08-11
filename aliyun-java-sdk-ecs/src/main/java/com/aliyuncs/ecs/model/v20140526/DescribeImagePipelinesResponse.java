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

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<ImagePipelineSet> imagePipeline;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

		private String nvmeSupport;

		private String description;

		private String resourceGroupId;

		private Integer systemDiskSize;

		private String imagePipelineId;

		private String name;

		private String instanceType;

		private String testContent;

		private String baseImage;

		private String baseImageType;

		private String vSwitchId;

		private String imageFamily;

		private String repairMode;

		private Boolean deleteInstanceOnFailure;

		private String imageName;

		private Integer internetMaxBandwidthOut;

		private String creationTime;

		private String buildContent;

		private List<Tag> tags;

		private List<String> toRegionIds;

		private List<String> addAccounts;

		private List<String> repairItems;

		private AdvancedOptions advancedOptions;

		private ImportImageOptions importImageOptions;

		private ImageOptions imageOptions;

		public String getNvmeSupport() {
			return this.nvmeSupport;
		}

		public void setNvmeSupport(String nvmeSupport) {
			this.nvmeSupport = nvmeSupport;
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

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getImagePipelineId() {
			return this.imagePipelineId;
		}

		public void setImagePipelineId(String imagePipelineId) {
			this.imagePipelineId = imagePipelineId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getTestContent() {
			return this.testContent;
		}

		public void setTestContent(String testContent) {
			this.testContent = testContent;
		}

		public String getBaseImage() {
			return this.baseImage;
		}

		public void setBaseImage(String baseImage) {
			this.baseImage = baseImage;
		}

		public String getBaseImageType() {
			return this.baseImageType;
		}

		public void setBaseImageType(String baseImageType) {
			this.baseImageType = baseImageType;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getImageFamily() {
			return this.imageFamily;
		}

		public void setImageFamily(String imageFamily) {
			this.imageFamily = imageFamily;
		}

		public String getRepairMode() {
			return this.repairMode;
		}

		public void setRepairMode(String repairMode) {
			this.repairMode = repairMode;
		}

		public Boolean getDeleteInstanceOnFailure() {
			return this.deleteInstanceOnFailure;
		}

		public void setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
			this.deleteInstanceOnFailure = deleteInstanceOnFailure;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getBuildContent() {
			return this.buildContent;
		}

		public void setBuildContent(String buildContent) {
			this.buildContent = buildContent;
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

		public List<String> getRepairItems() {
			return this.repairItems;
		}

		public void setRepairItems(List<String> repairItems) {
			this.repairItems = repairItems;
		}

		public AdvancedOptions getAdvancedOptions() {
			return this.advancedOptions;
		}

		public void setAdvancedOptions(AdvancedOptions advancedOptions) {
			this.advancedOptions = advancedOptions;
		}

		public ImportImageOptions getImportImageOptions() {
			return this.importImageOptions;
		}

		public void setImportImageOptions(ImportImageOptions importImageOptions) {
			this.importImageOptions = importImageOptions;
		}

		public ImageOptions getImageOptions() {
			return this.imageOptions;
		}

		public void setImageOptions(ImageOptions imageOptions) {
			this.imageOptions = imageOptions;
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

		public static class AdvancedOptions {

			private Boolean retainCloudAssistant;

			private String imageNameSuffix;

			private Boolean skipCheckImage;

			private Boolean skipBuildImage;

			public Boolean getRetainCloudAssistant() {
				return this.retainCloudAssistant;
			}

			public void setRetainCloudAssistant(Boolean retainCloudAssistant) {
				this.retainCloudAssistant = retainCloudAssistant;
			}

			public String getImageNameSuffix() {
				return this.imageNameSuffix;
			}

			public void setImageNameSuffix(String imageNameSuffix) {
				this.imageNameSuffix = imageNameSuffix;
			}

			public Boolean getSkipCheckImage() {
				return this.skipCheckImage;
			}

			public void setSkipCheckImage(Boolean skipCheckImage) {
				this.skipCheckImage = skipCheckImage;
			}

			public Boolean getSkipBuildImage() {
				return this.skipBuildImage;
			}

			public void setSkipBuildImage(Boolean skipBuildImage) {
				this.skipBuildImage = skipBuildImage;
			}
		}

		public static class ImportImageOptions {

			private String description;

			private String architecture;

			private String platform;

			private String bootMode;

			private String licenseType;

			private String imageName;

			private String roleName;

			private String retentionStrategy;

			private String oSType;

			private Boolean retainImportedImage;

			private List<DiskDeviceMapping> diskDeviceMappings;

			private List<ImportImageTag> importImageTags;

			private DockerOptions dockerOptions;

			private Features features;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getArchitecture() {
				return this.architecture;
			}

			public void setArchitecture(String architecture) {
				this.architecture = architecture;
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

			public String getImageName() {
				return this.imageName;
			}

			public void setImageName(String imageName) {
				this.imageName = imageName;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getRetentionStrategy() {
				return this.retentionStrategy;
			}

			public void setRetentionStrategy(String retentionStrategy) {
				this.retentionStrategy = retentionStrategy;
			}

			public String getOSType() {
				return this.oSType;
			}

			public void setOSType(String oSType) {
				this.oSType = oSType;
			}

			public Boolean getRetainImportedImage() {
				return this.retainImportedImage;
			}

			public void setRetainImportedImage(Boolean retainImportedImage) {
				this.retainImportedImage = retainImportedImage;
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

			public DockerOptions getDockerOptions() {
				return this.dockerOptions;
			}

			public void setDockerOptions(DockerOptions dockerOptions) {
				this.dockerOptions = dockerOptions;
			}

			public Features getFeatures() {
				return this.features;
			}

			public void setFeatures(Features features) {
				this.features = features;
			}

			public static class DiskDeviceMapping {

				private String format;

				private String oSSObject;

				private Integer diskImageSize;

				private String oSSBucket;

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getOSSObject() {
					return this.oSSObject;
				}

				public void setOSSObject(String oSSObject) {
					this.oSSObject = oSSObject;
				}

				public Integer getDiskImageSize() {
					return this.diskImageSize;
				}

				public void setDiskImageSize(Integer diskImageSize) {
					this.diskImageSize = diskImageSize;
				}

				public String getOSSBucket() {
					return this.oSSBucket;
				}

				public void setOSSBucket(String oSSBucket) {
					this.oSSBucket = oSSBucket;
				}
			}

			public static class ImportImageTag {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class DockerOptions {

				private Integer imageSize;

				private String image;

				public Integer getImageSize() {
					return this.imageSize;
				}

				public void setImageSize(Integer imageSize) {
					this.imageSize = imageSize;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
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

		public static class ImageOptions {

			private String imageName;

			private String description;

			private String imageFamily;

			private List<ImageTag> imageTags;

			private ImageFeatures imageFeatures;

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

			public String getImageFamily() {
				return this.imageFamily;
			}

			public void setImageFamily(String imageFamily) {
				this.imageFamily = imageFamily;
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
