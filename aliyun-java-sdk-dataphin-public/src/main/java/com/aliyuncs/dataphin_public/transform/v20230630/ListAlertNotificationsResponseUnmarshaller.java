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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo.AlertObject;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo.AlertReason;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo.AlertReason.AlertReasonParam;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo.AlertReceiver;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo.AlertReceiver.User;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertNotificationsResponse.ListResult.AlertNotificationInfo.AlertSend;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertNotificationsResponseUnmarshaller {

	public static ListAlertNotificationsResponse unmarshall(ListAlertNotificationsResponse listAlertNotificationsResponse, UnmarshallerContext _ctx) {
		
		listAlertNotificationsResponse.setRequestId(_ctx.stringValue("ListAlertNotificationsResponse.RequestId"));
		listAlertNotificationsResponse.setSuccess(_ctx.booleanValue("ListAlertNotificationsResponse.Success"));
		listAlertNotificationsResponse.setHttpStatusCode(_ctx.integerValue("ListAlertNotificationsResponse.HttpStatusCode"));
		listAlertNotificationsResponse.setCode(_ctx.stringValue("ListAlertNotificationsResponse.Code"));
		listAlertNotificationsResponse.setMessage(_ctx.stringValue("ListAlertNotificationsResponse.Message"));

		ListResult listResult = new ListResult();
		listResult.setTotalCount(_ctx.integerValue("ListAlertNotificationsResponse.ListResult.TotalCount"));

		List<AlertNotificationInfo> data = new ArrayList<AlertNotificationInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertNotificationsResponse.ListResult.Data.Length"); i++) {
			AlertNotificationInfo alertNotificationInfo = new AlertNotificationInfo();
			alertNotificationInfo.setAlertEventId(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertEventId"));

			AlertObject alertObject = new AlertObject();
			alertObject.setSourceSystemType(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertObject.SourceSystemType"));
			alertObject.setName(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertObject.Name"));
			alertObject.setType(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertObject.Type"));
			alertNotificationInfo.setAlertObject(alertObject);

			AlertReason alertReason = new AlertReason();
			alertReason.setType(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReason.Type"));
			alertReason.setBizDate(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReason.BizDate"));
			alertReason.setUniqueKey(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReason.UniqueKey"));

			List<AlertReasonParam> alertReasonParamList = new ArrayList<AlertReasonParam>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReason.AlertReasonParamList.Length"); j++) {
				AlertReasonParam alertReasonParam = new AlertReasonParam();
				alertReasonParam.setKey(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReason.AlertReasonParamList["+ j +"].Key"));
				alertReasonParam.setValue(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReason.AlertReasonParamList["+ j +"].Value"));

				alertReasonParamList.add(alertReasonParam);
			}
			alertReason.setAlertReasonParamList(alertReasonParamList);
			alertNotificationInfo.setAlertReason(alertReason);

			AlertReceiver alertReceiver = new AlertReceiver();
			alertReceiver.setAlertChannelType(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReceiver.AlertChannelType"));
			alertReceiver.setCustomAlertChannelId(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReceiver.CustomAlertChannelId"));
			alertReceiver.setType(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReceiver.Type"));
			alertReceiver.setOnCallTableId(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReceiver.OnCallTableId"));
			alertReceiver.setOnCallTableName(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReceiver.OnCallTableName"));

			User user = new User();
			user.setName(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertReceiver.User.Name"));
			alertReceiver.setUser(user);
			alertNotificationInfo.setAlertReceiver(alertReceiver);

			AlertSend alertSend = new AlertSend();
			alertSend.setStatus(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertSend.Status"));
			alertSend.setFailReason(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertSend.FailReason"));
			alertSend.setSendTime(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertSend.SendTime"));
			alertSend.setSendContent(_ctx.stringValue("ListAlertNotificationsResponse.ListResult.Data["+ i +"].AlertSend.SendContent"));
			alertNotificationInfo.setAlertSend(alertSend);

			data.add(alertNotificationInfo);
		}
		listResult.setData(data);
		listAlertNotificationsResponse.setListResult(listResult);
	 
	 	return listAlertNotificationsResponse;
	}
}