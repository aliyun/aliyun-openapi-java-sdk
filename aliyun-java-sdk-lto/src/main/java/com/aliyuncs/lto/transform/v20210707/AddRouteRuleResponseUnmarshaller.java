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

import com.aliyuncs.lto.model.v20210707.AddRouteRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRouteRuleResponseUnmarshaller {

	public static AddRouteRuleResponse unmarshall(AddRouteRuleResponse addRouteRuleResponse, UnmarshallerContext _ctx) {
		
		addRouteRuleResponse.setRequestId(_ctx.stringValue("AddRouteRuleResponse.RequestId"));
		addRouteRuleResponse.setCode(_ctx.stringValue("AddRouteRuleResponse.Code"));
		addRouteRuleResponse.setHttpStatusCode(_ctx.integerValue("AddRouteRuleResponse.HttpStatusCode"));
		addRouteRuleResponse.setMessage(_ctx.stringValue("AddRouteRuleResponse.Message"));
		addRouteRuleResponse.setSuccess(_ctx.booleanValue("AddRouteRuleResponse.Success"));
	 
	 	return addRouteRuleResponse;
	}
}