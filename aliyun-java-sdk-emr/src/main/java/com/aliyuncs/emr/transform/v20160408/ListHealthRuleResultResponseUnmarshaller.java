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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListHealthRuleResultResponse;
import com.aliyuncs.emr.model.v20160408.ListHealthRuleResultResponse.HealthRuleResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHealthRuleResultResponseUnmarshaller {

	public static ListHealthRuleResultResponse unmarshall(ListHealthRuleResultResponse listHealthRuleResultResponse, UnmarshallerContext context) {
		
		listHealthRuleResultResponse.setRequestId(context.stringValue("ListHealthRuleResultResponse.RequestId"));
		listHealthRuleResultResponse.setTotal(context.integerValue("ListHealthRuleResultResponse.Total"));
		listHealthRuleResultResponse.setPageNumber(context.integerValue("ListHealthRuleResultResponse.PageNumber"));
		listHealthRuleResultResponse.setPageSize(context.integerValue("ListHealthRuleResultResponse.PageSize"));

		List<HealthRuleResult> healthRuleResultList = new ArrayList<HealthRuleResult>();
		for (int i = 0; i < context.lengthValue("ListHealthRuleResultResponse.HealthRuleResultList.Length"); i++) {
			HealthRuleResult healthRuleResult = new HealthRuleResult();
			healthRuleResult.setId(context.longValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].Id"));
			healthRuleResult.setClusterId(context.longValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].ClusterId"));
			healthRuleResult.setRuleId(context.longValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].RuleId"));
			healthRuleResult.setRuleName(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].RuleName"));
			healthRuleResult.setRuleTitle(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].RuleTitle"));
			healthRuleResult.setRuleStatus(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].RuleStatus"));
			healthRuleResult.setRuleDescription(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].RuleDescription"));
			healthRuleResult.setService(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].Service"));
			healthRuleResult.setComponent(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].Component"));
			healthRuleResult.setPass(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].Pass"));
			healthRuleResult.setHostNames(context.stringValue("ListHealthRuleResultResponse.HealthRuleResultList["+ i +"].HostNames"));

			healthRuleResultList.add(healthRuleResult);
		}
		listHealthRuleResultResponse.setHealthRuleResultList(healthRuleResultList);
	 
	 	return listHealthRuleResultResponse;
	}
}