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

import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleCountResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleCountResponse.MetricRuleCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleCountResponseUnmarshaller {

	public static DescribeMetricRuleCountResponse unmarshall(DescribeMetricRuleCountResponse describeMetricRuleCountResponse, UnmarshallerContext context) {
		
		describeMetricRuleCountResponse.setRequestId(context.stringValue("DescribeMetricRuleCountResponse.RequestId"));
		describeMetricRuleCountResponse.setSuccess(context.booleanValue("DescribeMetricRuleCountResponse.Success"));
		describeMetricRuleCountResponse.setCode(context.stringValue("DescribeMetricRuleCountResponse.Code"));
		describeMetricRuleCountResponse.setMessage(context.stringValue("DescribeMetricRuleCountResponse.Message"));

		MetricRuleCount metricRuleCount = new MetricRuleCount();
		metricRuleCount.setAlarm(context.integerValue("DescribeMetricRuleCountResponse.MetricRuleCount.Alarm"));
		metricRuleCount.setDisable(context.integerValue("DescribeMetricRuleCountResponse.MetricRuleCount.Disable"));
		metricRuleCount.setNodata(context.integerValue("DescribeMetricRuleCountResponse.MetricRuleCount.Nodata"));
		metricRuleCount.setOk(context.integerValue("DescribeMetricRuleCountResponse.MetricRuleCount.Ok"));
		metricRuleCount.setTotal(context.integerValue("DescribeMetricRuleCountResponse.MetricRuleCount.Total"));
		describeMetricRuleCountResponse.setMetricRuleCount(metricRuleCount);
	 
	 	return describeMetricRuleCountResponse;
	}
}