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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedProductsResponse;
import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedProductsResponse.ProductsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessKeyLastUsedProductsResponseUnmarshaller {

	public static GetAccessKeyLastUsedProductsResponse unmarshall(GetAccessKeyLastUsedProductsResponse getAccessKeyLastUsedProductsResponse, UnmarshallerContext _ctx) {
		
		getAccessKeyLastUsedProductsResponse.setRequestId(_ctx.stringValue("GetAccessKeyLastUsedProductsResponse.RequestId"));

		List<ProductsItem> products = new ArrayList<ProductsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccessKeyLastUsedProductsResponse.Products.Length"); i++) {
			ProductsItem productsItem = new ProductsItem();
			productsItem.setUsedTimestamp(_ctx.longValue("GetAccessKeyLastUsedProductsResponse.Products["+ i +"].UsedTimestamp"));
			productsItem.setDetail(_ctx.stringValue("GetAccessKeyLastUsedProductsResponse.Products["+ i +"].Detail"));
			productsItem.setSource(_ctx.stringValue("GetAccessKeyLastUsedProductsResponse.Products["+ i +"].Source"));
			productsItem.setServiceName(_ctx.stringValue("GetAccessKeyLastUsedProductsResponse.Products["+ i +"].ServiceName"));
			productsItem.setServiceNameCn(_ctx.stringValue("GetAccessKeyLastUsedProductsResponse.Products["+ i +"].ServiceNameCn"));
			productsItem.setServiceNameEn(_ctx.stringValue("GetAccessKeyLastUsedProductsResponse.Products["+ i +"].ServiceNameEn"));

			products.add(productsItem);
		}
		getAccessKeyLastUsedProductsResponse.setProducts(products);
	 
	 	return getAccessKeyLastUsedProductsResponse;
	}
}