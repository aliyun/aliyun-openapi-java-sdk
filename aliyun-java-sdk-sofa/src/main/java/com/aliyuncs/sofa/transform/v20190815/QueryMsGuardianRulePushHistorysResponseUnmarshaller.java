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

import com.aliyuncs.sofa.model.v20190815.QueryMsGuardianRulePushHistorysResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsGuardianRulePushHistorysResponse.PushHistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsGuardianRulePushHistorysResponseUnmarshaller {

	public static QueryMsGuardianRulePushHistorysResponse unmarshall(QueryMsGuardianRulePushHistorysResponse queryMsGuardianRulePushHistorysResponse, UnmarshallerContext _ctx) {
		
		queryMsGuardianRulePushHistorysResponse.setRequestId(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.RequestId"));
		queryMsGuardianRulePushHistorysResponse.setResultCode(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.ResultCode"));
		queryMsGuardianRulePushHistorysResponse.setResultMessage(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.ResultMessage"));
		queryMsGuardianRulePushHistorysResponse.setCurrentPage(_ctx.longValue("QueryMsGuardianRulePushHistorysResponse.CurrentPage"));
		queryMsGuardianRulePushHistorysResponse.setPageSize(_ctx.longValue("QueryMsGuardianRulePushHistorysResponse.PageSize"));
		queryMsGuardianRulePushHistorysResponse.setStartIndex(_ctx.longValue("QueryMsGuardianRulePushHistorysResponse.StartIndex"));
		queryMsGuardianRulePushHistorysResponse.setTotalSize(_ctx.longValue("QueryMsGuardianRulePushHistorysResponse.TotalSize"));

		List<PushHistoriesItem> pushHistories = new ArrayList<PushHistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsGuardianRulePushHistorysResponse.PushHistories.Length"); i++) {
			PushHistoriesItem pushHistoriesItem = new PushHistoriesItem();
			pushHistoriesItem.setAppName(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].AppName"));
			pushHistoriesItem.setGmtCreate(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].GmtCreate"));
			pushHistoriesItem.setId(_ctx.longValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].Id"));
			pushHistoriesItem.setInstanceId(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].InstanceId"));
			pushHistoriesItem.setOperator(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].Operator"));
			pushHistoriesItem.setPushContent(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].PushContent"));
			pushHistoriesItem.setRuleIds(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].RuleIds"));
			pushHistoriesItem.setSuccess(_ctx.booleanValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].Success"));
			pushHistoriesItem.setTarget(_ctx.stringValue("QueryMsGuardianRulePushHistorysResponse.PushHistories["+ i +"].Target"));

			pushHistories.add(pushHistoriesItem);
		}
		queryMsGuardianRulePushHistorysResponse.setPushHistories(pushHistories);
	 
	 	return queryMsGuardianRulePushHistorysResponse;
	}
}