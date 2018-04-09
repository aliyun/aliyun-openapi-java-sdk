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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListActiveAlertRuleResponse;
import com.aliyuncs.cms.model.v20180308.ListActiveAlertRuleResponse.Alarm;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActiveAlertRuleResponseUnmarshaller {

	public static ListActiveAlertRuleResponse unmarshall(ListActiveAlertRuleResponse listActiveAlertRuleResponse, UnmarshallerContext context) {
		
		listActiveAlertRuleResponse.setRequestId(context.stringValue("ListActiveAlertRuleResponse.RequestId"));
		listActiveAlertRuleResponse.setSuccess(context.booleanValue("ListActiveAlertRuleResponse.Success"));
		listActiveAlertRuleResponse.setCode(context.stringValue("ListActiveAlertRuleResponse.Code"));
		listActiveAlertRuleResponse.setMessage(context.stringValue("ListActiveAlertRuleResponse.Message"));

		List<Alarm> datapoints = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("ListActiveAlertRuleResponse.Datapoints.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setUuid(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Uuid"));
			alarm.setName(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Name"));
			alarm.setNamespace(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Namespace"));
			alarm.setMetricName(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].MetricName"));
			alarm.setPeriod(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Period"));
			alarm.setStatistics(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Statistics"));
			alarm.setComparisonOperator(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].ComparisonOperator"));
			alarm.setThreshold(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Threshold"));
			alarm.setEvaluationCount(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].EvaluationCount"));
			alarm.setStartTime(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].StartTime"));
			alarm.setEndTime(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].EndTime"));
			alarm.setSilenceTime(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].SilenceTime"));
			alarm.setNotifyType(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].NotifyType"));
			alarm.setEnable(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Enable"));
			alarm.setState(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].State"));
			alarm.setContactGroups(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].ContactGroups"));
			alarm.setWebhook(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].Webhook"));
			alarm.setRuleName(context.stringValue("ListActiveAlertRuleResponse.Datapoints["+ i +"].RuleName"));

			datapoints.add(alarm);
		}
		listActiveAlertRuleResponse.setDatapoints(datapoints);
	 
	 	return listActiveAlertRuleResponse;
	}
}