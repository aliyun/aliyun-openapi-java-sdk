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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.ReversedRegisterServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReversedRegisterServerResponseUnmarshaller {

	public static ReversedRegisterServerResponse unmarshall(ReversedRegisterServerResponse reversedRegisterServerResponse, UnmarshallerContext _ctx) {
		
		reversedRegisterServerResponse.setRequestId(_ctx.stringValue("ReversedRegisterServerResponse.RequestId"));
		reversedRegisterServerResponse.setSuccess(_ctx.booleanValue("ReversedRegisterServerResponse.Success"));
		reversedRegisterServerResponse.setCode(_ctx.stringValue("ReversedRegisterServerResponse.Code"));
		reversedRegisterServerResponse.setMessage(_ctx.stringValue("ReversedRegisterServerResponse.Message"));
		reversedRegisterServerResponse.setServerId(_ctx.stringValue("ReversedRegisterServerResponse.ServerId"));
	 
	 	return reversedRegisterServerResponse;
	}
}