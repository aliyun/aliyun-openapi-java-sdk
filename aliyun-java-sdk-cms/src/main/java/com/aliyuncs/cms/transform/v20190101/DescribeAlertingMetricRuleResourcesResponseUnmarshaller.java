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

import com.aliyuncs.cms.model.v20190101.DescribeAlertingMetricRuleResourcesResponse;
import com.aliyuncs.cms.model.v20190101.DescribeAlertingMetricRuleResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertingMetricRuleResourcesResponseUnmarshaller {

	public static DescribeAlertingMetricRuleResourcesResponse unmarshall(DescribeAlertingMetricRuleResourcesResponse describeAlertingMetricRuleResourcesResponse, UnmarshallerContext context) {
		
		describeAlertingMetricRuleResourcesResponse.setRequestId(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.RequestId"));
		describeAlertingMetricRuleResourcesResponse.setSuccess(context.booleanValue("DescribeAlertingMetricRuleResourcesResponse.Success"));
		describeAlertingMetricRuleResourcesResponse.setCode(context.integerValue("DescribeAlertingMetricRuleResourcesResponse.Code"));
		describeAlertingMetricRuleResourcesResponse.setMessage(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Message"));
		describeAlertingMetricRuleResourcesResponse.setTotal(context.integerValue("DescribeAlertingMetricRuleResourcesResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeAlertingMetricRuleResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setRuleId(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RuleId"));
			resource.setRuleName(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RuleName"));
			resource.setGroupId(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].GroupId"));
			resource.setResource(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Resource"));
			resource.setEnable(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Enable"));
			resource.setLastAlertTime(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].LastAlertTime"));
			resource.setLastModifyTime(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].LastModifyTime"));
			resource.setStartTime(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].StartTime"));
			resource.setMetricValues(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].MetricValues"));
			resource.setRetryTimes(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RetryTimes"));
			resource.setThreshold(context.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Threshold"));

			resources.add(resource);
		}
		describeAlertingMetricRuleResourcesResponse.setResources(resources);
	 
	 	return describeAlertingMetricRuleResourcesResponse;
	}
}