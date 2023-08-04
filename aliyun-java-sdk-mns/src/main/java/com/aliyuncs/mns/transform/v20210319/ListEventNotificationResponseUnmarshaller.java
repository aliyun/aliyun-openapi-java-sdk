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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListEventNotificationResponse;
import com.aliyuncs.mns.model.v20210319.ListEventNotificationResponse.DataItem;
import com.aliyuncs.mns.model.v20210319.ListEventNotificationResponse.DataItem.ResourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventNotificationResponseUnmarshaller {

	public static ListEventNotificationResponse unmarshall(ListEventNotificationResponse listEventNotificationResponse, UnmarshallerContext _ctx) {
		
		listEventNotificationResponse.setRequestId(_ctx.stringValue("ListEventNotificationResponse.RequestId"));
		listEventNotificationResponse.setCode(_ctx.longValue("ListEventNotificationResponse.Code"));
		listEventNotificationResponse.setStatus(_ctx.stringValue("ListEventNotificationResponse.Status"));
		listEventNotificationResponse.setMessage(_ctx.stringValue("ListEventNotificationResponse.Message"));
		listEventNotificationResponse.setSuccess(_ctx.booleanValue("ListEventNotificationResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventNotificationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIdentifier(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].Identifier"));
			dataItem.setTopicName(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].TopicName"));
			dataItem.setIsDefaultRule(_ctx.booleanValue("ListEventNotificationResponse.Data["+ i +"].IsDefaultRule"));

			List<String> eventType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventNotificationResponse.Data["+ i +"].EventType.Length"); j++) {
				eventType.add(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].EventType["+ j +"]"));
			}
			dataItem.setEventType(eventType);

			List<String> endpoint = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventNotificationResponse.Data["+ i +"].Endpoint.Length"); j++) {
				endpoint.add(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].Endpoint["+ j +"]"));
			}
			dataItem.setEndpoint(endpoint);

			List<ResourceItem> resource = new ArrayList<ResourceItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventNotificationResponse.Data["+ i +"].Resource.Length"); j++) {
				ResourceItem resourceItem = new ResourceItem();
				resourceItem.setName(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].Resource["+ j +"].Name"));
				resourceItem.setPrefix(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].Resource["+ j +"].Prefix"));
				resourceItem.setSuffix(_ctx.stringValue("ListEventNotificationResponse.Data["+ i +"].Resource["+ j +"].Suffix"));

				resource.add(resourceItem);
			}
			dataItem.setResource(resource);

			data.add(dataItem);
		}
		listEventNotificationResponse.setData(data);
	 
	 	return listEventNotificationResponse;
	}
}