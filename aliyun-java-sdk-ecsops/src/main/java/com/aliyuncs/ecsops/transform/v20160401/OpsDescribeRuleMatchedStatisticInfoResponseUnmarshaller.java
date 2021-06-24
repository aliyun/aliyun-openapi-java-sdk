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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRuleMatchedStatisticInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRuleMatchedStatisticInfoResponse.RuleMatchedStatisticsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeRuleMatchedStatisticInfoResponseUnmarshaller {

	public static OpsDescribeRuleMatchedStatisticInfoResponse unmarshall(OpsDescribeRuleMatchedStatisticInfoResponse opsDescribeRuleMatchedStatisticInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeRuleMatchedStatisticInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeRuleMatchedStatisticInfoResponse.RequestId"));
		opsDescribeRuleMatchedStatisticInfoResponse.setTotalCount(_ctx.integerValue("OpsDescribeRuleMatchedStatisticInfoResponse.TotalCount"));
		opsDescribeRuleMatchedStatisticInfoResponse.setPageSize(_ctx.integerValue("OpsDescribeRuleMatchedStatisticInfoResponse.PageSize"));
		opsDescribeRuleMatchedStatisticInfoResponse.setPage(_ctx.integerValue("OpsDescribeRuleMatchedStatisticInfoResponse.Page"));
		opsDescribeRuleMatchedStatisticInfoResponse.setCount(_ctx.integerValue("OpsDescribeRuleMatchedStatisticInfoResponse.Count"));

		List<RuleMatchedStatisticsInfo> ruleMatchedStatisticsInfos = new ArrayList<RuleMatchedStatisticsInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeRuleMatchedStatisticInfoResponse.RuleMatchedStatisticsInfos.Length"); i++) {
			RuleMatchedStatisticsInfo ruleMatchedStatisticsInfo = new RuleMatchedStatisticsInfo();
			ruleMatchedStatisticsInfo.setGroupedDateTime(_ctx.stringValue("OpsDescribeRuleMatchedStatisticInfoResponse.RuleMatchedStatisticsInfos["+ i +"].GroupedDateTime"));
			ruleMatchedStatisticsInfo.setDistinctResourceCount(_ctx.integerValue("OpsDescribeRuleMatchedStatisticInfoResponse.RuleMatchedStatisticsInfos["+ i +"].DistinctResourceCount"));
			ruleMatchedStatisticsInfo.setRuleName(_ctx.stringValue("OpsDescribeRuleMatchedStatisticInfoResponse.RuleMatchedStatisticsInfos["+ i +"].RuleName"));

			ruleMatchedStatisticsInfos.add(ruleMatchedStatisticsInfo);
		}
		opsDescribeRuleMatchedStatisticInfoResponse.setRuleMatchedStatisticsInfos(ruleMatchedStatisticsInfos);
	 
	 	return opsDescribeRuleMatchedStatisticInfoResponse;
	}
}