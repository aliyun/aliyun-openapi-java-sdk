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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceRateLimitRulesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServiceRateLimitRulesResponseUnmarshaller {

	public static QueryMsSgServiceRateLimitRulesResponse unmarshall(QueryMsSgServiceRateLimitRulesResponse queryMsSgServiceRateLimitRulesResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServiceRateLimitRulesResponse.setRequestId(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.RequestId"));
		queryMsSgServiceRateLimitRulesResponse.setResultCode(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ResultCode"));
		queryMsSgServiceRateLimitRulesResponse.setResultMessage(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ResultMessage"));
		queryMsSgServiceRateLimitRulesResponse.setCurrentPage(_ctx.longValue("QueryMsSgServiceRateLimitRulesResponse.CurrentPage"));
		queryMsSgServiceRateLimitRulesResponse.setPageSize(_ctx.longValue("QueryMsSgServiceRateLimitRulesResponse.PageSize"));
		queryMsSgServiceRateLimitRulesResponse.setStartIndex(_ctx.longValue("QueryMsSgServiceRateLimitRulesResponse.StartIndex"));
		queryMsSgServiceRateLimitRulesResponse.setTotalSize(_ctx.longValue("QueryMsSgServiceRateLimitRulesResponse.TotalSize"));

		List<ServiceRateLimitRulesItem> serviceRateLimitRules = new ArrayList<ServiceRateLimitRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules.Length"); i++) {
			ServiceRateLimitRulesItem serviceRateLimitRulesItem = new ServiceRateLimitRulesItem();
			serviceRateLimitRulesItem.setAppName(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].AppName"));
			serviceRateLimitRulesItem.setDataId(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].DataId"));
			serviceRateLimitRulesItem.setEnable(_ctx.booleanValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].Enable"));
			serviceRateLimitRulesItem.setGmtCreate(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].GmtCreate"));
			serviceRateLimitRulesItem.setGmtModified(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].GmtModified"));
			serviceRateLimitRulesItem.setId(_ctx.longValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].Id"));
			serviceRateLimitRulesItem.setInstanceId(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].InstanceId"));
			serviceRateLimitRulesItem.setName(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].Name"));
			serviceRateLimitRulesItem.setOperator(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].Operator"));
			serviceRateLimitRulesItem.setResourceType(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].ResourceType"));
			serviceRateLimitRulesItem.setRuleConfig(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].RuleConfig"));
			serviceRateLimitRulesItem.setRunMode(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].RunMode"));
			serviceRateLimitRulesItem.setServiceType(_ctx.stringValue("QueryMsSgServiceRateLimitRulesResponse.ServiceRateLimitRules["+ i +"].ServiceType"));

			serviceRateLimitRules.add(serviceRateLimitRulesItem);
		}
		queryMsSgServiceRateLimitRulesResponse.setServiceRateLimitRules(serviceRateLimitRules);
	 
	 	return queryMsSgServiceRateLimitRulesResponse;
	}
}