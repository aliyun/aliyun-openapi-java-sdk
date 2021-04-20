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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.CreateFaultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFaultResponseUnmarshaller {

	public static CreateFaultResponse unmarshall(CreateFaultResponse createFaultResponse, UnmarshallerContext _ctx) {
		
		createFaultResponse.setRequestId(_ctx.stringValue("CreateFaultResponse.RequestId"));
		createFaultResponse.setSuccess(_ctx.booleanValue("CreateFaultResponse.Success"));
		createFaultResponse.setCode(_ctx.stringValue("CreateFaultResponse.Code"));
		createFaultResponse.setMessage(_ctx.stringValue("CreateFaultResponse.Message"));
		createFaultResponse.setHttpStatusCode(_ctx.integerValue("CreateFaultResponse.HttpStatusCode"));
	 
	 	return createFaultResponse;
	}
}