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

import com.aliyuncs.sae.model.v20190506.UpdateApplicationScalingRuleResponse;
import com.aliyuncs.sae.model.v20190506.UpdateApplicationScalingRuleResponse.Data;
import com.aliyuncs.sae.model.v20190506.UpdateApplicationScalingRuleResponse.Data.Metric;
import com.aliyuncs.sae.model.v20190506.UpdateApplicationScalingRuleResponse.Data.Metric.Metric1;
import com.aliyuncs.sae.model.v20190506.UpdateApplicationScalingRuleResponse.Data.Timer;
import com.aliyuncs.sae.model.v20190506.UpdateApplicationScalingRuleResponse.Data.Timer.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationScalingRuleResponseUnmarshaller {

	public static UpdateApplicationScalingRuleResponse unmarshall(UpdateApplicationScalingRuleResponse updateApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		updateApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("UpdateApplicationScalingRuleResponse.RequestId"));
		updateApplicationScalingRuleResponse.setTraceId(_ctx.stringValue("UpdateApplicationScalingRuleResponse.TraceId"));

		Data data = new Data();
		data.setUpdateTime(_ctx.longValue("UpdateApplicationScalingRuleResponse.Data.UpdateTime"));
		data.setAppId(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.AppId"));
		data.setCreateTime(_ctx.longValue("UpdateApplicationScalingRuleResponse.Data.CreateTime"));
		data.setLastDisableTime(_ctx.longValue("UpdateApplicationScalingRuleResponse.Data.LastDisableTime"));
		data.setScaleRuleEnabled(_ctx.booleanValue("UpdateApplicationScalingRuleResponse.Data.ScaleRuleEnabled"));
		data.setScaleRuleType(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.ScaleRuleType"));
		data.setScaleRuleName(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.ScaleRuleName"));

		Timer timer = new Timer();
		timer.setEndDate(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.Timer.EndDate"));
		timer.setBeginDate(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.Timer.BeginDate"));
		timer.setPeriod(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.Timer.Period"));

		List<Schedule> schedules = new ArrayList<Schedule>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApplicationScalingRuleResponse.Data.Timer.Schedules.Length"); i++) {
			Schedule schedule = new Schedule();
			schedule.setAtTime(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].AtTime"));
			schedule.setTargetReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].TargetReplicas"));

			schedules.add(schedule);
		}
		timer.setSchedules(schedules);
		data.setTimer(timer);

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.Data.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.Data.Metric.MinReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApplicationScalingRuleResponse.Data.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("UpdateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));
			metric1.setMetricType(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricType"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		data.setMetric(metric);
		updateApplicationScalingRuleResponse.setData(data);
	 
	 	return updateApplicationScalingRuleResponse;
	}
}