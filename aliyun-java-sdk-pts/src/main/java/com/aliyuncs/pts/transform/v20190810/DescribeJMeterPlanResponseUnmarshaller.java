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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeJMeterPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJMeterPlanResponseUnmarshaller {

	public static DescribeJMeterPlanResponse unmarshall(DescribeJMeterPlanResponse describeJMeterPlanResponse, UnmarshallerContext _ctx) {
		
		describeJMeterPlanResponse.setRequestId(_ctx.stringValue("DescribeJMeterPlanResponse.RequestId"));
		describeJMeterPlanResponse.setMessage(_ctx.stringValue("DescribeJMeterPlanResponse.Message"));
		describeJMeterPlanResponse.setCode(_ctx.stringValue("DescribeJMeterPlanResponse.Code"));
		describeJMeterPlanResponse.setSuccess(_ctx.booleanValue("DescribeJMeterPlanResponse.Success"));
		describeJMeterPlanResponse.setHttpStatusCode(_ctx.integerValue("DescribeJMeterPlanResponse.HttpStatusCode"));
		describeJMeterPlanResponse.setReport(_ctx.stringValue("DescribeJMeterPlanResponse.Report"));
	 
	 	return describeJMeterPlanResponse;
	}
}