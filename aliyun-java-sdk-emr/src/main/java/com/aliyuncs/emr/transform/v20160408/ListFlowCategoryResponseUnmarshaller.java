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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowCategoryResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowCategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowCategoryResponseUnmarshaller {

	public static ListFlowCategoryResponse unmarshall(ListFlowCategoryResponse listFlowCategoryResponse, UnmarshallerContext _ctx) {
		
		listFlowCategoryResponse.setRequestId(_ctx.stringValue("ListFlowCategoryResponse.RequestId"));
		listFlowCategoryResponse.setPageNumber(_ctx.integerValue("ListFlowCategoryResponse.PageNumber"));
		listFlowCategoryResponse.setPageSize(_ctx.integerValue("ListFlowCategoryResponse.PageSize"));
		listFlowCategoryResponse.setTotal(_ctx.integerValue("ListFlowCategoryResponse.Total"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowCategoryResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setId(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].Id"));
			category.setGmtCreate(_ctx.longValue("ListFlowCategoryResponse.Categories["+ i +"].GmtCreate"));
			category.setGmtModified(_ctx.longValue("ListFlowCategoryResponse.Categories["+ i +"].GmtModified"));
			category.setName(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].Name"));
			category.setParentId(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].ParentId"));
			category.setType(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].Type"));
			category.setCategoryType(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].CategoryType"));
			category.setObjectType(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].ObjectType"));
			category.setObjectId(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].ObjectId"));
			category.setProjectId(_ctx.stringValue("ListFlowCategoryResponse.Categories["+ i +"].ProjectId"));

			categories.add(category);
		}
		listFlowCategoryResponse.setCategories(categories);
	 
	 	return listFlowCategoryResponse;
	}
}