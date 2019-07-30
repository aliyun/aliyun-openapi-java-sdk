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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.GetCategoryListResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetCategoryListResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCategoryListResponseUnmarshaller {

	public static GetCategoryListResponse unmarshall(GetCategoryListResponse getCategoryListResponse, UnmarshallerContext _ctx) {
		
		getCategoryListResponse.setRequestId(_ctx.stringValue("GetCategoryListResponse.RequestId"));
		getCategoryListResponse.setCode(_ctx.stringValue("GetCategoryListResponse.Code"));
		getCategoryListResponse.setMessage(_ctx.stringValue("GetCategoryListResponse.Message"));

		List<Category> categoryList = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("GetCategoryListResponse.CategoryList.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(_ctx.longValue("GetCategoryListResponse.CategoryList["+ i +"].CategoryId"));
			category.setName(_ctx.stringValue("GetCategoryListResponse.CategoryList["+ i +"].Name"));

			categoryList.add(category);
		}
		getCategoryListResponse.setCategoryList(categoryList);
	 
	 	return getCategoryListResponse;
	}
}