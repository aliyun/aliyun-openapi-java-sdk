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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListNotificationsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNotificationsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNotificationsResponse.Data.Notification;
import com.aliyuncs.linkwan.model.v20181230.ListNotificationsResponse.Data.Notification.GatewayOfflineInfo;
import com.aliyuncs.linkwan.model.v20181230.ListNotificationsResponse.Data.Notification.JoinPermissionAuthInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotificationsResponseUnmarshaller {

	public static ListNotificationsResponse unmarshall(ListNotificationsResponse listNotificationsResponse, UnmarshallerContext context) {
		
		listNotificationsResponse.setRequestId(context.stringValue("ListNotificationsResponse.RequestId"));
		listNotificationsResponse.setSuccess(context.booleanValue("ListNotificationsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNotificationsResponse.Data.TotalCount"));

		List<Notification> list = new ArrayList<Notification>();
		for (int i = 0; i < context.lengthValue("ListNotificationsResponse.Data.List.Length"); i++) {
			Notification notification = new Notification();
			notification.setNotificationId(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].NotificationId"));
			notification.setCategory(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].Category"));
			notification.setHandleState(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].HandleState"));
			notification.setNoticeMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].NoticeMillis"));
			notification.setHandledMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].HandledMillis"));

			GatewayOfflineInfo gatewayOfflineInfo = new GatewayOfflineInfo();
			gatewayOfflineInfo.setGwEui(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].GatewayOfflineInfo.GwEui"));
			gatewayOfflineInfo.setOfflineMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].GatewayOfflineInfo.OfflineMillis"));
			notification.setGatewayOfflineInfo(gatewayOfflineInfo);

			JoinPermissionAuthInfo joinPermissionAuthInfo = new JoinPermissionAuthInfo();
			joinPermissionAuthInfo.setOrderId(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.OrderId"));
			joinPermissionAuthInfo.setJoinPermissionId(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.JoinPermissionId"));
			joinPermissionAuthInfo.setOwnerAliyunId(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.OwnerAliyunId"));
			joinPermissionAuthInfo.setRenterAliyunId(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.RenterAliyunId"));
			joinPermissionAuthInfo.setOrderState(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.OrderState"));
			joinPermissionAuthInfo.setApplyingMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.ApplyingMillis"));
			joinPermissionAuthInfo.setAcceptedMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.AcceptedMillis"));
			joinPermissionAuthInfo.setCanceledMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.CanceledMillis"));
			joinPermissionAuthInfo.setRejectedMillis(context.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.RejectedMillis"));
			joinPermissionAuthInfo.setJoinEui(context.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.JoinEui"));
			notification.setJoinPermissionAuthInfo(joinPermissionAuthInfo);

			list.add(notification);
		}
		data.setList(list);
		listNotificationsResponse.setData(data);
	 
	 	return listNotificationsResponse;
	}
}