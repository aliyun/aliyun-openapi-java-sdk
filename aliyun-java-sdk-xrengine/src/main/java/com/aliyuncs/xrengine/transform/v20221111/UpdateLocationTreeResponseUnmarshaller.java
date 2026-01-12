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

import com.aliyuncs.xrengine.model.v20221111.UpdateLocationTreeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLocationTreeResponseUnmarshaller {

	public static UpdateLocationTreeResponse unmarshall(UpdateLocationTreeResponse updateLocationTreeResponse, UnmarshallerContext _ctx) {
		
		updateLocationTreeResponse.setRequestId(_ctx.stringValue("UpdateLocationTreeResponse.RequestId"));
		updateLocationTreeResponse.setSuccess(_ctx.booleanValue("UpdateLocationTreeResponse.Success"));
		updateLocationTreeResponse.setCode(_ctx.stringValue("UpdateLocationTreeResponse.Code"));
		updateLocationTreeResponse.setMessage(_ctx.stringValue("UpdateLocationTreeResponse.Message"));
		updateLocationTreeResponse.setErrorName(_ctx.stringValue("UpdateLocationTreeResponse.ErrorName"));
		updateLocationTreeResponse.setHttpCode(_ctx.integerValue("UpdateLocationTreeResponse.HttpCode"));
		updateLocationTreeResponse.setData(_ctx.booleanValue("UpdateLocationTreeResponse.Data"));
	 
	 	return updateLocationTreeResponse;
	}
}