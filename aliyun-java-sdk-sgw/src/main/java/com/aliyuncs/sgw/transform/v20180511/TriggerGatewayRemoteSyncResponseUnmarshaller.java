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

import com.aliyuncs.sgw.model.v20180511.TriggerGatewayRemoteSyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TriggerGatewayRemoteSyncResponseUnmarshaller {

	public static TriggerGatewayRemoteSyncResponse unmarshall(TriggerGatewayRemoteSyncResponse triggerGatewayRemoteSyncResponse, UnmarshallerContext _ctx) {
		
		triggerGatewayRemoteSyncResponse.setRequestId(_ctx.stringValue("TriggerGatewayRemoteSyncResponse.RequestId"));
		triggerGatewayRemoteSyncResponse.setCode(_ctx.stringValue("TriggerGatewayRemoteSyncResponse.Code"));
		triggerGatewayRemoteSyncResponse.setMessage(_ctx.stringValue("TriggerGatewayRemoteSyncResponse.Message"));
		triggerGatewayRemoteSyncResponse.setTaskId(_ctx.stringValue("TriggerGatewayRemoteSyncResponse.TaskId"));
		triggerGatewayRemoteSyncResponse.setSuccess(_ctx.booleanValue("TriggerGatewayRemoteSyncResponse.Success"));
	 
	 	return triggerGatewayRemoteSyncResponse;
	}
}