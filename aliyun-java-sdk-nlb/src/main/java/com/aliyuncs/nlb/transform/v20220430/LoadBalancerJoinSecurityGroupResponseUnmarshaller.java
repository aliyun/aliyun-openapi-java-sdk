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

import com.aliyuncs.nlb.model.v20220430.LoadBalancerJoinSecurityGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoadBalancerJoinSecurityGroupResponseUnmarshaller {

	public static LoadBalancerJoinSecurityGroupResponse unmarshall(LoadBalancerJoinSecurityGroupResponse loadBalancerJoinSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		loadBalancerJoinSecurityGroupResponse.setRequestId(_ctx.stringValue("LoadBalancerJoinSecurityGroupResponse.RequestId"));
		loadBalancerJoinSecurityGroupResponse.setSuccess(_ctx.booleanValue("LoadBalancerJoinSecurityGroupResponse.Success"));
		loadBalancerJoinSecurityGroupResponse.setCode(_ctx.stringValue("LoadBalancerJoinSecurityGroupResponse.Code"));
		loadBalancerJoinSecurityGroupResponse.setMessage(_ctx.stringValue("LoadBalancerJoinSecurityGroupResponse.Message"));
		loadBalancerJoinSecurityGroupResponse.setHttpStatusCode(_ctx.integerValue("LoadBalancerJoinSecurityGroupResponse.HttpStatusCode"));
		loadBalancerJoinSecurityGroupResponse.setDynamicCode(_ctx.stringValue("LoadBalancerJoinSecurityGroupResponse.DynamicCode"));
		loadBalancerJoinSecurityGroupResponse.setDynamicMessage(_ctx.stringValue("LoadBalancerJoinSecurityGroupResponse.DynamicMessage"));
		loadBalancerJoinSecurityGroupResponse.setJobId(_ctx.stringValue("LoadBalancerJoinSecurityGroupResponse.JobId"));
	 
	 	return loadBalancerJoinSecurityGroupResponse;
	}
}