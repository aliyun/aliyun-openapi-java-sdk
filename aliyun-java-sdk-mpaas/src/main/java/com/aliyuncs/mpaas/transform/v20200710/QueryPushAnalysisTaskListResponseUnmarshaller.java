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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.QueryPushAnalysisTaskListResponse;
import com.aliyuncs.mpaas.model.v20200710.QueryPushAnalysisTaskListResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20200710.QueryPushAnalysisTaskListResponse.ResultContent.DataItem;
import com.aliyuncs.mpaas.model.v20200710.QueryPushAnalysisTaskListResponse.ResultContent.DataItem.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushAnalysisTaskListResponseUnmarshaller {

	public static QueryPushAnalysisTaskListResponse unmarshall(QueryPushAnalysisTaskListResponse queryPushAnalysisTaskListResponse, UnmarshallerContext _ctx) {
		
		queryPushAnalysisTaskListResponse.setRequestId(_ctx.stringValue("QueryPushAnalysisTaskListResponse.RequestId"));
		queryPushAnalysisTaskListResponse.setResultCode(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultCode"));
		queryPushAnalysisTaskListResponse.setResultMessage(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPushAnalysisTaskListResponse.ResultContent.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskId(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].TaskId"));
			dataItem.setTaskName(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].TaskName"));
			dataItem.setTemplateId(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].TemplateId"));
			dataItem.setTemplateName(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].TemplateName"));
			dataItem.setType(_ctx.longValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].Type"));
			dataItem.setGmtCreate(_ctx.longValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].GmtCreate"));

			List<ListItem> list = new ArrayList<ListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List.Length"); j++) {
				ListItem listItem = new ListItem();
				listItem.setTaskId(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List["+ j +"].TaskId"));
				listItem.setTaskName(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List["+ j +"].TaskName"));
				listItem.setTemplateId(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List["+ j +"].TemplateId"));
				listItem.setTemplateName(_ctx.stringValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List["+ j +"].TemplateName"));
				listItem.setType(_ctx.longValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List["+ j +"].Type"));
				listItem.setGmtCreate(_ctx.longValue("QueryPushAnalysisTaskListResponse.ResultContent.Data["+ i +"].List["+ j +"].GmtCreate"));

				list.add(listItem);
			}
			dataItem.setList(list);

			data.add(dataItem);
		}
		resultContent.setData(data);
		queryPushAnalysisTaskListResponse.setResultContent(resultContent);
	 
	 	return queryPushAnalysisTaskListResponse;
	}
}