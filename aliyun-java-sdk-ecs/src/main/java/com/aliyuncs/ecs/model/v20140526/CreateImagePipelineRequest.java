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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateImagePipelineRequest extends RpcAcsRequest<CreateImagePipelineResponse> {
	   

	private String baseImageType;

	private Long resourceOwnerId;

	private String resourceGroupId;

	private ImageOptions imageOptions;

	private Integer systemDiskSize;

	private List<Tag> tags;

	private AdvancedOptions advancedOptions;

	private String repairMode;

	private Long ownerId;

	private String vSwitchId;

	private List<Long> addAccounts;

	private Boolean deleteInstanceOnFailure;

	private String name;

	private ImportImageOptions importImageOptions;

	private String testContent;

	private String clientToken;

	private List<String> toRegionIds;

	private Integer internetMaxBandwidthOut;

	private String description;

	private String imageName;

	private String instanceType;

	private String nvmeSupport;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String baseImage;

	private String imageFamily;

	private String buildContent;
	public CreateImagePipelineRequest() {
		super("Ecs", "2014-05-26", "CreateImagePipeline", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBaseImageType() {
		return this.baseImageType;
	}

	public void setBaseImageType(String baseImageType) {
		this.baseImageType = baseImageType;
		if(baseImageType != null){
			putQueryParameter("BaseImageType", baseImageType);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public ImageOptions getImageOptions() {
		return this.imageOptions;
	}

	public void setImageOptions(ImageOptions imageOptions) {
		this.imageOptions = imageOptions;	
		if (imageOptions != null) {
			
				putQueryParameter("ImageOptions.ImageName" , imageOptions.getImageName());
				putQueryParameter("ImageOptions.ImageFamily" , imageOptions.getImageFamily());
				putQueryParameter("ImageOptions.Description" , imageOptions.getDescription());
				if (imageOptions.getImageFeatures() != null) {
					
						putQueryParameter("ImageOptions.ImageFeatures.NvmeSupport" , imageOptions.getImageFeatures().getNvmeSupport());
				}
				if (imageOptions.getImageTags() != null) {
					for (int depth1 = 0; depth1 < imageOptions.getImageTags().size(); depth1++) {
						if (imageOptions.getImageTags().get(depth1) != null) {
							
								putQueryParameter("ImageOptions.ImageTags." + (depth1 + 1) + ".Key" , imageOptions.getImageTags().get(depth1).getKey());
								putQueryParameter("ImageOptions.ImageTags." + (depth1 + 1) + ".Value" , imageOptions.getImageTags().get(depth1).getValue());
						}
					}
				}
		}	
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public AdvancedOptions getAdvancedOptions() {
		return this.advancedOptions;
	}

	public void setAdvancedOptions(AdvancedOptions advancedOptions) {
		this.advancedOptions = advancedOptions;	
		if (advancedOptions != null) {
			
				putQueryParameter("AdvancedOptions.RetainCloudAssistant" , advancedOptions.getRetainCloudAssistant());
				putQueryParameter("AdvancedOptions.SkipBuildImage" , advancedOptions.getSkipBuildImage());
				putQueryParameter("AdvancedOptions.SkipCheckImage" , advancedOptions.getSkipCheckImage());
				putQueryParameter("AdvancedOptions.ImageNameSuffix" , advancedOptions.getImageNameSuffix());
		}	
	}

	public String getRepairMode() {
		return this.repairMode;
	}

	public void setRepairMode(String repairMode) {
		this.repairMode = repairMode;
		if(repairMode != null){
			putQueryParameter("RepairMode", repairMode);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public List<Long> getAddAccounts() {
		return this.addAccounts;
	}

	public void setAddAccounts(List<Long> addAccounts) {
		this.addAccounts = addAccounts;	
		if (addAccounts != null) {
			for (int i = 0; i < addAccounts.size(); i++) {
				putQueryParameter("AddAccount." + (i + 1) , addAccounts.get(i));
			}
		}	
	}

	public Boolean getDeleteInstanceOnFailure() {
		return this.deleteInstanceOnFailure;
	}

	public void setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
		this.deleteInstanceOnFailure = deleteInstanceOnFailure;
		if(deleteInstanceOnFailure != null){
			putQueryParameter("DeleteInstanceOnFailure", deleteInstanceOnFailure.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public ImportImageOptions getImportImageOptions() {
		return this.importImageOptions;
	}

	public void setImportImageOptions(ImportImageOptions importImageOptions) {
		this.importImageOptions = importImageOptions;	
		if (importImageOptions != null) {
			
				putQueryParameter("ImportImageOptions.Architecture" , importImageOptions.getArchitecture());
				putQueryParameter("ImportImageOptions.OSType" , importImageOptions.getOSType());
				putQueryParameter("ImportImageOptions.Platform" , importImageOptions.getPlatform());
				putQueryParameter("ImportImageOptions.BootMode" , importImageOptions.getBootMode());
				putQueryParameter("ImportImageOptions.LicenseType" , importImageOptions.getLicenseType());
				if (importImageOptions.getDiskDeviceMappings() != null) {
					for (int depth1 = 0; depth1 < importImageOptions.getDiskDeviceMappings().size(); depth1++) {
						if (importImageOptions.getDiskDeviceMappings().get(depth1) != null) {
							
								putQueryParameter("ImportImageOptions.DiskDeviceMappings." + (depth1 + 1) + ".OSSBucket" , importImageOptions.getDiskDeviceMappings().get(depth1).getOSSBucket());
								putQueryParameter("ImportImageOptions.DiskDeviceMappings." + (depth1 + 1) + ".OSSObject" , importImageOptions.getDiskDeviceMappings().get(depth1).getOSSObject());
								putQueryParameter("ImportImageOptions.DiskDeviceMappings." + (depth1 + 1) + ".Format" , importImageOptions.getDiskDeviceMappings().get(depth1).getFormat());
								putQueryParameter("ImportImageOptions.DiskDeviceMappings." + (depth1 + 1) + ".DiskImageSize" , importImageOptions.getDiskDeviceMappings().get(depth1).getDiskImageSize());
						}
					}
				}
				if (importImageOptions.getFeatures() != null) {
					
						putQueryParameter("ImportImageOptions.Features.NvmeSupport" , importImageOptions.getFeatures().getNvmeSupport());
						putQueryParameter("ImportImageOptions.Features.ImdsSupport" , importImageOptions.getFeatures().getImdsSupport());
				}
				putQueryParameter("ImportImageOptions.RetainImportedImage" , importImageOptions.getRetainImportedImage());
				putQueryParameter("ImportImageOptions.RetentionStrategy" , importImageOptions.getRetentionStrategy());
				putQueryParameter("ImportImageOptions.ImageName" , importImageOptions.getImageName());
				putQueryParameter("ImportImageOptions.Description" , importImageOptions.getDescription());
				putQueryParameter("ImportImageOptions.RoleName" , importImageOptions.getRoleName());
				if (importImageOptions.getImportImageTags() != null) {
					for (int depth1 = 0; depth1 < importImageOptions.getImportImageTags().size(); depth1++) {
						if (importImageOptions.getImportImageTags().get(depth1) != null) {
							
								putQueryParameter("ImportImageOptions.ImportImageTags." + (depth1 + 1) + ".Key" , importImageOptions.getImportImageTags().get(depth1).getKey());
								putQueryParameter("ImportImageOptions.ImportImageTags." + (depth1 + 1) + ".Value" , importImageOptions.getImportImageTags().get(depth1).getValue());
						}
					}
				}
		}	
	}

	public String getTestContent() {
		return this.testContent;
	}

	public void setTestContent(String testContent) {
		this.testContent = testContent;
		if(testContent != null){
			putQueryParameter("TestContent", testContent);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<String> getToRegionIds() {
		return this.toRegionIds;
	}

	public void setToRegionIds(List<String> toRegionIds) {
		this.toRegionIds = toRegionIds;	
		if (toRegionIds != null) {
			for (int i = 0; i < toRegionIds.size(); i++) {
				putQueryParameter("ToRegionId." + (i + 1) , toRegionIds.get(i));
			}
		}	
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getNvmeSupport() {
		return this.nvmeSupport;
	}

	public void setNvmeSupport(String nvmeSupport) {
		this.nvmeSupport = nvmeSupport;
		if(nvmeSupport != null){
			putQueryParameter("NvmeSupport", nvmeSupport);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getBaseImage() {
		return this.baseImage;
	}

	public void setBaseImage(String baseImage) {
		this.baseImage = baseImage;
		if(baseImage != null){
			putQueryParameter("BaseImage", baseImage);
		}
	}

	public String getImageFamily() {
		return this.imageFamily;
	}

	public void setImageFamily(String imageFamily) {
		this.imageFamily = imageFamily;
		if(imageFamily != null){
			putQueryParameter("ImageFamily", imageFamily);
		}
	}

	public String getBuildContent() {
		return this.buildContent;
	}

	public void setBuildContent(String buildContent) {
		this.buildContent = buildContent;
		if(buildContent != null){
			putQueryParameter("BuildContent", buildContent);
		}
	}

	public static class ImageOptions {

		private String imageName;

		private String imageFamily;

		private String description;

		private ImageFeatures imageFeatures;

		private List<ImageTagsItem> imageTags;

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

		public ImageFeatures getImageFeatures() {
			return this.imageFeatures;
		}

		public void setImageFeatures(ImageFeatures imageFeatures) {
			this.imageFeatures = imageFeatures;
		}

		public List<ImageTagsItem> getImageTags() {
			return this.imageTags;
		}

		public void setImageTags(List<ImageTagsItem> imageTags) {
			this.imageTags = imageTags;
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

		public static class ImageTagsItem {

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
	}

	public static class Tag {

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

	public static class ImportImageOptions {

		private String architecture;

		private String oSType;

		private String platform;

		private String bootMode;

		private String licenseType;

		private List<DiskDeviceMappingsItem> diskDeviceMappings;

		private Features features;

		private Boolean retainImportedImage;

		private String retentionStrategy;

		private String imageName;

		private String description;

		private String roleName;

		private List<ImportImageTagsItem> importImageTags;

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

		public List<DiskDeviceMappingsItem> getDiskDeviceMappings() {
			return this.diskDeviceMappings;
		}

		public void setDiskDeviceMappings(List<DiskDeviceMappingsItem> diskDeviceMappings) {
			this.diskDeviceMappings = diskDeviceMappings;
		}

		public Features getFeatures() {
			return this.features;
		}

		public void setFeatures(Features features) {
			this.features = features;
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

		public List<ImportImageTagsItem> getImportImageTags() {
			return this.importImageTags;
		}

		public void setImportImageTags(List<ImportImageTagsItem> importImageTags) {
			this.importImageTags = importImageTags;
		}

		public static class DiskDeviceMappingsItem {

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

		public static class ImportImageTagsItem {

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
	}

	@Override
	public Class<CreateImagePipelineResponse> getResponseClass() {
		return CreateImagePipelineResponse.class;
	}

}
