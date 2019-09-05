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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ModifyNotificationConfigResponse;
import com.aliyuncs.ccc.model.v20170705.ModifyNotificationConfigResponse.SubscriptionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyNotificationConfigResponseUnmarshaller {

	public static ModifyNotificationConfigResponse unmarshall(ModifyNotificationConfigResponse modifyNotificationConfigResponse, UnmarshallerContext _ctx) {
		
		modifyNotificationConfigResponse.setRequestId(_ctx.stringValue("ModifyNotificationConfigResponse.RequestId"));
		modifyNotificationConfigResponse.setSuccess(_ctx.booleanValue("ModifyNotificationConfigResponse.Success"));
		modifyNotificationConfigResponse.setCode(_ctx.stringValue("ModifyNotificationConfigResponse.Code"));
		modifyNotificationConfigResponse.setMessage(_ctx.stringValue("ModifyNotificationConfigResponse.Message"));
		modifyNotificationConfigResponse.setHttpStatusCode(_ctx.integerValue("ModifyNotificationConfigResponse.HttpStatusCode"));
		modifyNotificationConfigResponse.setProducerId(_ctx.stringValue("ModifyNotificationConfigResponse.ProducerId"));
		modifyNotificationConfigResponse.setAccessPoint(_ctx.stringValue("ModifyNotificationConfigResponse.AccessPoint"));
		modifyNotificationConfigResponse.setTopic(_ctx.stringValue("ModifyNotificationConfigResponse.Topic"));

		List<SubscriptionsItem> subscriptions = new ArrayList<SubscriptionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyNotificationConfigResponse.Subscriptions.Length"); i++) {
			SubscriptionsItem subscriptionsItem = new SubscriptionsItem();
			subscriptionsItem.setName(_ctx.stringValue("ModifyNotificationConfigResponse.Subscriptions["+ i +"].Name"));
			subscriptionsItem.setSelected(_ctx.booleanValue("ModifyNotificationConfigResponse.Subscriptions["+ i +"].Selected"));
			subscriptionsItem.setDisplayName(_ctx.stringValue("ModifyNotificationConfigResponse.Subscriptions["+ i +"].DisplayName"));

			subscriptions.add(subscriptionsItem);
		}
		modifyNotificationConfigResponse.setSubscriptions(subscriptions);
	 
	 	return modifyNotificationConfigResponse;
	}
}