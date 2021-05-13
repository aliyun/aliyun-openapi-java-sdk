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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.ListProductsResponse;
import com.aliyuncs.quotas.model.v20200510.ListProductsResponse.ProductInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductsResponseUnmarshaller {

	public static ListProductsResponse unmarshall(ListProductsResponse listProductsResponse, UnmarshallerContext _ctx) {
		
		listProductsResponse.setRequestId(_ctx.stringValue("ListProductsResponse.RequestId"));
		listProductsResponse.setTotalCount(_ctx.integerValue("ListProductsResponse.TotalCount"));
		listProductsResponse.setNextToken(_ctx.stringValue("ListProductsResponse.NextToken"));
		listProductsResponse.setMaxResults(_ctx.integerValue("ListProductsResponse.MaxResults"));

		List<ProductInfos> productInfo = new ArrayList<ProductInfos>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.ProductInfo.Length"); i++) {
			ProductInfos productInfos = new ProductInfos();
			productInfos.setSecondCategoryNameEn(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].SecondCategoryNameEn"));
			productInfos.setDynamic(_ctx.booleanValue("ListProductsResponse.ProductInfo["+ i +"].Dynamic"));
			productInfos.setCommonQuotaSupport(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].CommonQuotaSupport"));
			productInfos.setProductName(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].ProductName"));
			productInfos.setProductCode(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].ProductCode"));
			productInfos.setSecondCategoryName(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].SecondCategoryName"));
			productInfos.setFlowControlSupport(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].FlowControlSupport"));
			productInfos.setSecondCategoryId(_ctx.longValue("ListProductsResponse.ProductInfo["+ i +"].SecondCategoryId"));
			productInfos.setProductNameEn(_ctx.stringValue("ListProductsResponse.ProductInfo["+ i +"].ProductNameEn"));

			productInfo.add(productInfos);
		}
		listProductsResponse.setProductInfo(productInfo);
	 
	 	return listProductsResponse;
	}
}