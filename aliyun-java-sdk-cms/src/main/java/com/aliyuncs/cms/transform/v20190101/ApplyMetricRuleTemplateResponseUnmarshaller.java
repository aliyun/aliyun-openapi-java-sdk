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

import com.aliyuncs.cms.model.v20190101.ApplyMetricRuleTemplateResponse;
import com.aliyuncs.cms.model.v20190101.ApplyMetricRuleTemplateResponse.Resource;
import com.aliyuncs.cms.model.v20190101.ApplyMetricRuleTemplateResponse.Resource.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyMetricRuleTemplateResponseUnmarshaller {

	public static ApplyMetricRuleTemplateResponse unmarshall(ApplyMetricRuleTemplateResponse applyMetricRuleTemplateResponse, UnmarshallerContext context) {
		
		applyMetricRuleTemplateResponse.setRequestId(context.stringValue("ApplyMetricRuleTemplateResponse.RequestId"));
		applyMetricRuleTemplateResponse.setSuccess(context.booleanValue("ApplyMetricRuleTemplateResponse.Success"));
		applyMetricRuleTemplateResponse.setCode(context.integerValue("ApplyMetricRuleTemplateResponse.Code"));
		applyMetricRuleTemplateResponse.setMessage(context.stringValue("ApplyMetricRuleTemplateResponse.Message"));

		Resource resource = new Resource();
		resource.setGroupId(context.longValue("ApplyMetricRuleTemplateResponse.Resource.GroupId"));

		List<Result> alertResults = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults.Length"); i++) {
			Result result = new Result();
			result.setGroupId(context.longValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults["+ i +"].GroupId"));
			result.setRuleId(context.stringValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults["+ i +"].RuleId"));
			result.setMessage(context.stringValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults["+ i +"].Message"));
			result.setRuleName(context.stringValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults["+ i +"].RuleName"));
			result.setCode(context.stringValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults["+ i +"].Code"));
			result.setSuccess(context.booleanValue("ApplyMetricRuleTemplateResponse.Resource.AlertResults["+ i +"].Success"));

			alertResults.add(result);
		}
		resource.setAlertResults(alertResults);
		applyMetricRuleTemplateResponse.setResource(resource);
	 
	 	return applyMetricRuleTemplateResponse;
	}
}