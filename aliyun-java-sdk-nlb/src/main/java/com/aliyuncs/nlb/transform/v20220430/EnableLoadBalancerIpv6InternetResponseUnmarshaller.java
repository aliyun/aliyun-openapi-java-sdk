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

import com.aliyuncs.nlb.model.v20220430.EnableLoadBalancerIpv6InternetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableLoadBalancerIpv6InternetResponseUnmarshaller {

	public static EnableLoadBalancerIpv6InternetResponse unmarshall(EnableLoadBalancerIpv6InternetResponse enableLoadBalancerIpv6InternetResponse, UnmarshallerContext _ctx) {
		
		enableLoadBalancerIpv6InternetResponse.setRequestId(_ctx.stringValue("EnableLoadBalancerIpv6InternetResponse.RequestId"));
		enableLoadBalancerIpv6InternetResponse.setSuccess(_ctx.booleanValue("EnableLoadBalancerIpv6InternetResponse.Success"));
		enableLoadBalancerIpv6InternetResponse.setCode(_ctx.stringValue("EnableLoadBalancerIpv6InternetResponse.Code"));
		enableLoadBalancerIpv6InternetResponse.setMessage(_ctx.stringValue("EnableLoadBalancerIpv6InternetResponse.Message"));
		enableLoadBalancerIpv6InternetResponse.setHttpStatusCode(_ctx.integerValue("EnableLoadBalancerIpv6InternetResponse.HttpStatusCode"));
		enableLoadBalancerIpv6InternetResponse.setDynamicCode(_ctx.stringValue("EnableLoadBalancerIpv6InternetResponse.DynamicCode"));
		enableLoadBalancerIpv6InternetResponse.setDynamicMessage(_ctx.stringValue("EnableLoadBalancerIpv6InternetResponse.DynamicMessage"));
	 
	 	return enableLoadBalancerIpv6InternetResponse;
	}
}