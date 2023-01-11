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

import com.aliyuncs.nlb.model.v20220430.CreateServerGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServerGroupResponseUnmarshaller {

	public static CreateServerGroupResponse unmarshall(CreateServerGroupResponse createServerGroupResponse, UnmarshallerContext _ctx) {
		
		createServerGroupResponse.setRequestId(_ctx.stringValue("CreateServerGroupResponse.RequestId"));
		createServerGroupResponse.setSuccess(_ctx.booleanValue("CreateServerGroupResponse.Success"));
		createServerGroupResponse.setCode(_ctx.stringValue("CreateServerGroupResponse.Code"));
		createServerGroupResponse.setMessage(_ctx.stringValue("CreateServerGroupResponse.Message"));
		createServerGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateServerGroupResponse.HttpStatusCode"));
		createServerGroupResponse.setDynamicCode(_ctx.stringValue("CreateServerGroupResponse.DynamicCode"));
		createServerGroupResponse.setDynamicMessage(_ctx.stringValue("CreateServerGroupResponse.DynamicMessage"));
		createServerGroupResponse.setServerGroupId(_ctx.stringValue("CreateServerGroupResponse.ServerGroupId"));
		createServerGroupResponse.setJobId(_ctx.stringValue("CreateServerGroupResponse.JobId"));
	 
	 	return createServerGroupResponse;
	}
}