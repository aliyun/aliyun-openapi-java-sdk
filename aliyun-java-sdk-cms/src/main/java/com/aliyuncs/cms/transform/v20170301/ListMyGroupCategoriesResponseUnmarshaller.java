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
package com.aliyuncs.cms.transform.v20170301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20170301.ListMyGroupCategoriesResponse;
import com.aliyuncs.cms.model.v20170301.ListMyGroupCategoriesResponse.Category;
import com.aliyuncs.cms.model.v20170301.ListMyGroupCategoriesResponse.Category.CategoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMyGroupCategoriesResponseUnmarshaller {

	public static ListMyGroupCategoriesResponse unmarshall(ListMyGroupCategoriesResponse listMyGroupCategoriesResponse, UnmarshallerContext context) {
		
		listMyGroupCategoriesResponse.setRequestId(context.stringValue("ListMyGroupCategoriesResponse.RequestId"));
		listMyGroupCategoriesResponse.setSuccess(context.booleanValue("ListMyGroupCategoriesResponse.Success"));
		listMyGroupCategoriesResponse.setErrorCode(context.integerValue("ListMyGroupCategoriesResponse.ErrorCode"));
		listMyGroupCategoriesResponse.setErrorMessage(context.stringValue("ListMyGroupCategoriesResponse.ErrorMessage"));

		Category category = new Category();
		category.setGroupId(context.longValue("ListMyGroupCategoriesResponse.Category.GroupId"));

		List<CategoryItem> categoryItems = new ArrayList<CategoryItem>();
		for (int i = 0; i < context.lengthValue("ListMyGroupCategoriesResponse.Category.CategoryItems.Length"); i++) {
			CategoryItem categoryItem = new CategoryItem();
			categoryItem.setCategory(context.stringValue("ListMyGroupCategoriesResponse.Category.CategoryItems["+ i +"].Category"));
			categoryItem.setCount(context.integerValue("ListMyGroupCategoriesResponse.Category.CategoryItems["+ i +"].Count"));

			categoryItems.add(categoryItem);
		}
		category.setCategoryItems(categoryItems);
		listMyGroupCategoriesResponse.setCategory(category);
	 
	 	return listMyGroupCategoriesResponse;
	}
}