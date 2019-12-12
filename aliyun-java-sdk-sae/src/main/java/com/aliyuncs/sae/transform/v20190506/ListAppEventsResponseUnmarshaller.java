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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListAppEventsResponse;
import com.aliyuncs.sae.model.v20190506.ListAppEventsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListAppEventsResponse.Data.AppEventEntityItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppEventsResponseUnmarshaller {

	public static ListAppEventsResponse unmarshall(ListAppEventsResponse listAppEventsResponse, UnmarshallerContext _ctx) {
		
		listAppEventsResponse.setRequestId(_ctx.stringValue("ListAppEventsResponse.RequestId"));
		listAppEventsResponse.setCode(_ctx.stringValue("ListAppEventsResponse.Code"));
		listAppEventsResponse.setMessage(_ctx.stringValue("ListAppEventsResponse.Message"));
		listAppEventsResponse.setSuccess(_ctx.booleanValue("ListAppEventsResponse.Success"));
		listAppEventsResponse.setErrorCode(_ctx.stringValue("ListAppEventsResponse.ErrorCode"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListAppEventsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListAppEventsResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListAppEventsResponse.Data.TotalSize"));

		List<AppEventEntityItem> appEventEntity = new ArrayList<AppEventEntityItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppEventsResponse.Data.AppEventEntity.Length"); i++) {
			AppEventEntityItem appEventEntityItem = new AppEventEntityItem();
			appEventEntityItem.setObjectKind(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].ObjectKind"));
			appEventEntityItem.setObjectName(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].ObjectName"));
			appEventEntityItem.setEventType(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].EventType"));
			appEventEntityItem.setMessage(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].Message"));
			appEventEntityItem.setFirstTimestamp(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].FirstTimestamp"));
			appEventEntityItem.setLastTimestamp(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].LastTimestamp"));
			appEventEntityItem.setReason(_ctx.stringValue("ListAppEventsResponse.Data.AppEventEntity["+ i +"].Reason"));

			appEventEntity.add(appEventEntityItem);
		}
		data.setAppEventEntity(appEventEntity);
		listAppEventsResponse.setData(data);
	 
	 	return listAppEventsResponse;
	}
}