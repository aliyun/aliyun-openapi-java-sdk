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

import com.aliyuncs.cms.model.v20190101.DescribeProductsOfActiveMetricRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductsOfActiveMetricRuleResponseUnmarshaller {

	public static DescribeProductsOfActiveMetricRuleResponse unmarshall(DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRuleResponse, UnmarshallerContext _ctx) {
		
		describeProductsOfActiveMetricRuleResponse.setRequestId(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.RequestId"));
		describeProductsOfActiveMetricRuleResponse.setSuccess(_ctx.booleanValue("DescribeProductsOfActiveMetricRuleResponse.Success"));
		describeProductsOfActiveMetricRuleResponse.setCode(_ctx.integerValue("DescribeProductsOfActiveMetricRuleResponse.Code"));
		describeProductsOfActiveMetricRuleResponse.setMessage(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.Message"));
		describeProductsOfActiveMetricRuleResponse.setDatapoints(_ctx.stringValue("DescribeProductsOfActiveMetricRuleResponse.Datapoints"));
	 
	 	return describeProductsOfActiveMetricRuleResponse;
	}
}