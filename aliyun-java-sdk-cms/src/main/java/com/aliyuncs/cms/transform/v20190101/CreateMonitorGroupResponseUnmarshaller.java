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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.CreateMonitorGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMonitorGroupResponseUnmarshaller {

	public static CreateMonitorGroupResponse unmarshall(CreateMonitorGroupResponse createMonitorGroupResponse, UnmarshallerContext _ctx) {
		
		createMonitorGroupResponse.setRequestId(_ctx.stringValue("CreateMonitorGroupResponse.RequestId"));
		createMonitorGroupResponse.setCode(_ctx.integerValue("CreateMonitorGroupResponse.Code"));
		createMonitorGroupResponse.setMessage(_ctx.stringValue("CreateMonitorGroupResponse.Message"));
		createMonitorGroupResponse.setGroupId(_ctx.longValue("CreateMonitorGroupResponse.GroupId"));
		createMonitorGroupResponse.setSuccess(_ctx.booleanValue("CreateMonitorGroupResponse.Success"));
	 
	 	return createMonitorGroupResponse;
	}
}