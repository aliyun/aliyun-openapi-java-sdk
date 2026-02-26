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

package com.aliyuncs.workorder.transform.v20210610;

import com.aliyuncs.workorder.model.v20210610.GetTicketResponse;
import com.aliyuncs.workorder.model.v20210610.GetTicketResponse.Data;
import com.aliyuncs.workorder.model.v20210610.GetTicketResponse.Data.Severity;
import com.aliyuncs.workorder.model.v20210610.GetTicketResponse.Data.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTicketResponseUnmarshaller {

	public static GetTicketResponse unmarshall(GetTicketResponse getTicketResponse, UnmarshallerContext _ctx) {
		
		getTicketResponse.setRequestId(_ctx.stringValue("GetTicketResponse.RequestId"));
		getTicketResponse.setSuccess(_ctx.booleanValue("GetTicketResponse.Success"));
		getTicketResponse.setCode(_ctx.integerValue("GetTicketResponse.Code"));
		getTicketResponse.setMessage(_ctx.stringValue("GetTicketResponse.Message"));
		getTicketResponse.setPageNumber(_ctx.integerValue("GetTicketResponse.PageNumber"));
		getTicketResponse.setPageSize(_ctx.integerValue("GetTicketResponse.PageSize"));
		getTicketResponse.setTotalCount(_ctx.longValue("GetTicketResponse.TotalCount"));

		Data data = new Data();
		data.setTicketId(_ctx.stringValue("GetTicketResponse.Data.TicketId"));
		data.setTitle(_ctx.stringValue("GetTicketResponse.Data.Title"));
		data.setDescription(_ctx.stringValue("GetTicketResponse.Data.Description"));
		data.setCreateTime(_ctx.longValue("GetTicketResponse.Data.CreateTime"));
		data.setCreatorId(_ctx.stringValue("GetTicketResponse.Data.CreatorId"));
		data.setCategoryId(_ctx.stringValue("GetTicketResponse.Data.CategoryId"));

		Status status = new Status();
		status.setLabel(_ctx.stringValue("GetTicketResponse.Data.Status.Label"));
		status.setValue(_ctx.stringValue("GetTicketResponse.Data.Status.Value"));
		data.setStatus(status);

		Severity severity = new Severity();
		severity.setLabel(_ctx.stringValue("GetTicketResponse.Data.Severity.Label"));
		severity.setValue(_ctx.stringValue("GetTicketResponse.Data.Severity.Value"));
		data.setSeverity(severity);
		getTicketResponse.setData(data);
	 
	 	return getTicketResponse;
	}
}