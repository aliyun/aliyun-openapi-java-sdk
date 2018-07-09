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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.PutEventRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutEventRuleResponseUnmarshaller {

	public static PutEventRuleResponse unmarshall(PutEventRuleResponse putEventRuleResponse, UnmarshallerContext context) {
		
		putEventRuleResponse.setRequestId(context.stringValue("PutEventRuleResponse.RequestId"));
		putEventRuleResponse.setSuccess(context.booleanValue("PutEventRuleResponse.Success"));
		putEventRuleResponse.setCode(context.stringValue("PutEventRuleResponse.Code"));
		putEventRuleResponse.setMessage(context.stringValue("PutEventRuleResponse.Message"));
		putEventRuleResponse.setData(context.stringValue("PutEventRuleResponse.Data"));
	 
	 	return putEventRuleResponse;
	}
}