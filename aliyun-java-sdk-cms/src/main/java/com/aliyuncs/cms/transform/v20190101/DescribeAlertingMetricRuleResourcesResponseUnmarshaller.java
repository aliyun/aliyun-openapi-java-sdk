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

	public static DescribeAlertingMetricRuleResourcesResponse unmarshall(DescribeAlertingMetricRuleResourcesResponse describeAlertingMetricRuleResourcesResponse, UnmarshallerContext _ctx) {
		
		describeAlertingMetricRuleResourcesResponse.setRequestId(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.RequestId"));
		describeAlertingMetricRuleResourcesResponse.setSuccess(_ctx.booleanValue("DescribeAlertingMetricRuleResourcesResponse.Success"));
		describeAlertingMetricRuleResourcesResponse.setCode(_ctx.integerValue("DescribeAlertingMetricRuleResourcesResponse.Code"));
		describeAlertingMetricRuleResourcesResponse.setMessage(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Message"));
		describeAlertingMetricRuleResourcesResponse.setTotal(_ctx.integerValue("DescribeAlertingMetricRuleResourcesResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertingMetricRuleResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setRuleId(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RuleId"));
			resource.setRuleName(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RuleName"));
			resource.setGroupId(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].GroupId"));
			resource.setResource(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Resource"));
			resource.setEnable(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Enable"));
			resource.setLastAlertTime(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].LastAlertTime"));
			resource.setLastModifyTime(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].LastModifyTime"));
			resource.setStartTime(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].StartTime"));
			resource.setMetricValues(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].MetricValues"));
			resource.setRetryTimes(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RetryTimes"));
			resource.setThreshold(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Threshold"));

			resources.add(resource);
		}
		describeAlertingMetricRuleResourcesResponse.setResources(resources);
	 
	 	return describeAlertingMetricRuleResourcesResponse;
	}
}