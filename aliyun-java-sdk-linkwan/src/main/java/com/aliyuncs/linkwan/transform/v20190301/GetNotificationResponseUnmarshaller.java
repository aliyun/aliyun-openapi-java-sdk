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

import com.aliyuncs.linkwan.model.v20190301.GetNotificationResponse;
import com.aliyuncs.linkwan.model.v20190301.GetNotificationResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.GetNotificationResponse.Data.GatewayOfflineInfo;
import com.aliyuncs.linkwan.model.v20190301.GetNotificationResponse.Data.JoinPermissionAuthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNotificationResponseUnmarshaller {

	public static GetNotificationResponse unmarshall(GetNotificationResponse getNotificationResponse, UnmarshallerContext _ctx) {
		
		getNotificationResponse.setRequestId(_ctx.stringValue("GetNotificationResponse.RequestId"));
		getNotificationResponse.setSuccess(_ctx.booleanValue("GetNotificationResponse.Success"));

		Data data = new Data();
		data.setNotificationId(_ctx.stringValue("GetNotificationResponse.Data.NotificationId"));
		data.setCategory(_ctx.stringValue("GetNotificationResponse.Data.Category"));
		data.setHandleState(_ctx.stringValue("GetNotificationResponse.Data.HandleState"));
		data.setNoticeMillis(_ctx.longValue("GetNotificationResponse.Data.NoticeMillis"));
		data.setHandledMillis(_ctx.longValue("GetNotificationResponse.Data.HandledMillis"));

		GatewayOfflineInfo gatewayOfflineInfo = new GatewayOfflineInfo();
		gatewayOfflineInfo.setGwEui(_ctx.stringValue("GetNotificationResponse.Data.GatewayOfflineInfo.GwEui"));
		gatewayOfflineInfo.setOfflineMillis(_ctx.longValue("GetNotificationResponse.Data.GatewayOfflineInfo.OfflineMillis"));
		data.setGatewayOfflineInfo(gatewayOfflineInfo);

		JoinPermissionAuthInfo joinPermissionAuthInfo = new JoinPermissionAuthInfo();
		joinPermissionAuthInfo.setOrderId(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.OrderId"));
		joinPermissionAuthInfo.setJoinPermissionId(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.JoinPermissionId"));
		joinPermissionAuthInfo.setOwnerAliyunId(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.OwnerAliyunId"));
		joinPermissionAuthInfo.setRenterAliyunId(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.RenterAliyunId"));
		joinPermissionAuthInfo.setOrderState(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.OrderState"));
		joinPermissionAuthInfo.setApplyingMillis(_ctx.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.ApplyingMillis"));
		joinPermissionAuthInfo.setAcceptedMillis(_ctx.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.AcceptedMillis"));
		joinPermissionAuthInfo.setCanceledMillis(_ctx.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.CanceledMillis"));
		joinPermissionAuthInfo.setRejectedMillis(_ctx.longValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.RejectedMillis"));
		joinPermissionAuthInfo.setJoinEui(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.JoinEui"));
		joinPermissionAuthInfo.setJoinPermissionName(_ctx.stringValue("GetNotificationResponse.Data.JoinPermissionAuthInfo.JoinPermissionName"));
		data.setJoinPermissionAuthInfo(joinPermissionAuthInfo);
		getNotificationResponse.setData(data);
	 
	 	return getNotificationResponse;
	}
}