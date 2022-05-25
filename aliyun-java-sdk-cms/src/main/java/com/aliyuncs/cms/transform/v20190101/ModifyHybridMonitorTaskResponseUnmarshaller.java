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

import com.aliyuncs.cms.model.v20190101.ModifyHybridMonitorTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyHybridMonitorTaskResponseUnmarshaller {

	public static ModifyHybridMonitorTaskResponse unmarshall(ModifyHybridMonitorTaskResponse modifyHybridMonitorTaskResponse, UnmarshallerContext _ctx) {
		
		modifyHybridMonitorTaskResponse.setRequestId(_ctx.stringValue("ModifyHybridMonitorTaskResponse.RequestId"));
		modifyHybridMonitorTaskResponse.setCode(_ctx.stringValue("ModifyHybridMonitorTaskResponse.Code"));
		modifyHybridMonitorTaskResponse.setMessage(_ctx.stringValue("ModifyHybridMonitorTaskResponse.Message"));
		modifyHybridMonitorTaskResponse.setSuccess(_ctx.stringValue("ModifyHybridMonitorTaskResponse.Success"));
	 
	 	return modifyHybridMonitorTaskResponse;
	}
}