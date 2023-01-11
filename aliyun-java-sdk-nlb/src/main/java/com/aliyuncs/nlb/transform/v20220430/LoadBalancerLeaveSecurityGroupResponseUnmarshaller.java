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

import com.aliyuncs.nlb.model.v20220430.LoadBalancerLeaveSecurityGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoadBalancerLeaveSecurityGroupResponseUnmarshaller {

	public static LoadBalancerLeaveSecurityGroupResponse unmarshall(LoadBalancerLeaveSecurityGroupResponse loadBalancerLeaveSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		loadBalancerLeaveSecurityGroupResponse.setRequestId(_ctx.stringValue("LoadBalancerLeaveSecurityGroupResponse.RequestId"));
		loadBalancerLeaveSecurityGroupResponse.setSuccess(_ctx.booleanValue("LoadBalancerLeaveSecurityGroupResponse.Success"));
		loadBalancerLeaveSecurityGroupResponse.setCode(_ctx.stringValue("LoadBalancerLeaveSecurityGroupResponse.Code"));
		loadBalancerLeaveSecurityGroupResponse.setMessage(_ctx.stringValue("LoadBalancerLeaveSecurityGroupResponse.Message"));
		loadBalancerLeaveSecurityGroupResponse.setHttpStatusCode(_ctx.integerValue("LoadBalancerLeaveSecurityGroupResponse.HttpStatusCode"));
		loadBalancerLeaveSecurityGroupResponse.setDynamicCode(_ctx.stringValue("LoadBalancerLeaveSecurityGroupResponse.DynamicCode"));
		loadBalancerLeaveSecurityGroupResponse.setDynamicMessage(_ctx.stringValue("LoadBalancerLeaveSecurityGroupResponse.DynamicMessage"));
		loadBalancerLeaveSecurityGroupResponse.setJobId(_ctx.stringValue("LoadBalancerLeaveSecurityGroupResponse.JobId"));
	 
	 	return loadBalancerLeaveSecurityGroupResponse;
	}
}