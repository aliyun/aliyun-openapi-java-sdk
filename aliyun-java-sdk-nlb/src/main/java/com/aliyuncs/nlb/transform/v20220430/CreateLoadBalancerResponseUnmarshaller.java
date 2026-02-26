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

package com.aliyuncs.nlb.transform.v20220430;

import com.aliyuncs.nlb.model.v20220430.CreateLoadBalancerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLoadBalancerResponseUnmarshaller {

	public static CreateLoadBalancerResponse unmarshall(CreateLoadBalancerResponse createLoadBalancerResponse, UnmarshallerContext _ctx) {
		
		createLoadBalancerResponse.setRequestId(_ctx.stringValue("CreateLoadBalancerResponse.RequestId"));
		createLoadBalancerResponse.setSuccess(_ctx.booleanValue("CreateLoadBalancerResponse.Success"));
		createLoadBalancerResponse.setCode(_ctx.stringValue("CreateLoadBalancerResponse.Code"));
		createLoadBalancerResponse.setMessage(_ctx.stringValue("CreateLoadBalancerResponse.Message"));
		createLoadBalancerResponse.setHttpStatusCode(_ctx.integerValue("CreateLoadBalancerResponse.HttpStatusCode"));
		createLoadBalancerResponse.setDynamicCode(_ctx.stringValue("CreateLoadBalancerResponse.DynamicCode"));
		createLoadBalancerResponse.setDynamicMessage(_ctx.stringValue("CreateLoadBalancerResponse.DynamicMessage"));
		createLoadBalancerResponse.setLoadbalancerId(_ctx.stringValue("CreateLoadBalancerResponse.LoadbalancerId"));
		createLoadBalancerResponse.setJobId(_ctx.stringValue("CreateLoadBalancerResponse.JobId"));
		createLoadBalancerResponse.setOrderId(_ctx.longValue("CreateLoadBalancerResponse.OrderId"));
	 
	 	return createLoadBalancerResponse;
	}
}