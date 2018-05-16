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

import com.aliyuncs.market_inner.model.v20160801.InnerQueryPurchaseImagesResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryPurchaseImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryPurchaseImagesResponseUnmarshaller {

	public static InnerQueryPurchaseImagesResponse unmarshall(InnerQueryPurchaseImagesResponse innerQueryPurchaseImagesResponse, UnmarshallerContext context) {
		
		innerQueryPurchaseImagesResponse.setRequestId(context.stringValue("InnerQueryPurchaseImagesResponse.RequestId"));
		innerQueryPurchaseImagesResponse.setTotalCount(context.integerValue("InnerQueryPurchaseImagesResponse.TotalCount"));

		List<Image> imageList = new ArrayList<Image>();
		for (int i = 0; i < context.lengthValue("InnerQueryPurchaseImagesResponse.ImageList.Length"); i++) {
			Image image = new Image();
			image.setRequestImageId(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].RequestImageId"));
			image.setChargeType(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].ChargeType"));
			image.setProductCode(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].ProductCode"));
			image.setProductSKUCode(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].ProductSKUCode"));
			image.setImageId(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].ImageId"));
			image.setImageVersion(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].ImageVersion"));
			image.setImageStatus(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].ImageStatus"));
			image.setRegionId(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].RegionId"));
			image.setSupplierId(context.longValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].SupplierId"));
			image.setSupplierName(context.stringValue("InnerQueryPurchaseImagesResponse.ImageList["+ i +"].SupplierName"));

			imageList.add(image);
		}
		innerQueryPurchaseImagesResponse.setImageList(imageList);
	 
	 	return innerQueryPurchaseImagesResponse;
	}
}