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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckSummaryResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckSummaryResponse.RiskCheckSummary;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckSummaryResponse.RiskCheckSummary.Group;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckSummaryResponse.RiskCheckSummary.Group.StatusCount;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckSummaryResponse.RiskCheckSummary.LevelCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskCheckSummaryResponseUnmarshaller {

	public static DescribeRiskCheckSummaryResponse unmarshall(DescribeRiskCheckSummaryResponse describeRiskCheckSummaryResponse, UnmarshallerContext context) {
		
		describeRiskCheckSummaryResponse.setRequestId(context.stringValue("DescribeRiskCheckSummaryResponse.RequestId"));

		RiskCheckSummary riskCheckSummary = new RiskCheckSummary();
		riskCheckSummary.setRiskCount(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskCount"));
		riskCheckSummary.setPreviousCount(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.PreviousCount"));
		riskCheckSummary.setItemCount(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.ItemCount"));
		riskCheckSummary.setRiskRate(context.floatValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskRate"));
		riskCheckSummary.setAffectedAssetCount(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.AffectedAssetCount"));
		riskCheckSummary.setPreviousTime(context.longValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.PreviousTime"));

		List<LevelCount> riskLevelCount = new ArrayList<LevelCount>();
		for (int i = 0; i < context.lengthValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskLevelCount.Length"); i++) {
			LevelCount levelCount = new LevelCount();
			levelCount.setKey(context.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskLevelCount["+ i +"].Key"));
			levelCount.setCount(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskLevelCount["+ i +"].Count"));

			riskLevelCount.add(levelCount);
		}
		riskCheckSummary.setRiskLevelCount(riskLevelCount);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups.Length"); i++) {
			Group group = new Group();
			group.setId(context.longValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Id"));
			group.setTitle(context.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Title"));
			group.setStatus(context.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Status"));
			group.setRemainingTime(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].RemainingTime"));
			group.setSort(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Sort"));

			List<StatusCount> countByStatus = new ArrayList<StatusCount>();
			for (int j = 0; j < context.lengthValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].CountByStatus.Length"); j++) {
				StatusCount statusCount = new StatusCount();
				statusCount.setStatus(context.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].CountByStatus["+ j +"].Status"));
				statusCount.setCount(context.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].CountByStatus["+ j +"].Count"));

				countByStatus.add(statusCount);
			}
			group.setCountByStatus(countByStatus);

			groups.add(group);
		}
		riskCheckSummary.setGroups(groups);
		describeRiskCheckSummaryResponse.setRiskCheckSummary(riskCheckSummary);
	 
	 	return describeRiskCheckSummaryResponse;
	}
}