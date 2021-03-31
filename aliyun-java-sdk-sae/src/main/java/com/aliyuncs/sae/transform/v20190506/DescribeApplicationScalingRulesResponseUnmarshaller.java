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

import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Metric;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Metric.Metric1;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Metric.MetricsStatus;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Metric.MetricsStatus.CurrentMetric;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Metric.MetricsStatus.NextScaleMetric;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Timer;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRule.Timer.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationScalingRulesResponseUnmarshaller {

	public static DescribeApplicationScalingRulesResponse unmarshall(DescribeApplicationScalingRulesResponse describeApplicationScalingRulesResponse, UnmarshallerContext _ctx) {
		
		describeApplicationScalingRulesResponse.setRequestId(_ctx.stringValue("DescribeApplicationScalingRulesResponse.RequestId"));
		describeApplicationScalingRulesResponse.setTraceId(_ctx.stringValue("DescribeApplicationScalingRulesResponse.TraceId"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.TotalSize"));

		List<ApplicationScalingRule> applicationScalingRules = new ArrayList<ApplicationScalingRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules.Length"); i++) {
			ApplicationScalingRule applicationScalingRule = new ApplicationScalingRule();
			applicationScalingRule.setScaleRuleEnabled(_ctx.booleanValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].ScaleRuleEnabled"));
			applicationScalingRule.setLastDisableTime(_ctx.longValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].LastDisableTime"));
			applicationScalingRule.setAppId(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].AppId"));
			applicationScalingRule.setCreateTime(_ctx.longValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].CreateTime"));
			applicationScalingRule.setUpdateTime(_ctx.longValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].UpdateTime"));
			applicationScalingRule.setScaleRuleName(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].ScaleRuleName"));
			applicationScalingRule.setScaleRuleType(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].ScaleRuleType"));

			Timer timer = new Timer();
			timer.setPeriod(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Timer.Period"));
			timer.setEndDate(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Timer.EndDate"));
			timer.setBeginDate(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Timer.BeginDate"));

			List<Schedule> schedules = new ArrayList<Schedule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Timer.Schedules.Length"); j++) {
				Schedule schedule = new Schedule();
				schedule.setTargetReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Timer.Schedules["+ j +"].TargetReplicas"));
				schedule.setAtTime(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Timer.Schedules["+ j +"].AtTime"));

				schedules.add(schedule);
			}
			timer.setSchedules(schedules);
			applicationScalingRule.setTimer(timer);

			Metric metric = new Metric();
			metric.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MinReplicas"));
			metric.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MaxReplicas"));

			MetricsStatus metricsStatus = new MetricsStatus();
			metricsStatus.setDesiredReplicas(_ctx.longValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.DesiredReplicas"));
			metricsStatus.setCurrentReplicas(_ctx.longValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.CurrentReplicas"));
			metricsStatus.setNextScaleTimePeriod(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.NextScaleTimePeriod"));
			metricsStatus.setLastScaleTime(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.LastScaleTime"));

			List<NextScaleMetric> nextScaleMetrics = new ArrayList<NextScaleMetric>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.NextScaleMetrics.Length"); j++) {
				NextScaleMetric nextScaleMetric = new NextScaleMetric();
				nextScaleMetric.setNextScaleInAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.NextScaleMetrics["+ j +"].NextScaleInAverageUtilization"));
				nextScaleMetric.setName(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.NextScaleMetrics["+ j +"].Name"));
				nextScaleMetric.setNextScaleOutAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.NextScaleMetrics["+ j +"].NextScaleOutAverageUtilization"));

				nextScaleMetrics.add(nextScaleMetric);
			}
			metricsStatus.setNextScaleMetrics(nextScaleMetrics);

			List<CurrentMetric> currentMetrics = new ArrayList<CurrentMetric>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.CurrentMetrics.Length"); j++) {
				CurrentMetric currentMetric = new CurrentMetric();
				currentMetric.setType(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.CurrentMetrics["+ j +"].Type"));
				currentMetric.setCurrentValue(_ctx.longValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.CurrentMetrics["+ j +"].CurrentValue"));
				currentMetric.setName(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.MetricsStatus.CurrentMetrics["+ j +"].Name"));

				currentMetrics.add(currentMetric);
			}
			metricsStatus.setCurrentMetrics(currentMetrics);
			metric.setMetricsStatus(metricsStatus);

			List<Metric1> metrics = new ArrayList<Metric1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.Metrics.Length"); j++) {
				Metric1 metric1 = new Metric1();
				metric1.setMetricType(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.Metrics["+ j +"].MetricType"));
				metric1.setMetricTargetAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Data.ApplicationScalingRules["+ i +"].Metric.Metrics["+ j +"].MetricTargetAverageUtilization"));

				metrics.add(metric1);
			}
			metric.setMetrics(metrics);
			applicationScalingRule.setMetric(metric);

			applicationScalingRules.add(applicationScalingRule);
		}
		data.setApplicationScalingRules(applicationScalingRules);
		describeApplicationScalingRulesResponse.setData(data);
	 
	 	return describeApplicationScalingRulesResponse;
	}
}