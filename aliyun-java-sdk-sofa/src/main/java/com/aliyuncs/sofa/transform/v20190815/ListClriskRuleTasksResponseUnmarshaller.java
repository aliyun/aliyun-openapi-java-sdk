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

import com.aliyuncs.sofa.model.v20190815.ListClriskRuleTasksResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskRuleTasksResponse.TaskRecordListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskRuleTasksResponseUnmarshaller {

	public static ListClriskRuleTasksResponse unmarshall(ListClriskRuleTasksResponse listClriskRuleTasksResponse, UnmarshallerContext _ctx) {
		
		listClriskRuleTasksResponse.setRequestId(_ctx.stringValue("ListClriskRuleTasksResponse.RequestId"));
		listClriskRuleTasksResponse.setResultCode(_ctx.stringValue("ListClriskRuleTasksResponse.ResultCode"));
		listClriskRuleTasksResponse.setResultMessage(_ctx.stringValue("ListClriskRuleTasksResponse.ResultMessage"));
		listClriskRuleTasksResponse.setModelCode(_ctx.stringValue("ListClriskRuleTasksResponse.ModelCode"));
		listClriskRuleTasksResponse.setModelName(_ctx.stringValue("ListClriskRuleTasksResponse.ModelName"));
		listClriskRuleTasksResponse.setPageCount(_ctx.longValue("ListClriskRuleTasksResponse.PageCount"));
		listClriskRuleTasksResponse.setPageNumber(_ctx.longValue("ListClriskRuleTasksResponse.PageNumber"));
		listClriskRuleTasksResponse.setPageSize(_ctx.longValue("ListClriskRuleTasksResponse.PageSize"));
		listClriskRuleTasksResponse.setRuleCode(_ctx.stringValue("ListClriskRuleTasksResponse.RuleCode"));
		listClriskRuleTasksResponse.setTotalCount(_ctx.longValue("ListClriskRuleTasksResponse.TotalCount"));

		List<TaskRecordListItem> taskRecordList = new ArrayList<TaskRecordListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskRuleTasksResponse.TaskRecordList.Length"); i++) {
			TaskRecordListItem taskRecordListItem = new TaskRecordListItem();
			taskRecordListItem.setCycle(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].Cycle"));
			taskRecordListItem.setGmtCreate(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].GmtCreate"));
			taskRecordListItem.setGmtModified(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].GmtModified"));
			taskRecordListItem.setPkgCode(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].PkgCode"));
			taskRecordListItem.setResultCode(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].ResultCode"));
			taskRecordListItem.setResultDetail(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].ResultDetail"));
			taskRecordListItem.setResultSize(_ctx.longValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].ResultSize"));
			taskRecordListItem.setSqlText(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].SqlText"));
			taskRecordListItem.setStatus(_ctx.stringValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].Status"));
			taskRecordListItem.setTaskId(_ctx.longValue("ListClriskRuleTasksResponse.TaskRecordList["+ i +"].TaskId"));

			taskRecordList.add(taskRecordListItem);
		}
		listClriskRuleTasksResponse.setTaskRecordList(taskRecordList);
	 
	 	return listClriskRuleTasksResponse;
	}
}