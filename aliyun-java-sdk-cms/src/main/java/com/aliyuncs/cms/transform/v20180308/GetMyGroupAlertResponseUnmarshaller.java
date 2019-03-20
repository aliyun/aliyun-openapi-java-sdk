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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.GetMyGroupAlertResponse;
import com.aliyuncs.cms.model.v20180308.GetMyGroupAlertResponse.GroupAlert;
import com.aliyuncs.cms.model.v20180308.GetMyGroupAlertResponse.GroupAlert.Escalations;
import com.aliyuncs.cms.model.v20180308.GetMyGroupAlertResponse.GroupAlert.Escalations.Critical;
import com.aliyuncs.cms.model.v20180308.GetMyGroupAlertResponse.GroupAlert.Escalations.Info;
import com.aliyuncs.cms.model.v20180308.GetMyGroupAlertResponse.GroupAlert.Escalations.Warn;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMyGroupAlertResponseUnmarshaller {

	public static GetMyGroupAlertResponse unmarshall(GetMyGroupAlertResponse getMyGroupAlertResponse, UnmarshallerContext context) {
		
		getMyGroupAlertResponse.setRequestId(context.stringValue("GetMyGroupAlertResponse.RequestId"));
		getMyGroupAlertResponse.setSuccess(context.booleanValue("GetMyGroupAlertResponse.Success"));
		getMyGroupAlertResponse.setErrorCode(context.integerValue("GetMyGroupAlertResponse.ErrorCode"));
		getMyGroupAlertResponse.setErrorMessage(context.stringValue("GetMyGroupAlertResponse.ErrorMessage"));

		GroupAlert groupAlert = new GroupAlert();
		groupAlert.setGroupId(context.stringValue("GetMyGroupAlertResponse.GroupAlert.GroupId"));
		groupAlert.setAlertName(context.stringValue("GetMyGroupAlertResponse.GroupAlert.AlertName"));
		groupAlert.setDisplayName(context.stringValue("GetMyGroupAlertResponse.GroupAlert.DisplayName"));
		groupAlert.setSubject(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Subject"));
		groupAlert.setWebhook(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Webhook"));
		groupAlert.setCategory(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Category"));
		groupAlert.setNamespace(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Namespace"));
		groupAlert.setMetricName(context.stringValue("GetMyGroupAlertResponse.GroupAlert.MetricName"));
		groupAlert.setPeriod(context.integerValue("GetMyGroupAlertResponse.GroupAlert.Period"));
		groupAlert.setState(context.stringValue("GetMyGroupAlertResponse.GroupAlert.State"));
		groupAlert.setDescription(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Description"));
		groupAlert.setEnable(context.booleanValue("GetMyGroupAlertResponse.GroupAlert.Enable"));
		groupAlert.setSilenceTime(context.integerValue("GetMyGroupAlertResponse.GroupAlert.SilenceTime"));
		groupAlert.setEnableEndTime(context.stringValue("GetMyGroupAlertResponse.GroupAlert.EnableEndTime"));
		groupAlert.setEnableStartTime(context.stringValue("GetMyGroupAlertResponse.GroupAlert.EnableStartTime"));
		groupAlert.setSelector(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Selector"));

		Escalations escalations = new Escalations();

		Info info = new Info();
		info.setStatistics(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Info.Statistics"));
		info.setComparisonOperator(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Info.ComparisonOperator"));
		info.setThreshold(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Info.Threshold"));
		info.setTimes(context.integerValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Info.Times"));
		escalations.setInfo(info);

		Warn warn = new Warn();
		warn.setStatistics(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Warn.Statistics"));
		warn.setComparisonOperator(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Warn.ComparisonOperator"));
		warn.setThreshold(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Warn.Threshold"));
		warn.setTimes(context.integerValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Warn.Times"));
		escalations.setWarn(warn);

		Critical critical = new Critical();
		critical.setStatistics(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Critical.Statistics"));
		critical.setComparisonOperator(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Critical.ComparisonOperator"));
		critical.setThreshold(context.stringValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Critical.Threshold"));
		critical.setTimes(context.integerValue("GetMyGroupAlertResponse.GroupAlert.Escalations.Critical.Times"));
		escalations.setCritical(critical);
		groupAlert.setEscalations(escalations);
		getMyGroupAlertResponse.setGroupAlert(groupAlert);
	 
	 	return getMyGroupAlertResponse;
	}
}