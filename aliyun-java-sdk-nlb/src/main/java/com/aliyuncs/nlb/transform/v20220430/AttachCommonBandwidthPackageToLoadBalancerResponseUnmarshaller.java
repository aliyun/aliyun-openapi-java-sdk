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

import com.aliyuncs.nlb.model.v20220430.AttachCommonBandwidthPackageToLoadBalancerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachCommonBandwidthPackageToLoadBalancerResponseUnmarshaller {

	public static AttachCommonBandwidthPackageToLoadBalancerResponse unmarshall(AttachCommonBandwidthPackageToLoadBalancerResponse attachCommonBandwidthPackageToLoadBalancerResponse, UnmarshallerContext _ctx) {
		
		attachCommonBandwidthPackageToLoadBalancerResponse.setRequestId(_ctx.stringValue("AttachCommonBandwidthPackageToLoadBalancerResponse.RequestId"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setSuccess(_ctx.booleanValue("AttachCommonBandwidthPackageToLoadBalancerResponse.Success"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setCode(_ctx.stringValue("AttachCommonBandwidthPackageToLoadBalancerResponse.Code"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setMessage(_ctx.stringValue("AttachCommonBandwidthPackageToLoadBalancerResponse.Message"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setHttpStatusCode(_ctx.integerValue("AttachCommonBandwidthPackageToLoadBalancerResponse.HttpStatusCode"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setDynamicCode(_ctx.stringValue("AttachCommonBandwidthPackageToLoadBalancerResponse.DynamicCode"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setDynamicMessage(_ctx.stringValue("AttachCommonBandwidthPackageToLoadBalancerResponse.DynamicMessage"));
		attachCommonBandwidthPackageToLoadBalancerResponse.setJobId(_ctx.stringValue("AttachCommonBandwidthPackageToLoadBalancerResponse.JobId"));
	 
	 	return attachCommonBandwidthPackageToLoadBalancerResponse;
	}
}