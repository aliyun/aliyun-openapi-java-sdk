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

import com.aliyuncs.mns.model.v20210319.GetEventNotificationResponse;
import com.aliyuncs.mns.model.v20210319.GetEventNotificationResponse.Data;
import com.aliyuncs.mns.model.v20210319.GetEventNotificationResponse.Data.ResourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventNotificationResponseUnmarshaller {

	public static GetEventNotificationResponse unmarshall(GetEventNotificationResponse getEventNotificationResponse, UnmarshallerContext _ctx) {
		
		getEventNotificationResponse.setRequestId(_ctx.stringValue("GetEventNotificationResponse.RequestId"));
		getEventNotificationResponse.setCode(_ctx.longValue("GetEventNotificationResponse.Code"));
		getEventNotificationResponse.setStatus(_ctx.stringValue("GetEventNotificationResponse.Status"));
		getEventNotificationResponse.setMessage(_ctx.stringValue("GetEventNotificationResponse.Message"));
		getEventNotificationResponse.setSuccess(_ctx.booleanValue("GetEventNotificationResponse.Success"));

		Data data = new Data();
		data.setIdentifier(_ctx.stringValue("GetEventNotificationResponse.Data.Identifier"));
		data.setTopicName(_ctx.stringValue("GetEventNotificationResponse.Data.TopicName"));
		data.setIsDefaultRule(_ctx.booleanValue("GetEventNotificationResponse.Data.IsDefaultRule"));

		List<String> eventType = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetEventNotificationResponse.Data.EventType.Length"); i++) {
			eventType.add(_ctx.stringValue("GetEventNotificationResponse.Data.EventType["+ i +"]"));
		}
		data.setEventType(eventType);

		List<String> endpoint = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetEventNotificationResponse.Data.Endpoint.Length"); i++) {
			endpoint.add(_ctx.stringValue("GetEventNotificationResponse.Data.Endpoint["+ i +"]"));
		}
		data.setEndpoint(endpoint);

		List<ResourceItem> resource = new ArrayList<ResourceItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEventNotificationResponse.Data.Resource.Length"); i++) {
			ResourceItem resourceItem = new ResourceItem();
			resourceItem.setName(_ctx.stringValue("GetEventNotificationResponse.Data.Resource["+ i +"].Name"));
			resourceItem.setPrefix(_ctx.stringValue("GetEventNotificationResponse.Data.Resource["+ i +"].Prefix"));
			resourceItem.setSuffix(_ctx.stringValue("GetEventNotificationResponse.Data.Resource["+ i +"].Suffix"));

			resource.add(resourceItem);
		}
		data.setResource(resource);
		getEventNotificationResponse.setData(data);
	 
	 	return getEventNotificationResponse;
	}
}