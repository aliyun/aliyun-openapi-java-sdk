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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DeleteRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRuleResponseUnmarshaller {

	public static DeleteRuleResponse unmarshall(DeleteRuleResponse deleteRuleResponse, UnmarshallerContext _ctx) {
		
		deleteRuleResponse.setRequestId(_ctx.stringValue("DeleteRuleResponse.RequestId"));
		deleteRuleResponse.setSuccess(_ctx.booleanValue("DeleteRuleResponse.Success"));
		deleteRuleResponse.setCode(_ctx.stringValue("DeleteRuleResponse.Code"));
		deleteRuleResponse.setErrorMessage(_ctx.stringValue("DeleteRuleResponse.ErrorMessage"));
	 
	 	return deleteRuleResponse;
	}
}