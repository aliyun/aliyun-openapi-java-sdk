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

import com.aliyuncs.linkwan.model.v20181230.GetNotificationResponse;
import com.aliyuncs.linkwan.model.v20181230.GetNotificationResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.GetNotificationResponse.Data.GatewayOfflineInfo;
import com.aliyuncs.linkwan.model.v20181230.GetNotificationResponse.Data.JoinPermissionAuthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNotificationResponseUnmarshaller {

	public static GetNotificationResponse unmarshall(GetNotificationResponse getNotificationResponse, UnmarshallerContext context) {
		
		getNotificationResponse.setRequestId(context.stringValue("GetNotificationResponse.RequestId"));
		getNotificationResponse.setSuccess(context.booleanValue("GetNotificationResponse.Success"));

		Data data = new Data();
		data.setNotificationId(context.stringValue("GetNotificationResponse.Data.NotificationId"));
		data.setCategory(context.stringValue("GetNotificationResponse.Data.Category"));
		data.setHandleState(context.stringValue("GetNotificationResponse.Data.HandleState"));
		data.setNoticeMillis(context.longValue("GetNotificationResponse.Data.NoticeMillis"));
		data.setHandledMillis(context.longValue("GetNotificationResponse.Data.HandledMillis"));

		GatewayOfflineInfo gatewayOfflineInfo = new GatewayOfflineInfo();
		gatewayOfflineInfo.setGwEui(context.stringValue("GetNotificationResponse.Data.GatewayOfflineInfo.GwEui"));
		gatewayOfflineInfo.setOfflineMillis(context.longValue("GetNotificationResponse.Data.GatewayOfflineInfo.OfflineMillis"));
		data.setGatewayOfflineInfo(gatewayOfflineInfo);

		JoinPermissionAuthInfo joinPermissionAuthInfo = new JoinPermissionAuthInfo();
		joinPermissionAuthInfo.setOrderId(context.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.OrderId"));
		joinPermissionAuthInfo.setJoinPermissionId(context.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.JoinPermissionId"));
		joinPermissionAuthInfo.setOwnerAliyunId(context.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.OwnerAliyunId"));
		joinPermissionAuthInfo.setRenterAliyunId(context.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.RenterAliyunId"));
		joinPermissionAuthInfo.setOrderState(context.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.OrderState"));
		joinPermissionAuthInfo.setApplyingMillis(context.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.ApplyingMillis"));
		joinPermissionAuthInfo.setAcceptedMillis(context.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.AcceptedMillis"));
		joinPermissionAuthInfo.setCanceledMillis(context.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.CanceledMillis"));
		joinPermissionAuthInfo.setRejectedMillis(context.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.RejectedMillis"));
		joinPermissionAuthInfo.setJoinEui(context.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.JoinEui"));
		data.setJoinPermissionAuthInfo(joinPermissionAuthInfo);
		getNotificationResponse.setData(data);
	 
	 	return getNotificationResponse;
	}
}