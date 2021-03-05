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
import com.aliyuncs.cms.model.v20190101.DescribeAlertingMetricRuleResourcesResponse.Resource.Resource1;
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
			resource.setMetricName(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].MetricName"));
			resource.setNamespace(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Namespace"));
			resource.setEnable(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Enable"));
			resource.setLastAlertTime(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].LastAlertTime"));
			resource.setLastModifyTime(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].LastModifyTime"));
			resource.setDimensions(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Dimensions"));
			resource.setStartTime(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].StartTime"));
			resource.setMetricValues(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].MetricValues"));
			resource.setRetryTimes(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].RetryTimes"));
			resource.setStatistics(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Statistics"));
			resource.setThreshold(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Threshold"));
			resource.setProductCategory(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].ProductCategory"));
			resource.setLevel(_ctx.integerValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Level"));

			List<Resource1> escalation = new ArrayList<Resource1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation.Length"); j++) {
				Resource1 resource1 = new Resource1();
				resource1.setExpression(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].Expression"));
				resource1.setPreCondition(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].PreCondition"));
				resource1.setLevel(_ctx.integerValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].Level"));
				resource1.setTimes(_ctx.integerValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].Times"));
				resource1.setComparisonOperator(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].ComparisonOperator"));
				resource1.setTag(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].Tag"));
				resource1.setThreshold(_ctx.stringValue("DescribeAlertingMetricRuleResourcesResponse.Resources["+ i +"].Escalation["+ j +"].Threshold"));

				escalation.add(resource1);
			}
			resource.setEscalation(escalation);

			resources.add(resource);
		}
		describeAlertingMetricRuleResourcesResponse.setResources(resources);
	 
	 	return describeAlertingMetricRuleResourcesResponse;
	}
}