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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListProductByTagsResponse;
import com.aliyuncs.iot.model.v20180120.ListProductByTagsResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductByTagsResponseUnmarshaller {

	public static ListProductByTagsResponse unmarshall(ListProductByTagsResponse listProductByTagsResponse, UnmarshallerContext context) {
		
		listProductByTagsResponse.setRequestId(context.stringValue("ListProductByTagsResponse.RequestId"));
		listProductByTagsResponse.setSuccess(context.booleanValue("ListProductByTagsResponse.Success"));
		listProductByTagsResponse.setErrorMessage(context.stringValue("ListProductByTagsResponse.ErrorMessage"));
		listProductByTagsResponse.setCode(context.stringValue("ListProductByTagsResponse.Code"));

		List<ProductInfo> productInfos = new ArrayList<ProductInfo>();
		for (int i = 0; i < context.lengthValue("ListProductByTagsResponse.ProductInfos.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductName(context.stringValue("ListProductByTagsResponse.ProductInfos["+ i +"].ProductName"));
			productInfo.setProductKey(context.stringValue("ListProductByTagsResponse.ProductInfos["+ i +"].ProductKey"));
			productInfo.setCreateTime(context.longValue("ListProductByTagsResponse.ProductInfos["+ i +"].CreateTime"));
			productInfo.setDescription(context.stringValue("ListProductByTagsResponse.ProductInfos["+ i +"].Description"));
			productInfo.setNodeType(context.integerValue("ListProductByTagsResponse.ProductInfos["+ i +"].NodeType"));

			productInfos.add(productInfo);
		}
		listProductByTagsResponse.setProductInfos(productInfos);
	 
	 	return listProductByTagsResponse;
	}
}