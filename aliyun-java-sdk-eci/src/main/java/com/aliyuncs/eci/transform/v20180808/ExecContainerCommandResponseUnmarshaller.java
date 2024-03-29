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

package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.ExecContainerCommandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecContainerCommandResponseUnmarshaller {

	public static ExecContainerCommandResponse unmarshall(ExecContainerCommandResponse execContainerCommandResponse, UnmarshallerContext context) {
		
		execContainerCommandResponse.setRequestId(context.stringValue("ExecContainerCommandResponse.RequestId"));
		execContainerCommandResponse.setWebSocketUri(context.stringValue("ExecContainerCommandResponse.WebSocketUri"));
		execContainerCommandResponse.setHttpUrl(context.stringValue("ExecContainerCommandResponse.HttpUrl"));
		execContainerCommandResponse.setSyncResponse(context.stringValue("ExecContainerCommandResponse.SyncResponse"));
	 
	 	return execContainerCommandResponse;
	}
}