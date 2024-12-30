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

import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.AlertObject;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.AlertReason;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.AlertReason.AlertReasonParam;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.AlertReceiver;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.AlertReceiver.User;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.BelongProject;
import com.aliyuncs.dataphin_public.model.v20230630.ListAlertEventsResponse.ListResult.AlertEventInfo.UrlConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertEventsResponseUnmarshaller {

	public static ListAlertEventsResponse unmarshall(ListAlertEventsResponse listAlertEventsResponse, UnmarshallerContext _ctx) {
		
		listAlertEventsResponse.setRequestId(_ctx.stringValue("ListAlertEventsResponse.RequestId"));
		listAlertEventsResponse.setSuccess(_ctx.booleanValue("ListAlertEventsResponse.Success"));
		listAlertEventsResponse.setHttpStatusCode(_ctx.integerValue("ListAlertEventsResponse.HttpStatusCode"));
		listAlertEventsResponse.setCode(_ctx.stringValue("ListAlertEventsResponse.Code"));
		listAlertEventsResponse.setMessage(_ctx.stringValue("ListAlertEventsResponse.Message"));

		ListResult listResult = new ListResult();
		listResult.setTotalCount(_ctx.integerValue("ListAlertEventsResponse.ListResult.TotalCount"));

		List<AlertEventInfo> data = new ArrayList<AlertEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertEventsResponse.ListResult.Data.Length"); i++) {
			AlertEventInfo alertEventInfo = new AlertEventInfo();
			alertEventInfo.setId(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].Id"));
			alertEventInfo.setLatestAlertTime(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].LatestAlertTime"));
			alertEventInfo.setFirstAlertTime(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].FirstAlertTime"));
			alertEventInfo.setStatus(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].Status"));
			alertEventInfo.setAlertFrequency(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertFrequency"));
			alertEventInfo.setTotalAlertTimes(_ctx.longValue("ListAlertEventsResponse.ListResult.Data["+ i +"].TotalAlertTimes"));
			alertEventInfo.setDoNotDisturbEndTime(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].DoNotDisturbEndTime"));

			AlertObject alertObject = new AlertObject();
			alertObject.setSourceSystemType(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertObject.SourceSystemType"));
			alertObject.setName(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertObject.Name"));
			alertObject.setType(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertObject.Type"));
			alertEventInfo.setAlertObject(alertObject);

			AlertReason alertReason = new AlertReason();
			alertReason.setType(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReason.Type"));
			alertReason.setBizDate(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReason.BizDate"));
			alertReason.setUniqueKey(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReason.UniqueKey"));

			List<AlertReasonParam> alertReasonParamList = new ArrayList<AlertReasonParam>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReason.AlertReasonParamList.Length"); j++) {
				AlertReasonParam alertReasonParam = new AlertReasonParam();
				alertReasonParam.setKey(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReason.AlertReasonParamList["+ j +"].Key"));
				alertReasonParam.setValue(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReason.AlertReasonParamList["+ j +"].Value"));

				alertReasonParamList.add(alertReasonParam);
			}
			alertReason.setAlertReasonParamList(alertReasonParamList);
			alertEventInfo.setAlertReason(alertReason);

			BelongProject belongProject = new BelongProject();
			belongProject.setProjectName(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].BelongProject.ProjectName"));
			belongProject.setBizName(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].BelongProject.BizName"));
			alertEventInfo.setBelongProject(belongProject);

			UrlConfig urlConfig = new UrlConfig();
			urlConfig.setObjectUrl(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].UrlConfig.ObjectUrl"));
			urlConfig.setLogUrl(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].UrlConfig.LogUrl"));
			urlConfig.setAlertConfigUrl(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].UrlConfig.AlertConfigUrl"));
			alertEventInfo.setUrlConfig(urlConfig);

			List<AlertReceiver> alertReceiverList = new ArrayList<AlertReceiver>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList.Length"); j++) {
				AlertReceiver alertReceiver = new AlertReceiver();
				alertReceiver.setType(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].Type"));
				alertReceiver.setOnCallTableName(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].OnCallTableName"));

				List<String> alertChannelTypeList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].AlertChannelTypeList.Length"); k++) {
					alertChannelTypeList.add(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].AlertChannelTypeList["+ k +"]"));
				}
				alertReceiver.setAlertChannelTypeList(alertChannelTypeList);

				List<String> customAlertChannelIdList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].CustomAlertChannelIdList.Length"); k++) {
					customAlertChannelIdList.add(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].CustomAlertChannelIdList["+ k +"]"));
				}
				alertReceiver.setCustomAlertChannelIdList(customAlertChannelIdList);

				List<User> userList = new ArrayList<User>();
				for (int k = 0; k < _ctx.lengthValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].UserList.Length"); k++) {
					User user = new User();
					user.setName(_ctx.stringValue("ListAlertEventsResponse.ListResult.Data["+ i +"].AlertReceiverList["+ j +"].UserList["+ k +"].Name"));

					userList.add(user);
				}
				alertReceiver.setUserList(userList);

				alertReceiverList.add(alertReceiver);
			}
			alertEventInfo.setAlertReceiverList(alertReceiverList);

			data.add(alertEventInfo);
		}
		listResult.setData(data);
		listAlertEventsResponse.setListResult(listResult);
	 
	 	return listAlertEventsResponse;
	}
}