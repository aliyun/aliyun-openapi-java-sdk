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
		createApplicationScalingRuleResponse.setMessage(_ctx.stringValue("CreateApplicationScalingRuleResponse.Message"));
		createApplicationScalingRuleResponse.setErrorCode(_ctx.stringValue("CreateApplicationScalingRuleResponse.ErrorCode"));
		createApplicationScalingRuleResponse.setCode(_ctx.stringValue("CreateApplicationScalingRuleResponse.Code"));
		createApplicationScalingRuleResponse.setSuccess(_ctx.booleanValue("CreateApplicationScalingRuleResponse.Success"));

		Data data = new Data();
		data.setUpdateTime(_ctx.longValue("CreateApplicationScalingRuleResponse.Data.UpdateTime"));
		data.setAppId(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.AppId"));
		data.setCreateTime(_ctx.longValue("CreateApplicationScalingRuleResponse.Data.CreateTime"));
		data.setLastDisableTime(_ctx.longValue("CreateApplicationScalingRuleResponse.Data.LastDisableTime"));
		data.setScaleRuleEnabled(_ctx.booleanValue("CreateApplicationScalingRuleResponse.Data.ScaleRuleEnabled"));
		data.setScaleRuleType(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.ScaleRuleType"));
		data.setScaleRuleName(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.ScaleRuleName"));

		Timer timer = new Timer();
		timer.setEndDate(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.EndDate"));
		timer.setBeginDate(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.BeginDate"));
		timer.setPeriod(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.Period"));

		List<Schedule> schedules = new ArrayList<Schedule>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules.Length"); i++) {
			Schedule schedule = new Schedule();
			schedule.setAtTime(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].AtTime"));
			schedule.setTargetReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].TargetReplicas"));
			schedule.setMaxReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].MaxReplicas"));
			schedule.setMinReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Timer.Schedules["+ i +"].MinReplicas"));

			schedules.add(schedule);
		}
		timer.setSchedules(schedules);
		data.setTimer(timer);

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Metric.MinReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));
			metric1.setMetricType(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].MetricType"));
			metric1.setSlbProject(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].SlbProject"));
			metric1.setSlbLogstore(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].SlbLogstore"));
			metric1.setVport(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].Vport"));
			metric1.setSlbId(_ctx.stringValue("CreateApplicationScalingRuleResponse.Data.Metric.Metrics["+ i +"].SlbId"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		data.setMetric(metric);
		createApplicationScalingRuleResponse.setData(data);
	 
	 	return createApplicationScalingRuleResponse;
	}
}