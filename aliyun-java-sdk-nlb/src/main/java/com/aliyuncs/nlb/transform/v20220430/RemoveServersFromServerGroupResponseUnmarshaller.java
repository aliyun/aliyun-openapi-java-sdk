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

import com.aliyuncs.nlb.model.v20220430.RemoveServersFromServerGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveServersFromServerGroupResponseUnmarshaller {

	public static RemoveServersFromServerGroupResponse unmarshall(RemoveServersFromServerGroupResponse removeServersFromServerGroupResponse, UnmarshallerContext _ctx) {
		
		removeServersFromServerGroupResponse.setRequestId(_ctx.stringValue("RemoveServersFromServerGroupResponse.RequestId"));
		removeServersFromServerGroupResponse.setSuccess(_ctx.booleanValue("RemoveServersFromServerGroupResponse.Success"));
		removeServersFromServerGroupResponse.setCode(_ctx.stringValue("RemoveServersFromServerGroupResponse.Code"));
		removeServersFromServerGroupResponse.setMessage(_ctx.stringValue("RemoveServersFromServerGroupResponse.Message"));
		removeServersFromServerGroupResponse.setHttpStatusCode(_ctx.integerValue("RemoveServersFromServerGroupResponse.HttpStatusCode"));
		removeServersFromServerGroupResponse.setDynamicCode(_ctx.stringValue("RemoveServersFromServerGroupResponse.DynamicCode"));
		removeServersFromServerGroupResponse.setDynamicMessage(_ctx.stringValue("RemoveServersFromServerGroupResponse.DynamicMessage"));
		removeServersFromServerGroupResponse.setServerGroupId(_ctx.stringValue("RemoveServersFromServerGroupResponse.ServerGroupId"));
		removeServersFromServerGroupResponse.setJobId(_ctx.stringValue("RemoveServersFromServerGroupResponse.JobId"));
	 
	 	return removeServersFromServerGroupResponse;
	}
}