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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListSubscribeDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.ListSubscribeDeviceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListSubscribeDeviceResponse.Data.SubscribeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscribeDeviceResponseUnmarshaller {

	public static ListSubscribeDeviceResponse unmarshall(ListSubscribeDeviceResponse listSubscribeDeviceResponse, UnmarshallerContext _ctx) {
		
		listSubscribeDeviceResponse.setRequestId(_ctx.stringValue("ListSubscribeDeviceResponse.RequestId"));
		listSubscribeDeviceResponse.setCode(_ctx.stringValue("ListSubscribeDeviceResponse.Code"));
		listSubscribeDeviceResponse.setMessage(_ctx.stringValue("ListSubscribeDeviceResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListSubscribeDeviceResponse.Data.TotalCount"));

		List<SubscribeListItem> subscribeList = new ArrayList<SubscribeListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscribeDeviceResponse.Data.SubscribeList.Length"); i++) {
			SubscribeListItem subscribeListItem = new SubscribeListItem();
			subscribeListItem.setUserId(_ctx.stringValue("ListSubscribeDeviceResponse.Data.SubscribeList["+ i +"].UserId"));
			subscribeListItem.setDeviceId(_ctx.stringValue("ListSubscribeDeviceResponse.Data.SubscribeList["+ i +"].DeviceId"));
			subscribeListItem.setPushConfig(_ctx.stringValue("ListSubscribeDeviceResponse.Data.SubscribeList["+ i +"].PushConfig"));
			subscribeListItem.setCreateTime(_ctx.stringValue("ListSubscribeDeviceResponse.Data.SubscribeList["+ i +"].CreateTime"));
			subscribeListItem.setUpdateTime(_ctx.stringValue("ListSubscribeDeviceResponse.Data.SubscribeList["+ i +"].UpdateTime"));

			subscribeList.add(subscribeListItem);
		}
		data.setSubscribeList(subscribeList);
		listSubscribeDeviceResponse.setData(data);
	 
	 	return listSubscribeDeviceResponse;
	}
}