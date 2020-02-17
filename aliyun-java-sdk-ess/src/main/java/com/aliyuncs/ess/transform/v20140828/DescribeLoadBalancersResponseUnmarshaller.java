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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeLoadBalancersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancersResponseUnmarshaller {

	public static DescribeLoadBalancersResponse unmarshall(DescribeLoadBalancersResponse describeLoadBalancersResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancersResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancersResponse.RequestId"));
		describeLoadBalancersResponse.setScalingGroupId(_ctx.stringValue("DescribeLoadBalancersResponse.ScalingGroupId"));

		List<String> loadBalancers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancersResponse.LoadBalancers.Length"); i++) {
			loadBalancers.add(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"]"));
		}
		describeLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return describeLoadBalancersResponse;
	}
}