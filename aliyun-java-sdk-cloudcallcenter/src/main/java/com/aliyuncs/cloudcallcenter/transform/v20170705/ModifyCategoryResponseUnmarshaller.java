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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyCategoryResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyCategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCategoryResponseUnmarshaller {

	public static ModifyCategoryResponse unmarshall(ModifyCategoryResponse modifyCategoryResponse, UnmarshallerContext context) {
		
		modifyCategoryResponse.setRequestId(context.stringValue("ModifyCategoryResponse.RequestId"));
		modifyCategoryResponse.setSuccess(context.booleanValue("ModifyCategoryResponse.Success"));
		modifyCategoryResponse.setCode(context.stringValue("ModifyCategoryResponse.Code"));
		modifyCategoryResponse.setMessage(context.stringValue("ModifyCategoryResponse.Message"));
		modifyCategoryResponse.setHttpStatusCode(context.integerValue("ModifyCategoryResponse.HttpStatusCode"));

		Category category = new Category();
		category.setId(context.stringValue("ModifyCategoryResponse.Category.Id"));
		category.setScenarioId(context.stringValue("ModifyCategoryResponse.Category.ScenarioId"));
		category.setName(context.stringValue("ModifyCategoryResponse.Category.Name"));
		category.setOptions(context.stringValue("ModifyCategoryResponse.Category.Options"));
		category.setType(context.integerValue("ModifyCategoryResponse.Category.Type"));
		modifyCategoryResponse.setCategory(category);
	 
	 	return modifyCategoryResponse;
	}
}