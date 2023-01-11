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

import com.aliyuncs.nlb.model.v20220430.DisableLoadBalancerIpv6InternetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableLoadBalancerIpv6InternetResponseUnmarshaller {

	public static DisableLoadBalancerIpv6InternetResponse unmarshall(DisableLoadBalancerIpv6InternetResponse disableLoadBalancerIpv6InternetResponse, UnmarshallerContext _ctx) {
		
		disableLoadBalancerIpv6InternetResponse.setRequestId(_ctx.stringValue("DisableLoadBalancerIpv6InternetResponse.RequestId"));
		disableLoadBalancerIpv6InternetResponse.setSuccess(_ctx.booleanValue("DisableLoadBalancerIpv6InternetResponse.Success"));
		disableLoadBalancerIpv6InternetResponse.setCode(_ctx.stringValue("DisableLoadBalancerIpv6InternetResponse.Code"));
		disableLoadBalancerIpv6InternetResponse.setMessage(_ctx.stringValue("DisableLoadBalancerIpv6InternetResponse.Message"));
		disableLoadBalancerIpv6InternetResponse.setHttpStatusCode(_ctx.integerValue("DisableLoadBalancerIpv6InternetResponse.HttpStatusCode"));
		disableLoadBalancerIpv6InternetResponse.setDynamicCode(_ctx.stringValue("DisableLoadBalancerIpv6InternetResponse.DynamicCode"));
		disableLoadBalancerIpv6InternetResponse.setDynamicMessage(_ctx.stringValue("DisableLoadBalancerIpv6InternetResponse.DynamicMessage"));
		disableLoadBalancerIpv6InternetResponse.setJobId(_ctx.stringValue("DisableLoadBalancerIpv6InternetResponse.JobId"));
	 
	 	return disableLoadBalancerIpv6InternetResponse;
	}
}