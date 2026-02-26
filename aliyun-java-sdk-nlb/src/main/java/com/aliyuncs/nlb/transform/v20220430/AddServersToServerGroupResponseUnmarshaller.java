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

import com.aliyuncs.nlb.model.v20220430.AddServersToServerGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddServersToServerGroupResponseUnmarshaller {

	public static AddServersToServerGroupResponse unmarshall(AddServersToServerGroupResponse addServersToServerGroupResponse, UnmarshallerContext _ctx) {
		
		addServersToServerGroupResponse.setRequestId(_ctx.stringValue("AddServersToServerGroupResponse.RequestId"));
		addServersToServerGroupResponse.setSuccess(_ctx.booleanValue("AddServersToServerGroupResponse.Success"));
		addServersToServerGroupResponse.setCode(_ctx.stringValue("AddServersToServerGroupResponse.Code"));
		addServersToServerGroupResponse.setMessage(_ctx.stringValue("AddServersToServerGroupResponse.Message"));
		addServersToServerGroupResponse.setHttpStatusCode(_ctx.integerValue("AddServersToServerGroupResponse.HttpStatusCode"));
		addServersToServerGroupResponse.setDynamicCode(_ctx.stringValue("AddServersToServerGroupResponse.DynamicCode"));
		addServersToServerGroupResponse.setDynamicMessage(_ctx.stringValue("AddServersToServerGroupResponse.DynamicMessage"));
		addServersToServerGroupResponse.setServerGroupId(_ctx.stringValue("AddServersToServerGroupResponse.ServerGroupId"));
		addServersToServerGroupResponse.setJobId(_ctx.stringValue("AddServersToServerGroupResponse.JobId"));
	 
	 	return addServersToServerGroupResponse;
	}
}