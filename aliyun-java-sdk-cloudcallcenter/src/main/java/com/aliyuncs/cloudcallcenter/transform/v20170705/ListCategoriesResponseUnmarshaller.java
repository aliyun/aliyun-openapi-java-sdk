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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListCategoriesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCategoriesResponse.ScenarioParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCategoriesResponseUnmarshaller {

	public static ListCategoriesResponse unmarshall(ListCategoriesResponse listCategoriesResponse, UnmarshallerContext context) {
		
		listCategoriesResponse.setRequestId(context.stringValue("ListCategoriesResponse.RequestId"));
		listCategoriesResponse.setSuccess(context.booleanValue("ListCategoriesResponse.Success"));
		listCategoriesResponse.setCode(context.stringValue("ListCategoriesResponse.Code"));
		listCategoriesResponse.setMessage(context.stringValue("ListCategoriesResponse.Message"));
		listCategoriesResponse.setHttpStatusCode(context.integerValue("ListCategoriesResponse.HttpStatusCode"));

		List<ScenarioParameter> categories = new ArrayList<ScenarioParameter>();
		for (int i = 0; i < context.lengthValue("ListCategoriesResponse.Categories.Length"); i++) {
			ScenarioParameter scenarioParameter = new ScenarioParameter();
			scenarioParameter.setId(context.stringValue("ListCategoriesResponse.Categories["+ i +"].Id"));
			scenarioParameter.setScenarioId(context.stringValue("ListCategoriesResponse.Categories["+ i +"].ScenarioId"));
			scenarioParameter.setName(context.stringValue("ListCategoriesResponse.Categories["+ i +"].Name"));
			scenarioParameter.setOptions(context.stringValue("ListCategoriesResponse.Categories["+ i +"].Options"));
			scenarioParameter.setType(context.integerValue("ListCategoriesResponse.Categories["+ i +"].Type"));

			categories.add(scenarioParameter);
		}
		listCategoriesResponse.setCategories(categories);
	 
	 	return listCategoriesResponse;
	}
}