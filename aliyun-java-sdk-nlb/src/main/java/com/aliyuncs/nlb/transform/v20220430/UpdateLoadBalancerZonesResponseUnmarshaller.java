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

import com.aliyuncs.nlb.model.v20220430.UpdateLoadBalancerZonesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLoadBalancerZonesResponseUnmarshaller {

	public static UpdateLoadBalancerZonesResponse unmarshall(UpdateLoadBalancerZonesResponse updateLoadBalancerZonesResponse, UnmarshallerContext _ctx) {
		
		updateLoadBalancerZonesResponse.setRequestId(_ctx.stringValue("UpdateLoadBalancerZonesResponse.RequestId"));
		updateLoadBalancerZonesResponse.setSuccess(_ctx.booleanValue("UpdateLoadBalancerZonesResponse.Success"));
		updateLoadBalancerZonesResponse.setCode(_ctx.stringValue("UpdateLoadBalancerZonesResponse.Code"));
		updateLoadBalancerZonesResponse.setMessage(_ctx.stringValue("UpdateLoadBalancerZonesResponse.Message"));
		updateLoadBalancerZonesResponse.setHttpStatusCode(_ctx.integerValue("UpdateLoadBalancerZonesResponse.HttpStatusCode"));
		updateLoadBalancerZonesResponse.setDynamicCode(_ctx.stringValue("UpdateLoadBalancerZonesResponse.DynamicCode"));
		updateLoadBalancerZonesResponse.setDynamicMessage(_ctx.stringValue("UpdateLoadBalancerZonesResponse.DynamicMessage"));
		updateLoadBalancerZonesResponse.setJobId(_ctx.stringValue("UpdateLoadBalancerZonesResponse.JobId"));
	 
	 	return updateLoadBalancerZonesResponse;
	}
}