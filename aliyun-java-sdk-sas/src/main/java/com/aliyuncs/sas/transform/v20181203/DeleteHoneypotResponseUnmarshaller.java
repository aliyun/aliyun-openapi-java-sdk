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

import com.aliyuncs.sas.model.v20181203.DeleteHoneypotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteHoneypotResponseUnmarshaller {

	public static DeleteHoneypotResponse unmarshall(DeleteHoneypotResponse deleteHoneypotResponse, UnmarshallerContext _ctx) {
		
		deleteHoneypotResponse.setRequestId(_ctx.stringValue("DeleteHoneypotResponse.RequestId"));
		deleteHoneypotResponse.setSuccess(_ctx.booleanValue("DeleteHoneypotResponse.Success"));
		deleteHoneypotResponse.setCode(_ctx.stringValue("DeleteHoneypotResponse.Code"));
		deleteHoneypotResponse.setMessage(_ctx.stringValue("DeleteHoneypotResponse.Message"));
		deleteHoneypotResponse.setHttpStatusCode(_ctx.integerValue("DeleteHoneypotResponse.HttpStatusCode"));
	 
	 	return deleteHoneypotResponse;
	}
}