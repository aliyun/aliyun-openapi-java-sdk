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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.ListCategoriesResponse;
import com.aliyuncs.retailbot.model.v20210224.ListCategoriesResponse.Category;
import com.aliyuncs.retailbot.model.v20210224.ListCategoriesResponse.Category.Category1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCategoriesResponseUnmarshaller {

	public static ListCategoriesResponse unmarshall(ListCategoriesResponse listCategoriesResponse, UnmarshallerContext _ctx) {
		
		listCategoriesResponse.setRequestId(_ctx.stringValue("ListCategoriesResponse.RequestId"));
		listCategoriesResponse.setSuccess(_ctx.booleanValue("ListCategoriesResponse.Success"));
		listCategoriesResponse.setCode(_ctx.stringValue("ListCategoriesResponse.Code"));
		listCategoriesResponse.setMessage(_ctx.stringValue("ListCategoriesResponse.Message"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("ListCategoriesResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(_ctx.longValue("ListCategoriesResponse.Categories["+ i +"].CategoryId"));
			category.setParentCategoryId(_ctx.longValue("ListCategoriesResponse.Categories["+ i +"].ParentCategoryId"));
			category.setCategoryName(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].CategoryName"));

			List<Category1> children = new ArrayList<Category1>();
			for (int j = 0; j < _ctx.lengthValue("ListCategoriesResponse.Categories["+ i +"].Children.Length"); j++) {
				Category1 category1 = new Category1();
				category1.setCategoryId(_ctx.longValue("ListCategoriesResponse.Categories["+ i +"].Children["+ j +"].CategoryId"));
				category1.setParentCategoryId(_ctx.longValue("ListCategoriesResponse.Categories["+ i +"].Children["+ j +"].ParentCategoryId"));
				category1.setCategoryName(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].Children["+ j +"].CategoryName"));

				children.add(category1);
			}
			category.setChildren(children);

			categories.add(category);
		}
		listCategoriesResponse.setCategories(categories);
	 
	 	return listCategoriesResponse;
	}
}