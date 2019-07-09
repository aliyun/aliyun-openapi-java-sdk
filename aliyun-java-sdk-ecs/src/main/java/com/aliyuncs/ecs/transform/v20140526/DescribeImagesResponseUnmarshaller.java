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
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.DiskDeviceMapping;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse.Image.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagesResponseUnmarshaller {

	public static DescribeImagesResponse unmarshall(DescribeImagesResponse describeImagesResponse, UnmarshallerContext _ctx) {
		
		describeImagesResponse.setRequestId(_ctx.stringValue("DescribeImagesResponse.RequestId"));
		describeImagesResponse.setRegionId(_ctx.stringValue("DescribeImagesResponse.RegionId"));
		describeImagesResponse.setTotalCount(_ctx.integerValue("DescribeImagesResponse.TotalCount"));
		describeImagesResponse.setPageNumber(_ctx.integerValue("DescribeImagesResponse.PageNumber"));
		describeImagesResponse.setPageSize(_ctx.integerValue("DescribeImagesResponse.PageSize"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Progress"));
			image.setImageId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setImageName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageName"));
			image.setImageVersion(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageVersion"));
			image.setDescription(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Description"));
			image.setSize(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].Size"));
			image.setImageOwnerAlias(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setIsSupportIoOptimized(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportIoOptimized"));
			image.setIsSupportCloudinit(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSupportCloudinit"));
			image.setOSName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSName"));
			image.setOSNameEn(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSNameEn"));
			image.setArchitecture(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Architecture"));
			image.setStatus(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Status"));
			image.setProductCode(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ProductCode"));
			image.setIsSubscribed(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsSubscribed"));
			image.setCreationTime(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].CreationTime"));
			image.setIsSelfShared(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].IsSelfShared"));
			image.setOSType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OSType"));
			image.setPlatform(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Platform"));
			image.setUsage(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Usage"));
			image.setIsCopied(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].IsCopied"));
			image.setResourceGroupId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ResourceGroupId"));

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setSnapshotId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].SnapshotId"));
				diskDeviceMapping.setSize(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Size"));
				diskDeviceMapping.setDevice(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Device"));
				diskDeviceMapping.setType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Type"));
				diskDeviceMapping.setFormat(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Format"));
				diskDeviceMapping.setImportOSSBucket(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSBucket"));
				diskDeviceMapping.setImportOSSObject(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSObject"));
				diskDeviceMapping.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Progress"));
				diskDeviceMapping.setRemainTime(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].RemainTime"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			image.setTags(tags);

			images.add(image);
		}
		describeImagesResponse.setImages(images);
	 
	 	return describeImagesResponse;
	}
}