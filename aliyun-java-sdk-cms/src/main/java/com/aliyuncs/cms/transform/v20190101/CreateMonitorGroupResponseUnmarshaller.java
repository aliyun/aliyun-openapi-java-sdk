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

	public static CreateMonitorGroupResponse unmarshall(CreateMonitorGroupResponse createMonitorGroupResponse, UnmarshallerContext context) {
		
		createMonitorGroupResponse.setRequestId(context.stringValue("CreateMonitorGroupResponse.RequestId"));
		createMonitorGroupResponse.setSuccess(context.booleanValue("CreateMonitorGroupResponse.Success"));
		createMonitorGroupResponse.setCode(context.integerValue("CreateMonitorGroupResponse.Code"));
		createMonitorGroupResponse.setMessage(context.stringValue("CreateMonitorGroupResponse.Message"));
		createMonitorGroupResponse.setGroupId(context.longValue("CreateMonitorGroupResponse.GroupId"));
	 
	 	return createMonitorGroupResponse;
	}
}