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

import com.aliyuncs.sofa.model.v20190815.ListClriskIssueTaskResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskIssueTaskResponse.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskIssueTaskResponseUnmarshaller {

	public static ListClriskIssueTaskResponse unmarshall(ListClriskIssueTaskResponse listClriskIssueTaskResponse, UnmarshallerContext _ctx) {
		
		listClriskIssueTaskResponse.setRequestId(_ctx.stringValue("ListClriskIssueTaskResponse.RequestId"));
		listClriskIssueTaskResponse.setResultCode(_ctx.stringValue("ListClriskIssueTaskResponse.ResultCode"));
		listClriskIssueTaskResponse.setResultMessage(_ctx.stringValue("ListClriskIssueTaskResponse.ResultMessage"));
		listClriskIssueTaskResponse.setPageCount(_ctx.longValue("ListClriskIssueTaskResponse.PageCount"));
		listClriskIssueTaskResponse.setPageNumber(_ctx.longValue("ListClriskIssueTaskResponse.PageNumber"));
		listClriskIssueTaskResponse.setPageSize(_ctx.longValue("ListClriskIssueTaskResponse.PageSize"));
		listClriskIssueTaskResponse.setTotalCount(_ctx.longValue("ListClriskIssueTaskResponse.TotalCount"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskIssueTaskResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setCycle(_ctx.stringValue("ListClriskIssueTaskResponse.DataList["+ i +"].Cycle"));
			dataListItem.setDiffSize(_ctx.longValue("ListClriskIssueTaskResponse.DataList["+ i +"].DiffSize"));
			dataListItem.setGmtModified(_ctx.stringValue("ListClriskIssueTaskResponse.DataList["+ i +"].GmtModified"));
			dataListItem.setIssueDataId(_ctx.longValue("ListClriskIssueTaskResponse.DataList["+ i +"].IssueDataId"));
			dataListItem.setTaskId(_ctx.longValue("ListClriskIssueTaskResponse.DataList["+ i +"].TaskId"));

			dataList.add(dataListItem);
		}
		listClriskIssueTaskResponse.setDataList(dataList);
	 
	 	return listClriskIssueTaskResponse;
	}
}