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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCategoriesResponseUnmarshaller {

	public static GetCategoriesResponse unmarshall(GetCategoriesResponse getCategoriesResponse, UnmarshallerContext _ctx) {
		
		getCategoriesResponse.setRequestId(_ctx.stringValue("GetCategoriesResponse.RequestId"));
		getCategoriesResponse.setSubTotal(_ctx.longValue("GetCategoriesResponse.SubTotal"));

		Category1 category1 = new Category1();
		category1.setCateId(_ctx.longValue("GetCategoriesResponse.Category.CateId"));
		category1.setCateName(_ctx.stringValue("GetCategoriesResponse.Category.CateName"));
		category1.setLevel(_ctx.longValue("GetCategoriesResponse.Category.Level"));
		category1.setParentId(_ctx.longValue("GetCategoriesResponse.Category.ParentId"));
		category1.setType(_ctx.stringValue("GetCategoriesResponse.Category.Type"));
		getCategoriesResponse.setCategory1(category1);

		List<Category> subCategories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("GetCategoriesResponse.SubCategories.Length"); i++) {
			Category category = new Category();
			category.setCateId(_ctx.longValue("GetCategoriesResponse.SubCategories["+ i +"].CateId"));
			category.setCateName(_ctx.stringValue("GetCategoriesResponse.SubCategories["+ i +"].CateName"));
			category.setLevel(_ctx.longValue("GetCategoriesResponse.SubCategories["+ i +"].Level"));
			category.setParentId(_ctx.longValue("GetCategoriesResponse.SubCategories["+ i +"].ParentId"));
			category.setSubTotal(_ctx.longValue("GetCategoriesResponse.SubCategories["+ i +"].SubTotal"));
			category.setType(_ctx.stringValue("GetCategoriesResponse.SubCategories["+ i +"].Type"));

			subCategories.add(category);
		}
		getCategoriesResponse.setSubCategories(subCategories);
	 
	 	return getCategoriesResponse;
	}
}