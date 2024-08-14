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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetTicketResponse;
import com.aliyuncs.ccc.model.v20200701.GetTicketResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTicketResponseUnmarshaller {

	public static GetTicketResponse unmarshall(GetTicketResponse getTicketResponse, UnmarshallerContext _ctx) {
		
		getTicketResponse.setRequestId(_ctx.stringValue("GetTicketResponse.RequestId"));
		getTicketResponse.setHttpStatusCode(_ctx.integerValue("GetTicketResponse.HttpStatusCode"));
		getTicketResponse.setCode(_ctx.stringValue("GetTicketResponse.Code"));
		getTicketResponse.setMessage(_ctx.stringValue("GetTicketResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTicketResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetTicketResponse.Params["+ i +"]"));
		}
		getTicketResponse.setParams(params);

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetTicketResponse.Data.InstanceId"));
		data.setTicketId(_ctx.stringValue("GetTicketResponse.Data.TicketId"));
		data.setTemplateId(_ctx.stringValue("GetTicketResponse.Data.TemplateId"));
		data.setTemplateVersion(_ctx.stringValue("GetTicketResponse.Data.TemplateVersion"));
		data.setTitle(_ctx.stringValue("GetTicketResponse.Data.Title"));
		data.setContext(_ctx.stringValue("GetTicketResponse.Data.Context"));
		data.setAssignee(_ctx.stringValue("GetTicketResponse.Data.Assignee"));
		data.setAssigneeName(_ctx.stringValue("GetTicketResponse.Data.AssigneeName"));
		data.setCreator(_ctx.stringValue("GetTicketResponse.Data.Creator"));
		data.setCreatorName(_ctx.stringValue("GetTicketResponse.Data.CreatorName"));
		data.setCategoryId(_ctx.stringValue("GetTicketResponse.Data.CategoryId"));
		data.setCategoryName(_ctx.stringValue("GetTicketResponse.Data.CategoryName"));
		data.setJobId(_ctx.stringValue("GetTicketResponse.Data.JobId"));
		data.setStartTime(_ctx.longValue("GetTicketResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("GetTicketResponse.Data.EndTime"));
		data.setCreatedTime(_ctx.longValue("GetTicketResponse.Data.CreatedTime"));
		data.setUpdatedTime(_ctx.longValue("GetTicketResponse.Data.UpdatedTime"));
		data.setCurrentTaskId(_ctx.stringValue("GetTicketResponse.Data.CurrentTaskId"));
		data.setCurrentTaskName(_ctx.stringValue("GetTicketResponse.Data.CurrentTaskName"));
		data.setCurrentTaskStartTime(_ctx.longValue("GetTicketResponse.Data.CurrentTaskStartTime"));
		data.setSource(_ctx.stringValue("GetTicketResponse.Data.Source"));
		data.setCustomerId(_ctx.stringValue("GetTicketResponse.Data.CustomerId"));
		data.setState(_ctx.stringValue("GetTicketResponse.Data.State"));
		data.setCloseCode(_ctx.stringValue("GetTicketResponse.Data.CloseCode"));
		data.setComment(_ctx.stringValue("GetTicketResponse.Data.Comment"));
		getTicketResponse.setData(data);
	 
	 	return getTicketResponse;
	}
}