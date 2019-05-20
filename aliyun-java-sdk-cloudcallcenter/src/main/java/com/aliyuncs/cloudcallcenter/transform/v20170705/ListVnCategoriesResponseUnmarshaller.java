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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnCategoriesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnCategoriesResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVnCategoriesResponseUnmarshaller {

	public static ListVnCategoriesResponse unmarshall(ListVnCategoriesResponse listVnCategoriesResponse, UnmarshallerContext context) {
		
		listVnCategoriesResponse.setRequestId(context.stringValue("ListVnCategoriesResponse.RequestId"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < context.lengthValue("ListVnCategoriesResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setInstanceId(context.stringValue("ListVnCategoriesResponse.Categories["+ i +"].InstanceId"));
			category.setName(context.stringValue("ListVnCategoriesResponse.Categories["+ i +"].Name"));
			category.setCategoryId(context.stringValue("ListVnCategoriesResponse.Categories["+ i +"].CategoryId"));
			category.setLevel(context.longValue("ListVnCategoriesResponse.Categories["+ i +"].Level"));
			category.setPreviousSiblingId(context.stringValue("ListVnCategoriesResponse.Categories["+ i +"].PreviousSiblingId"));
			category.setNextSiblingId(context.stringValue("ListVnCategoriesResponse.Categories["+ i +"].NextSiblingId"));
			category.setParentId(context.stringValue("ListVnCategoriesResponse.Categories["+ i +"].ParentId"));

			categories.add(category);
		}
		listVnCategoriesResponse.setCategories(categories);
	 
	 	return listVnCategoriesResponse;
	}
}