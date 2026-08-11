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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.AdvancedOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImageOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImageOptions.ImageFeatures;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImageOptions.ImageTag;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImportImageOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImportImageOptions.DiskDeviceMapping;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImportImageOptions.DockerOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImportImageOptions.Features;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.ImportImageOptions.ImportImageTag;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagePipelinesResponseUnmarshaller {

	public static DescribeImagePipelinesResponse unmarshall(DescribeImagePipelinesResponse describeImagePipelinesResponse, UnmarshallerContext _ctx) {
		
		describeImagePipelinesResponse.setRequestId(_ctx.stringValue("DescribeImagePipelinesResponse.RequestId"));
		describeImagePipelinesResponse.setTotalCount(_ctx.integerValue("DescribeImagePipelinesResponse.TotalCount"));
		describeImagePipelinesResponse.setNextToken(_ctx.stringValue("DescribeImagePipelinesResponse.NextToken"));
		describeImagePipelinesResponse.setMaxResults(_ctx.integerValue("DescribeImagePipelinesResponse.MaxResults"));

		List<ImagePipelineSet> imagePipeline = new ArrayList<ImagePipelineSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline.Length"); i++) {
			ImagePipelineSet imagePipelineSet = new ImagePipelineSet();
			imagePipelineSet.setNvmeSupport(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].NvmeSupport"));
			imagePipelineSet.setDescription(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Description"));
			imagePipelineSet.setResourceGroupId(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ResourceGroupId"));
			imagePipelineSet.setSystemDiskSize(_ctx.integerValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].SystemDiskSize"));
			imagePipelineSet.setImagePipelineId(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImagePipelineId"));
			imagePipelineSet.setName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Name"));
			imagePipelineSet.setInstanceType(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].InstanceType"));
			imagePipelineSet.setTestContent(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].TestContent"));
			imagePipelineSet.setBaseImage(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].BaseImage"));
			imagePipelineSet.setBaseImageType(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].BaseImageType"));
			imagePipelineSet.setVSwitchId(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].VSwitchId"));
			imagePipelineSet.setImageFamily(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageFamily"));
			imagePipelineSet.setRepairMode(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].RepairMode"));
			imagePipelineSet.setDeleteInstanceOnFailure(_ctx.booleanValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].DeleteInstanceOnFailure"));
			imagePipelineSet.setImageName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageName"));
			imagePipelineSet.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].InternetMaxBandwidthOut"));
			imagePipelineSet.setCreationTime(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].CreationTime"));
			imagePipelineSet.setBuildContent(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].BuildContent"));

			List<String> toRegionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ToRegionIds.Length"); j++) {
				toRegionIds.add(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ToRegionIds["+ j +"]"));
			}
			imagePipelineSet.setToRegionIds(toRegionIds);

			List<String> addAccounts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AddAccounts.Length"); j++) {
				addAccounts.add(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AddAccounts["+ j +"]"));
			}
			imagePipelineSet.setAddAccounts(addAccounts);

			List<String> repairItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].RepairItems.Length"); j++) {
				repairItems.add(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].RepairItems["+ j +"]"));
			}
			imagePipelineSet.setRepairItems(repairItems);

			AdvancedOptions advancedOptions = new AdvancedOptions();
			advancedOptions.setRetainCloudAssistant(_ctx.booleanValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AdvancedOptions.RetainCloudAssistant"));
			advancedOptions.setImageNameSuffix(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AdvancedOptions.ImageNameSuffix"));
			advancedOptions.setSkipCheckImage(_ctx.booleanValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AdvancedOptions.SkipCheckImage"));
			advancedOptions.setSkipBuildImage(_ctx.booleanValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AdvancedOptions.SkipBuildImage"));
			imagePipelineSet.setAdvancedOptions(advancedOptions);

			ImportImageOptions importImageOptions = new ImportImageOptions();
			importImageOptions.setDescription(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.Description"));
			importImageOptions.setArchitecture(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.Architecture"));
			importImageOptions.setPlatform(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.Platform"));
			importImageOptions.setBootMode(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.BootMode"));
			importImageOptions.setLicenseType(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.LicenseType"));
			importImageOptions.setImageName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.ImageName"));
			importImageOptions.setRoleName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.RoleName"));
			importImageOptions.setRetentionStrategy(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.RetentionStrategy"));
			importImageOptions.setOSType(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.OSType"));
			importImageOptions.setRetainImportedImage(_ctx.booleanValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.RetainImportedImage"));

			DockerOptions dockerOptions = new DockerOptions();
			dockerOptions.setImageSize(_ctx.integerValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DockerOptions.ImageSize"));
			dockerOptions.setImage(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DockerOptions.Image"));
			importImageOptions.setDockerOptions(dockerOptions);

			Features features = new Features();
			features.setNvmeSupport(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.Features.NvmeSupport"));
			features.setImdsSupport(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.Features.ImdsSupport"));
			importImageOptions.setFeatures(features);

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setFormat(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DiskDeviceMappings["+ j +"].Format"));
				diskDeviceMapping.setOSSObject(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DiskDeviceMappings["+ j +"].OSSObject"));
				diskDeviceMapping.setDiskImageSize(_ctx.integerValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DiskDeviceMappings["+ j +"].DiskImageSize"));
				diskDeviceMapping.setOSSBucket(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.DiskDeviceMappings["+ j +"].OSSBucket"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			importImageOptions.setDiskDeviceMappings(diskDeviceMappings);

			List<ImportImageTag> importImageTags = new ArrayList<ImportImageTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.ImportImageTags.Length"); j++) {
				ImportImageTag importImageTag = new ImportImageTag();
				importImageTag.setValue(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.ImportImageTags["+ j +"].Value"));
				importImageTag.setKey(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImportImageOptions.ImportImageTags["+ j +"].Key"));

				importImageTags.add(importImageTag);
			}
			importImageOptions.setImportImageTags(importImageTags);
			imagePipelineSet.setImportImageOptions(importImageOptions);

			ImageOptions imageOptions = new ImageOptions();
			imageOptions.setImageName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.ImageName"));
			imageOptions.setDescription(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.Description"));
			imageOptions.setImageFamily(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.ImageFamily"));

			ImageFeatures imageFeatures = new ImageFeatures();
			imageFeatures.setNvmeSupport(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.ImageFeatures.NvmeSupport"));
			imageOptions.setImageFeatures(imageFeatures);

			List<ImageTag> imageTags = new ArrayList<ImageTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.ImageTags.Length"); j++) {
				ImageTag imageTag = new ImageTag();
				imageTag.setTagKey(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.ImageTags["+ j +"].TagKey"));
				imageTag.setTagValue(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageOptions.ImageTags["+ j +"].TagValue"));

				imageTags.add(imageTag);
			}
			imageOptions.setImageTags(imageTags);
			imagePipelineSet.setImageOptions(imageOptions);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			imagePipelineSet.setTags(tags);

			imagePipeline.add(imagePipelineSet);
		}
		describeImagePipelinesResponse.setImagePipeline(imagePipeline);
	 
	 	return describeImagePipelinesResponse;
	}
}