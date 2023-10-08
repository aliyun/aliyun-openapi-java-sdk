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

import com.aliyuncs.nlb.model.v20220430.CancelShiftLoadBalancerZonesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelShiftLoadBalancerZonesResponseUnmarshaller {

	public static CancelShiftLoadBalancerZonesResponse unmarshall(CancelShiftLoadBalancerZonesResponse cancelShiftLoadBalancerZonesResponse, UnmarshallerContext _ctx) {
		
		cancelShiftLoadBalancerZonesResponse.setRequestId(_ctx.stringValue("CancelShiftLoadBalancerZonesResponse.RequestId"));
		cancelShiftLoadBalancerZonesResponse.setSuccess(_ctx.booleanValue("CancelShiftLoadBalancerZonesResponse.Success"));
		cancelShiftLoadBalancerZonesResponse.setCode(_ctx.stringValue("CancelShiftLoadBalancerZonesResponse.Code"));
		cancelShiftLoadBalancerZonesResponse.setMessage(_ctx.stringValue("CancelShiftLoadBalancerZonesResponse.Message"));
		cancelShiftLoadBalancerZonesResponse.setHttpStatusCode(_ctx.integerValue("CancelShiftLoadBalancerZonesResponse.HttpStatusCode"));
		cancelShiftLoadBalancerZonesResponse.setDynamicCode(_ctx.stringValue("CancelShiftLoadBalancerZonesResponse.DynamicCode"));
		cancelShiftLoadBalancerZonesResponse.setDynamicMessage(_ctx.stringValue("CancelShiftLoadBalancerZonesResponse.DynamicMessage"));
	 
	 	return cancelShiftLoadBalancerZonesResponse;
	}
}