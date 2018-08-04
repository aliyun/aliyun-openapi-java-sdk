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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetCategoriesResponse;
import com.aliyuncs.vod.model.v20170321.GetCategoriesResponse.Category;
import com.aliyuncs.vod.model.v20170321.GetCategoriesResponse.Category1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCategoriesResponseUnmarshaller {

	public static GetCategoriesResponse unmarshall(GetCategoriesResponse getCategoriesResponse, UnmarshallerContext context) {
		
		getCategoriesResponse.setRequestId(context.stringValue("GetCategoriesResponse.RequestId"));
		getCategoriesResponse.setSubTotal(context.longValue("GetCategoriesResponse.SubTotal"));

		Category1 category1 = new Category1();
		category1.setCateId(context.longValue("GetCategoriesResponse.Category.CateId"));
		category1.setCateName(context.stringValue("GetCategoriesResponse.Category.CateName"));
		category1.setLevel(context.longValue("GetCategoriesResponse.Category.Level"));
		category1.setParentId(context.longValue("GetCategoriesResponse.Category.ParentId"));
		getCategoriesResponse.setCategory1(category1);

		List<Category> subCategories = new ArrayList<Category>();
		for (int i = 0; i < context.lengthValue("GetCategoriesResponse.SubCategories.Length"); i++) {
			Category category = new Category();
			category.setCateId(context.longValue("GetCategoriesResponse.SubCategories["+ i +"].CateId"));
			category.setCateName(context.stringValue("GetCategoriesResponse.SubCategories["+ i +"].CateName"));
			category.setLevel(context.longValue("GetCategoriesResponse.SubCategories["+ i +"].Level"));
			category.setParentId(context.longValue("GetCategoriesResponse.SubCategories["+ i +"].ParentId"));

			subCategories.add(category);
		}
		getCategoriesResponse.setSubCategories(subCategories);
	 
	 	return getCategoriesResponse;
	}
}