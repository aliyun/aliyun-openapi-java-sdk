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

import com.aliyuncs.nlb.model.v20220430.UpdateLoadBalancerAddressTypeConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLoadBalancerAddressTypeConfigResponseUnmarshaller {

	public static UpdateLoadBalancerAddressTypeConfigResponse unmarshall(UpdateLoadBalancerAddressTypeConfigResponse updateLoadBalancerAddressTypeConfigResponse, UnmarshallerContext _ctx) {
		
		updateLoadBalancerAddressTypeConfigResponse.setRequestId(_ctx.stringValue("UpdateLoadBalancerAddressTypeConfigResponse.RequestId"));
		updateLoadBalancerAddressTypeConfigResponse.setSuccess(_ctx.booleanValue("UpdateLoadBalancerAddressTypeConfigResponse.Success"));
		updateLoadBalancerAddressTypeConfigResponse.setCode(_ctx.stringValue("UpdateLoadBalancerAddressTypeConfigResponse.Code"));
		updateLoadBalancerAddressTypeConfigResponse.setMessage(_ctx.stringValue("UpdateLoadBalancerAddressTypeConfigResponse.Message"));
		updateLoadBalancerAddressTypeConfigResponse.setHttpStatusCode(_ctx.integerValue("UpdateLoadBalancerAddressTypeConfigResponse.HttpStatusCode"));
		updateLoadBalancerAddressTypeConfigResponse.setDynamicCode(_ctx.stringValue("UpdateLoadBalancerAddressTypeConfigResponse.DynamicCode"));
		updateLoadBalancerAddressTypeConfigResponse.setDynamicMessage(_ctx.stringValue("UpdateLoadBalancerAddressTypeConfigResponse.DynamicMessage"));
		updateLoadBalancerAddressTypeConfigResponse.setJobId(_ctx.stringValue("UpdateLoadBalancerAddressTypeConfigResponse.JobId"));
	 
	 	return updateLoadBalancerAddressTypeConfigResponse;
	}
}