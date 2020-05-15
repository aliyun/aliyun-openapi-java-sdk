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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.ListCategoriesResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListCategoriesResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCategoriesResponseUnmarshaller {

	public static ListCategoriesResponse unmarshall(ListCategoriesResponse listCategoriesResponse, UnmarshallerContext _ctx) {
		
		listCategoriesResponse.setRequestId(_ctx.stringValue("ListCategoriesResponse.RequestId"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("ListCategoriesResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setInstanceId(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].InstanceId"));
			category.setName(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].Name"));
			category.setCategoryId(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].CategoryId"));
			category.setLevel(_ctx.longValue("ListCategoriesResponse.Categories["+ i +"].Level"));
			category.setPreviousSiblingId(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].PreviousSiblingId"));
			category.setNextSiblingId(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].NextSiblingId"));
			category.setParentId(_ctx.stringValue("ListCategoriesResponse.Categories["+ i +"].ParentId"));

			categories.add(category);
		}
		listCategoriesResponse.setCategories(categories);
	 
	 	return listCategoriesResponse;
	}
}