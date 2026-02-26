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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.AddTerminalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTerminalResponseUnmarshaller {

	public static AddTerminalResponse unmarshall(AddTerminalResponse addTerminalResponse, UnmarshallerContext _ctx) {
		
		addTerminalResponse.setRequestId(_ctx.stringValue("AddTerminalResponse.RequestId"));
		addTerminalResponse.setSuccess(_ctx.booleanValue("AddTerminalResponse.Success"));
		addTerminalResponse.setCode(_ctx.stringValue("AddTerminalResponse.Code"));
		addTerminalResponse.setMessage(_ctx.stringValue("AddTerminalResponse.Message"));
		addTerminalResponse.setHttpStatusCode(_ctx.integerValue("AddTerminalResponse.HttpStatusCode"));
	 
	 	return addTerminalResponse;
	}
}