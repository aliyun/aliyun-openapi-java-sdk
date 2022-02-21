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

import com.aliyuncs.cms.model.v20190101.CreateMonitorGroupInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMonitorGroupInstancesResponseUnmarshaller {

	public static CreateMonitorGroupInstancesResponse unmarshall(CreateMonitorGroupInstancesResponse createMonitorGroupInstancesResponse, UnmarshallerContext _ctx) {
		
		createMonitorGroupInstancesResponse.setRequestId(_ctx.stringValue("CreateMonitorGroupInstancesResponse.RequestId"));
		createMonitorGroupInstancesResponse.setCode(_ctx.integerValue("CreateMonitorGroupInstancesResponse.Code"));
		createMonitorGroupInstancesResponse.setMessage(_ctx.stringValue("CreateMonitorGroupInstancesResponse.Message"));
		createMonitorGroupInstancesResponse.setSuccess(_ctx.booleanValue("CreateMonitorGroupInstancesResponse.Success"));
	 
	 	return createMonitorGroupInstancesResponse;
	}
}