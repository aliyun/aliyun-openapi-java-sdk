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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryTaskResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryTaskResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.QueryTaskResponse.Data.ProductListItem;
import com.aliyuncs.advisor_share.model.v20180608.QueryTaskResponse.Data.ProductListItem.ClassListItem;
import com.aliyuncs.advisor_share.model.v20180608.QueryTaskResponse.Data.ProductListItem.ClassListItem.FieldListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskResponseUnmarshaller {

	public static QueryTaskResponse unmarshall(QueryTaskResponse queryTaskResponse, UnmarshallerContext _ctx) {
		
		queryTaskResponse.setSuccess(_ctx.booleanValue("QueryTaskResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("QueryTaskResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryTaskResponse.Data.Name"));

		List<ProductListItem> productList = new ArrayList<ProductListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskResponse.Data.ProductList.Length"); i++) {
			ProductListItem productListItem = new ProductListItem();
			productListItem.setEnabled(_ctx.booleanValue("QueryTaskResponse.Data.ProductList["+ i +"].Enabled"));
			productListItem.setOrder(_ctx.longValue("QueryTaskResponse.Data.ProductList["+ i +"].Order"));
			productListItem.setProductCode(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ProductCode"));
			productListItem.setProductName(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ProductName"));

			List<ClassListItem> classList = new ArrayList<ClassListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList.Length"); j++) {
				ClassListItem classListItem = new ClassListItem();
				classListItem.setEnabled(_ctx.booleanValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].Enabled"));
				classListItem.setRuleCode(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].RuleCode"));
				classListItem.setRuleName(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].RuleName"));

				List<FieldListItem> fieldList = new ArrayList<FieldListItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList.Length"); k++) {
					FieldListItem fieldListItem = new FieldListItem();
					fieldListItem.setDefaultValue(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList["+ k +"].DefaultValue"));
					fieldListItem.setFieldLabel(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList["+ k +"].FieldLabel"));
					fieldListItem.setFieldName(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList["+ k +"].FieldName"));
					fieldListItem.setFieldValue(_ctx.longValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList["+ k +"].FieldValue"));
					fieldListItem.setOperator(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList["+ k +"].Operator"));
					fieldListItem.setValueUnit(_ctx.stringValue("QueryTaskResponse.Data.ProductList["+ i +"].ClassList["+ j +"].FieldList["+ k +"].ValueUnit"));

					fieldList.add(fieldListItem);
				}
				classListItem.setFieldList(fieldList);

				classList.add(classListItem);
			}
			productListItem.setClassList(classList);

			productList.add(productListItem);
		}
		data.setProductList(productList);
		queryTaskResponse.setData(data);
	 
	 	return queryTaskResponse;
	}
}