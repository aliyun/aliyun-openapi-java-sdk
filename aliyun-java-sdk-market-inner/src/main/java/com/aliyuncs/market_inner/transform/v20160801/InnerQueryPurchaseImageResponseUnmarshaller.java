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

import com.aliyuncs.market_inner.model.v20160801.InnerQueryPurchaseImageResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryPurchaseImageResponse.Image;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryPurchaseImageResponse.Image.DiskDeviceMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryPurchaseImageResponseUnmarshaller {

	public static InnerQueryPurchaseImageResponse unmarshall(InnerQueryPurchaseImageResponse innerQueryPurchaseImageResponse, UnmarshallerContext context) {
		

		Image image = new Image();
		image.setProductCode(context.stringValue("InnerQueryPurchaseImageResponse.Image.ProductCode"));
		image.setProductSKUCode(context.stringValue("InnerQueryPurchaseImageResponse.Image.ProductSKUCode"));
		image.setImageId(context.stringValue("InnerQueryPurchaseImageResponse.Image.ImageId"));
		image.setImageVersion(context.stringValue("InnerQueryPurchaseImageResponse.Image.ImageVersion"));
		image.setRegionId(context.stringValue("InnerQueryPurchaseImageResponse.Image.RegionId"));
		image.setSupplierId(context.longValue("InnerQueryPurchaseImageResponse.Image.SupplierId"));
		image.setSupplierName(context.stringValue("InnerQueryPurchaseImageResponse.Image.SupplierName"));

		List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
		for (int i = 0; i < context.lengthValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings.Length"); i++) {
			DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
			diskDeviceMapping.setDiskType(context.stringValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].DiskType"));
			diskDeviceMapping.setFormat(context.stringValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].Format"));
			diskDeviceMapping.setSnapshotId(context.stringValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].SnapshotId"));
			diskDeviceMapping.setSize(context.integerValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].Size"));
			diskDeviceMapping.setDevice(context.stringValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].Device"));
			diskDeviceMapping.setImportOSSBucket(context.stringValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].ImportOSSBucket"));
			diskDeviceMapping.setImportOSSObject(context.stringValue("InnerQueryPurchaseImageResponse.Image.DiskDeviceMappings["+ i +"].ImportOSSObject"));

			diskDeviceMappings.add(diskDeviceMapping);
		}
		image.setDiskDeviceMappings(diskDeviceMappings);
		innerQueryPurchaseImageResponse.setImage(image);
	 
	 	return innerQueryPurchaseImageResponse;
	}
}