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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetNotificationConfigResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetNotificationConfigResponse.SubscriptionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNotificationConfigResponseUnmarshaller {

	public static GetNotificationConfigResponse unmarshall(GetNotificationConfigResponse getNotificationConfigResponse, UnmarshallerContext context) {
		
		getNotificationConfigResponse.setRequestId(context.stringValue("GetNotificationConfigResponse.RequestId"));
		getNotificationConfigResponse.setSuccess(context.booleanValue("GetNotificationConfigResponse.Success"));
		getNotificationConfigResponse.setCode(context.stringValue("GetNotificationConfigResponse.Code"));
		getNotificationConfigResponse.setMessage(context.stringValue("GetNotificationConfigResponse.Message"));
		getNotificationConfigResponse.setHttpStatusCode(context.integerValue("GetNotificationConfigResponse.HttpStatusCode"));
		getNotificationConfigResponse.setProducerId(context.stringValue("GetNotificationConfigResponse.ProducerId"));
		getNotificationConfigResponse.setAccessPoint(context.stringValue("GetNotificationConfigResponse.AccessPoint"));
		getNotificationConfigResponse.setTopic(context.stringValue("GetNotificationConfigResponse.Topic"));

		List<SubscriptionsItem> subscriptions = new ArrayList<SubscriptionsItem>();
		for (int i = 0; i < context.lengthValue("GetNotificationConfigResponse.Subscriptions.Length"); i++) {
			SubscriptionsItem subscriptionsItem = new SubscriptionsItem();
			subscriptionsItem.setName(context.stringValue("GetNotificationConfigResponse.Subscriptions["+ i +"].Name"));
			subscriptionsItem.setDisplayName(context.stringValue("GetNotificationConfigResponse.Subscriptions["+ i +"].DisplayName"));
			subscriptionsItem.setSelected(context.booleanValue("GetNotificationConfigResponse.Subscriptions["+ i +"].Selected"));

			subscriptions.add(subscriptionsItem);
		}
		getNotificationConfigResponse.setSubscriptions(subscriptions);
	 
	 	return getNotificationConfigResponse;
	}
}