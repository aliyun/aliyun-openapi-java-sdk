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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDefaultEventResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDefaultEventResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDefaultEventResponse.Data.EventAttributeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDefaultEventResponseUnmarshaller {

	public static CreateDefaultEventResponse unmarshall(CreateDefaultEventResponse createDefaultEventResponse, UnmarshallerContext _ctx) {
		
		createDefaultEventResponse.setRequestId(_ctx.stringValue("CreateDefaultEventResponse.RequestId"));
		createDefaultEventResponse.setErrorDesc(_ctx.stringValue("CreateDefaultEventResponse.ErrorDesc"));
		createDefaultEventResponse.setTraceId(_ctx.stringValue("CreateDefaultEventResponse.TraceId"));
		createDefaultEventResponse.setErrorCode(_ctx.stringValue("CreateDefaultEventResponse.ErrorCode"));
		createDefaultEventResponse.setSuccess(_ctx.booleanValue("CreateDefaultEventResponse.Success"));

		Data data = new Data();
		data.setEventId(_ctx.stringValue("CreateDefaultEventResponse.Data.EventId"));
		data.setEventName(_ctx.stringValue("CreateDefaultEventResponse.Data.EventName"));
		data.setEventCode(_ctx.stringValue("CreateDefaultEventResponse.Data.EventCode"));
		data.setEventSourceId(_ctx.stringValue("CreateDefaultEventResponse.Data.EventSourceId"));
		data.setEventSourceName(_ctx.stringValue("CreateDefaultEventResponse.Data.EventSourceName"));
		data.setEventType(_ctx.longValue("CreateDefaultEventResponse.Data.EventType"));
		data.setGmtCreate(_ctx.stringValue("CreateDefaultEventResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("CreateDefaultEventResponse.Data.GmtModified"));
		data.setCreateId(_ctx.stringValue("CreateDefaultEventResponse.Data.CreateId"));
		data.setModifiedId(_ctx.stringValue("CreateDefaultEventResponse.Data.ModifiedId"));
		data.setOrgnizationId(_ctx.stringValue("CreateDefaultEventResponse.Data.OrgnizationId"));
		data.setWorkspaceId(_ctx.stringValue("CreateDefaultEventResponse.Data.WorkspaceId"));

		List<EventAttributeListItem> eventAttributeList = new ArrayList<EventAttributeListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDefaultEventResponse.Data.EventAttributeList.Length"); i++) {
			EventAttributeListItem eventAttributeListItem = new EventAttributeListItem();
			eventAttributeListItem.setEventId(_ctx.stringValue("CreateDefaultEventResponse.Data.EventAttributeList["+ i +"].EventId"));
			eventAttributeListItem.setEventAttributeName(_ctx.stringValue("CreateDefaultEventResponse.Data.EventAttributeList["+ i +"].EventAttributeName"));
			eventAttributeListItem.setEventAttributeCode(_ctx.stringValue("CreateDefaultEventResponse.Data.EventAttributeList["+ i +"].EventAttributeCode"));
			eventAttributeListItem.setEventAttributeTypeCode(_ctx.longValue("CreateDefaultEventResponse.Data.EventAttributeList["+ i +"].EventAttributeTypeCode"));

			eventAttributeList.add(eventAttributeListItem);
		}
		data.setEventAttributeList(eventAttributeList);
		createDefaultEventResponse.setData(data);
	 
	 	return createDefaultEventResponse;
	}
}