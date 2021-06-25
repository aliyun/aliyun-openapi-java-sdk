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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GetVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionResponseUnmarshaller {

	public static GetVersionResponse unmarshall(GetVersionResponse getVersionResponse, UnmarshallerContext _ctx) {
		
		getVersionResponse.setRequestId(_ctx.stringValue("GetVersionResponse.RequestId"));
		getVersionResponse.setSuccess(_ctx.booleanValue("GetVersionResponse.Success"));
		getVersionResponse.setCode(_ctx.stringValue("GetVersionResponse.Code"));
		getVersionResponse.setMessage(_ctx.stringValue("GetVersionResponse.Message"));
		getVersionResponse.setHttpStatusCode(_ctx.integerValue("GetVersionResponse.HttpStatusCode"));
		getVersionResponse.setVersion(_ctx.stringValue("GetVersionResponse.Version"));
	 
	 	return getVersionResponse;
	}
}