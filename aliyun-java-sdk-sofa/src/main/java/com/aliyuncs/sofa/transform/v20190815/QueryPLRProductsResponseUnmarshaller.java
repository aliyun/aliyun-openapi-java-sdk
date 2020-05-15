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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryPLRProductsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryPLRProductsResponse.ProductsItem;
import com.aliyuncs.sofa.model.v20190815.QueryPLRProductsResponse.ProductsetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPLRProductsResponseUnmarshaller {

	public static QueryPLRProductsResponse unmarshall(QueryPLRProductsResponse queryPLRProductsResponse, UnmarshallerContext _ctx) {
		
		queryPLRProductsResponse.setRequestId(_ctx.stringValue("QueryPLRProductsResponse.RequestId"));
		queryPLRProductsResponse.setResultCode(_ctx.stringValue("QueryPLRProductsResponse.ResultCode"));
		queryPLRProductsResponse.setResultMessage(_ctx.stringValue("QueryPLRProductsResponse.ResultMessage"));

		List<ProductsItem> products = new ArrayList<ProductsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPLRProductsResponse.Products.Length"); i++) {
			ProductsItem productsItem = new ProductsItem();
			productsItem.setCapabilityInfo(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].CapabilityInfo"));
			productsItem.setCategory(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].Category"));
			productsItem.setCommodityCode(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].CommodityCode"));
			productsItem.setDescription(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].Description"));
			productsItem.setDocLink(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].DocLink"));
			productsItem.setEnabled(_ctx.booleanValue("QueryPLRProductsResponse.Products["+ i +"].Enabled"));
			productsItem.setIsHot(_ctx.booleanValue("QueryPLRProductsResponse.Products["+ i +"].IsHot"));
			productsItem.setMeritInfo(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].MeritInfo"));
			productsItem.setName(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].Name"));
			productsItem.setPayment(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].Payment"));
			productsItem.setServiceCode(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].ServiceCode"));

			List<String> dependents = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryPLRProductsResponse.Products["+ i +"].Dependents.Length"); j++) {
				dependents.add(_ctx.stringValue("QueryPLRProductsResponse.Products["+ i +"].Dependents["+ j +"]"));
			}
			productsItem.setDependents(dependents);

			products.add(productsItem);
		}
		queryPLRProductsResponse.setProducts(products);

		List<ProductsetsItem> productsets = new ArrayList<ProductsetsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPLRProductsResponse.Productsets.Length"); i++) {
			ProductsetsItem productsetsItem = new ProductsetsItem();
			productsetsItem.setDescription(_ctx.stringValue("QueryPLRProductsResponse.Productsets["+ i +"].Description"));
			productsetsItem.setHasDiscount(_ctx.booleanValue("QueryPLRProductsResponse.Productsets["+ i +"].HasDiscount"));
			productsetsItem.setName(_ctx.stringValue("QueryPLRProductsResponse.Productsets["+ i +"].Name"));
			productsetsItem.setPayment(_ctx.stringValue("QueryPLRProductsResponse.Productsets["+ i +"].Payment"));
			productsetsItem.setPlanCode(_ctx.stringValue("QueryPLRProductsResponse.Productsets["+ i +"].PlanCode"));

			List<String> containingProducts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryPLRProductsResponse.Productsets["+ i +"].ContainingProducts.Length"); j++) {
				containingProducts.add(_ctx.stringValue("QueryPLRProductsResponse.Productsets["+ i +"].ContainingProducts["+ j +"]"));
			}
			productsetsItem.setContainingProducts(containingProducts);

			productsets.add(productsetsItem);
		}
		queryPLRProductsResponse.setProductsets(productsets);
	 
	 	return queryPLRProductsResponse;
	}
}