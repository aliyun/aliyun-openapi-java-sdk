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

import com.aliyuncs.schedulerx2.model.v20190430.ListWorkflowInstanceResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ListWorkflowInstanceResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ListWorkflowInstanceResponse.Data.WfInstanceInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkflowInstanceResponseUnmarshaller {

	public static ListWorkflowInstanceResponse unmarshall(ListWorkflowInstanceResponse listWorkflowInstanceResponse, UnmarshallerContext _ctx) {
		
		listWorkflowInstanceResponse.setRequestId(_ctx.stringValue("ListWorkflowInstanceResponse.RequestId"));
		listWorkflowInstanceResponse.setCode(_ctx.integerValue("ListWorkflowInstanceResponse.Code"));
		listWorkflowInstanceResponse.setSuccess(_ctx.booleanValue("ListWorkflowInstanceResponse.Success"));
		listWorkflowInstanceResponse.setMessage(_ctx.stringValue("ListWorkflowInstanceResponse.Message"));

		Data data = new Data();

		List<WfInstanceInfosItem> wfInstanceInfos = new ArrayList<WfInstanceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos.Length"); i++) {
			WfInstanceInfosItem wfInstanceInfosItem = new WfInstanceInfosItem();
			wfInstanceInfosItem.setWfInstanceId(_ctx.longValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].WfInstanceId"));
			wfInstanceInfosItem.setWorkflowId(_ctx.longValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].WorkflowId"));
			wfInstanceInfosItem.setStatus(_ctx.integerValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].Status"));
			wfInstanceInfosItem.setStartTime(_ctx.stringValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].StartTime"));
			wfInstanceInfosItem.setEndTime(_ctx.stringValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].EndTime"));
			wfInstanceInfosItem.setScheduleTime(_ctx.stringValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].ScheduleTime"));
			wfInstanceInfosItem.setDataTime(_ctx.stringValue("ListWorkflowInstanceResponse.Data.WfInstanceInfos["+ i +"].DataTime"));

			wfInstanceInfos.add(wfInstanceInfosItem);
		}
		data.setWfInstanceInfos(wfInstanceInfos);
		listWorkflowInstanceResponse.setData(data);
	 
	 	return listWorkflowInstanceResponse;
	}
}