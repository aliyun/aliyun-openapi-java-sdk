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

import com.aliyuncs.sofa.model.v20190815.ListClriskRuleRecordsResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskRuleRecordsResponse.RecordListItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskRuleRecordsResponse.TaskRecordListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskRuleRecordsResponseUnmarshaller {

	public static ListClriskRuleRecordsResponse unmarshall(ListClriskRuleRecordsResponse listClriskRuleRecordsResponse, UnmarshallerContext _ctx) {
		
		listClriskRuleRecordsResponse.setRequestId(_ctx.stringValue("ListClriskRuleRecordsResponse.RequestId"));
		listClriskRuleRecordsResponse.setResultCode(_ctx.stringValue("ListClriskRuleRecordsResponse.ResultCode"));
		listClriskRuleRecordsResponse.setResultMessage(_ctx.stringValue("ListClriskRuleRecordsResponse.ResultMessage"));
		listClriskRuleRecordsResponse.setModelCode(_ctx.stringValue("ListClriskRuleRecordsResponse.ModelCode"));
		listClriskRuleRecordsResponse.setModelName(_ctx.stringValue("ListClriskRuleRecordsResponse.ModelName"));
		listClriskRuleRecordsResponse.setPageCount(_ctx.longValue("ListClriskRuleRecordsResponse.PageCount"));
		listClriskRuleRecordsResponse.setPageNumber(_ctx.longValue("ListClriskRuleRecordsResponse.PageNumber"));
		listClriskRuleRecordsResponse.setPageSize(_ctx.longValue("ListClriskRuleRecordsResponse.PageSize"));
		listClriskRuleRecordsResponse.setRuleCode(_ctx.stringValue("ListClriskRuleRecordsResponse.RuleCode"));
		listClriskRuleRecordsResponse.setTotalCount(_ctx.longValue("ListClriskRuleRecordsResponse.TotalCount"));

		List<RecordListItem> recordList = new ArrayList<RecordListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskRuleRecordsResponse.RecordList.Length"); i++) {
			RecordListItem recordListItem = new RecordListItem();
			recordListItem.setGmtModified(_ctx.stringValue("ListClriskRuleRecordsResponse.RecordList["+ i +"].GmtModified"));
			recordListItem.setPkgCode(_ctx.stringValue("ListClriskRuleRecordsResponse.RecordList["+ i +"].PkgCode"));
			recordListItem.setRuleCode(_ctx.stringValue("ListClriskRuleRecordsResponse.RecordList["+ i +"].RuleCode"));
			recordListItem.setRuleName(_ctx.stringValue("ListClriskRuleRecordsResponse.RecordList["+ i +"].RuleName"));
			recordListItem.setTotalError(_ctx.longValue("ListClriskRuleRecordsResponse.RecordList["+ i +"].TotalError"));
			recordListItem.setTotalSuccess(_ctx.longValue("ListClriskRuleRecordsResponse.RecordList["+ i +"].TotalSuccess"));

			recordList.add(recordListItem);
		}
		listClriskRuleRecordsResponse.setRecordList(recordList);

		List<TaskRecordListItem> taskRecordList = new ArrayList<TaskRecordListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskRuleRecordsResponse.TaskRecordList.Length"); i++) {
			TaskRecordListItem taskRecordListItem = new TaskRecordListItem();
			taskRecordListItem.setCycle(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].Cycle"));
			taskRecordListItem.setGmtCreate(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].GmtCreate"));
			taskRecordListItem.setGmtModified(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].GmtModified"));
			taskRecordListItem.setPkgCode(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].PkgCode"));
			taskRecordListItem.setResultCode(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].ResultCode"));
			taskRecordListItem.setResultDetail(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].ResultDetail"));
			taskRecordListItem.setResultSize(_ctx.longValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].ResultSize"));
			taskRecordListItem.setSqlText(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].SqlText"));
			taskRecordListItem.setStatus(_ctx.stringValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].Status"));
			taskRecordListItem.setTaskId(_ctx.longValue("ListClriskRuleRecordsResponse.TaskRecordList["+ i +"].TaskId"));

			taskRecordList.add(taskRecordListItem);
		}
		listClriskRuleRecordsResponse.setTaskRecordList(taskRecordList);
	 
	 	return listClriskRuleRecordsResponse;
	}
}