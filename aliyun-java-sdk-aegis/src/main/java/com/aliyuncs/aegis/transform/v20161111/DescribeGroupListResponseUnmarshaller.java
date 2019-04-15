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

import com.aliyuncs.aegis.model.v20161111.DescribeGroupListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeGroupListResponse.PageInfo;
import com.aliyuncs.aegis.model.v20161111.DescribeGroupListResponse.RuleGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupListResponseUnmarshaller {

	public static DescribeGroupListResponse unmarshall(DescribeGroupListResponse describeGroupListResponse, UnmarshallerContext context) {
		
		describeGroupListResponse.setRequestId(context.stringValue("DescribeGroupListResponse.RequestId"));
		describeGroupListResponse.setSuccess(context.booleanValue("DescribeGroupListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(context.integerValue("DescribeGroupListResponse.PageInfo.Count"));
		pageInfo.setPageSize(context.integerValue("DescribeGroupListResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeGroupListResponse.PageInfo.CurrentPage"));
		pageInfo.setTotalCount(context.integerValue("DescribeGroupListResponse.PageInfo.TotalCount"));
		describeGroupListResponse.setPageInfo(pageInfo);

		List<RuleGroupsItem> ruleGroups = new ArrayList<RuleGroupsItem>();
		for (int i = 0; i < context.lengthValue("DescribeGroupListResponse.RuleGroups.Length"); i++) {
			RuleGroupsItem ruleGroupsItem = new RuleGroupsItem();
			ruleGroupsItem.setGroupName(context.stringValue("DescribeGroupListResponse.RuleGroups["+ i +"].GroupName"));
			ruleGroupsItem.setRuleNum(context.integerValue("DescribeGroupListResponse.RuleGroups["+ i +"].RuleNum"));
			ruleGroupsItem.setModified(context.longValue("DescribeGroupListResponse.RuleGroups["+ i +"].Modified"));
			ruleGroupsItem.setCreate(context.longValue("DescribeGroupListResponse.RuleGroups["+ i +"].Create"));
			ruleGroupsItem.setDescription(context.stringValue("DescribeGroupListResponse.RuleGroups["+ i +"].Description"));
			ruleGroupsItem.setId(context.integerValue("DescribeGroupListResponse.RuleGroups["+ i +"].Id"));
			ruleGroupsItem.setAliUid(context.longValue("DescribeGroupListResponse.RuleGroups["+ i +"].AliUid"));
			ruleGroupsItem.setStatus(context.integerValue("DescribeGroupListResponse.RuleGroups["+ i +"].Status"));
			ruleGroupsItem.setMachineGroupIds(context.stringValue("DescribeGroupListResponse.RuleGroups["+ i +"].MachineGroupIds"));

			ruleGroups.add(ruleGroupsItem);
		}
		describeGroupListResponse.setRuleGroups(ruleGroups);
	 
	 	return describeGroupListResponse;
	}
}