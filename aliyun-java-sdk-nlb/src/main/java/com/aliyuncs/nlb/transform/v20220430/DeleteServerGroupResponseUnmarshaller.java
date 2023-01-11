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

import com.aliyuncs.nlb.model.v20220430.DeleteServerGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteServerGroupResponseUnmarshaller {

	public static DeleteServerGroupResponse unmarshall(DeleteServerGroupResponse deleteServerGroupResponse, UnmarshallerContext _ctx) {
		
		deleteServerGroupResponse.setRequestId(_ctx.stringValue("DeleteServerGroupResponse.RequestId"));
		deleteServerGroupResponse.setSuccess(_ctx.booleanValue("DeleteServerGroupResponse.Success"));
		deleteServerGroupResponse.setCode(_ctx.stringValue("DeleteServerGroupResponse.Code"));
		deleteServerGroupResponse.setMessage(_ctx.stringValue("DeleteServerGroupResponse.Message"));
		deleteServerGroupResponse.setHttpStatusCode(_ctx.integerValue("DeleteServerGroupResponse.HttpStatusCode"));
		deleteServerGroupResponse.setDynamicCode(_ctx.stringValue("DeleteServerGroupResponse.DynamicCode"));
		deleteServerGroupResponse.setDynamicMessage(_ctx.stringValue("DeleteServerGroupResponse.DynamicMessage"));
		deleteServerGroupResponse.setServerGroupId(_ctx.stringValue("DeleteServerGroupResponse.ServerGroupId"));
		deleteServerGroupResponse.setJobId(_ctx.stringValue("DeleteServerGroupResponse.JobId"));
	 
	 	return deleteServerGroupResponse;
	}
}