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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeJoinRuleListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeJoinRuleListResponse.JoinRuleListItem;
import com.aliyuncs.aegis.model.v20161111.DescribeJoinRuleListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJoinRuleListResponseUnmarshaller {

	public static DescribeJoinRuleListResponse unmarshall(DescribeJoinRuleListResponse describeJoinRuleListResponse, UnmarshallerContext context) {
		
		describeJoinRuleListResponse.setRequestId(context.stringValue("DescribeJoinRuleListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(context.integerValue("DescribeJoinRuleListResponse.PageInfo.Count"));
		pageInfo.setPageSize(context.integerValue("DescribeJoinRuleListResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeJoinRuleListResponse.PageInfo.CurrentPage"));
		pageInfo.setTotalCount(context.integerValue("DescribeJoinRuleListResponse.PageInfo.TotalCount"));
		describeJoinRuleListResponse.setPageInfo(pageInfo);

		List<JoinRuleListItem> joinRuleList = new ArrayList<JoinRuleListItem>();
		for (int i = 0; i < context.lengthValue("DescribeJoinRuleListResponse.JoinRuleList.Length"); i++) {
			JoinRuleListItem joinRuleListItem = new JoinRuleListItem();
			joinRuleListItem.setTimeWindow(context.integerValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].TimeWindow"));
			joinRuleListItem.setWarnLevel(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].WarnLevel"));
			joinRuleListItem.setDataSourceId1(context.integerValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].DataSourceId1"));
			joinRuleListItem.setDescription(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].Description"));
			joinRuleListItem.setRuleName(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].RuleName"));
			joinRuleListItem.setJoinRelation(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].JoinRelation"));
			joinRuleListItem.setDataSourceId2(context.integerValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].DataSourceId2"));
			joinRuleListItem.setExpression2(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].Expression2"));
			joinRuleListItem.setRuleId(context.integerValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].RuleId"));
			joinRuleListItem.setExpression1(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].Expression1"));
			joinRuleListItem.setActions(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].Actions"));
			joinRuleListItem.setStatisticsRules(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].StatisticsRules"));
			joinRuleListItem.setNeedGroup(context.booleanValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].NeedGroup"));
			joinRuleListItem.setStatusCode(context.stringValue("DescribeJoinRuleListResponse.JoinRuleList["+ i +"].StatusCode"));

			joinRuleList.add(joinRuleListItem);
		}
		describeJoinRuleListResponse.setJoinRuleList(joinRuleList);
	 
	 	return describeJoinRuleListResponse;
	}
}