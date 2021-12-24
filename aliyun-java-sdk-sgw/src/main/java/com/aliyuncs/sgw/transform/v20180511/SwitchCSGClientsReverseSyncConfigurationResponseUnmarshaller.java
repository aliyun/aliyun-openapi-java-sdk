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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.SwitchCSGClientsReverseSyncConfigurationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchCSGClientsReverseSyncConfigurationResponseUnmarshaller {

	public static SwitchCSGClientsReverseSyncConfigurationResponse unmarshall(SwitchCSGClientsReverseSyncConfigurationResponse switchCSGClientsReverseSyncConfigurationResponse, UnmarshallerContext _ctx) {
		
		switchCSGClientsReverseSyncConfigurationResponse.setRequestId(_ctx.stringValue("SwitchCSGClientsReverseSyncConfigurationResponse.RequestId"));
		switchCSGClientsReverseSyncConfigurationResponse.setCode(_ctx.stringValue("SwitchCSGClientsReverseSyncConfigurationResponse.Code"));
		switchCSGClientsReverseSyncConfigurationResponse.setMessage(_ctx.stringValue("SwitchCSGClientsReverseSyncConfigurationResponse.Message"));
		switchCSGClientsReverseSyncConfigurationResponse.setTaskId(_ctx.stringValue("SwitchCSGClientsReverseSyncConfigurationResponse.TaskId"));
		switchCSGClientsReverseSyncConfigurationResponse.setSuccess(_ctx.booleanValue("SwitchCSGClientsReverseSyncConfigurationResponse.Success"));
	 
	 	return switchCSGClientsReverseSyncConfigurationResponse;
	}
}