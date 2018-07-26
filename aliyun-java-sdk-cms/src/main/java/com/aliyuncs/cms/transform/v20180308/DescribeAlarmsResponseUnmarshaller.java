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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.DescribeAlarmsResponse;
import com.aliyuncs.cms.model.v20180308.DescribeAlarmsResponse.Alarm;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext context) {
		
		describeAlarmsResponse.setRequestId(context.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setTraceId(context.stringValue("DescribeAlarmsResponse.TraceId"));
		describeAlarmsResponse.setSuccess(context.booleanValue("DescribeAlarmsResponse.Success"));
		describeAlarmsResponse.setCode(context.integerValue("DescribeAlarmsResponse.Code"));
		describeAlarmsResponse.setMessage(context.stringValue("DescribeAlarmsResponse.Message"));
		describeAlarmsResponse.setTotal(context.stringValue("DescribeAlarmsResponse.Total"));

		List<Alarm> datapoints = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmsResponse.Datapoints.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setUuid(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Uuid"));
			alarm.setName(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Name"));
			alarm.setNamespace(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Namespace"));
			alarm.setMetricName(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].MetricName"));
			alarm.setPeriod(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Period"));
			alarm.setEvaluationCount(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].EvaluationCount"));
			alarm.setEffectiveInterval(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].EffectiveInterval"));
			alarm.setNoEffectiveInterval(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].NoEffectiveInterval"));
			alarm.setSilenceTime(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].SilenceTime"));
			alarm.setEnable(context.booleanValue("DescribeAlarmsResponse.Datapoints["+ i +"].Enable"));
			alarm.setState(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].State"));
			alarm.setContactGroups(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].ContactGroups"));
			alarm.setWebhook(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Webhook"));
			alarm.setSubject(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Subject"));
			alarm.setRuleName(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].RuleName"));
			alarm.setResources(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Resources"));
			alarm.setLevel(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Level"));
			alarm.setGroupId(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].GroupId"));
			alarm.setGroupName(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].GroupName"));
			alarm.setDimensions(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Dimensions"));
			alarm.setStatistics(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Statistics"));
			alarm.setComparisonOperator(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].ComparisonOperator"));
			alarm.setThreshold(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].Threshold"));
			alarm.setDisplayName(context.stringValue("DescribeAlarmsResponse.Datapoints["+ i +"].DisplayName"));

			datapoints.add(alarm);
		}
		describeAlarmsResponse.setDatapoints(datapoints);
	 
	 	return describeAlarmsResponse;
	}
}