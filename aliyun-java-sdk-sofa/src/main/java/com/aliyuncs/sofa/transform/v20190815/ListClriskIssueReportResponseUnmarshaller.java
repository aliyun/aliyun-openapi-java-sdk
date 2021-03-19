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

import com.aliyuncs.sofa.model.v20190815.ListClriskIssueReportResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskIssueReportResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskIssueReportResponseUnmarshaller {

	public static ListClriskIssueReportResponse unmarshall(ListClriskIssueReportResponse listClriskIssueReportResponse, UnmarshallerContext _ctx) {
		
		listClriskIssueReportResponse.setRequestId(_ctx.stringValue("ListClriskIssueReportResponse.RequestId"));
		listClriskIssueReportResponse.setResultCode(_ctx.stringValue("ListClriskIssueReportResponse.ResultCode"));
		listClriskIssueReportResponse.setResultMessage(_ctx.stringValue("ListClriskIssueReportResponse.ResultMessage"));
		listClriskIssueReportResponse.setPageCount(_ctx.longValue("ListClriskIssueReportResponse.PageCount"));
		listClriskIssueReportResponse.setPageNumber(_ctx.longValue("ListClriskIssueReportResponse.PageNumber"));
		listClriskIssueReportResponse.setPageSize(_ctx.longValue("ListClriskIssueReportResponse.PageSize"));
		listClriskIssueReportResponse.setTotalCount(_ctx.longValue("ListClriskIssueReportResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskIssueReportResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setRelatedRuleId(_ctx.stringValue("ListClriskIssueReportResponse.List["+ i +"].RelatedRuleId"));
			listItem.setRelatedRuleName(_ctx.stringValue("ListClriskIssueReportResponse.List["+ i +"].RelatedRuleName"));
			listItem.setRuleErrorCode(_ctx.stringValue("ListClriskIssueReportResponse.List["+ i +"].RuleErrorCode"));
			listItem.setGmtCreate(_ctx.stringValue("ListClriskIssueReportResponse.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("ListClriskIssueReportResponse.List["+ i +"].GmtModified"));

			list.add(listItem);
		}
		listClriskIssueReportResponse.setList(list);
	 
	 	return listClriskIssueReportResponse;
	}
}