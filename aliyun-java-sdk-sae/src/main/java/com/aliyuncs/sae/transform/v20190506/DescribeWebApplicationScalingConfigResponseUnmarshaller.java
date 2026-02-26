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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationScalingConfigResponse;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationScalingConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebApplicationScalingConfigResponseUnmarshaller {

	public static DescribeWebApplicationScalingConfigResponse unmarshall(DescribeWebApplicationScalingConfigResponse describeWebApplicationScalingConfigResponse, UnmarshallerContext _ctx) {
		
		describeWebApplicationScalingConfigResponse.setRequestId(_ctx.stringValue("DescribeWebApplicationScalingConfigResponse.RequestId"));
		describeWebApplicationScalingConfigResponse.setCode(_ctx.integerValue("DescribeWebApplicationScalingConfigResponse.Code"));
		describeWebApplicationScalingConfigResponse.setMessage(_ctx.stringValue("DescribeWebApplicationScalingConfigResponse.Message"));
		describeWebApplicationScalingConfigResponse.setSuccess(_ctx.booleanValue("DescribeWebApplicationScalingConfigResponse.Success"));

		Data data = new Data();
		data.setMaximumInstanceCount(_ctx.longValue("DescribeWebApplicationScalingConfigResponse.Data.MaximumInstanceCount"));
		data.setMinimumInstanceCount(_ctx.longValue("DescribeWebApplicationScalingConfigResponse.Data.MinimumInstanceCount"));
		describeWebApplicationScalingConfigResponse.setData(data);
	 
	 	return describeWebApplicationScalingConfigResponse;
	}
}