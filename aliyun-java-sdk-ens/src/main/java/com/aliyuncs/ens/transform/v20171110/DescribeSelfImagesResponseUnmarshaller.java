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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeSelfImagesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSelfImagesResponse.Image;
import com.aliyuncs.ens.model.v20171110.DescribeSelfImagesResponse.Image.DiskDeviceMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSelfImagesResponseUnmarshaller {

	public static DescribeSelfImagesResponse unmarshall(DescribeSelfImagesResponse describeSelfImagesResponse, UnmarshallerContext _ctx) {
		
		describeSelfImagesResponse.setRequestId(_ctx.stringValue("DescribeSelfImagesResponse.RequestId"));
		describeSelfImagesResponse.setCode(_ctx.integerValue("DescribeSelfImagesResponse.Code"));
		describeSelfImagesResponse.setPageSize(_ctx.stringValue("DescribeSelfImagesResponse.PageSize"));
		describeSelfImagesResponse.setPageNumber(_ctx.stringValue("DescribeSelfImagesResponse.PageNumber"));
		describeSelfImagesResponse.setTotalCount(_ctx.stringValue("DescribeSelfImagesResponse.TotalCount"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSelfImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setArchitecture(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].Architecture"));
			image.setCreationTime(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].CreationTime"));
			image.setImageId(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].ImageId"));
			image.setImageName(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].ImageName"));
			image.setImageOwnerAlias(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setImageSize(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].ImageSize"));
			image.setInstanceId(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].InstanceId"));
			image.setOsVersion(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].OsVersion"));
			image.setPlatform(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].Platform"));
			image.setStatus(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].Status"));
			image.setComputeType(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].ComputeType"));
			image.setSnapshotId(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].SnapshotId"));
			image.setImageStorageSize(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].ImageStorageSize"));
			image.setRegionId(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].RegionId"));

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSelfImagesResponse.Images["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setType(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Type"));
				diskDeviceMapping.setSize(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Size"));
				diskDeviceMapping.setFormat(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].Format"));
				diskDeviceMapping.setImageId(_ctx.stringValue("DescribeSelfImagesResponse.Images["+ i +"].DiskDeviceMappings["+ j +"].imageId"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			images.add(image);
		}
		describeSelfImagesResponse.setImages(images);
	 
	 	return describeSelfImagesResponse;
	}
}