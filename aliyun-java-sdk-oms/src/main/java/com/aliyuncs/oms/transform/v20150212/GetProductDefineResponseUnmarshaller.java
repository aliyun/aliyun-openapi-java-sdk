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

package com.aliyuncs.oms.transform.v20150212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oms.model.v20150212.GetProductDefineResponse;
import com.aliyuncs.oms.model.v20150212.GetProductDefineResponse.Product;
import com.aliyuncs.oms.model.v20150212.GetProductDefineResponse.Product.Type;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductDefineResponseUnmarshaller {

	public static GetProductDefineResponse unmarshall(GetProductDefineResponse getProductDefineResponse, UnmarshallerContext context) {
		
		getProductDefineResponse.setRequestId(context.stringValue("GetProductDefineResponse.RequestId"));
		getProductDefineResponse.setProductName(context.stringValue("GetProductDefineResponse.ProductName"));
		getProductDefineResponse.setDataType(context.stringValue("GetProductDefineResponse.DataType"));
		getProductDefineResponse.setSiteBid(context.stringValue("GetProductDefineResponse.siteBid"));

		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < context.lengthValue("GetProductDefineResponse.ProductList.Length"); i++) {
			Product product = new Product();
			product.setProductName(context.stringValue("GetProductDefineResponse.ProductList["+ i +"].ProductName"));

			List<Type> typeList = new ArrayList<Type>();
			for (int j = 0; j < context.lengthValue("GetProductDefineResponse.ProductList["+ i +"].TypeList.Length"); j++) {
				Type type = new Type();
				type.setDataType(context.stringValue("GetProductDefineResponse.ProductList["+ i +"].TypeList["+ j +"].DataType"));

				List<String> fields = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetProductDefineResponse.ProductList["+ i +"].TypeList["+ j +"].Fields.Length"); k++) {
					fields.add(context.stringValue("GetProductDefineResponse.ProductList["+ i +"].TypeList["+ j +"].Fields["+ k +"]"));
				}
				type.setFields(fields);

				typeList.add(type);
			}
			product.setTypeList(typeList);

			productList.add(product);
		}
		getProductDefineResponse.setProductList(productList);
	 
	 	return getProductDefineResponse;
	}
}