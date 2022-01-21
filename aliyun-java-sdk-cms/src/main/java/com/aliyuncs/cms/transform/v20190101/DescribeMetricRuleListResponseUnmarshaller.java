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
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.CompositeExpression;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.CompositeExpression.ExpressionListItem;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations.Critical;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations.Info;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Escalations.Warn;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.LabelsItem;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Prometheus;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleListResponse.Alarm.Prometheus.AnnotationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleListResponseUnmarshaller {

	public static DescribeMetricRuleListResponse unmarshall(DescribeMetricRuleListResponse describeMetricRuleListResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleListResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleListResponse.RequestId"));
		describeMetricRuleListResponse.setCode(_ctx.integerValue("DescribeMetricRuleListResponse.Code"));
		describeMetricRuleListResponse.setMessage(_ctx.stringValue("DescribeMetricRuleListResponse.Message"));
		describeMetricRuleListResponse.setTotal(_ctx.stringValue("DescribeMetricRuleListResponse.Total"));
		describeMetricRuleListResponse.setSuccess(_ctx.booleanValue("DescribeMetricRuleListResponse.Success"));

		List<Alarm> alarms = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleListResponse.Alarms.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setSilenceTime(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].SilenceTime"));
			alarm.setMetricName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].MetricName"));
			alarm.setWebhook(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Webhook"));
			alarm.setContactGroups(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].ContactGroups"));
			alarm.setSourceType(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].SourceType"));
			alarm.setNamespace(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Namespace"));
			alarm.setMailSubject(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].MailSubject"));
			alarm.setNoEffectiveInterval(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].NoEffectiveInterval"));
			alarm.setEffectiveInterval(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].EffectiveInterval"));
			alarm.setRuleName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].RuleName"));
			alarm.setAlertState(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].AlertState"));
			alarm.setPeriod(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Period"));
			alarm.setRuleId(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].RuleId"));
			alarm.setGroupName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupName"));
			alarm.setGroupId(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupId"));
			alarm.setDimensions(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Dimensions"));
			alarm.setEnableState(_ctx.booleanValue("DescribeMetricRuleListResponse.Alarms["+ i +"].EnableState"));
			alarm.setGroupBy(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].GroupBy"));
			alarm.setResources(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Resources"));
			alarm.setNoDataPolicy(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].NoDataPolicy"));
			alarm.setOptions(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Options"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setPreCondition(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.PreCondition"));
			info.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Times"));
			info.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Threshold"));
			info.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Info.Statistics"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setPreCondition(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.PreCondition"));
			warn.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Times"));
			warn.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Threshold"));
			warn.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Warn.Statistics"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setPreCondition(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.PreCondition"));
			critical.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Times"));
			critical.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Threshold"));
			critical.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Escalations.Critical.Statistics"));
			escalations.setCritical(critical);
			alarm.setEscalations(escalations);

			CompositeExpression compositeExpression = new CompositeExpression();
			compositeExpression.setLevel(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.Level"));
			compositeExpression.setExpressionListJoin(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionListJoin"));
			compositeExpression.setExpressionRaw(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionRaw"));
			compositeExpression.setTimes(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.Times"));

			List<ExpressionListItem> expressionList = new ArrayList<ExpressionListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList.Length"); j++) {
				ExpressionListItem expressionListItem = new ExpressionListItem();
				expressionListItem.setMetricName(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList["+ j +"].MetricName"));
				expressionListItem.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList["+ j +"].ComparisonOperator"));
				expressionListItem.setStatistics(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList["+ j +"].Statistics"));
				expressionListItem.setThreshold(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList["+ j +"].Threshold"));
				expressionListItem.setPeriod(_ctx.integerValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList["+ j +"].Period"));
				expressionListItem.setId(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].CompositeExpression.ExpressionList["+ j +"].Id"));

				expressionList.add(expressionListItem);
			}
			compositeExpression.setExpressionList(expressionList);
			alarm.setCompositeExpression(compositeExpression);

			Prometheus prometheus = new Prometheus();
			prometheus.setPromQL(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Prometheus.PromQL"));
			prometheus.setLevel(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Prometheus.Level"));
			prometheus.setTimes(_ctx.longValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Prometheus.Times"));

			List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Prometheus.Annotations.Length"); j++) {
				AnnotationsItem annotationsItem = new AnnotationsItem();
				annotationsItem.setKey(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Prometheus.Annotations["+ j +"].Key"));
				annotationsItem.setValue(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Prometheus.Annotations["+ j +"].Value"));

				annotations.add(annotationsItem);
			}
			prometheus.setAnnotations(annotations);
			alarm.setPrometheus(prometheus);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setKey(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Labels["+ j +"].Key"));
				labelsItem.setValue(_ctx.stringValue("DescribeMetricRuleListResponse.Alarms["+ i +"].Labels["+ j +"].Value"));

				labels.add(labelsItem);
			}
			alarm.setLabels(labels);

			alarms.add(alarm);
		}
		describeMetricRuleListResponse.setAlarms(alarms);
	 
	 	return describeMetricRuleListResponse;
	}
}