/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.QueryMarketCategoriesResponse;
import com.aliyuncs.market.model.v20151101.QueryMarketCategoriesResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMarketCategoriesResponseUnmarshaller {

	public static QueryMarketCategoriesResponse unmarshall(QueryMarketCategoriesResponse queryMarketCategoriesResponse, UnmarshallerContext context) {
		
		queryMarketCategoriesResponse.setRequestId(context.stringValue("QueryMarketCategoriesResponse.RequestId"));
		queryMarketCategoriesResponse.setPageNumber(context.integerValue("QueryMarketCategoriesResponse.PageNumber"));
		queryMarketCategoriesResponse.setPageSize(context.integerValue("QueryMarketCategoriesResponse.PageSize"));
		queryMarketCategoriesResponse.setTotalCount(context.integerValue("QueryMarketCategoriesResponse.TotalCount"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < context.lengthValue("QueryMarketCategoriesResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setId(context.longValue("QueryMarketCategoriesResponse.Categories["+ i +"].Id"));
			category.setCategoryCode(context.stringValue("QueryMarketCategoriesResponse.Categories["+ i +"].CategoryCode"));
			category.setCategoryName(context.stringValue("QueryMarketCategoriesResponse.Categories["+ i +"].CategoryName"));

			categories.add(category);
		}
		queryMarketCategoriesResponse.setCategories(categories);
	 
	 	return queryMarketCategoriesResponse;
	}
}