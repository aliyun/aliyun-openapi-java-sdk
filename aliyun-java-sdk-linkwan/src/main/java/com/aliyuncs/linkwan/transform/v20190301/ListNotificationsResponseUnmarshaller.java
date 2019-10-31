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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListNotificationsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNotificationsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNotificationsResponse.Data.Notification;
import com.aliyuncs.linkwan.model.v20190301.ListNotificationsResponse.Data.Notification.GatewayDataflowLimit;
import com.aliyuncs.linkwan.model.v20190301.ListNotificationsResponse.Data.Notification.GatewayOfflineInfo;
import com.aliyuncs.linkwan.model.v20190301.ListNotificationsResponse.Data.Notification.JoinPermissionAuthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotificationsResponseUnmarshaller {

	public static ListNotificationsResponse unmarshall(ListNotificationsResponse listNotificationsResponse, UnmarshallerContext _ctx) {
		
		listNotificationsResponse.setRequestId(_ctx.stringValue("ListNotificationsResponse.RequestId"));
		listNotificationsResponse.setSuccess(_ctx.booleanValue("ListNotificationsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNotificationsResponse.Data.TotalCount"));

		List<Notification> list = new ArrayList<Notification>();
		for (int i = 0; i < _ctx.lengthValue("ListNotificationsResponse.Data.List.Length"); i++) {
			Notification notification = new Notification();
			notification.setNotificationId(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].NotificationId"));
			notification.setCategory(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].Category"));
			notification.setHandleState(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].HandleState"));
			notification.setNoticeMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].NoticeMillis"));
			notification.setHandledMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].HandledMillis"));

			GatewayOfflineInfo gatewayOfflineInfo = new GatewayOfflineInfo();
			gatewayOfflineInfo.setGwEui(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].GatewayOfflineInfo.GwEui"));
			gatewayOfflineInfo.setOfflineMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].GatewayOfflineInfo.OfflineMillis"));
			notification.setGatewayOfflineInfo(gatewayOfflineInfo);

			JoinPermissionAuthInfo joinPermissionAuthInfo = new JoinPermissionAuthInfo();
			joinPermissionAuthInfo.setOrderId(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.OrderId"));
			joinPermissionAuthInfo.setJoinPermissionId(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.JoinPermissionId"));
			joinPermissionAuthInfo.setOwnerAliyunId(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.OwnerAliyunId"));
			joinPermissionAuthInfo.setRenterAliyunId(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.RenterAliyunId"));
			joinPermissionAuthInfo.setOrderState(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.OrderState"));
			joinPermissionAuthInfo.setApplyingMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.ApplyingMillis"));
			joinPermissionAuthInfo.setAcceptedMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.AcceptedMillis"));
			joinPermissionAuthInfo.setCanceledMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.CanceledMillis"));
			joinPermissionAuthInfo.setRejectedMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.RejectedMillis"));
			joinPermissionAuthInfo.setJoinEui(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.JoinEui"));
			joinPermissionAuthInfo.setJoinPermissionName(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].JoinPermissionAuthInfo.JoinPermissionName"));
			notification.setJoinPermissionAuthInfo(joinPermissionAuthInfo);

			GatewayDataflowLimit gatewayDataflowLimit = new GatewayDataflowLimit();
			gatewayDataflowLimit.setDataflowLimitMillis(_ctx.longValue("ListNotificationsResponse.Data.List["+ i +"].GatewayDataflowLimit.DataflowLimitMillis"));
			gatewayDataflowLimit.setAlarmDetail(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].GatewayDataflowLimit.AlarmDetail"));
			gatewayDataflowLimit.setGwEui(_ctx.stringValue("ListNotificationsResponse.Data.List["+ i +"].GatewayDataflowLimit.GwEui"));
			notification.setGatewayDataflowLimit(gatewayDataflowLimit);

			list.add(notification);
		}
		data.setList(list);
		listNotificationsResponse.setData(data);
	 
	 	return listNotificationsResponse;
	}
}