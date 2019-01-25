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

package com.aliyuncs.chatbot.transform.v20171011;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.aliyuncs.chatbot.model.v20171011.QueryCategoriesResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryCategoriesResponse.Category;
import java.util.Map;

import com.aliyuncs.chatbot.util.BeanUtil;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCategoriesResponseUnmarshaller {

	public static QueryCategoriesResponse unmarshall(QueryCategoriesResponse queryCategoriesResponse, UnmarshallerContext context) {
		try {
			if(context.getHttpResponse() == null){
				throw new ClientException("SDK.NullResponse");
			}
			String content = context.getHttpResponse().getHttpContentString();
			if(FormatType.JSON.equals(context.getHttpResponse().getHttpContentType())){
				QueryCategoriesResponse responseData = JSON.parseObject(content, QueryCategoriesResponse.class);
				BeanUtil.copyProperties(responseData, queryCategoriesResponse, true);
				return queryCategoriesResponse;
			}
		} catch (ClientException e) {
			throw new RuntimeException(e.getMessage());
		}
		queryCategoriesResponse.setRequestId(context.stringValue("QueryCategoriesResponse.RequestId"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < context.lengthValue("QueryCategoriesResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(context.longValue("QueryCategoriesResponse.Categories["+ i +"].CategoryId"));
			category.setParentCategoryId(context.longValue("QueryCategoriesResponse.Categories["+ i +"].ParentCategoryId"));
			category.setName(context.stringValue("QueryCategoriesResponse.Categories["+ i +"].Name"));
			List<Map<Object, Object>> childrensMap = context.listMapValue("QueryCategoriesResponse.Categories["+ i +"].Childrens");
			category.setChildrens(JSON.parseObject(JSON.toJSONString(childrensMap), new TypeReference<List<Category>>(){}));
			categories.add(category);
		}
		queryCategoriesResponse.setCategories(categories);
	 
	 	return queryCategoriesResponse;
	}
}