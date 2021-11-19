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
		describeActiveMetricRuleListResponse.setCode(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Code"));
		describeActiveMetricRuleListResponse.setMessage(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Message"));
		describeActiveMetricRuleListResponse.setSuccess(_ctx.booleanValue("DescribeActiveMetricRuleListResponse.Success"));

		List<Alarm> datapoints = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveMetricRuleListResponse.Datapoints.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setSilenceTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].SilenceTime"));
			alarm.setMetricName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].MetricName"));
			alarm.setEvaluationCount(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].EvaluationCount"));
			alarm.setWebhook(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Webhook"));
			alarm.setState(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].State"));
			alarm.setContactGroups(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].ContactGroups"));
			alarm.setNamespace(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Namespace"));
			alarm.setRuleName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].RuleName"));
			alarm.setRuleId(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].RuleId"));
			alarm.setPeriod(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Period"));
			alarm.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].ComparisonOperator"));
			alarm.setEndTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].EndTime"));
			alarm.setStartTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].StartTime"));
			alarm.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Threshold"));
			alarm.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Statistics"));
			alarm.setEnable(_ctx.stringValue("DescribeActiveMetricRuleListResponse.Datapoints["+ i +"].Enable"));

			datapoints.add(alarm);
		}
		describeActiveMetricRuleListResponse.setDatapoints(datapoints);

		List<Alert> alertList = new ArrayList<Alert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveMetricRuleListResponse.AlertList.Length"); i++) {
			Alert alert = new Alert();
			alert.setSilenceTime(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].SilenceTime"));
			alert.setMetricName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].MetricName"));
			alert.setWebhook(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Webhook"));
			alert.setContactGroups(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].ContactGroups"));
			alert.setNamespace(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Namespace"));
			alert.setEffectiveInterval(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].EffectiveInterval"));
			alert.setNoEffectiveInterval(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].NoEffectiveInterval"));
			alert.setMailSubject(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].MailSubject"));
			alert.setRuleName(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].RuleName"));
			alert.setRuleId(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].RuleId"));
			alert.setPeriod(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Period"));
			alert.setAlertState(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].AlertState"));
			alert.setDimensions(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Dimensions"));
			alert.setEnableState(_ctx.booleanValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].EnableState"));
			alert.setResources(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Resources"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setTimes(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.Times"));
			info.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.Threshold"));
			info.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Info.Statistics"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setTimes(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.Times"));
			warn.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.Threshold"));
			warn.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Warn.Statistics"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setComparisonOperator(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setTimes(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.Times"));
			critical.setThreshold(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.Threshold"));
			critical.setStatistics(_ctx.stringValue("DescribeActiveMetricRuleListResponse.AlertList["+ i +"].Escalations.Critical.Statistics"));
			escalations.setCritical(critical);
			alert.setEscalations(escalations);

			alertList.add(alert);
		}
		describeActiveMetricRuleListResponse.setAlertList(alertList);
	 
	 	return describeActiveMetricRuleListResponse;
	}
}