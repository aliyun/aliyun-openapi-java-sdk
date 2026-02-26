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

import com.aliyuncs.nlb.model.v20220430.UpdateServerGroupAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateServerGroupAttributeResponseUnmarshaller {

	public static UpdateServerGroupAttributeResponse unmarshall(UpdateServerGroupAttributeResponse updateServerGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		updateServerGroupAttributeResponse.setRequestId(_ctx.stringValue("UpdateServerGroupAttributeResponse.RequestId"));
		updateServerGroupAttributeResponse.setSuccess(_ctx.booleanValue("UpdateServerGroupAttributeResponse.Success"));
		updateServerGroupAttributeResponse.setCode(_ctx.stringValue("UpdateServerGroupAttributeResponse.Code"));
		updateServerGroupAttributeResponse.setMessage(_ctx.stringValue("UpdateServerGroupAttributeResponse.Message"));
		updateServerGroupAttributeResponse.setHttpStatusCode(_ctx.integerValue("UpdateServerGroupAttributeResponse.HttpStatusCode"));
		updateServerGroupAttributeResponse.setDynamicCode(_ctx.stringValue("UpdateServerGroupAttributeResponse.DynamicCode"));
		updateServerGroupAttributeResponse.setDynamicMessage(_ctx.stringValue("UpdateServerGroupAttributeResponse.DynamicMessage"));
		updateServerGroupAttributeResponse.setServerGroupId(_ctx.stringValue("UpdateServerGroupAttributeResponse.ServerGroupId"));
		updateServerGroupAttributeResponse.setJobId(_ctx.stringValue("UpdateServerGroupAttributeResponse.JobId"));
	 
	 	return updateServerGroupAttributeResponse;
	}
}