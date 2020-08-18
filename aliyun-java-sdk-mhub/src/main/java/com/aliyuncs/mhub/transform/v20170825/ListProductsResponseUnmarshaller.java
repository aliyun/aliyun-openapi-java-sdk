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

package com.aliyuncs.mhub.transform.v20170825;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mhub.model.v20170825.ListProductsResponse;
import com.aliyuncs.mhub.model.v20170825.ListProductsResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductsResponseUnmarshaller {

	public static ListProductsResponse unmarshall(ListProductsResponse listProductsResponse, UnmarshallerContext _ctx) {
		
		listProductsResponse.setRequestId(_ctx.stringValue("ListProductsResponse.RequestId"));
		listProductsResponse.setTotal(_ctx.integerValue("ListProductsResponse.Total"));
		listProductsResponse.setUbsmsStatus(_ctx.stringValue("ListProductsResponse.UbsmsStatus"));

		List<ProductInfo> productInfos = new ArrayList<ProductInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.ProductInfos.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductId(_ctx.stringValue("ListProductsResponse.ProductInfos["+ i +"].ProductId"));
			productInfo.setName(_ctx.stringValue("ListProductsResponse.ProductInfos["+ i +"].Name"));
			productInfo.setEncodedIcon(_ctx.stringValue("ListProductsResponse.ProductInfos["+ i +"].EncodedIcon"));
			productInfo.setPlatforms(_ctx.stringValue("ListProductsResponse.ProductInfos["+ i +"].Platforms"));
			productInfo.setReadonly(_ctx.booleanValue("ListProductsResponse.ProductInfos["+ i +"].Readonly"));
			productInfo.setIndustryId(_ctx.integerValue("ListProductsResponse.ProductInfos["+ i +"].IndustryId"));

			productInfos.add(productInfo);
		}
		listProductsResponse.setProductInfos(productInfos);
	 
	 	return listProductsResponse;
	}
}