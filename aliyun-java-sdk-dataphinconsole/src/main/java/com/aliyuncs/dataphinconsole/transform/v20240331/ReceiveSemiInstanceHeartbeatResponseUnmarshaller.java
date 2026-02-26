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

package com.aliyuncs.dataphinconsole.transform.v20240331;

import com.aliyuncs.dataphinconsole.model.v20240331.ReceiveSemiInstanceHeartbeatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReceiveSemiInstanceHeartbeatResponseUnmarshaller {

	public static ReceiveSemiInstanceHeartbeatResponse unmarshall(ReceiveSemiInstanceHeartbeatResponse receiveSemiInstanceHeartbeatResponse, UnmarshallerContext _ctx) {
		
		receiveSemiInstanceHeartbeatResponse.setRequestId(_ctx.stringValue("ReceiveSemiInstanceHeartbeatResponse.RequestId"));
		receiveSemiInstanceHeartbeatResponse.setCode(_ctx.stringValue("ReceiveSemiInstanceHeartbeatResponse.Code"));
		receiveSemiInstanceHeartbeatResponse.setMessage(_ctx.stringValue("ReceiveSemiInstanceHeartbeatResponse.Message"));
		receiveSemiInstanceHeartbeatResponse.setData(_ctx.booleanValue("ReceiveSemiInstanceHeartbeatResponse.Data"));
		receiveSemiInstanceHeartbeatResponse.setSuccess(_ctx.booleanValue("ReceiveSemiInstanceHeartbeatResponse.Success"));
		receiveSemiInstanceHeartbeatResponse.setHttpStatusCode(_ctx.integerValue("ReceiveSemiInstanceHeartbeatResponse.HttpStatusCode"));
	 
	 	return receiveSemiInstanceHeartbeatResponse;
	}
}