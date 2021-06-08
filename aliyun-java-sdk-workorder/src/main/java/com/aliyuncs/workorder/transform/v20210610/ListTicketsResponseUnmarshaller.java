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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20210610.ListTicketsResponse;
import com.aliyuncs.workorder.model.v20210610.ListTicketsResponse.DataItem;
import com.aliyuncs.workorder.model.v20210610.ListTicketsResponse.DataItem.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketsResponseUnmarshaller {

	public static ListTicketsResponse unmarshall(ListTicketsResponse listTicketsResponse, UnmarshallerContext _ctx) {
		
		listTicketsResponse.setRequestId(_ctx.stringValue("ListTicketsResponse.RequestId"));
		listTicketsResponse.setCode(_ctx.integerValue("ListTicketsResponse.Code"));
		listTicketsResponse.setMessage(_ctx.stringValue("ListTicketsResponse.Message"));
		listTicketsResponse.setPageNumber(_ctx.integerValue("ListTicketsResponse.PageNumber"));
		listTicketsResponse.setPageSize(_ctx.integerValue("ListTicketsResponse.PageSize"));
		listTicketsResponse.setTotalCount(_ctx.longValue("ListTicketsResponse.TotalCount"));
		listTicketsResponse.setSuccess(_ctx.booleanValue("ListTicketsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTitle(_ctx.stringValue("ListTicketsResponse.Data["+ i +"].Title"));
			dataItem.setTicketId(_ctx.stringValue("ListTicketsResponse.Data["+ i +"].TicketId"));

			Status status = new Status();
			status.setLabel(_ctx.stringValue("ListTicketsResponse.Data["+ i +"].Status.Label"));
			status.setValue(_ctx.stringValue("ListTicketsResponse.Data["+ i +"].Status.Value"));
			dataItem.setStatus(status);

			data.add(dataItem);
		}
		listTicketsResponse.setData(data);
	 
	 	return listTicketsResponse;
	}
}