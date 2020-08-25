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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgDowngradeGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroupsItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroupsItem.DowngradeRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgDowngradeGroupsResponseUnmarshaller {

	public static QueryMsSgDowngradeGroupsResponse unmarshall(QueryMsSgDowngradeGroupsResponse queryMsSgDowngradeGroupsResponse, UnmarshallerContext _ctx) {
		
		queryMsSgDowngradeGroupsResponse.setRequestId(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.RequestId"));
		queryMsSgDowngradeGroupsResponse.setResultCode(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.ResultCode"));
		queryMsSgDowngradeGroupsResponse.setResultMessage(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.ResultMessage"));
		queryMsSgDowngradeGroupsResponse.setCurrentPage(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.CurrentPage"));
		queryMsSgDowngradeGroupsResponse.setPageSize(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.PageSize"));
		queryMsSgDowngradeGroupsResponse.setTotalSize(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.TotalSize"));

		List<DowngradeRuleGroupsItem> downgradeRuleGroups = new ArrayList<DowngradeRuleGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups.Length"); i++) {
			DowngradeRuleGroupsItem downgradeRuleGroupsItem = new DowngradeRuleGroupsItem();
			downgradeRuleGroupsItem.setAppName(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].AppName"));
			downgradeRuleGroupsItem.setEnabled(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].Enabled"));
			downgradeRuleGroupsItem.setId(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].Id"));
			downgradeRuleGroupsItem.setInstanceId(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].InstanceId"));
			downgradeRuleGroupsItem.setType(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].Type"));

			List<DowngradeRulesItem> downgradeRules = new ArrayList<DowngradeRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules.Length"); j++) {
				DowngradeRulesItem downgradeRulesItem = new DowngradeRulesItem();
				downgradeRulesItem.setDowngradeAction(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].DowngradeAction"));
				downgradeRulesItem.setDowngradeMethod(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].DowngradeMethod"));
				downgradeRulesItem.setDowngradeService(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].DowngradeService"));
				downgradeRulesItem.setEnabled(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].Enabled"));
				downgradeRulesItem.setGmtModified(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].GmtModified"));
				downgradeRulesItem.setGroupId(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].GroupId"));
				downgradeRulesItem.setId(_ctx.longValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].Id"));
				downgradeRulesItem.setInstanceId(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].InstanceId"));
				downgradeRulesItem.setMode(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].Mode"));
				downgradeRulesItem.setRuleName(_ctx.stringValue("QueryMsSgDowngradeGroupsResponse.DowngradeRuleGroups["+ i +"].DowngradeRules["+ j +"].RuleName"));

				downgradeRules.add(downgradeRulesItem);
			}
			downgradeRuleGroupsItem.setDowngradeRules(downgradeRules);

			downgradeRuleGroups.add(downgradeRuleGroupsItem);
		}
		queryMsSgDowngradeGroupsResponse.setDowngradeRuleGroups(downgradeRuleGroups);
	 
	 	return queryMsSgDowngradeGroupsResponse;
	}
}