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

import com.aliyuncs.nlb.model.v20220430.DetachCommonBandwidthPackageFromLoadBalancerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachCommonBandwidthPackageFromLoadBalancerResponseUnmarshaller {

	public static DetachCommonBandwidthPackageFromLoadBalancerResponse unmarshall(DetachCommonBandwidthPackageFromLoadBalancerResponse detachCommonBandwidthPackageFromLoadBalancerResponse, UnmarshallerContext _ctx) {
		
		detachCommonBandwidthPackageFromLoadBalancerResponse.setRequestId(_ctx.stringValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.RequestId"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setSuccess(_ctx.booleanValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.Success"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setCode(_ctx.stringValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.Code"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setMessage(_ctx.stringValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.Message"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setHttpStatusCode(_ctx.integerValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.HttpStatusCode"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setDynamicCode(_ctx.stringValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.DynamicCode"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setDynamicMessage(_ctx.stringValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.DynamicMessage"));
		detachCommonBandwidthPackageFromLoadBalancerResponse.setJobId(_ctx.stringValue("DetachCommonBandwidthPackageFromLoadBalancerResponse.JobId"));
	 
	 	return detachCommonBandwidthPackageFromLoadBalancerResponse;
	}
}