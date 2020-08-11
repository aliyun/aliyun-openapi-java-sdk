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

import com.aliyuncs.ahas_openapi.model.v20190901.DeleteHotParamRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DeleteHotParamRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteHotParamRuleResponseUnmarshaller {

	public static DeleteHotParamRuleResponse unmarshall(DeleteHotParamRuleResponse deleteHotParamRuleResponse, UnmarshallerContext _ctx) {
		
		deleteHotParamRuleResponse.setRequestId(_ctx.stringValue("DeleteHotParamRuleResponse.RequestId"));
		deleteHotParamRuleResponse.setCode(_ctx.stringValue("DeleteHotParamRuleResponse.Code"));
		deleteHotParamRuleResponse.setMessage(_ctx.stringValue("DeleteHotParamRuleResponse.Message"));
		deleteHotParamRuleResponse.setSuccess(_ctx.booleanValue("DeleteHotParamRuleResponse.Success"));

		Data data = new Data();
		data.setRuleId(_ctx.longValue("DeleteHotParamRuleResponse.Data.RuleId"));
		deleteHotParamRuleResponse.setData(data);
	 
	 	return deleteHotParamRuleResponse;
	}
}