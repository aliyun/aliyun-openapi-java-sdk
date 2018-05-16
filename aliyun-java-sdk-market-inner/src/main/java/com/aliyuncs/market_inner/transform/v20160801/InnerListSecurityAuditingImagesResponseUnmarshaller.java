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

import com.aliyuncs.market_inner.model.v20160801.InnerListSecurityAuditingImagesResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerListSecurityAuditingImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListSecurityAuditingImagesResponseUnmarshaller {

	public static InnerListSecurityAuditingImagesResponse unmarshall(InnerListSecurityAuditingImagesResponse innerListSecurityAuditingImagesResponse, UnmarshallerContext context) {
		
		innerListSecurityAuditingImagesResponse.setRequestId(context.stringValue("InnerListSecurityAuditingImagesResponse.RequestId"));
		innerListSecurityAuditingImagesResponse.setTotalCount(context.integerValue("InnerListSecurityAuditingImagesResponse.TotalCount"));

		List<Image> imageList = new ArrayList<Image>();
		for (int i = 0; i < context.lengthValue("InnerListSecurityAuditingImagesResponse.ImageList.Length"); i++) {
			Image image = new Image();
			image.setRegionNo(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].RegionNo"));
			image.setProductCode(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].ProductCode"));
			image.setImageNo(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].ImageNo"));
			image.setImageVersion(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].ImageVersion"));
			image.setSupplierId(context.longValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].SupplierId"));
			image.setProductName(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].ProductName"));
			image.setInstanceId(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].InstanceId"));
			image.setInstanceAddress(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].InstanceAddress"));
			image.setOsType(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].OsType"));
			image.setUserName(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].UserName"));
			image.setSupplierName(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].SupplierName"));
			image.setPassword(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].Password"));
			image.setOsKind(context.stringValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].OsKind"));
			image.setOsBit(context.integerValue("InnerListSecurityAuditingImagesResponse.ImageList["+ i +"].OsBit"));

			imageList.add(image);
		}
		innerListSecurityAuditingImagesResponse.setImageList(imageList);
	 
	 	return innerListSecurityAuditingImagesResponse;
	}
}