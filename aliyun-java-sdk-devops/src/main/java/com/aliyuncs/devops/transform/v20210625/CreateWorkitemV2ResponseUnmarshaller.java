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

import com.aliyuncs.devops.model.v20210625.CreateWorkitemV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkitemV2ResponseUnmarshaller {

	public static CreateWorkitemV2Response unmarshall(CreateWorkitemV2Response createWorkitemV2Response, UnmarshallerContext _ctx) {
		
		createWorkitemV2Response.setRequestId(_ctx.stringValue("CreateWorkitemV2Response.requestId"));
		createWorkitemV2Response.setErrorCode(_ctx.stringValue("CreateWorkitemV2Response.errorCode"));
		createWorkitemV2Response.setErrorMessage(_ctx.stringValue("CreateWorkitemV2Response.errorMessage"));
		createWorkitemV2Response.setSuccess(_ctx.stringValue("CreateWorkitemV2Response.success"));
		createWorkitemV2Response.setWorkitemIdentifier(_ctx.stringValue("CreateWorkitemV2Response.workitemIdentifier"));
	 
	 	return createWorkitemV2Response;
	}
}