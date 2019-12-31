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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.CreateSpaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSpaceResponseUnmarshaller {

	public static CreateSpaceResponse unmarshall(CreateSpaceResponse createSpaceResponse, UnmarshallerContext _ctx) {
		
		createSpaceResponse.setRequestId(_ctx.stringValue("CreateSpaceResponse.RequestId"));
		createSpaceResponse.setHttpStatusCode(_ctx.stringValue("CreateSpaceResponse.HttpStatusCode"));
		createSpaceResponse.setSuccess(_ctx.booleanValue("CreateSpaceResponse.Success"));
		createSpaceResponse.setCode(_ctx.stringValue("CreateSpaceResponse.Code"));
		createSpaceResponse.setMessage(_ctx.stringValue("CreateSpaceResponse.Message"));
		createSpaceResponse.setSpaceId(_ctx.stringValue("CreateSpaceResponse.SpaceId"));
		createSpaceResponse.setHttpStatusCode1(_ctx.stringValue("CreateSpaceResponse.HttpStatusCode"));
	 
	 	return createSpaceResponse;
	}
}