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

import com.aliyuncs.cms.model.v20190101.CreateHybridMonitorTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHybridMonitorTaskResponseUnmarshaller {

	public static CreateHybridMonitorTaskResponse unmarshall(CreateHybridMonitorTaskResponse createHybridMonitorTaskResponse, UnmarshallerContext _ctx) {
		
		createHybridMonitorTaskResponse.setRequestId(_ctx.stringValue("CreateHybridMonitorTaskResponse.RequestId"));
		createHybridMonitorTaskResponse.setCode(_ctx.stringValue("CreateHybridMonitorTaskResponse.Code"));
		createHybridMonitorTaskResponse.setMessage(_ctx.stringValue("CreateHybridMonitorTaskResponse.Message"));
		createHybridMonitorTaskResponse.setSuccess(_ctx.stringValue("CreateHybridMonitorTaskResponse.Success"));
	 
	 	return createHybridMonitorTaskResponse;
	}
}