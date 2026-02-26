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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.ClientStartResponse;
import com.aliyuncs.avatar.model.v20220130.ClientStartResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClientStartResponseUnmarshaller {

	public static ClientStartResponse unmarshall(ClientStartResponse clientStartResponse, UnmarshallerContext _ctx) {
		
		clientStartResponse.setRequestId(_ctx.stringValue("ClientStartResponse.RequestId"));
		clientStartResponse.setSuccess(_ctx.booleanValue("ClientStartResponse.Success"));
		clientStartResponse.setCode(_ctx.stringValue("ClientStartResponse.Code"));
		clientStartResponse.setMessage(_ctx.stringValue("ClientStartResponse.Message"));

		Data data = new Data();
		data.setImToken(_ctx.stringValue("ClientStartResponse.Data.ImToken"));
		clientStartResponse.setData(data);
	 
	 	return clientStartResponse;
	}
}