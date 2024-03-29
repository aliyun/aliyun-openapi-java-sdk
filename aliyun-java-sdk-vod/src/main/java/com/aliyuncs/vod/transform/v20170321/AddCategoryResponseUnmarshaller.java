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

import com.aliyuncs.vod.model.v20170321.AddCategoryResponse;
import com.aliyuncs.vod.model.v20170321.AddCategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCategoryResponseUnmarshaller {

	public static AddCategoryResponse unmarshall(AddCategoryResponse addCategoryResponse, UnmarshallerContext _ctx) {
		
		addCategoryResponse.setRequestId(_ctx.stringValue("AddCategoryResponse.RequestId"));

		Category category = new Category();
		category.setType(_ctx.stringValue("AddCategoryResponse.Category.Type"));
		category.setParentId(_ctx.longValue("AddCategoryResponse.Category.ParentId"));
		category.setCateName(_ctx.stringValue("AddCategoryResponse.Category.CateName"));
		category.setCateId(_ctx.longValue("AddCategoryResponse.Category.CateId"));
		category.setLevel(_ctx.longValue("AddCategoryResponse.Category.Level"));
		addCategoryResponse.setCategory(category);
	 
	 	return addCategoryResponse;
	}
}