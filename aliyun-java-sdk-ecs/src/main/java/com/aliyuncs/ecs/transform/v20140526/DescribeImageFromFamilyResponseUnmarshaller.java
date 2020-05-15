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

import com.aliyuncs.ecs.model.v20140526.DescribeImageFromFamilyResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImageFromFamilyResponse.Image;
import com.aliyuncs.ecs.model.v20140526.DescribeImageFromFamilyResponse.Image.DiskDeviceMapping;
import com.aliyuncs.ecs.model.v20140526.DescribeImageFromFamilyResponse.Image.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageFromFamilyResponseUnmarshaller {

	public static DescribeImageFromFamilyResponse unmarshall(DescribeImageFromFamilyResponse describeImageFromFamilyResponse, UnmarshallerContext _ctx) {
		
		describeImageFromFamilyResponse.setRequestId(_ctx.stringValue("DescribeImageFromFamilyResponse.RequestId"));

		Image image = new Image();
		image.setProgress(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Progress"));
		image.setImageId(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.ImageId"));
		image.setImageName(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.ImageName"));
		image.setImageFamily(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.ImageFamily"));
		image.setImageVersion(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.ImageVersion"));
		image.setDescription(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Description"));
		image.setSize(_ctx.integerValue("DescribeImageFromFamilyResponse.Image.Size"));
		image.setImageOwnerAlias(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.ImageOwnerAlias"));
		image.setIsSupportIoOptimized(_ctx.booleanValue("DescribeImageFromFamilyResponse.Image.IsSupportIoOptimized"));
		image.setIsSupportCloudinit(_ctx.booleanValue("DescribeImageFromFamilyResponse.Image.IsSupportCloudinit"));
		image.setOSName(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.OSName"));
		image.setArchitecture(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Architecture"));
		image.setStatus(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Status"));
		image.setProductCode(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.ProductCode"));
		image.setIsSubscribed(_ctx.booleanValue("DescribeImageFromFamilyResponse.Image.IsSubscribed"));
		image.setCreationTime(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.CreationTime"));
		image.setIsSelfShared(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.IsSelfShared"));
		image.setOSType(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.OSType"));
		image.setPlatform(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Platform"));
		image.setUsage(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Usage"));
		image.setIsCopied(_ctx.booleanValue("DescribeImageFromFamilyResponse.Image.IsCopied"));

		List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings.Length"); i++) {
			DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
			diskDeviceMapping.setSnapshotId(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].SnapshotId"));
			diskDeviceMapping.setSize(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].Size"));
			diskDeviceMapping.setDevice(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].Device"));
			diskDeviceMapping.setType(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].Type"));
			diskDeviceMapping.setFormat(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].Format"));
			diskDeviceMapping.setImportOSSBucket(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].ImportOSSBucket"));
			diskDeviceMapping.setImportOSSObject(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.DiskDeviceMappings["+ i +"].ImportOSSObject"));

			diskDeviceMappings.add(diskDeviceMapping);
		}
		image.setDiskDeviceMappings(diskDeviceMappings);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageFromFamilyResponse.Image.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeImageFromFamilyResponse.Image.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		image.setTags(tags);
		describeImageFromFamilyResponse.setImage(image);
	 
	 	return describeImageFromFamilyResponse;
	}
}