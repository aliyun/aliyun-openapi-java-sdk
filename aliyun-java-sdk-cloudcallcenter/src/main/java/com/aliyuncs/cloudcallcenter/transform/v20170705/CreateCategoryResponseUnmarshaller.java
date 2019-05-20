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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateCategoryResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateCategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCategoryResponseUnmarshaller {

	public static CreateCategoryResponse unmarshall(CreateCategoryResponse createCategoryResponse, UnmarshallerContext context) {
		
		createCategoryResponse.setRequestId(context.stringValue("CreateCategoryResponse.RequestId"));
		createCategoryResponse.setSuccess(context.booleanValue("CreateCategoryResponse.Success"));
		createCategoryResponse.setCode(context.stringValue("CreateCategoryResponse.Code"));
		createCategoryResponse.setMessage(context.stringValue("CreateCategoryResponse.Message"));
		createCategoryResponse.setHttpStatusCode(context.integerValue("CreateCategoryResponse.HttpStatusCode"));

		Category category = new Category();
		category.setId(context.stringValue("CreateCategoryResponse.Category.Id"));
		category.setScenarioId(context.stringValue("CreateCategoryResponse.Category.ScenarioId"));
		category.setName(context.stringValue("CreateCategoryResponse.Category.Name"));
		category.setOptions(context.stringValue("CreateCategoryResponse.Category.Options"));
		category.setType(context.integerValue("CreateCategoryResponse.Category.Type"));
		createCategoryResponse.setCategory(category);
	 
	 	return createCategoryResponse;
	}
}