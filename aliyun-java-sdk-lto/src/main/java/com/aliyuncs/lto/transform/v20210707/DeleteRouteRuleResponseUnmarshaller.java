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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.DeleteRouteRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRouteRuleResponseUnmarshaller {

	public static DeleteRouteRuleResponse unmarshall(DeleteRouteRuleResponse deleteRouteRuleResponse, UnmarshallerContext _ctx) {
		
		deleteRouteRuleResponse.setRequestId(_ctx.stringValue("DeleteRouteRuleResponse.RequestId"));
		deleteRouteRuleResponse.setCode(_ctx.stringValue("DeleteRouteRuleResponse.Code"));
		deleteRouteRuleResponse.setHttpStatusCode(_ctx.integerValue("DeleteRouteRuleResponse.HttpStatusCode"));
		deleteRouteRuleResponse.setMessage(_ctx.stringValue("DeleteRouteRuleResponse.Message"));
		deleteRouteRuleResponse.setSuccess(_ctx.booleanValue("DeleteRouteRuleResponse.Success"));
	 
	 	return deleteRouteRuleResponse;
	}
}