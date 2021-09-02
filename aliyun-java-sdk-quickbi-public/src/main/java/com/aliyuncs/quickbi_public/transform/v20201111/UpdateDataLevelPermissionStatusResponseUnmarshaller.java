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

package com.aliyuncs.quickbi_public.transform.v20201111;

import com.aliyuncs.quickbi_public.model.v20201111.UpdateDataLevelPermissionStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataLevelPermissionStatusResponseUnmarshaller {

	public static UpdateDataLevelPermissionStatusResponse unmarshall(UpdateDataLevelPermissionStatusResponse updateDataLevelPermissionStatusResponse, UnmarshallerContext _ctx) {
		
		updateDataLevelPermissionStatusResponse.setRequestId(_ctx.stringValue("UpdateDataLevelPermissionStatusResponse.RequestId"));
		updateDataLevelPermissionStatusResponse.setResult(_ctx.booleanValue("UpdateDataLevelPermissionStatusResponse.Result"));
		updateDataLevelPermissionStatusResponse.setSuccess(_ctx.booleanValue("UpdateDataLevelPermissionStatusResponse.Success"));
	 
	 	return updateDataLevelPermissionStatusResponse;
	}
}