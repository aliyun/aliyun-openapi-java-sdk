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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric.Metric1;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.CurrentMetric;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.NextScaleMetric;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric.ScaleDownRules;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Metric.ScaleUpRules;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Timer;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRuleResponse.Data.Timer.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationScalingRuleResponseUnmarshaller {

	public static DescribeApplicationScalingRuleResponse unmarshall(DescribeApplicationScalingRuleResponse describeApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		describeApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("DescribeApplicationScalingRuleResponse.RequestId"));
		describeApplicationScalingRuleResponse.setTraceId(_ctx.stringValue("DescribeApplicationScalingRuleResponse.TraceId"));
		describeApplicationScalingRuleResponse.setMessage(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Message"));
		describeApplicationScalingRuleResponse.setErrorCode(_ctx.stringValue("DescribeApplicationScalingRuleResponse.ErrorCode"));
		describeApplicationScalingRuleResponse.setCode(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Code"));
		describeApplicationScalingRuleResponse.setSuccess(_ctx.booleanValue("DescribeApplicationScalingRuleResponse.Success"));

		Data data = new Data();
		data.setUpdateTime(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.UpdateTime"));
		data.setAppId(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.AppId"));
		data.setCreateTime(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.CreateTime"));
		data.setLastDisableTime(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.LastDisableTime"));
		data.setScaleRuleEnabled(_ctx.booleanValue("DescribeApplicationScalingRuleResponse.Data.ScaleRuleEnabled"));
		data.setScaleRuleType(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.ScaleRuleType"));
		data.setScaleRuleName(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.ScaleRuleName"));

		Timer timer = new Timer();
		timer.setEndDate(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Timer.EndDate"));
		timer.setBeginDate(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Timer.BeginDate"));
		timer.setPeriod(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Timer.Period"));

		List<Schedule> schedules = new ArrayList<Schedule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRuleResponse.Data.Timer.Schedules.Length"); i++) {
			Schedule schedule = new Schedule();
			schedule.setAtTime(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].AtTime"));
			schedule.setTargetReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].TargetReplicas"));

			schedules.add(schedule);
		}
		timer.setSchedules(schedules);
		data.setTimer(timer);

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Metric.MinReplicas"));

		MetricsStatus metricsStatus = new MetricsStatus();
		metricsStatus.setDesiredReplicas(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.DesiredReplicas"));
		metricsStatus.setNextScaleTimePeriod(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.NextScaleTimePeriod"));
		metricsStatus.setCurrentReplicas(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.CurrentReplicas"));
		metricsStatus.setLastScaleTime(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.LastScaleTime"));

		List<CurrentMetric> currentMetrics = new ArrayList<CurrentMetric>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.CurrentMetrics.Length"); i++) {
			CurrentMetric currentMetric = new CurrentMetric();
			currentMetric.setType(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.CurrentMetrics["+ i +"].Type"));
			currentMetric.setCurrentValue(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.CurrentMetrics["+ i +"].CurrentValue"));
			currentMetric.setName(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.CurrentMetrics["+ i +"].Name"));

			currentMetrics.add(currentMetric);
		}
		metricsStatus.setCurrentMetrics(currentMetrics);

		List<NextScaleMetric> nextScaleMetrics = new ArrayList<NextScaleMetric>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.NextScaleMetrics.Length"); i++) {
			NextScaleMetric nextScaleMetric = new NextScaleMetric();
			nextScaleMetric.setNextScaleOutAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.NextScaleMetrics["+ i +"].NextScaleOutAverageUtilization"));
			nextScaleMetric.setNextScaleInAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.NextScaleMetrics["+ i +"].NextScaleInAverageUtilization"));
			nextScaleMetric.setName(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Metric.MetricsStatus.NextScaleMetrics["+ i +"].Name"));

			nextScaleMetrics.add(nextScaleMetric);
		}
		metricsStatus.setNextScaleMetrics(nextScaleMetrics);
		metric.setMetricsStatus(metricsStatus);

		ScaleUpRules scaleUpRules = new ScaleUpRules();
		scaleUpRules.setStep(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.ScaleUpRules.Step"));
		scaleUpRules.setStabilizationWindowSeconds(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.ScaleUpRules.StabilizationWindowSeconds"));
		scaleUpRules.setDisabled(_ctx.booleanValue("DescribeApplicationScalingRuleResponse.Data.Metric.ScaleUpRules.Disabled"));
		metric.setScaleUpRules(scaleUpRules);

		ScaleDownRules scaleDownRules = new ScaleDownRules();
		scaleDownRules.setStep(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.ScaleDownRules.Step"));
		scaleDownRules.setStabilizationWindowSeconds(_ctx.longValue("DescribeApplicationScalingRuleResponse.Data.Metric.ScaleDownRules.StabilizationWindowSeconds"));
		scaleDownRules.setDisabled(_ctx.booleanValue("DescribeApplicationScalingRuleResponse.Data.Metric.ScaleDownRules.Disabled"));
		metric.setScaleDownRules(scaleDownRules);

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRuleResponse.Data.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));
			metric1.setMetricType(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricType"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		data.setMetric(metric);
		describeApplicationScalingRuleResponse.setData(data);
	 
	 	return describeApplicationScalingRuleResponse;
	}
}