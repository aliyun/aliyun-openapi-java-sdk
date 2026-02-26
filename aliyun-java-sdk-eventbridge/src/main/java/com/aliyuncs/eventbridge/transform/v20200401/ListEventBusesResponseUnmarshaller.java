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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.ListEventBusesResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListEventBusesResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListEventBusesResponse.Data.EventBusesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventBusesResponseUnmarshaller {

	public static ListEventBusesResponse unmarshall(ListEventBusesResponse listEventBusesResponse, UnmarshallerContext _ctx) {
		
		listEventBusesResponse.setRequestId(_ctx.stringValue("ListEventBusesResponse.RequestId"));
		listEventBusesResponse.setMessage(_ctx.stringValue("ListEventBusesResponse.Message"));
		listEventBusesResponse.setCode(_ctx.stringValue("ListEventBusesResponse.Code"));
		listEventBusesResponse.setSuccess(_ctx.booleanValue("ListEventBusesResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListEventBusesResponse.Data.NextToken"));
		data.setTotal(_ctx.integerValue("ListEventBusesResponse.Data.Total"));

		List<EventBusesItem> eventBuses = new ArrayList<EventBusesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventBusesResponse.Data.EventBuses.Length"); i++) {
			EventBusesItem eventBusesItem = new EventBusesItem();
			eventBusesItem.setEventBusARN(_ctx.stringValue("ListEventBusesResponse.Data.EventBuses["+ i +"].EventBusARN"));
			eventBusesItem.setEventBusName(_ctx.stringValue("ListEventBusesResponse.Data.EventBuses["+ i +"].EventBusName"));
			eventBusesItem.setDescription(_ctx.stringValue("ListEventBusesResponse.Data.EventBuses["+ i +"].Description"));
			eventBusesItem.setCreateTimestamp(_ctx.longValue("ListEventBusesResponse.Data.EventBuses["+ i +"].CreateTimestamp"));

			eventBuses.add(eventBusesItem);
		}
		data.setEventBuses(eventBuses);
		listEventBusesResponse.setData(data);
	 
	 	return listEventBusesResponse;
	}
}