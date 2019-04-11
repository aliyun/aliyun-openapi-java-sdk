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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations.Critical;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations.Info;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations.Warn;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleListResponseUnmarshaller {

	public static DescribeMetricRuleListResponse unmarshall(DescribeMetricRuleListResponse describeMetricRuleListResponse, UnmarshallerContext context) {
		
		describeMetricRuleListResponse.setRequestId(context.stringValue("DescribeMetricRuleListResponse.RequestId"));
		describeMetricRuleListResponse.setSuccess(context.booleanValue("DescribeMetricRuleListResponse.Success"));
		describeMetricRuleListResponse.setCode(context.integerValue("DescribeMetricRuleListResponse.Code"));
		describeMetricRuleListResponse.setMessage(context.stringValue("DescribeMetricRuleListResponse.Message"));
		describeMetricRuleListResponse.setTotal(context.stringValue("DescribeMetricRuleListResponse.Total"));

		List<Alarm> alarms = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("DescribeMetricRuleListResponse.Alarms.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setRuleId(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].RuleId"));
			alarm.setNamespace(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Namespace"));
			alarm.setMetricName(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].MetricName"));
			alarm.setPeriod(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Period"));
			alarm.setEffectiveInterval(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].EffectiveInterval"));
			alarm.setNoEffectiveInterval(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].NoEffectiveInterval"));
			alarm.setSilenceTime(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].SilenceTime"));
			alarm.setEnableState(context.booleanValue("DescribeMetricRuleListResponse.Alarms["+ i +"].EnableState"));
			alarm.setAlertState(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].AlertState"));
			alarm.setContactGroups(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].ContactGroups"));
			alarm.setWebhook(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Webhook"));
			alarm.setMailSubject(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].MailSubject"));
			alarm.setRuleName(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].RuleName"));
			alarm.setResources(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Resources"));
			alarm.setGroupId(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupId"));
			alarm.setGroupName(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupName"));
			alarm.setDimensions(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Dimensions"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setComparisonOperator(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setStatistics(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Statistics"));
			info.setThreshold(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Threshold"));
			info.setTimes(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Times"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setComparisonOperator(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setStatistics(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Statistics"));
			warn.setThreshold(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Threshold"));
			warn.setTimes(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Times"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setComparisonOperator(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setStatistics(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Statistics"));
			critical.setThreshold(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Threshold"));
			critical.setTimes(context.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Times"));
			escalations.setCritical(critical);
			alarm.setEscalations(escalations);

			alarms.add(alarm);
		}
		describeMetricRuleListResponse.setAlarms(alarms);
	 
	 	return describeMetricRuleListResponse;
	}
}