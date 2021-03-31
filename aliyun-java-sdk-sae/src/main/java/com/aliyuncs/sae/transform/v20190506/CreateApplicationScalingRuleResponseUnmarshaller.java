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

import com.aliyuncs.sae.model.v20190506.CreateApplicationScalingRuleResponse;
import com.aliyuncs.sae.model.v20190506.CreateApplicationScalingRuleResponse.Data;
import com.aliyuncs.sae.model.v20190506.CreateApplicationScalingRuleResponse.Data.Metric;
import com.aliyuncs.sae.model.v20190506.CreateApplicationScalingRuleResponse.Data.Metric.Metric1;
import com.aliyuncs.sae.model.v20190506.CreateApplicationScalingRuleResponse.Data.Timer;
import com.aliyuncs.sae.model.v20190506.CreateApplicationScalingRuleResponse.Data.Timer.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationScalingRuleResponseUnmarshaller {

	public static CreateApplicationScalingRuleResponse unmarshall(CreateApplicationScalingRuleResponse createApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		createApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("CreateApplicationScalingRuleResponse.RequestId"));
		createApplicationScalingRuleResponse.setTraceId(_ctx.stringValue("CreateApplicationScalingRuleResponse.TraceId"));

		Data data = new Data();
		data.setScaleRuleEnabled(_ctx.booleanValue("CreateApplicationScalingRuleResponse.Data.ScaleRuleEnabled"));
		data.setLastDisableTime(_ctx.longValue("CreateApplicationScalingRuleResponse.Data.LastDisableTime"));
		data.setAppId(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.AppId"));
		data.setCreateTime(_ctx.longValue("CreateApplicationScalingRuleResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.longValue("CreateApplicationScalingRuleResponse.Data.UpdateTime"));
		data.setScaleRuleName(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.ScaleRuleName"));
		data.setScaleRuleType(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.ScaleRuleType"));

		Timer timer = new Timer();
		timer.setPeriod(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.Period"));
		timer.setEndDate(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.EndDate"));
		timer.setBeginDate(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.BeginDate"));

		List<Schedule> schedules = new ArrayList<Schedule>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules.Length"); i++) {
			Schedule schedule = new Schedule();
			schedule.setTargetReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].TargetReplicas"));
			schedule.setAtTime(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].AtTime"));

			schedules.add(schedule);
		}
		timer.setSchedules(schedules);
		data.setTimer(timer);

		Metric metric = new Metric();
		metric.setMinReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Metric.MinReplicas"));
		metric.setMaxReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Metric.MaxReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricType(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricType"));
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		data.setMetric(metric);
		createApplicationScalingRuleResponse.setData(data);
	 
	 	return createApplicationScalingRuleResponse;
	}
}