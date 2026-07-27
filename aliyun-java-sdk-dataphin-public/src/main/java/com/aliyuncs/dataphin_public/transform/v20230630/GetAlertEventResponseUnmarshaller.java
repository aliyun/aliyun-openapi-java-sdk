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

import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.AlertObject;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.AlertReason;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.AlertReason.AlertReasonParam;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.AlertReceiver;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.AlertReceiver.User;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.BelongProject;
import com.aliyuncs.dataphin_public.model.v20230630.GetAlertEventResponse.AlertEventInfo.UrlConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlertEventResponseUnmarshaller {

	public static GetAlertEventResponse unmarshall(GetAlertEventResponse getAlertEventResponse, UnmarshallerContext _ctx) {
		
		getAlertEventResponse.setRequestId(_ctx.stringValue("GetAlertEventResponse.RequestId"));
		getAlertEventResponse.setMessage(_ctx.stringValue("GetAlertEventResponse.Message"));
		getAlertEventResponse.setHttpStatusCode(_ctx.integerValue("GetAlertEventResponse.HttpStatusCode"));
		getAlertEventResponse.setCode(_ctx.stringValue("GetAlertEventResponse.Code"));
		getAlertEventResponse.setSuccess(_ctx.booleanValue("GetAlertEventResponse.Success"));

		AlertEventInfo alertEventInfo = new AlertEventInfo();
		alertEventInfo.setFirstAlertTime(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.FirstAlertTime"));
		alertEventInfo.setStatus(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.Status"));
		alertEventInfo.setAlertFrequency(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertFrequency"));
		alertEventInfo.setTotalAlertTimes(_ctx.longValue("GetAlertEventResponse.AlertEventInfo.TotalAlertTimes"));
		alertEventInfo.setId(_ctx.longValue("GetAlertEventResponse.AlertEventInfo.Id"));
		alertEventInfo.setLatestAlertTime(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.LatestAlertTime"));
		alertEventInfo.setDoNotDisturbEndTime(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.DoNotDisturbEndTime"));

		AlertObject alertObject = new AlertObject();
		alertObject.setSourceSystemType(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertObject.SourceSystemType"));
		alertObject.setType(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertObject.Type"));
		alertObject.setName(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertObject.Name"));
		alertEventInfo.setAlertObject(alertObject);

		AlertReason alertReason = new AlertReason();
		alertReason.setType(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReason.Type"));
		alertReason.setUniqueKey(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReason.UniqueKey"));
		alertReason.setBizDate(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReason.BizDate"));

		List<AlertReasonParam> alertReasonParamList = new ArrayList<AlertReasonParam>();
		for (int i = 0; i < _ctx.lengthValue("GetAlertEventResponse.AlertEventInfo.AlertReason.AlertReasonParamList.Length"); i++) {
			AlertReasonParam alertReasonParam = new AlertReasonParam();
			alertReasonParam.setValue(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReason.AlertReasonParamList["+ i +"].Value"));
			alertReasonParam.setKey(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReason.AlertReasonParamList["+ i +"].Key"));

			alertReasonParamList.add(alertReasonParam);
		}
		alertReason.setAlertReasonParamList(alertReasonParamList);
		alertEventInfo.setAlertReason(alertReason);

		BelongProject belongProject = new BelongProject();
		belongProject.setProjectName(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.BelongProject.ProjectName"));
		belongProject.setBizName(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.BelongProject.BizName"));
		alertEventInfo.setBelongProject(belongProject);

		UrlConfig urlConfig = new UrlConfig();
		urlConfig.setLogUrl(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.UrlConfig.LogUrl"));
		urlConfig.setObjectUrl(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.UrlConfig.ObjectUrl"));
		urlConfig.setAlertConfigUrl(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.UrlConfig.AlertConfigUrl"));
		alertEventInfo.setUrlConfig(urlConfig);

		List<AlertReceiver> alertReceiverList = new ArrayList<AlertReceiver>();
		for (int i = 0; i < _ctx.lengthValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList.Length"); i++) {
			AlertReceiver alertReceiver = new AlertReceiver();
			alertReceiver.setOnCallTableName(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].OnCallTableName"));
			alertReceiver.setType(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].Type"));

			List<String> customAlertChannelIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].CustomAlertChannelIdList.Length"); j++) {
				customAlertChannelIdList.add(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].CustomAlertChannelIdList["+ j +"]"));
			}
			alertReceiver.setCustomAlertChannelIdList(customAlertChannelIdList);

			List<String> alertChannelTypeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].AlertChannelTypeList.Length"); j++) {
				alertChannelTypeList.add(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].AlertChannelTypeList["+ j +"]"));
			}
			alertReceiver.setAlertChannelTypeList(alertChannelTypeList);

			List<User> userList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].UserList.Length"); j++) {
				User user = new User();
				user.setName(_ctx.stringValue("GetAlertEventResponse.AlertEventInfo.AlertReceiverList["+ i +"].UserList["+ j +"].Name"));

				userList.add(user);
			}
			alertReceiver.setUserList(userList);

			alertReceiverList.add(alertReceiver);
		}
		alertEventInfo.setAlertReceiverList(alertReceiverList);
		getAlertEventResponse.setAlertEventInfo(alertEventInfo);
	 
	 	return getAlertEventResponse;
	}
}