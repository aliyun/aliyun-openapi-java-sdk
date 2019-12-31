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

import com.aliyuncs.mpserverless.model.v20190615.CreateFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190615.CreateFunctionResponse.Spec;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFunctionResponseUnmarshaller {

	public static CreateFunctionResponse unmarshall(CreateFunctionResponse createFunctionResponse, UnmarshallerContext _ctx) {
		
		createFunctionResponse.setRequestId(_ctx.stringValue("CreateFunctionResponse.RequestId"));
		createFunctionResponse.setHttpStatusCode(_ctx.stringValue("CreateFunctionResponse.HttpStatusCode"));
		createFunctionResponse.setSuccess(_ctx.booleanValue("CreateFunctionResponse.Success"));
		createFunctionResponse.setCode(_ctx.stringValue("CreateFunctionResponse.Code"));
		createFunctionResponse.setMessage(_ctx.stringValue("CreateFunctionResponse.Message"));
		createFunctionResponse.setName(_ctx.stringValue("CreateFunctionResponse.Name"));
		createFunctionResponse.setDesc(_ctx.stringValue("CreateFunctionResponse.Desc"));
		createFunctionResponse.setCreatedAt(_ctx.stringValue("CreateFunctionResponse.CreatedAt"));
		createFunctionResponse.setModifiedAt(_ctx.stringValue("CreateFunctionResponse.ModifiedAt"));

		Spec spec = new Spec();
		spec.setRuntime(_ctx.stringValue("CreateFunctionResponse.Spec.Runtime"));
		spec.setMemory(_ctx.stringValue("CreateFunctionResponse.Spec.Memory"));
		spec.setTimeout(_ctx.stringValue("CreateFunctionResponse.Spec.Timeout"));
		createFunctionResponse.setSpec(spec);
	 
	 	return createFunctionResponse;
	}
}