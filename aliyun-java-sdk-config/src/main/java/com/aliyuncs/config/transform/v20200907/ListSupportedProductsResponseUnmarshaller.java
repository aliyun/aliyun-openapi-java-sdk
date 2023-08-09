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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListSupportedProductsResponse;
import com.aliyuncs.config.model.v20200907.ListSupportedProductsResponse.Data;
import com.aliyuncs.config.model.v20200907.ListSupportedProductsResponse.Data.ResourceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupportedProductsResponseUnmarshaller {

	public static ListSupportedProductsResponse unmarshall(ListSupportedProductsResponse listSupportedProductsResponse, UnmarshallerContext _ctx) {
		
		listSupportedProductsResponse.setRequestId(_ctx.stringValue("ListSupportedProductsResponse.RequestId"));
		listSupportedProductsResponse.setNextToken(_ctx.stringValue("ListSupportedProductsResponse.NextToken"));
		listSupportedProductsResponse.setMaxResults(_ctx.stringValue("ListSupportedProductsResponse.MaxResults"));

		List<Data> products = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListSupportedProductsResponse.Products.Length"); i++) {
			Data data = new Data();
			data.setProductNameEn(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ProductNameEn"));
			data.setProductNameZh(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ProductNameZh"));
			data.setProductCode(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ProductCode"));

			List<ResourceType> resourceTypeList = new ArrayList<ResourceType>();
			for (int j = 0; j < _ctx.lengthValue("ListSupportedProductsResponse.Products["+ i +"].ResourceTypeList.Length"); j++) {
				ResourceType resourceType = new ResourceType();
				resourceType.setResourceType(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ResourceTypeList["+ j +"].ResourceType"));
				resourceType.setTypeNameEn(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ResourceTypeList["+ j +"].TypeNameEn"));
				resourceType.setTypeNameZh(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ResourceTypeList["+ j +"].TypeNameZh"));
				resourceType.setTypePageLink(_ctx.stringValue("ListSupportedProductsResponse.Products["+ i +"].ResourceTypeList["+ j +"].TypePageLink"));

				resourceTypeList.add(resourceType);
			}
			data.setResourceTypeList(resourceTypeList);

			products.add(data);
		}
		listSupportedProductsResponse.setProducts(products);
	 
	 	return listSupportedProductsResponse;
	}
}