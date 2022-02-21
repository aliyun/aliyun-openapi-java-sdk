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

import com.aliyuncs.cms.model.v20190101.ModifyMonitorGroupInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMonitorGroupInstancesResponseUnmarshaller {

	public static ModifyMonitorGroupInstancesResponse unmarshall(ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstancesResponse, UnmarshallerContext _ctx) {
		
		modifyMonitorGroupInstancesResponse.setRequestId(_ctx.stringValue("ModifyMonitorGroupInstancesResponse.RequestId"));
		modifyMonitorGroupInstancesResponse.setCode(_ctx.integerValue("ModifyMonitorGroupInstancesResponse.Code"));
		modifyMonitorGroupInstancesResponse.setMessage(_ctx.stringValue("ModifyMonitorGroupInstancesResponse.Message"));
		modifyMonitorGroupInstancesResponse.setSuccess(_ctx.booleanValue("ModifyMonitorGroupInstancesResponse.Success"));
	 
	 	return modifyMonitorGroupInstancesResponse;
	}
}