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

	public static DescribeRiskCheckSummaryResponse unmarshall(DescribeRiskCheckSummaryResponse describeRiskCheckSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRiskCheckSummaryResponse.setRequestId(_ctx.stringValue("DescribeRiskCheckSummaryResponse.RequestId"));

		RiskCheckSummary riskCheckSummary = new RiskCheckSummary();
		riskCheckSummary.setRiskCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskCount"));
		riskCheckSummary.setPreviousCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.PreviousCount"));
		riskCheckSummary.setItemCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.ItemCount"));
		riskCheckSummary.setRiskRate(_ctx.floatValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskRate"));
		riskCheckSummary.setAffectedAssetCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.AffectedAssetCount"));
		riskCheckSummary.setPreviousTime(_ctx.longValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.PreviousTime"));
		riskCheckSummary.setEnabledRiskCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.EnabledRiskCount"));
		riskCheckSummary.setDisabledRiskCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.DisabledRiskCount"));

		List<LevelCount> riskLevelCount = new ArrayList<LevelCount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskLevelCount.Length"); i++) {
			LevelCount levelCount = new LevelCount();
			levelCount.setKey(_ctx.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskLevelCount["+ i +"].Key"));
			levelCount.setCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.RiskLevelCount["+ i +"].Count"));

			riskLevelCount.add(levelCount);
		}
		riskCheckSummary.setRiskLevelCount(riskLevelCount);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups.Length"); i++) {
			Group group = new Group();
			group.setId(_ctx.longValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Id"));
			group.setTitle(_ctx.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Title"));
			group.setStatus(_ctx.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Status"));
			group.setRemainingTime(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].RemainingTime"));
			group.setSort(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].Sort"));

			List<StatusCount> countByStatus = new ArrayList<StatusCount>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].CountByStatus.Length"); j++) {
				StatusCount statusCount = new StatusCount();
				statusCount.setStatus(_ctx.stringValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].CountByStatus["+ j +"].Status"));
				statusCount.setCount(_ctx.integerValue("DescribeRiskCheckSummaryResponse.RiskCheckSummary.Groups["+ i +"].CountByStatus["+ j +"].Count"));

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