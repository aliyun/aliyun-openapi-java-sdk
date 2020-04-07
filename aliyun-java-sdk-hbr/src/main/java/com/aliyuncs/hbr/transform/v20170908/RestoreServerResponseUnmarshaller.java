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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.RestoreServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestoreServerResponseUnmarshaller {

	public static RestoreServerResponse unmarshall(RestoreServerResponse restoreServerResponse, UnmarshallerContext _ctx) {
		
		restoreServerResponse.setRequestId(_ctx.stringValue("RestoreServerResponse.RequestId"));
		restoreServerResponse.setSuccess(_ctx.booleanValue("RestoreServerResponse.Success"));
		restoreServerResponse.setCode(_ctx.stringValue("RestoreServerResponse.Code"));
		restoreServerResponse.setMessage(_ctx.stringValue("RestoreServerResponse.Message"));
	 
	 	return restoreServerResponse;
	}
}