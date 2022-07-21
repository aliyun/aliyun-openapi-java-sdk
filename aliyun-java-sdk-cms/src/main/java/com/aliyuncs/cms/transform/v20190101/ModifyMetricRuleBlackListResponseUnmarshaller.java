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

import com.aliyuncs.cms.model.v20190101.ModifyMetricRuleBlackListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMetricRuleBlackListResponseUnmarshaller {

	public static ModifyMetricRuleBlackListResponse unmarshall(ModifyMetricRuleBlackListResponse modifyMetricRuleBlackListResponse, UnmarshallerContext _ctx) {
		
		modifyMetricRuleBlackListResponse.setRequestId(_ctx.stringValue("ModifyMetricRuleBlackListResponse.RequestId"));
		modifyMetricRuleBlackListResponse.setCode(_ctx.stringValue("ModifyMetricRuleBlackListResponse.Code"));
		modifyMetricRuleBlackListResponse.setMessage(_ctx.stringValue("ModifyMetricRuleBlackListResponse.Message"));
		modifyMetricRuleBlackListResponse.setSuccess(_ctx.booleanValue("ModifyMetricRuleBlackListResponse.Success"));
		modifyMetricRuleBlackListResponse.setCount(_ctx.stringValue("ModifyMetricRuleBlackListResponse.Count"));
	 
	 	return modifyMetricRuleBlackListResponse;
	}
}