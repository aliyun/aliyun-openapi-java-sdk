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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.SuspendLocationServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendLocationServiceResponseUnmarshaller {

	public static SuspendLocationServiceResponse unmarshall(SuspendLocationServiceResponse suspendLocationServiceResponse, UnmarshallerContext _ctx) {
		
		suspendLocationServiceResponse.setRequestId(_ctx.stringValue("SuspendLocationServiceResponse.RequestId"));
		suspendLocationServiceResponse.setSuccess(_ctx.booleanValue("SuspendLocationServiceResponse.Success"));
		suspendLocationServiceResponse.setCode(_ctx.stringValue("SuspendLocationServiceResponse.Code"));
		suspendLocationServiceResponse.setMessage(_ctx.stringValue("SuspendLocationServiceResponse.Message"));
		suspendLocationServiceResponse.setErrorName(_ctx.stringValue("SuspendLocationServiceResponse.ErrorName"));
		suspendLocationServiceResponse.setHttpCode(_ctx.integerValue("SuspendLocationServiceResponse.HttpCode"));
		suspendLocationServiceResponse.setData(_ctx.booleanValue("SuspendLocationServiceResponse.Data"));
	 
	 	return suspendLocationServiceResponse;
	}
}