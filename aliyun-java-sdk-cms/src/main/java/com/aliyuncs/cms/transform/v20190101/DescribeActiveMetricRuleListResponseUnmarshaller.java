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

import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse.Alarm;
import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse.Alert;
import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse.Alert.Escalations;
import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse.Alert.Escalations.Critical;
import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse.Alert.Escalations.Info;
import com.aliyuncs.cms.model.v20190101.DescribeActiveMetricRuleListResponse.Alert.Escalations.Warn;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveMetricRuleListResponseUnmarshaller {

	public static DescribeActiveMetricRuleListResponse unmarshall(DescribeActiveMetricRuleListResponse describeActiveMetricRuleListResponse, UnmarshallerContext _ctx) {
		
		describeActiveMetricRuleListResponse.setRequestId(_ctx.stringValue("DescribeActiveMetricRuleListResponse.RequestId"));
		describeActiveMetricRuleListResponse.setSuccess(_ctx.booleanValue("DescribeActiveMetricRuleListResponse.Success"));
		describeActiveMetricRuleListResponse.setCode(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Code"));
		describeActiveMetricRuleListResponse.setMessage(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Message"));

		List<Alarm> datapoints = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveMetricRuleListResponse.Datapoints.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setRuleId(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].RuleId"));
			alarm.setNamespace(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Namespace"));
			alarm.setMetricName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].MetricName"));
			alarm.setPeriod(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Period"));
			alarm.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Statistics"));
			alarm.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].ComparisonOperator"));
			alarm.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Threshold"));
			alarm.setEvaluationCount(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].EvaluationCount"));
			alarm.setStartTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].StartTime"));
			alarm.setEndTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].EndTime"));
			alarm.setSilenceTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].SilenceTime"));
			alarm.setEnable(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Enable"));
			alarm.setState(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].State"));
			alarm.setContactGroups(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].ContactGroups"));
			alarm.setWebhook(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Webhook"));
			alarm.setRuleName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].RuleName"));

			datapoints.add(alarm);
		}
		describeActiveMetricRuleListResponse.setDatapoints(datapoints);

		List<Alert> alertList = new ArrayList<Alert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveMetricRuleListResponse.AlertList.Length"); i++) {
			Alert alert = new Alert();
			alert.setRuleId(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].RuleId"));
			alert.setNamespace(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Namespace"));
			alert.setMetricName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].MetricName"));
			alert.setPeriod(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Period"));
			alert.setEffectiveInterval(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].EffectiveInterval"));
			alert.setNoEffectiveInterval(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].NoEffectiveInterval"));
			alert.setSilenceTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].SilenceTime"));
			alert.setEnableState(_ctx.booleanValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].EnableState"));
			alert.setAlertState(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].AlertState"));
			alert.setContactGroups(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].ContactGroups"));
			alert.setWebhook(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Webhook"));
			alert.setMailSubject(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].MailSubject"));
			alert.setRuleName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].RuleName"));
			alert.setResources(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Resources"));
			alert.setDimensions(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Dimensions"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.Statistics"));
			info.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.Threshold"));
			info.setTimes(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.Times"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.Statistics"));
			warn.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.Threshold"));
			warn.setTimes(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.Times"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.Statistics"));
			critical.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.Threshold"));
			critical.setTimes(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.Times"));
			escalations.setCritical(critical);
			alert.setEscalations(escalations);

			alertList.add(alert);
		}
		describeActiveMetricRuleListResponse.setAlertList(alertList);
	 
	 	return describeActiveMetricRuleListResponse;
	}
}