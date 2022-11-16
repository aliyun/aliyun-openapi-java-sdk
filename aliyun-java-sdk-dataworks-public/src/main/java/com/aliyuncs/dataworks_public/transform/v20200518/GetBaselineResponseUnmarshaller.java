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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineResponse.Data.AlertSetting;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineResponse.Data.AlertSetting.DingRobot;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineResponse.Data.OverTimeSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBaselineResponseUnmarshaller {

	public static GetBaselineResponse unmarshall(GetBaselineResponse getBaselineResponse, UnmarshallerContext _ctx) {
		
		getBaselineResponse.setRequestId(_ctx.stringValue("GetBaselineResponse.RequestId"));
		getBaselineResponse.setSuccess(_ctx.booleanValue("GetBaselineResponse.Success"));
		getBaselineResponse.setErrorCode(_ctx.stringValue("GetBaselineResponse.ErrorCode"));
		getBaselineResponse.setErrorMessage(_ctx.stringValue("GetBaselineResponse.ErrorMessage"));
		getBaselineResponse.setHttpStatusCode(_ctx.integerValue("GetBaselineResponse.HttpStatusCode"));
		getBaselineResponse.setDynamicErrorCode(_ctx.stringValue("GetBaselineResponse.DynamicErrorCode"));
		getBaselineResponse.setDynamicErrorMessage(_ctx.stringValue("GetBaselineResponse.DynamicErrorMessage"));

		Data data = new Data();
		data.setBaselineId(_ctx.longValue("GetBaselineResponse.Data.BaselineId"));
		data.setBaselineName(_ctx.stringValue("GetBaselineResponse.Data.BaselineName"));
		data.setProjectId(_ctx.longValue("GetBaselineResponse.Data.ProjectId"));
		data.setOwner(_ctx.stringValue("GetBaselineResponse.Data.Owner"));
		data.setPriority(_ctx.integerValue("GetBaselineResponse.Data.Priority"));
		data.setBaselineType(_ctx.stringValue("GetBaselineResponse.Data.BaselineType"));
		data.setEnabled(_ctx.booleanValue("GetBaselineResponse.Data.Enabled"));
		data.setAlertEnabled(_ctx.booleanValue("GetBaselineResponse.Data.AlertEnabled"));
		data.setAlertMarginThreshold(_ctx.integerValue("GetBaselineResponse.Data.AlertMarginThreshold"));

		List<Long> taskIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetBaselineResponse.Data.TaskIds.Length"); i++) {
			taskIds.add(_ctx.longValue("GetBaselineResponse.Data.TaskIds["+ i +"]"));
		}
		data.setTaskIds(taskIds);

		List<OverTimeSetting> overTimeSettings = new ArrayList<OverTimeSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetBaselineResponse.Data.OverTimeSettings.Length"); i++) {
			OverTimeSetting overTimeSetting = new OverTimeSetting();
			overTimeSetting.setCycle(_ctx.integerValue("GetBaselineResponse.Data.OverTimeSettings["+ i +"].Cycle"));
			overTimeSetting.setTime(_ctx.stringValue("GetBaselineResponse.Data.OverTimeSettings["+ i +"].Time"));

			overTimeSettings.add(overTimeSetting);
		}
		data.setOverTimeSettings(overTimeSettings);

		List<AlertSetting> alertSettings = new ArrayList<AlertSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetBaselineResponse.Data.AlertSettings.Length"); i++) {
			AlertSetting alertSetting = new AlertSetting();
			alertSetting.setAlertType(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertType"));
			alertSetting.setSilenceStartTime(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].SilenceStartTime"));
			alertSetting.setSilenceEndTime(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].SilenceEndTime"));
			alertSetting.setAlertInterval(_ctx.integerValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertInterval"));
			alertSetting.setAlertMaximum(_ctx.integerValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertMaximum"));
			alertSetting.setBaselineAlertEnabled(_ctx.booleanValue("GetBaselineResponse.Data.AlertSettings["+ i +"].BaselineAlertEnabled"));
			alertSetting.setAlertRecipientType(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertRecipientType"));
			alertSetting.setAlertRecipient(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertRecipient"));

			List<String> alertMethods = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertMethods.Length"); j++) {
				alertMethods.add(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].AlertMethods["+ j +"]"));
			}
			alertSetting.setAlertMethods(alertMethods);

			List<String> webhooks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBaselineResponse.Data.AlertSettings["+ i +"].Webhooks.Length"); j++) {
				webhooks.add(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].Webhooks["+ j +"]"));
			}
			alertSetting.setWebhooks(webhooks);

			List<String> topicTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBaselineResponse.Data.AlertSettings["+ i +"].TopicTypes.Length"); j++) {
				topicTypes.add(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].TopicTypes["+ j +"]"));
			}
			alertSetting.setTopicTypes(topicTypes);

			List<DingRobot> dingRobots = new ArrayList<DingRobot>();
			for (int j = 0; j < _ctx.lengthValue("GetBaselineResponse.Data.AlertSettings["+ i +"].DingRobots.Length"); j++) {
				DingRobot dingRobot = new DingRobot();
				dingRobot.setWebUrl(_ctx.stringValue("GetBaselineResponse.Data.AlertSettings["+ i +"].DingRobots["+ j +"].WebUrl"));
				dingRobot.setAtAll(_ctx.booleanValue("GetBaselineResponse.Data.AlertSettings["+ i +"].DingRobots["+ j +"].AtAll"));

				dingRobots.add(dingRobot);
			}
			alertSetting.setDingRobots(dingRobots);

			alertSettings.add(alertSetting);
		}
		data.setAlertSettings(alertSettings);
		getBaselineResponse.setData(data);
	 
	 	return getBaselineResponse;
	}
}