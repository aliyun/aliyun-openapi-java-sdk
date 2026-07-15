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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ListWorkFlowsResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ListWorkFlowsResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ListWorkFlowsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkFlowsResponseUnmarshaller {

	public static ListWorkFlowsResponse unmarshall(ListWorkFlowsResponse listWorkFlowsResponse, UnmarshallerContext _ctx) {
		
		listWorkFlowsResponse.setRequestId(_ctx.stringValue("ListWorkFlowsResponse.RequestId"));
		listWorkFlowsResponse.setMessage(_ctx.stringValue("ListWorkFlowsResponse.Message"));
		listWorkFlowsResponse.setCode(_ctx.integerValue("ListWorkFlowsResponse.Code"));
		listWorkFlowsResponse.setSuccess(_ctx.booleanValue("ListWorkFlowsResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListWorkFlowsResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListWorkFlowsResponse.Data.PageNumber"));
		data.setTotal(_ctx.integerValue("ListWorkFlowsResponse.Data.Total"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkFlowsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setDescription(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].Description"));
			record.setUpdater(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].Updater"));
			record.setCalendar(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].Calendar"));
			record.setMaxConcurrency(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].MaxConcurrency"));
			record.setTimeExpression(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].TimeExpression"));
			record.setCreator(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].Creator"));
			record.setWorkflowId(_ctx.longValue("ListWorkFlowsResponse.Data.Records["+ i +"].WorkflowId"));
			record.setNamespace(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].Namespace"));
			record.setGroupId(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].GroupId"));
			record.setName(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].Name"));
			record.setTimeType(_ctx.stringValue("ListWorkFlowsResponse.Data.Records["+ i +"].TimeType"));

			records.add(record);
		}
		data.setRecords(records);
		listWorkFlowsResponse.setData(data);
	 
	 	return listWorkFlowsResponse;
	}
}