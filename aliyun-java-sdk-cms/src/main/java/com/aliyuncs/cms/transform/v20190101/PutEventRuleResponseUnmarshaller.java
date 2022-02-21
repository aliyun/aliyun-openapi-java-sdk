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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.PutEventRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutEventRuleResponseUnmarshaller {

	public static PutEventRuleResponse unmarshall(PutEventRuleResponse putEventRuleResponse, UnmarshallerContext _ctx) {
		
		putEventRuleResponse.setRequestId(_ctx.stringValue("PutEventRuleResponse.RequestId"));
		putEventRuleResponse.setCode(_ctx.stringValue("PutEventRuleResponse.Code"));
		putEventRuleResponse.setMessage(_ctx.stringValue("PutEventRuleResponse.Message"));
		putEventRuleResponse.setData(_ctx.stringValue("PutEventRuleResponse.Data"));
		putEventRuleResponse.setSuccess(_ctx.booleanValue("PutEventRuleResponse.Success"));
	 
	 	return putEventRuleResponse;
	}
}