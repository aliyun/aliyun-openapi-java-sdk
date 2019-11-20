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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListAllCategoryResponse;
import com.aliyuncs.mts.model.v20140618.ListAllCategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllCategoryResponseUnmarshaller {

	public static ListAllCategoryResponse unmarshall(ListAllCategoryResponse listAllCategoryResponse, UnmarshallerContext _ctx) {
		
		listAllCategoryResponse.setRequestId(_ctx.stringValue("ListAllCategoryResponse.RequestId"));

		List<Category> categoryList = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("ListAllCategoryResponse.CategoryList.Length"); i++) {
			Category category = new Category();
			category.setCateId(_ctx.stringValue("ListAllCategoryResponse.CategoryList["+ i +"].CateId"));
			category.setCateName(_ctx.stringValue("ListAllCategoryResponse.CategoryList["+ i +"].CateName"));
			category.setParentId(_ctx.stringValue("ListAllCategoryResponse.CategoryList["+ i +"].ParentId"));
			category.setLevel(_ctx.stringValue("ListAllCategoryResponse.CategoryList["+ i +"].Level"));

			categoryList.add(category);
		}
		listAllCategoryResponse.setCategoryList(categoryList);
	 
	 	return listAllCategoryResponse;
	}
}