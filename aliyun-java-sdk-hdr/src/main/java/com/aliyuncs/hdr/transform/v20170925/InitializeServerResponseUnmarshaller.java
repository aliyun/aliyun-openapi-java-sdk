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

import com.aliyuncs.hdr.model.v20170925.InitializeServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitializeServerResponseUnmarshaller {

	public static InitializeServerResponse unmarshall(InitializeServerResponse initializeServerResponse, UnmarshallerContext _ctx) {
		
		initializeServerResponse.setRequestId(_ctx.stringValue("InitializeServerResponse.RequestId"));
		initializeServerResponse.setSuccess(_ctx.booleanValue("InitializeServerResponse.Success"));
		initializeServerResponse.setCode(_ctx.stringValue("InitializeServerResponse.Code"));
		initializeServerResponse.setMessage(_ctx.stringValue("InitializeServerResponse.Message"));
	 
	 	return initializeServerResponse;
	}
}