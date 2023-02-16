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

import com.aliyuncs.eventbridge.model.v20200401.ListAliyunOfficialEventSourcesResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListAliyunOfficialEventSourcesResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListAliyunOfficialEventSourcesResponse.Data.EventSourceListItem;
import com.aliyuncs.eventbridge.model.v20200401.ListAliyunOfficialEventSourcesResponse.Data.EventSourceListItem.EventTypesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAliyunOfficialEventSourcesResponseUnmarshaller {

	public static ListAliyunOfficialEventSourcesResponse unmarshall(ListAliyunOfficialEventSourcesResponse listAliyunOfficialEventSourcesResponse, UnmarshallerContext _ctx) {
		
		listAliyunOfficialEventSourcesResponse.setRequestId(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.RequestId"));
		listAliyunOfficialEventSourcesResponse.setMessage(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Message"));
		listAliyunOfficialEventSourcesResponse.setCode(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Code"));
		listAliyunOfficialEventSourcesResponse.setSuccess(_ctx.booleanValue("ListAliyunOfficialEventSourcesResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.NextToken"));
		data.setTotal(_ctx.floatValue("ListAliyunOfficialEventSourcesResponse.Data.Total"));

		List<EventSourceListItem> eventSourceList = new ArrayList<EventSourceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList.Length"); i++) {
			EventSourceListItem eventSourceListItem = new EventSourceListItem();
			eventSourceListItem.setName(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].Name"));
			eventSourceListItem.setArn(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].Arn"));
			eventSourceListItem.setStatus(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].Status"));
			eventSourceListItem.setType(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].Type"));
			eventSourceListItem.setCtime(_ctx.floatValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].Ctime"));
			eventSourceListItem.setDescription(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].Description"));
			eventSourceListItem.setEventBusName(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventBusName"));

			List<EventTypesItem> eventTypes = new ArrayList<EventTypesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventTypes.Length"); j++) {
				EventTypesItem eventTypesItem = new EventTypesItem();
				eventTypesItem.setName(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventTypes["+ j +"].Name"));
				eventTypesItem.setShortName(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventTypes["+ j +"].ShortName"));
				eventTypesItem.setGroupName(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventTypes["+ j +"].GroupName"));
				eventTypesItem.setDescription(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventTypes["+ j +"].Description"));
				eventTypesItem.setEventSourceName(_ctx.stringValue("ListAliyunOfficialEventSourcesResponse.Data.EventSourceList["+ i +"].EventTypes["+ j +"].EventSourceName"));

				eventTypes.add(eventTypesItem);
			}
			eventSourceListItem.setEventTypes(eventTypes);

			eventSourceList.add(eventSourceListItem);
		}
		data.setEventSourceList(eventSourceList);
		listAliyunOfficialEventSourcesResponse.setData(data);
	 
	 	return listAliyunOfficialEventSourcesResponse;
	}
}