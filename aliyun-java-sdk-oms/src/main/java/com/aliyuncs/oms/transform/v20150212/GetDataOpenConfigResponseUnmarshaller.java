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

import com.aliyuncs.oms.model.v20150212.GetDataOpenConfigResponse;
import com.aliyuncs.oms.model.v20150212.GetDataOpenConfigResponse.Product;
import com.aliyuncs.oms.model.v20150212.GetDataOpenConfigResponse.Product.Table;
import com.aliyuncs.oms.model.v20150212.GetDataOpenConfigResponse.Product.Table.DataType;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataOpenConfigResponseUnmarshaller {

	public static GetDataOpenConfigResponse unmarshall(GetDataOpenConfigResponse getDataOpenConfigResponse, UnmarshallerContext context) {
		
		getDataOpenConfigResponse.setRequestId(context.stringValue("GetDataOpenConfigResponse.RequestId"));
		getDataOpenConfigResponse.setProductName(context.stringValue("GetDataOpenConfigResponse.ProductName"));
		getDataOpenConfigResponse.setTableName(context.stringValue("GetDataOpenConfigResponse.TableName"));
		getDataOpenConfigResponse.setDataType(context.stringValue("GetDataOpenConfigResponse.DataType"));
		getDataOpenConfigResponse.setSiteBid(context.stringValue("GetDataOpenConfigResponse.SiteBid"));

		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < context.lengthValue("GetDataOpenConfigResponse.ProductList.Length"); i++) {
			Product product = new Product();
			product.setProductName(context.stringValue("GetDataOpenConfigResponse.ProductList["+ i +"].ProductName"));

			List<Table> tableList = new ArrayList<Table>();
			for (int j = 0; j < context.lengthValue("GetDataOpenConfigResponse.ProductList["+ i +"].TableList.Length"); j++) {
				Table table = new Table();
				table.setTableName(context.stringValue("GetDataOpenConfigResponse.ProductList["+ i +"].TableList["+ j +"].TableName"));

				List<DataType> dataTypeList = new ArrayList<DataType>();
				for (int k = 0; k < context.lengthValue("GetDataOpenConfigResponse.ProductList["+ i +"].TableList["+ j +"].DataTypeList.Length"); k++) {
					DataType dataType = new DataType();
					dataType.setDataType(context.stringValue("GetDataOpenConfigResponse.ProductList["+ i +"].TableList["+ j +"].DataTypeList["+ k +"].DataType"));

					List<String> fields = new ArrayList<String>();
					for (int l = 0; l < context.lengthValue("GetDataOpenConfigResponse.ProductList["+ i +"].TableList["+ j +"].DataTypeList["+ k +"].Fields.Length"); l++) {
						fields.add(context.stringValue("GetDataOpenConfigResponse.ProductList["+ i +"].TableList["+ j +"].DataTypeList["+ k +"].Fields["+ l +"]"));
					}
					dataType.setFields(fields);

					dataTypeList.add(dataType);
				}
				table.setDataTypeList(dataTypeList);

				tableList.add(table);
			}
			product.setTableList(tableList);

			productList.add(product);
		}
		getDataOpenConfigResponse.setProductList(productList);
	 
	 	return getDataOpenConfigResponse;
	}
}