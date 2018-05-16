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

import com.aliyuncs.market_inner.model.v20160801.InnerReviewHistoryImageResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerReviewHistoryImageResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerReviewHistoryImageResponseUnmarshaller {

	public static InnerReviewHistoryImageResponse unmarshall(InnerReviewHistoryImageResponse innerReviewHistoryImageResponse, UnmarshallerContext context) {
		
		innerReviewHistoryImageResponse.setRequestId(context.stringValue("InnerReviewHistoryImageResponse.RequestId"));
		innerReviewHistoryImageResponse.setTotalCount(context.integerValue("InnerReviewHistoryImageResponse.TotalCount"));
		innerReviewHistoryImageResponse.setIsSuccess(context.booleanValue("InnerReviewHistoryImageResponse.IsSuccess"));

		List<Image> imageList = new ArrayList<Image>();
		for (int i = 0; i < context.lengthValue("InnerReviewHistoryImageResponse.ImageList.Length"); i++) {
			Image image = new Image();
			image.setRegionNo(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].RegionNo"));
			image.setProductCode(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].ProductCode"));
			image.setImageNo(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].ImageNo"));
			image.setImageVersion(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].ImageVersion"));
			image.setSupplierId(context.longValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].SupplierId"));
			image.setProductName(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].ProductName"));
			image.setInstanceId(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].InstanceId"));
			image.setInstanceAddress(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].InstanceAddress"));
			image.setOsType(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].OsType"));
			image.setUserName(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].UserName"));
			image.setSupplierName(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].SupplierName"));
			image.setPassword(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].Password"));
			image.setOsKind(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].OsKind"));
			image.setOsBit(context.integerValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].OsBit"));
			image.setInstanceStatus(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].InstanceStatus"));
			image.setImageCreateTime(context.stringValue("InnerReviewHistoryImageResponse.ImageList["+ i +"].ImageCreateTime"));

			imageList.add(image);
		}
		innerReviewHistoryImageResponse.setImageList(imageList);
	 
	 	return innerReviewHistoryImageResponse;
	}
}