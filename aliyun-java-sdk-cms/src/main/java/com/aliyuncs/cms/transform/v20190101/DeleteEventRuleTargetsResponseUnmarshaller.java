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

import com.aliyuncs.cms.model.v20190101.DeleteEventRuleTargetsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteEventRuleTargetsResponseUnmarshaller {

	public static DeleteEventRuleTargetsResponse unmarshall(DeleteEventRuleTargetsResponse deleteEventRuleTargetsResponse, UnmarshallerContext _ctx) {
		
		deleteEventRuleTargetsResponse.setRequestId(_ctx.stringValue("DeleteEventRuleTargetsResponse.RequestId"));
		deleteEventRuleTargetsResponse.setCode(_ctx.stringValue("DeleteEventRuleTargetsResponse.Code"));
		deleteEventRuleTargetsResponse.setMessage(_ctx.stringValue("DeleteEventRuleTargetsResponse.Message"));
		deleteEventRuleTargetsResponse.setSuccess(_ctx.booleanValue("DeleteEventRuleTargetsResponse.Success"));
	 
	 	return deleteEventRuleTargetsResponse;
	}
}