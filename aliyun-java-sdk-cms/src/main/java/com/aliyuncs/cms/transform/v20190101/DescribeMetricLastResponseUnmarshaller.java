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

import com.aliyuncs.cms.model.v20190101.DescribeMetricLastResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricLastResponseUnmarshaller {

	public static DescribeMetricLastResponse unmarshall(DescribeMetricLastResponse describeMetricLastResponse, UnmarshallerContext context) {
		
		describeMetricLastResponse.setRequestId(context.stringValue("DescribeMetricLastResponse.RequestId"));
		describeMetricLastResponse.setCode(context.stringValue("DescribeMetricLastResponse.Code"));
		describeMetricLastResponse.setMessage(context.stringValue("DescribeMetricLastResponse.Message"));
		describeMetricLastResponse.setNextToken(context.stringValue("DescribeMetricLastResponse.NextToken"));
		describeMetricLastResponse.setDatapoints(context.stringValue("DescribeMetricLastResponse.Datapoints"));
		describeMetricLastResponse.setPeriod(context.stringValue("DescribeMetricLastResponse.Period"));
		describeMetricLastResponse.setSuccess(context.booleanValue("DescribeMetricLastResponse.Success"));
	 
	 	return describeMetricLastResponse;
	}
}