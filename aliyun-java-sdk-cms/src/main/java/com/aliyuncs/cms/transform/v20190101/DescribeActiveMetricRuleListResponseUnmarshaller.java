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
	 
	 	return describeActiveMetricRuleListResponse;
	}
}