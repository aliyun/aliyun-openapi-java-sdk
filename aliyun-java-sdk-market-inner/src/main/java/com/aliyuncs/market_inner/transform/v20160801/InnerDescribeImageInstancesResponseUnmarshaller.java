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

import com.aliyuncs.market_inner.model.v20160801.InnerDescribeImageInstancesResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerDescribeImageInstancesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeImageInstancesResponseUnmarshaller {

	public static InnerDescribeImageInstancesResponse unmarshall(InnerDescribeImageInstancesResponse innerDescribeImageInstancesResponse, UnmarshallerContext context) {
		
		innerDescribeImageInstancesResponse.setRequestId(context.stringValue("InnerDescribeImageInstancesResponse.RequestId"));
		innerDescribeImageInstancesResponse.setPageNumber(context.integerValue("InnerDescribeImageInstancesResponse.PageNumber"));
		innerDescribeImageInstancesResponse.setPageSize(context.integerValue("InnerDescribeImageInstancesResponse.PageSize"));
		innerDescribeImageInstancesResponse.setTotalCount(context.integerValue("InnerDescribeImageInstancesResponse.TotalCount"));

		List<Image> imageList = new ArrayList<Image>();
		for (int i = 0; i < context.lengthValue("InnerDescribeImageInstancesResponse.ImageList.Length"); i++) {
			Image image = new Image();
			image.setInstanceId(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].InstanceId"));
			image.setOrderId(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].OrderId"));
			image.setSupplierId(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].SupplierId"));
			image.setSupplierName(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].SupplierName"));
			image.setProductCode(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].ProductCode"));
			image.setProductSkuCode(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].ProductSkuCode"));
			image.setProductName(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].ProductName"));
			image.setStatus(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].Status"));
			image.setChargeType(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].ChargeType"));
			image.setBeganOn(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].BeganOn"));
			image.setEndOn(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].EndOn"));
			image.setCreatedOn(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].CreatedOn"));
			image.setRemainTime(context.longValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].RemainTime"));
			image.setRegionNo(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].RegionNo"));
			image.setImageNo(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].ImageNo"));
			image.setImageVersion(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].ImageVersion"));
			image.setEcsInstanceId(context.stringValue("InnerDescribeImageInstancesResponse.ImageList["+ i +"].EcsInstanceId"));

			imageList.add(image);
		}
		innerDescribeImageInstancesResponse.setImageList(imageList);
	 
	 	return innerDescribeImageInstancesResponse;
	}
}