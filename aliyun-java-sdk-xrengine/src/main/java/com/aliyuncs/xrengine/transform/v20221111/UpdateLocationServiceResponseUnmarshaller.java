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

import com.aliyuncs.xrengine.model.v20221111.UpdateLocationServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLocationServiceResponseUnmarshaller {

	public static UpdateLocationServiceResponse unmarshall(UpdateLocationServiceResponse updateLocationServiceResponse, UnmarshallerContext _ctx) {
		
		updateLocationServiceResponse.setRequestId(_ctx.stringValue("UpdateLocationServiceResponse.RequestId"));
		updateLocationServiceResponse.setSuccess(_ctx.booleanValue("UpdateLocationServiceResponse.Success"));
		updateLocationServiceResponse.setCode(_ctx.stringValue("UpdateLocationServiceResponse.Code"));
		updateLocationServiceResponse.setMessage(_ctx.stringValue("UpdateLocationServiceResponse.Message"));
		updateLocationServiceResponse.setErrorName(_ctx.stringValue("UpdateLocationServiceResponse.ErrorName"));
		updateLocationServiceResponse.setHttpCode(_ctx.integerValue("UpdateLocationServiceResponse.HttpCode"));
		updateLocationServiceResponse.setData(_ctx.booleanValue("UpdateLocationServiceResponse.Data"));
	 
	 	return updateLocationServiceResponse;
	}
}