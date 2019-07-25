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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.AddRuleCategoryResponse;
import com.aliyuncs.qualitycheck.model.v20190115.AddRuleCategoryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRuleCategoryResponseUnmarshaller {

	public static AddRuleCategoryResponse unmarshall(AddRuleCategoryResponse addRuleCategoryResponse, UnmarshallerContext _ctx) {
		
		addRuleCategoryResponse.setRequestId(_ctx.stringValue("AddRuleCategoryResponse.RequestId"));
		addRuleCategoryResponse.setSuccess(_ctx.booleanValue("AddRuleCategoryResponse.Success"));
		addRuleCategoryResponse.setCode(_ctx.stringValue("AddRuleCategoryResponse.Code"));
		addRuleCategoryResponse.setMessage(_ctx.stringValue("AddRuleCategoryResponse.Message"));

		Data data = new Data();
		data.setSelect(_ctx.booleanValue("AddRuleCategoryResponse.Data.Select"));
		addRuleCategoryResponse.setData(data);
	 
	 	return addRuleCategoryResponse;
	}
}