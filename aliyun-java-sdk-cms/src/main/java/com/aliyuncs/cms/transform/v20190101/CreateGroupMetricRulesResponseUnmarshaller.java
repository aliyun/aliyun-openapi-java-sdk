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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.CreateGroupMetricRulesResponse;
import com.aliyuncs.cms.model.v20190101.CreateGroupMetricRulesResponse.AlertResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGroupMetricRulesResponseUnmarshaller {

	public static CreateGroupMetricRulesResponse unmarshall(CreateGroupMetricRulesResponse createGroupMetricRulesResponse, UnmarshallerContext _ctx) {
		
		createGroupMetricRulesResponse.setRequestId(_ctx.stringValue("CreateGroupMetricRulesResponse.RequestId"));
		createGroupMetricRulesResponse.setCode(_ctx.integerValue("CreateGroupMetricRulesResponse.Code"));
		createGroupMetricRulesResponse.setMessage(_ctx.stringValue("CreateGroupMetricRulesResponse.Message"));
		createGroupMetricRulesResponse.setSuccess(_ctx.booleanValue("CreateGroupMetricRulesResponse.Success"));

		List<AlertResult> resources = new ArrayList<AlertResult>();
		for (int i = 0; i < _ctx.lengthValue("CreateGroupMetricRulesResponse.Resources.Length"); i++) {
			AlertResult alertResult = new AlertResult();
			alertResult.setCode(_ctx.integerValue("CreateGroupMetricRulesResponse.Resources["+ i +"].Code"));
			alertResult.setMessage(_ctx.stringValue("CreateGroupMetricRulesResponse.Resources["+ i +"].Message"));
			alertResult.setSuccess(_ctx.booleanValue("CreateGroupMetricRulesResponse.Resources["+ i +"].Success"));
			alertResult.setRuleName(_ctx.stringValue("CreateGroupMetricRulesResponse.Resources["+ i +"].RuleName"));
			alertResult.setRuleId(_ctx.stringValue("CreateGroupMetricRulesResponse.Resources["+ i +"].RuleId"));

			resources.add(alertResult);
		}
		createGroupMetricRulesResponse.setResources(resources);
	 
	 	return createGroupMetricRulesResponse;
	}
}