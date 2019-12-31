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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.CreateTaobaoSpaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaobaoSpaceResponseUnmarshaller {

	public static CreateTaobaoSpaceResponse unmarshall(CreateTaobaoSpaceResponse createTaobaoSpaceResponse, UnmarshallerContext _ctx) {
		
		createTaobaoSpaceResponse.setRequestId(_ctx.stringValue("CreateTaobaoSpaceResponse.RequestId"));
		createTaobaoSpaceResponse.setHttpStatusCode(_ctx.stringValue("CreateTaobaoSpaceResponse.HttpStatusCode"));
		createTaobaoSpaceResponse.setSuccess(_ctx.booleanValue("CreateTaobaoSpaceResponse.Success"));
		createTaobaoSpaceResponse.setCode(_ctx.stringValue("CreateTaobaoSpaceResponse.Code"));
		createTaobaoSpaceResponse.setMessage(_ctx.stringValue("CreateTaobaoSpaceResponse.Message"));
		createTaobaoSpaceResponse.setSpaceId(_ctx.stringValue("CreateTaobaoSpaceResponse.SpaceId"));
	 
	 	return createTaobaoSpaceResponse;
	}
}