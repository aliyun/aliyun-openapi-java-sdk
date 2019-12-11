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

import com.aliyuncs.cms.model.v20190101.PutResourceMetricRulesResponse;
import com.aliyuncs.cms.model.v20190101.PutResourceMetricRulesResponse.Target;
import com.aliyuncs.cms.model.v20190101.PutResourceMetricRulesResponse.Target.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutResourceMetricRulesResponseUnmarshaller {

	public static PutResourceMetricRulesResponse unmarshall(PutResourceMetricRulesResponse putResourceMetricRulesResponse, UnmarshallerContext _ctx) {
		
		putResourceMetricRulesResponse.setRequestId(_ctx.stringValue("PutResourceMetricRulesResponse.RequestId"));
		putResourceMetricRulesResponse.setSuccess(_ctx.booleanValue("PutResourceMetricRulesResponse.Success"));
		putResourceMetricRulesResponse.setCode(_ctx.stringValue("PutResourceMetricRulesResponse.Code"));
		putResourceMetricRulesResponse.setMessage(_ctx.stringValue("PutResourceMetricRulesResponse.Message"));

		List<Target> failedListResult = new ArrayList<Target>();
		for (int i = 0; i < _ctx.lengthValue("PutResourceMetricRulesResponse.FailedListResult.Length"); i++) {
			Target target = new Target();
			target.setRuleId(_ctx.stringValue("PutResourceMetricRulesResponse.FailedListResult["+ i +"].RuleId"));

			Result result = new Result();
			result.setCode(_ctx.stringValue("PutResourceMetricRulesResponse.FailedListResult["+ i +"].Result.Code"));
			result.setMessage(_ctx.stringValue("PutResourceMetricRulesResponse.FailedListResult["+ i +"].Result.Message"));
			result.setSuccess(_ctx.booleanValue("PutResourceMetricRulesResponse.FailedListResult["+ i +"].Result.Success"));
			target.setResult(result);

			failedListResult.add(target);
		}
		putResourceMetricRulesResponse.setFailedListResult(failedListResult);
	 
	 	return putResourceMetricRulesResponse;
	}
}