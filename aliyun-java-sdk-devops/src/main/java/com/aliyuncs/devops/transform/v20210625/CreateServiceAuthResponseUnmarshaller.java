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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.CreateServiceAuthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceAuthResponseUnmarshaller {

	public static CreateServiceAuthResponse unmarshall(CreateServiceAuthResponse createServiceAuthResponse, UnmarshallerContext _ctx) {
		
		createServiceAuthResponse.setRequestId(_ctx.stringValue("CreateServiceAuthResponse.requestId"));
		createServiceAuthResponse.setErrorMessage(_ctx.stringValue("CreateServiceAuthResponse.errorMessage"));
		createServiceAuthResponse.setErrorCode(_ctx.stringValue("CreateServiceAuthResponse.errorCode"));
		createServiceAuthResponse.setSuccess(_ctx.booleanValue("CreateServiceAuthResponse.success"));
		createServiceAuthResponse.setId(_ctx.stringValue("CreateServiceAuthResponse.id"));
	 
	 	return createServiceAuthResponse;
	}
}