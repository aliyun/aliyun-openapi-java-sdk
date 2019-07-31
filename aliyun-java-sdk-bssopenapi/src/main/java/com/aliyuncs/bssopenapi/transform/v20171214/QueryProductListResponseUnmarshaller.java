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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryProductListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryProductListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryProductListResponse.Data.Product;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductListResponseUnmarshaller {

	public static QueryProductListResponse unmarshall(QueryProductListResponse queryProductListResponse, UnmarshallerContext _ctx) {
		
		queryProductListResponse.setRequestId(_ctx.stringValue("QueryProductListResponse.RequestId"));
		queryProductListResponse.setSuccess(_ctx.booleanValue("QueryProductListResponse.Success"));
		queryProductListResponse.setCode(_ctx.stringValue("QueryProductListResponse.Code"));
		queryProductListResponse.setMessage(_ctx.stringValue("QueryProductListResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QueryProductListResponse.Data.TotalCount"));
		data.setPageNum(_ctx.integerValue("QueryProductListResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryProductListResponse.Data.PageSize"));

		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductListResponse.Data.ProductList.Length"); i++) {
			Product product = new Product();
			product.setProductCode(_ctx.stringValue("QueryProductListResponse.Data.ProductList["+ i +"].ProductCode"));
			product.setProductName(_ctx.stringValue("QueryProductListResponse.Data.ProductList["+ i +"].ProductName"));
			product.setProductType(_ctx.stringValue("QueryProductListResponse.Data.ProductList["+ i +"].ProductType"));
			product.setSubscriptionType(_ctx.stringValue("QueryProductListResponse.Data.ProductList["+ i +"].SubscriptionType"));

			productList.add(product);
		}
		data.setProductList(productList);
		queryProductListResponse.setData(data);
	 
	 	return queryProductListResponse;
	}
}