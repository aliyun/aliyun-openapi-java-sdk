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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListEventSubResponse;
import com.aliyuncs.live.model.v20161101.ListEventSubResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventSubResponseUnmarshaller {

	public static ListEventSubResponse unmarshall(ListEventSubResponse listEventSubResponse, UnmarshallerContext _ctx) {
		
		listEventSubResponse.setRequestId(_ctx.stringValue("ListEventSubResponse.RequestId"));

		List<Data> subscribers = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListEventSubResponse.Subscribers.Length"); i++) {
			Data data = new Data();
			data.setSubId(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].SubId"));
			data.setChannelId(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].ChannelId"));
			data.setCallbackUrl(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].CallbackUrl"));
			data.setCreateTime(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].CreateTime"));
			data.setModifyTime(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].ModifyTime"));
			data.setRoles(_ctx.integerValue("ListEventSubResponse.Subscribers["+ i +"].Roles"));

			List<String> events = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventSubResponse.Subscribers["+ i +"].Events.Length"); j++) {
				events.add(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].Events["+ j +"]"));
			}
			data.setEvents(events);

			List<String> users = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventSubResponse.Subscribers["+ i +"].Users.Length"); j++) {
				users.add(_ctx.stringValue("ListEventSubResponse.Subscribers["+ i +"].Users["+ j +"]"));
			}
			data.setUsers(users);

			subscribers.add(data);
		}
		listEventSubResponse.setSubscribers(subscribers);
	 
	 	return listEventSubResponse;
	}
}