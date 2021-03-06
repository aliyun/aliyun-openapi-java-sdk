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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.GetServiceStatusResponse;
import com.aliyuncs.datalake.model.v20200710.GetServiceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceStatusResponseUnmarshaller {

	public static GetServiceStatusResponse unmarshall(GetServiceStatusResponse getServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getServiceStatusResponse.setRequestId(_ctx.stringValue("GetServiceStatusResponse.RequestId"));
		getServiceStatusResponse.setSuccess(_ctx.booleanValue("GetServiceStatusResponse.Success"));

		Data data = new Data();
		data.setIsOssOpen(_ctx.booleanValue("GetServiceStatusResponse.Data.IsOssOpen"));
		data.setHasRamPermissions(_ctx.booleanValue("GetServiceStatusResponse.Data.HasRamPermissions"));
		data.setIsDlfServiceOpen(_ctx.booleanValue("GetServiceStatusResponse.Data.IsDlfServiceOpen"));
		getServiceStatusResponse.setData(data);
	 
	 	return getServiceStatusResponse;
	}
}