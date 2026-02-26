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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCImageListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCImageListResponse.Image;
import com.aliyuncs.rds.model.v20140815.DescribeRCImageListResponse.Image.DiskDeviceMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCImageListResponseUnmarshaller {

	public static DescribeRCImageListResponse unmarshall(DescribeRCImageListResponse describeRCImageListResponse, UnmarshallerContext _ctx) {
		
		describeRCImageListResponse.setRequestId(_ctx.stringValue("DescribeRCImageListResponse.RequestId"));
		describeRCImageListResponse.setTotalCount(_ctx.integerValue("DescribeRCImageListResponse.TotalCount"));
		describeRCImageListResponse.setPageNumber(_ctx.integerValue("DescribeRCImageListResponse.PageNumber"));
		describeRCImageListResponse.setPageSize(_ctx.integerValue("DescribeRCImageListResponse.PageSize"));
		describeRCImageListResponse.setRegionId(_ctx.stringValue("DescribeRCImageListResponse.RegionId"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCImageListResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setArchitecture(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].Architecture"));
			image.setCreationTime(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].CreationTime"));
			image.setDescription(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].Description"));
			image.setImageId(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].ImageId"));
			image.setImageName(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].ImageName"));
			image.setImageVersion(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].ImageVersion"));
			image.setIsPublic(_ctx.booleanValue("DescribeRCImageListResponse.Images["+ i +"].IsPublic"));
			image.setOSName(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].OSName"));
			image.setOSNameEn(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].OSNameEn"));
			image.setOSType(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].OSType"));
			image.setSize(_ctx.longValue("DescribeRCImageListResponse.Images["+ i +"].Size"));
			image.setStatus(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].Status"));
			image.setUsage(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].Usage"));
			image.setIsSupportRdsCustom(_ctx.booleanValue("DescribeRCImageListResponse.Images["+ i +"].IsSupportRdsCustom"));
			image.setPlatform(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].Platform"));

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCImageListResponse.Images["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setType(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Type"));
				diskDeviceMapping.setDevice(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Device"));
				diskDeviceMapping.setSize(_ctx.stringValue("DescribeRCImageListResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Size"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			images.add(image);
		}
		describeRCImageListResponse.setImages(images);
	 
	 	return describeRCImageListResponse;
	}
}