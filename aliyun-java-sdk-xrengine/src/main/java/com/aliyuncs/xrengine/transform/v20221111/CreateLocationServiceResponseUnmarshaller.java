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

import com.aliyuncs.xrengine.model.v20221111.CreateLocationServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLocationServiceResponseUnmarshaller {

	public static CreateLocationServiceResponse unmarshall(CreateLocationServiceResponse createLocationServiceResponse, UnmarshallerContext _ctx) {
		
		createLocationServiceResponse.setRequestId(_ctx.stringValue("CreateLocationServiceResponse.RequestId"));
		createLocationServiceResponse.setSuccess(_ctx.booleanValue("CreateLocationServiceResponse.Success"));
		createLocationServiceResponse.setCode(_ctx.stringValue("CreateLocationServiceResponse.Code"));
		createLocationServiceResponse.setMessage(_ctx.stringValue("CreateLocationServiceResponse.Message"));
		createLocationServiceResponse.setErrorName(_ctx.stringValue("CreateLocationServiceResponse.ErrorName"));
		createLocationServiceResponse.setHttpCode(_ctx.integerValue("CreateLocationServiceResponse.HttpCode"));
		createLocationServiceResponse.setData(_ctx.booleanValue("CreateLocationServiceResponse.Data"));
	 
	 	return createLocationServiceResponse;
	}
}