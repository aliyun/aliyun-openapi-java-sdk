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

import com.aliyuncs.mpserverless.model.v20190615.UpdateFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190615.UpdateFunctionResponse.Spec;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFunctionResponseUnmarshaller {

	public static UpdateFunctionResponse unmarshall(UpdateFunctionResponse updateFunctionResponse, UnmarshallerContext _ctx) {
		
		updateFunctionResponse.setRequestId(_ctx.stringValue("UpdateFunctionResponse.RequestId"));
		updateFunctionResponse.setHttpStatusCode(_ctx.stringValue("UpdateFunctionResponse.HttpStatusCode"));
		updateFunctionResponse.setSuccess(_ctx.booleanValue("UpdateFunctionResponse.Success"));
		updateFunctionResponse.setCode(_ctx.stringValue("UpdateFunctionResponse.Code"));
		updateFunctionResponse.setMessage(_ctx.stringValue("UpdateFunctionResponse.Message"));
		updateFunctionResponse.setName(_ctx.stringValue("UpdateFunctionResponse.Name"));
		updateFunctionResponse.setDesc(_ctx.stringValue("UpdateFunctionResponse.Desc"));
		updateFunctionResponse.setCreatedAt(_ctx.stringValue("UpdateFunctionResponse.CreatedAt"));
		updateFunctionResponse.setModifiedAt(_ctx.stringValue("UpdateFunctionResponse.ModifiedAt"));

		Spec spec = new Spec();
		spec.setRuntime(_ctx.stringValue("UpdateFunctionResponse.Spec.Runtime"));
		spec.setMemory(_ctx.stringValue("UpdateFunctionResponse.Spec.Memory"));
		spec.setTimeout(_ctx.stringValue("UpdateFunctionResponse.Spec.Timeout"));
		updateFunctionResponse.setSpec(spec);
	 
	 	return updateFunctionResponse;
	}
}