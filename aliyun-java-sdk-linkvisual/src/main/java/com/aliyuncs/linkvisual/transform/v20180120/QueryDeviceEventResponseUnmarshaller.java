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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceEventResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceEventResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceEventResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceEventResponseUnmarshaller {

	public static QueryDeviceEventResponse unmarshall(QueryDeviceEventResponse queryDeviceEventResponse, UnmarshallerContext _ctx) {
		
		queryDeviceEventResponse.setRequestId(_ctx.stringValue("QueryDeviceEventResponse.RequestId"));
		queryDeviceEventResponse.setSuccess(_ctx.booleanValue("QueryDeviceEventResponse.Success"));
		queryDeviceEventResponse.setErrorMessage(_ctx.stringValue("QueryDeviceEventResponse.ErrorMessage"));
		queryDeviceEventResponse.setCode(_ctx.stringValue("QueryDeviceEventResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryDeviceEventResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryDeviceEventResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryDeviceEventResponse.Data.Page"));
		data.setPageCount(_ctx.integerValue("QueryDeviceEventResponse.Data.PageCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceEventResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setEventId(_ctx.stringValue("QueryDeviceEventResponse.Data.List["+ i +"].EventId"));
			listItem.setEventTime(_ctx.stringValue("QueryDeviceEventResponse.Data.List["+ i +"].EventTime"));
			listItem.setEventType(_ctx.integerValue("QueryDeviceEventResponse.Data.List["+ i +"].EventType"));
			listItem.setEventDesc(_ctx.stringValue("QueryDeviceEventResponse.Data.List["+ i +"].EventDesc"));
			listItem.setEventPicId(_ctx.stringValue("QueryDeviceEventResponse.Data.List["+ i +"].EventPicId"));
			listItem.setEventData(_ctx.stringValue("QueryDeviceEventResponse.Data.List["+ i +"].EventData"));

			list.add(listItem);
		}
		data.setList(list);
		queryDeviceEventResponse.setData(data);
	 
	 	return queryDeviceEventResponse;
	}
}