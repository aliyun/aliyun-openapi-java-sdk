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

import com.aliyuncs.linkedmall.model.v20180116.GetCategoryChainResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetCategoryChainResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCategoryChainResponseUnmarshaller {

	public static GetCategoryChainResponse unmarshall(GetCategoryChainResponse getCategoryChainResponse, UnmarshallerContext _ctx) {
		
		getCategoryChainResponse.setRequestId(_ctx.stringValue("GetCategoryChainResponse.RequestId"));
		getCategoryChainResponse.setCode(_ctx.stringValue("GetCategoryChainResponse.Code"));
		getCategoryChainResponse.setMessage(_ctx.stringValue("GetCategoryChainResponse.Message"));

		List<Category> categoryList = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("GetCategoryChainResponse.CategoryList.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(_ctx.longValue("GetCategoryChainResponse.CategoryList["+ i +"].CategoryId"));
			category.setName(_ctx.stringValue("GetCategoryChainResponse.CategoryList["+ i +"].Name"));

			categoryList.add(category);
		}
		getCategoryChainResponse.setCategoryList(categoryList);
	 
	 	return getCategoryChainResponse;
	}
}