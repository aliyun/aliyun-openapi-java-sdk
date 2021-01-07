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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.ListRuleTasksResponse;
import com.aliyuncs.airec.model.v20201126.ListRuleTasksResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleTasksResponseUnmarshaller {

	public static ListRuleTasksResponse unmarshall(ListRuleTasksResponse listRuleTasksResponse, UnmarshallerContext _ctx) {
		
		listRuleTasksResponse.setRequestId(_ctx.stringValue("ListRuleTasksResponse.requestId"));
		listRuleTasksResponse.setCode(_ctx.stringValue("ListRuleTasksResponse.code"));
		listRuleTasksResponse.setMessage(_ctx.stringValue("ListRuleTasksResponse.message"));

		Result result = new Result();
		result.setFinishRate(_ctx.integerValue("ListRuleTasksResponse.result.finishRate"));
		result.setFinishTime(_ctx.integerValue("ListRuleTasksResponse.result.finishTime"));
		listRuleTasksResponse.setResult(result);
	 
	 	return listRuleTasksResponse;
	}
}