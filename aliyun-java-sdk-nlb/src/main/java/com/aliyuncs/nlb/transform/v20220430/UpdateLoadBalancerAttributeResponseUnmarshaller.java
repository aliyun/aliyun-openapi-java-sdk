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

import com.aliyuncs.nlb.model.v20220430.UpdateLoadBalancerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLoadBalancerAttributeResponseUnmarshaller {

	public static UpdateLoadBalancerAttributeResponse unmarshall(UpdateLoadBalancerAttributeResponse updateLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		updateLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("UpdateLoadBalancerAttributeResponse.RequestId"));
		updateLoadBalancerAttributeResponse.setSuccess(_ctx.booleanValue("UpdateLoadBalancerAttributeResponse.Success"));
		updateLoadBalancerAttributeResponse.setCode(_ctx.stringValue("UpdateLoadBalancerAttributeResponse.Code"));
		updateLoadBalancerAttributeResponse.setMessage(_ctx.stringValue("UpdateLoadBalancerAttributeResponse.Message"));
		updateLoadBalancerAttributeResponse.setHttpStatusCode(_ctx.integerValue("UpdateLoadBalancerAttributeResponse.HttpStatusCode"));
		updateLoadBalancerAttributeResponse.setDynamicCode(_ctx.stringValue("UpdateLoadBalancerAttributeResponse.DynamicCode"));
		updateLoadBalancerAttributeResponse.setDynamicMessage(_ctx.stringValue("UpdateLoadBalancerAttributeResponse.DynamicMessage"));
		updateLoadBalancerAttributeResponse.setJobId(_ctx.stringValue("UpdateLoadBalancerAttributeResponse.JobId"));
	 
	 	return updateLoadBalancerAttributeResponse;
	}
}