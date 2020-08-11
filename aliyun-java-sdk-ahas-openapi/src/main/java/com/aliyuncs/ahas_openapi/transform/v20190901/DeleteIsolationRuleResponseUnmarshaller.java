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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.DeleteIsolationRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DeleteIsolationRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteIsolationRuleResponseUnmarshaller {

	public static DeleteIsolationRuleResponse unmarshall(DeleteIsolationRuleResponse deleteIsolationRuleResponse, UnmarshallerContext _ctx) {
		
		deleteIsolationRuleResponse.setRequestId(_ctx.stringValue("DeleteIsolationRuleResponse.RequestId"));
		deleteIsolationRuleResponse.setCode(_ctx.stringValue("DeleteIsolationRuleResponse.Code"));
		deleteIsolationRuleResponse.setMessage(_ctx.stringValue("DeleteIsolationRuleResponse.Message"));
		deleteIsolationRuleResponse.setSuccess(_ctx.booleanValue("DeleteIsolationRuleResponse.Success"));

		Data data = new Data();
		data.setRuleId(_ctx.longValue("DeleteIsolationRuleResponse.Data.RuleId"));
		deleteIsolationRuleResponse.setData(data);
	 
	 	return deleteIsolationRuleResponse;
	}
}