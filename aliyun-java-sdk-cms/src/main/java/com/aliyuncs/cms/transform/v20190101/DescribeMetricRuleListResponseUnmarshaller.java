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

	public static DescribeMetricRuleListResponse unmarshall(DescribeMetricRuleListResponse describeMetricRuleListResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleListResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleListResponse.RequestId"));
		describeMetricRuleListResponse.setSuccess(_ctx.booleanValue("DescribeMetricRuleListResponse.Success"));
		describeMetricRuleListResponse.setCode(_ctx.integerValue("DescribeMetricRuleListResponse.Code"));
		describeMetricRuleListResponse.setMessage(_ctx.stringValue("DescribeMetricRuleListResponse.Message"));
		describeMetricRuleListResponse.setTotal(_ctx.stringValue("DescribeMetricRuleListResponse.Total"));

		List<Alarm> alarms = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleListResponse.Alarms.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setRuleId(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].RuleId"));
			alarm.setNamespace(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Namespace"));
			alarm.setMetricName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].MetricName"));
			alarm.setPeriod(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Period"));
			alarm.setEffectiveInterval(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].EffectiveInterval"));
			alarm.setNoEffectiveInterval(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].NoEffectiveInterval"));
			alarm.setSilenceTime(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].SilenceTime"));
			alarm.setEnableState(_ctx.booleanValue("DescribeMetricRuleListResponse.Alarms["+ i +"].EnableState"));
			alarm.setAlertState(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].AlertState"));
			alarm.setContactGroups(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].ContactGroups"));
			alarm.setWebhook(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Webhook"));
			alarm.setMailSubject(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].MailSubject"));
			alarm.setRuleName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].RuleName"));
			alarm.setResources(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Resources"));
			alarm.setGroupId(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupId"));
			alarm.setGroupName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupName"));
			alarm.setDimensions(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Dimensions"));
			alarm.setSourceType(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].SourceType"));
			alarm.setGroupBy(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupBy"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Statistics"));
			info.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Threshold"));
			info.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Times"));
			info.setPreCondition(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.PreCondition"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Statistics"));
			warn.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Threshold"));
			warn.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Times"));
			warn.setPreCondition(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.PreCondition"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Statistics"));
			critical.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Threshold"));
			critical.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Times"));
			critical.setPreCondition(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.PreCondition"));
			escalations.setCritical(critical);
			alarm.setEscalations(escalations);

			alarms.add(alarm);
		}
		describeMetricRuleListResponse.setAlarms(alarms);
	 
	 	return describeMetricRuleListResponse;
	}
}