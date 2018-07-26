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

import com.aliyuncs.cms.model.v20180308.DescribeAlarmsForResourcesResponse;
import com.aliyuncs.cms.model.v20180308.DescribeAlarmsForResourcesResponse.Alarm;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsForResourcesResponseUnmarshaller {

	public static DescribeAlarmsForResourcesResponse unmarshall(DescribeAlarmsForResourcesResponse describeAlarmsForResourcesResponse, UnmarshallerContext context) {
		
		describeAlarmsForResourcesResponse.setRequestId(context.stringValue("DescribeAlarmsForResourcesResponse.RequestId"));
		describeAlarmsForResourcesResponse.setTraceId(context.stringValue("DescribeAlarmsForResourcesResponse.TraceId"));
		describeAlarmsForResourcesResponse.setSuccess(context.booleanValue("DescribeAlarmsForResourcesResponse.Success"));
		describeAlarmsForResourcesResponse.setCode(context.integerValue("DescribeAlarmsForResourcesResponse.Code"));
		describeAlarmsForResourcesResponse.setMessage(context.stringValue("DescribeAlarmsForResourcesResponse.Message"));
		describeAlarmsForResourcesResponse.setTotal(context.stringValue("DescribeAlarmsForResourcesResponse.Total"));
		describeAlarmsForResourcesResponse.setDimensions(context.stringValue("DescribeAlarmsForResourcesResponse.Dimensions"));

		List<Alarm> datapoints = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmsForResourcesResponse.Datapoints.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setUuid(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Uuid"));
			alarm.setName(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Name"));
			alarm.setNamespace(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Namespace"));
			alarm.setMetricName(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].MetricName"));
			alarm.setPeriod(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Period"));
			alarm.setEvaluationCount(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].EvaluationCount"));
			alarm.setEffectiveInterval(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].EffectiveInterval"));
			alarm.setNoEffectiveInterval(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].NoEffectiveInterval"));
			alarm.setSilenceTime(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].SilenceTime"));
			alarm.setEnable(context.booleanValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Enable"));
			alarm.setState(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].State"));
			alarm.setContactGroups(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].ContactGroups"));
			alarm.setWebhook(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Webhook"));
			alarm.setSubject(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Subject"));
			alarm.setDisplayName(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].DisplayName"));
			alarm.setResources(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Resources"));
			alarm.setLevel(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Level"));
			alarm.setGroupId(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].GroupId"));
			alarm.setGroupName(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].GroupName"));
			alarm.setStatistics(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Statistics"));
			alarm.setComparisonOperator(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].ComparisonOperator"));
			alarm.setThreshold(context.stringValue("DescribeAlarmsForResourcesResponse.Datapoints["+ i +"].Threshold"));

			datapoints.add(alarm);
		}
		describeAlarmsForResourcesResponse.setDatapoints(datapoints);
	 
	 	return describeAlarmsForResourcesResponse;
	}
}