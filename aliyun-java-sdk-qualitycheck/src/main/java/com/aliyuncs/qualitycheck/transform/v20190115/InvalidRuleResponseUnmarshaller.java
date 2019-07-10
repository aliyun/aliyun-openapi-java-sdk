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

import com.aliyuncs.qualitycheck.model.v20190115.InvalidRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvalidRuleResponseUnmarshaller {

	public static InvalidRuleResponse unmarshall(InvalidRuleResponse invalidRuleResponse, UnmarshallerContext _ctx) {
		
		invalidRuleResponse.setRequestId(_ctx.stringValue("InvalidRuleResponse.RequestId"));
		invalidRuleResponse.setSuccess(_ctx.booleanValue("InvalidRuleResponse.Success"));
		invalidRuleResponse.setCode(_ctx.stringValue("InvalidRuleResponse.Code"));
		invalidRuleResponse.setMessage(_ctx.stringValue("InvalidRuleResponse.Message"));
		invalidRuleResponse.setData(_ctx.booleanValue("InvalidRuleResponse.Data"));
	 
	 	return invalidRuleResponse;
	}
}