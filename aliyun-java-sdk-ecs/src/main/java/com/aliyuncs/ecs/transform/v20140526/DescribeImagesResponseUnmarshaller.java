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

import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DetectionOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DetectionOptions.Item;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DiskDeviceMapping;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Features;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.SecureBootOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagesResponseUnmarshaller {

	public static DescribeImagesResponse unmarshall(DescribeImagesResponse describeImagesResponse, UnmarshallerContext _ctx) {
		
		describeImagesResponse.setRequestId(_ctx.stringValue("DescribeImagesResponse.RequestId"));
		describeImagesResponse.setTotalCount(_ctx.integerValue("DescribeImagesResponse.TotalCount"));
		describeImagesResponse.setPageSize(_ctx.integerValue("DescribeImagesResponse.PageSize"));
		describeImagesResponse.setPageNumber(_ctx.integerValue("DescribeImagesResponse.PageNumber"));
		describeImagesResponse.setRegionId(_ctx.stringValue("DescribeImagesResponse.RegionId"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageOwnerAlias(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setIsSelfShared(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].IsSelfShared"));
			image.setDescription(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Description"));
			image.setResourceGroupId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ResourceGroupId"));
			image.setPlatform(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Platform"));
			image.setSize(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].Size"));
			image.setIsSubscribed(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSubscribed"));
			image.setBootMode(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].BootMode"));
			image.setOSName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSName"));
			image.setLicenseType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].LicenseType"));
			image.setIsPublic(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsPublic"));
			image.setUsable(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].Usable"));
			image.setImageId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setOSNameEn(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSNameEn"));
			image.setLoginAsNonRootSupported(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].LoginAsNonRootSupported"));
			image.setStatus(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Status"));
			image.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Progress"));
			image.setUsage(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Usage"));
			image.setArchitecture(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Architecture"));
			image.setProductCode(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ProductCode"));
			image.setImageOwnerId(_ctx.longValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerId"));
			image.setIsCopied(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsCopied"));
			image.setImageFamily(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageFamily"));
			image.setIsSupportIoOptimized(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportIoOptimized"));
			image.setIsSupportCloudinit(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportCloudinit"));
			image.setImageName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageName"));
			image.setImageVersion(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageVersion"));
			image.setSupplierName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].SupplierName"));
			image.setOSType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSType"));
			image.setCreationTime(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].CreationTime"));

			DetectionOptions detectionOptions = new DetectionOptions();
			detectionOptions.setStatus(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Status"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items.Length"); j++) {
				Item item = new Item();
				item.setRiskCode(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].RiskCode"));
				item.setValue(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].Value"));
				item.setRiskLevel(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].RiskLevel"));
				item.setName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DetectionOptions.Items["+ j +"].Name"));

				items.add(item);
			}
			detectionOptions.setItems(items);
			image.setDetectionOptions(detectionOptions);

			Features features = new Features();
			features.setMemoryOnlineUpgrade(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.MemoryOnlineUpgrade"));
			features.setNvmeSupport(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.NvmeSupport"));
			features.setCpuOnlineDowngrade(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.CpuOnlineDowngrade"));
			features.setImdsSupport(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.ImdsSupport"));
			features.setCpuOnlineUpgrade(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.CpuOnlineUpgrade"));
			features.setMemoryOnlineDowngrade(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Features.MemoryOnlineDowngrade"));
			image.setFeatures(features);

			SecureBootOptions secureBootOptions = new SecureBootOptions();
			secureBootOptions.setSecureBootSupport(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].SecureBootOptions.SecureBootSupport"));
			image.setSecureBootOptions(secureBootOptions);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			image.setTags(tags);

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setSnapshotId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].SnapshotId"));
				diskDeviceMapping.setType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Type"));
				diskDeviceMapping.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Progress"));
				diskDeviceMapping.setFormat(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Format"));
				diskDeviceMapping.setDevice(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Device"));
				diskDeviceMapping.setSize(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Size"));
				diskDeviceMapping.setEncrypted(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Encrypted"));
				diskDeviceMapping.setImportOSSBucket(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSBucket"));
				diskDeviceMapping.setImportOSSObject(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSObject"));
				diskDeviceMapping.setRemainTime(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].RemainTime"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			images.add(image);
		}
		describeImagesResponse.setImages(images);
	 
	 	return describeImagesResponse;
	}
}