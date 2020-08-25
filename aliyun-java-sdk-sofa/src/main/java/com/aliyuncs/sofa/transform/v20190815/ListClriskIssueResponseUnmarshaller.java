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

import com.aliyuncs.sofa.model.v20190815.ListClriskIssueResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskIssueResponse.IssueListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskIssueResponseUnmarshaller {

	public static ListClriskIssueResponse unmarshall(ListClriskIssueResponse listClriskIssueResponse, UnmarshallerContext _ctx) {
		
		listClriskIssueResponse.setRequestId(_ctx.stringValue("ListClriskIssueResponse.RequestId"));
		listClriskIssueResponse.setResultCode(_ctx.stringValue("ListClriskIssueResponse.ResultCode"));
		listClriskIssueResponse.setResultMessage(_ctx.stringValue("ListClriskIssueResponse.ResultMessage"));
		listClriskIssueResponse.setPageCount(_ctx.longValue("ListClriskIssueResponse.PageCount"));
		listClriskIssueResponse.setPageNumber(_ctx.longValue("ListClriskIssueResponse.PageNumber"));
		listClriskIssueResponse.setPageSize(_ctx.longValue("ListClriskIssueResponse.PageSize"));
		listClriskIssueResponse.setTotalCount(_ctx.longValue("ListClriskIssueResponse.TotalCount"));

		List<IssueListItem> issueList = new ArrayList<IssueListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskIssueResponse.IssueList.Length"); i++) {
			IssueListItem issueListItem = new IssueListItem();
			issueListItem.setCreateTime(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].CreateTime"));
			issueListItem.setDiffSize(_ctx.longValue("ListClriskIssueResponse.IssueList["+ i +"].DiffSize"));
			issueListItem.setIssueCode(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].IssueCode"));
			issueListItem.setIssueId(_ctx.longValue("ListClriskIssueResponse.IssueList["+ i +"].IssueId"));
			issueListItem.setModelCode(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].ModelCode"));
			issueListItem.setProcessDuration(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].ProcessDuration"));
			issueListItem.setRuleCode(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].RuleCode"));
			issueListItem.setRuleName(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].RuleName"));
			issueListItem.setSceneId(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].SceneId"));
			issueListItem.setSceneName(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].SceneName"));
			issueListItem.setStatus(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].Status"));
			issueListItem.setTriggerMode(_ctx.stringValue("ListClriskIssueResponse.IssueList["+ i +"].TriggerMode"));

			issueList.add(issueListItem);
		}
		listClriskIssueResponse.setIssueList(issueList);
	 
	 	return listClriskIssueResponse;
	}
}