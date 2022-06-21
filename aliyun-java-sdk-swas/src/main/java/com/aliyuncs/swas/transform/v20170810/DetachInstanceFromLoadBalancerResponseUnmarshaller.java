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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.DetachInstanceFromLoadBalancerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachInstanceFromLoadBalancerResponseUnmarshaller {

	public static DetachInstanceFromLoadBalancerResponse unmarshall(DetachInstanceFromLoadBalancerResponse detachInstanceFromLoadBalancerResponse, UnmarshallerContext _ctx) {
		
		detachInstanceFromLoadBalancerResponse.setRequestId(_ctx.stringValue("DetachInstanceFromLoadBalancerResponse.RequestId"));
		detachInstanceFromLoadBalancerResponse.setCode(_ctx.stringValue("DetachInstanceFromLoadBalancerResponse.Code"));
		detachInstanceFromLoadBalancerResponse.setMessage(_ctx.stringValue("DetachInstanceFromLoadBalancerResponse.Message"));
		detachInstanceFromLoadBalancerResponse.setData(_ctx.booleanValue("DetachInstanceFromLoadBalancerResponse.Data"));
		detachInstanceFromLoadBalancerResponse.setSuccess(_ctx.booleanValue("DetachInstanceFromLoadBalancerResponse.Success"));
	 
	 	return detachInstanceFromLoadBalancerResponse;
	}
}