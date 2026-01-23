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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.AssignQualityRuleOfAllRuleScopeSchedulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignQualityRuleOfAllRuleScopeSchedulesResponseUnmarshaller {

	public static AssignQualityRuleOfAllRuleScopeSchedulesResponse unmarshall(AssignQualityRuleOfAllRuleScopeSchedulesResponse assignQualityRuleOfAllRuleScopeSchedulesResponse, UnmarshallerContext _ctx) {
		
		assignQualityRuleOfAllRuleScopeSchedulesResponse.setRequestId(_ctx.stringValue("AssignQualityRuleOfAllRuleScopeSchedulesResponse.RequestId"));
		assignQualityRuleOfAllRuleScopeSchedulesResponse.setSuccess(_ctx.booleanValue("AssignQualityRuleOfAllRuleScopeSchedulesResponse.Success"));
		assignQualityRuleOfAllRuleScopeSchedulesResponse.setHttpStatusCode(_ctx.integerValue("AssignQualityRuleOfAllRuleScopeSchedulesResponse.HttpStatusCode"));
		assignQualityRuleOfAllRuleScopeSchedulesResponse.setCode(_ctx.stringValue("AssignQualityRuleOfAllRuleScopeSchedulesResponse.Code"));
		assignQualityRuleOfAllRuleScopeSchedulesResponse.setMessage(_ctx.stringValue("AssignQualityRuleOfAllRuleScopeSchedulesResponse.Message"));
		assignQualityRuleOfAllRuleScopeSchedulesResponse.setData(_ctx.booleanValue("AssignQualityRuleOfAllRuleScopeSchedulesResponse.Data"));
	 
	 	return assignQualityRuleOfAllRuleScopeSchedulesResponse;
	}
}