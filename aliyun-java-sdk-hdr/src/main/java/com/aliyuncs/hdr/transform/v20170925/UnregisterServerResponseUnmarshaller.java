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

import com.aliyuncs.hdr.model.v20170925.UnregisterServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnregisterServerResponseUnmarshaller {

	public static UnregisterServerResponse unmarshall(UnregisterServerResponse unregisterServerResponse, UnmarshallerContext _ctx) {
		
		unregisterServerResponse.setRequestId(_ctx.stringValue("UnregisterServerResponse.RequestId"));
		unregisterServerResponse.setSuccess(_ctx.booleanValue("UnregisterServerResponse.Success"));
		unregisterServerResponse.setCode(_ctx.stringValue("UnregisterServerResponse.Code"));
		unregisterServerResponse.setMessage(_ctx.stringValue("UnregisterServerResponse.Message"));
	 
	 	return unregisterServerResponse;
	}
}