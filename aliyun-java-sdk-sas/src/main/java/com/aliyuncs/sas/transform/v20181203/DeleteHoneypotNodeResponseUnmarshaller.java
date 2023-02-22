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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DeleteHoneypotNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteHoneypotNodeResponseUnmarshaller {

	public static DeleteHoneypotNodeResponse unmarshall(DeleteHoneypotNodeResponse deleteHoneypotNodeResponse, UnmarshallerContext _ctx) {
		
		deleteHoneypotNodeResponse.setRequestId(_ctx.stringValue("DeleteHoneypotNodeResponse.RequestId"));
		deleteHoneypotNodeResponse.setSuccess(_ctx.booleanValue("DeleteHoneypotNodeResponse.Success"));
		deleteHoneypotNodeResponse.setCode(_ctx.stringValue("DeleteHoneypotNodeResponse.Code"));
		deleteHoneypotNodeResponse.setMessage(_ctx.stringValue("DeleteHoneypotNodeResponse.Message"));
		deleteHoneypotNodeResponse.setHttpStatusCode(_ctx.integerValue("DeleteHoneypotNodeResponse.HttpStatusCode"));
	 
	 	return deleteHoneypotNodeResponse;
	}
}