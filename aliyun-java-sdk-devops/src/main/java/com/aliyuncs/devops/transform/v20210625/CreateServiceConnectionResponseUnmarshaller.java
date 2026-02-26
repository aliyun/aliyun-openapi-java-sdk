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

import com.aliyuncs.devops.model.v20210625.CreateServiceConnectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceConnectionResponseUnmarshaller {

	public static CreateServiceConnectionResponse unmarshall(CreateServiceConnectionResponse createServiceConnectionResponse, UnmarshallerContext _ctx) {
		
		createServiceConnectionResponse.setRequestId(_ctx.stringValue("CreateServiceConnectionResponse.requestId"));
		createServiceConnectionResponse.setErrorMessage(_ctx.stringValue("CreateServiceConnectionResponse.errorMessage"));
		createServiceConnectionResponse.setErrorCode(_ctx.stringValue("CreateServiceConnectionResponse.errorCode"));
		createServiceConnectionResponse.setSuccess(_ctx.booleanValue("CreateServiceConnectionResponse.success"));
		createServiceConnectionResponse.setId(_ctx.longValue("CreateServiceConnectionResponse.id"));
	 
	 	return createServiceConnectionResponse;
	}
}