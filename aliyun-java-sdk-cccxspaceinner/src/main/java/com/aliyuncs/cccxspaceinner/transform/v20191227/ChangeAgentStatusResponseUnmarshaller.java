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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.ChangeAgentStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeAgentStatusResponseUnmarshaller {

	public static ChangeAgentStatusResponse unmarshall(ChangeAgentStatusResponse changeAgentStatusResponse, UnmarshallerContext _ctx) {
		
		changeAgentStatusResponse.setMessage(_ctx.stringValue("ChangeAgentStatusResponse.Message"));
		changeAgentStatusResponse.setData(_ctx.stringValue("ChangeAgentStatusResponse.Data"));
		changeAgentStatusResponse.setCode(_ctx.stringValue("ChangeAgentStatusResponse.Code"));
		changeAgentStatusResponse.setSuccess(_ctx.booleanValue("ChangeAgentStatusResponse.Success"));
	 
	 	return changeAgentStatusResponse;
	}
}