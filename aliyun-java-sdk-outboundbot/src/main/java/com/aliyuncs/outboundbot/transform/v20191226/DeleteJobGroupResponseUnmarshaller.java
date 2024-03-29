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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DeleteJobGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteJobGroupResponseUnmarshaller {

	public static DeleteJobGroupResponse unmarshall(DeleteJobGroupResponse deleteJobGroupResponse, UnmarshallerContext _ctx) {
		
		deleteJobGroupResponse.setRequestId(_ctx.stringValue("DeleteJobGroupResponse.RequestId"));
		deleteJobGroupResponse.setHttpStatusCode(_ctx.integerValue("DeleteJobGroupResponse.HttpStatusCode"));
		deleteJobGroupResponse.setCode(_ctx.stringValue("DeleteJobGroupResponse.Code"));
		deleteJobGroupResponse.setMessage(_ctx.stringValue("DeleteJobGroupResponse.Message"));
		deleteJobGroupResponse.setSuccess(_ctx.booleanValue("DeleteJobGroupResponse.Success"));
	 
	 	return deleteJobGroupResponse;
	}
}