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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRuleMatchedStatisticsDetailResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeRuleMatchedStatisticsDetailResponseUnmarshaller {

	public static OpsDescribeRuleMatchedStatisticsDetailResponse unmarshall(OpsDescribeRuleMatchedStatisticsDetailResponse opsDescribeRuleMatchedStatisticsDetailResponse, UnmarshallerContext _ctx) {
		
		opsDescribeRuleMatchedStatisticsDetailResponse.setRequestId(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RequestId"));
		opsDescribeRuleMatchedStatisticsDetailResponse.setTotalCount(_ctx.integerValue("OpsDescribeRuleMatchedStatisticsDetailResponse.TotalCount"));
		opsDescribeRuleMatchedStatisticsDetailResponse.setPageSize(_ctx.integerValue("OpsDescribeRuleMatchedStatisticsDetailResponse.PageSize"));
		opsDescribeRuleMatchedStatisticsDetailResponse.setPage(_ctx.integerValue("OpsDescribeRuleMatchedStatisticsDetailResponse.Page"));
		opsDescribeRuleMatchedStatisticsDetailResponse.setCount(_ctx.integerValue("OpsDescribeRuleMatchedStatisticsDetailResponse.Count"));

		List<RuleMatchedStatisticsDetail> ruleMatchedStatisticsDetails = new ArrayList<RuleMatchedStatisticsDetail>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails.Length"); i++) {
			RuleMatchedStatisticsDetail ruleMatchedStatisticsDetail = new RuleMatchedStatisticsDetail();
			ruleMatchedStatisticsDetail.setEventId(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].EventId"));
			ruleMatchedStatisticsDetail.setFirstMatchedDate(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].FirstMatchedDate"));
			ruleMatchedStatisticsDetail.setDimensions(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].Dimensions"));
			ruleMatchedStatisticsDetail.setLastMatchedDate(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].LastMatchedDate"));
			ruleMatchedStatisticsDetail.setMatchedTimes(_ctx.integerValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].MatchedTimes"));
			ruleMatchedStatisticsDetail.setTargetId(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].TargetId"));
			ruleMatchedStatisticsDetail.setRegionId(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].RegionId"));
			ruleMatchedStatisticsDetail.setFeatures(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].Features"));
			ruleMatchedStatisticsDetail.setTargetType(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].TargetType"));
			ruleMatchedStatisticsDetail.setRuleName(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].RuleName"));
			ruleMatchedStatisticsDetail.setShortDesc(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].ShortDesc"));
			ruleMatchedStatisticsDetail.setReason(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].Reason"));
			ruleMatchedStatisticsDetail.setActions(_ctx.stringValue("OpsDescribeRuleMatchedStatisticsDetailResponse.RuleMatchedStatisticsDetails["+ i +"].Actions"));

			ruleMatchedStatisticsDetails.add(ruleMatchedStatisticsDetail);
		}
		opsDescribeRuleMatchedStatisticsDetailResponse.setRuleMatchedStatisticsDetails(ruleMatchedStatisticsDetails);
	 
	 	return opsDescribeRuleMatchedStatisticsDetailResponse;
	}
}