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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoSyncRuleResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoSyncRuleResponse.SyncRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoSyncRuleResponseUnmarshaller {

	public static ListRepoSyncRuleResponse unmarshall(ListRepoSyncRuleResponse listRepoSyncRuleResponse, UnmarshallerContext _ctx) {
		
		listRepoSyncRuleResponse.setRequestId(_ctx.stringValue("ListRepoSyncRuleResponse.RequestId"));
		listRepoSyncRuleResponse.setIsSuccess(_ctx.booleanValue("ListRepoSyncRuleResponse.IsSuccess"));
		listRepoSyncRuleResponse.setCode(_ctx.stringValue("ListRepoSyncRuleResponse.Code"));
		listRepoSyncRuleResponse.setPageNo(_ctx.integerValue("ListRepoSyncRuleResponse.PageNo"));
		listRepoSyncRuleResponse.setPageSize(_ctx.integerValue("ListRepoSyncRuleResponse.PageSize"));
		listRepoSyncRuleResponse.setTotalCount(_ctx.integerValue("ListRepoSyncRuleResponse.TotalCount"));

		List<SyncRulesItem> syncRules = new ArrayList<SyncRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoSyncRuleResponse.SyncRules.Length"); i++) {
			SyncRulesItem syncRulesItem = new SyncRulesItem();
			syncRulesItem.setSyncRuleId(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].SyncRuleId"));
			syncRulesItem.setLocalRegionId(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].LocalRegionId"));
			syncRulesItem.setLocalInstanceId(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].LocalInstanceId"));
			syncRulesItem.setLocalNamespaceName(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].LocalNamespaceName"));
			syncRulesItem.setLocalRepoName(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].LocalRepoName"));
			syncRulesItem.setTargetRegionId(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].TargetRegionId"));
			syncRulesItem.setTargetInstanceId(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].TargetInstanceId"));
			syncRulesItem.setTargetNamespaceName(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].TargetNamespaceName"));
			syncRulesItem.setTargetRepoName(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].TargetRepoName"));
			syncRulesItem.setTagFilter(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].TagFilter"));
			syncRulesItem.setSyncScope(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].SyncScope"));
			syncRulesItem.setSyncDirection(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].SyncDirection"));
			syncRulesItem.setCreateTime(_ctx.longValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].CreateTime"));
			syncRulesItem.setModifiedTime(_ctx.longValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].ModifiedTime"));
			syncRulesItem.setSyncRuleName(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].SyncRuleName"));
			syncRulesItem.setSyncTrigger(_ctx.stringValue("ListRepoSyncRuleResponse.SyncRules["+ i +"].SyncTrigger"));

			syncRules.add(syncRulesItem);
		}
		listRepoSyncRuleResponse.setSyncRules(syncRules);
	 
	 	return listRepoSyncRuleResponse;
	}
}