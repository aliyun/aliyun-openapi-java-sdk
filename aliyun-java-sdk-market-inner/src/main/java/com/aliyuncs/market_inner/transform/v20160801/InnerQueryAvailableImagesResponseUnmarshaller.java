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

package com.aliyuncs.market_inner.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market_inner.model.v20160801.InnerQueryAvailableImagesResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryAvailableImagesResponse.Image;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryAvailableImagesResponse.Image.DiskDeviceMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryAvailableImagesResponseUnmarshaller {

	public static InnerQueryAvailableImagesResponse unmarshall(InnerQueryAvailableImagesResponse innerQueryAvailableImagesResponse, UnmarshallerContext context) {
		
		innerQueryAvailableImagesResponse.setRequestId(context.stringValue("InnerQueryAvailableImagesResponse.RequestId"));
		innerQueryAvailableImagesResponse.setPageNumber(context.integerValue("InnerQueryAvailableImagesResponse.PageNumber"));
		innerQueryAvailableImagesResponse.setPageSize(context.integerValue("InnerQueryAvailableImagesResponse.PageSize"));
		innerQueryAvailableImagesResponse.setTotalCount(context.integerValue("InnerQueryAvailableImagesResponse.TotalCount"));

		List<Image> imageList = new ArrayList<Image>();
		for (int i = 0; i < context.lengthValue("InnerQueryAvailableImagesResponse.ImageList.Length"); i++) {
			Image image = new Image();
			image.setImageId(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ImageId"));
			image.setImageSize(context.integerValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ImageSize"));
			image.setSupplierId(context.longValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].SupplierId"));
			image.setSnapshotId(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].SnapshotId"));
			image.setDevice(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].Device"));
			image.setProductCode(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ProductCode"));
			image.setProductSkuCode(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ProductSkuCode"));
			image.setImageVersion(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ImageVersion"));
			image.setRegionId(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].RegionId"));
			image.setImageName(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ImageName"));
			image.setSupplierName(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].SupplierName"));
			image.setOsName(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].OsName"));
			image.setArchitecture(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].Architecture"));
			image.setDescription(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].Description"));
			image.setImageOwnerAlias(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].ImageOwnerAlias"));
			image.setIsSubscribed(context.booleanValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].IsSubscribed"));
			image.setGmtCreated(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].GmtCreated"));
			image.setSupportIoOptimized(context.booleanValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].SupportIoOptimized"));
			image.setVmType(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].VmType"));

			List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
			for (int j = 0; j < context.lengthValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings.Length"); j++) {
				DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
				diskDeviceMapping.setDiskType(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].DiskType"));
				diskDeviceMapping.setFormat(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].Format"));
				diskDeviceMapping.setSnapshotId(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].SnapshotId"));
				diskDeviceMapping.setSize(context.integerValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].Size"));
				diskDeviceMapping.setDevice(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].Device"));
				diskDeviceMapping.setImportOSSBucket(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSBucket"));
				diskDeviceMapping.setImportOSSObject(context.stringValue("InnerQueryAvailableImagesResponse.ImageList["+ i +"].DiskDeviceMappings["+ j +"].ImportOSSObject"));

				diskDeviceMappings.add(diskDeviceMapping);
			}
			image.setDiskDeviceMappings(diskDeviceMappings);

			imageList.add(image);
		}
		innerQueryAvailableImagesResponse.setImageList(imageList);
	 
	 	return innerQueryAvailableImagesResponse;
	}
}