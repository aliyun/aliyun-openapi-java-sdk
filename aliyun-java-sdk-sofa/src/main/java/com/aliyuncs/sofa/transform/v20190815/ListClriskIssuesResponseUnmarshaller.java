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

import com.aliyuncs.sofa.model.v20190815.ListClriskIssuesResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskIssuesResponse.IssueListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskIssuesResponseUnmarshaller {

	public static ListClriskIssuesResponse unmarshall(ListClriskIssuesResponse listClriskIssuesResponse, UnmarshallerContext _ctx) {
		
		listClriskIssuesResponse.setRequestId(_ctx.stringValue("ListClriskIssuesResponse.RequestId"));
		listClriskIssuesResponse.setResultCode(_ctx.stringValue("ListClriskIssuesResponse.ResultCode"));
		listClriskIssuesResponse.setResultMessage(_ctx.stringValue("ListClriskIssuesResponse.ResultMessage"));
		listClriskIssuesResponse.setPageCount(_ctx.longValue("ListClriskIssuesResponse.PageCount"));
		listClriskIssuesResponse.setPageNumber(_ctx.longValue("ListClriskIssuesResponse.PageNumber"));
		listClriskIssuesResponse.setPageSize(_ctx.longValue("ListClriskIssuesResponse.PageSize"));
		listClriskIssuesResponse.setTotalCount(_ctx.longValue("ListClriskIssuesResponse.TotalCount"));

		List<IssueListItem> issueList = new ArrayList<IssueListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskIssuesResponse.IssueList.Length"); i++) {
			IssueListItem issueListItem = new IssueListItem();
			issueListItem.setCreateTime(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].CreateTime"));
			issueListItem.setDiffSize(_ctx.longValue("ListClriskIssuesResponse.IssueList["+ i +"].DiffSize"));
			issueListItem.setIssueCode(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].IssueCode"));
			issueListItem.setIssueId(_ctx.longValue("ListClriskIssuesResponse.IssueList["+ i +"].IssueId"));
			issueListItem.setModelCode(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].ModelCode"));
			issueListItem.setProcessDuration(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].ProcessDuration"));
			issueListItem.setRuleCode(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].RuleCode"));
			issueListItem.setRuleName(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].RuleName"));
			issueListItem.setSceneId(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].SceneId"));
			issueListItem.setSceneName(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].SceneName"));
			issueListItem.setStatus(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].Status"));
			issueListItem.setTriggerMode(_ctx.stringValue("ListClriskIssuesResponse.IssueList["+ i +"].TriggerMode"));

			issueList.add(issueListItem);
		}
		listClriskIssuesResponse.setIssueList(issueList);
	 
	 	return listClriskIssuesResponse;
	}
}