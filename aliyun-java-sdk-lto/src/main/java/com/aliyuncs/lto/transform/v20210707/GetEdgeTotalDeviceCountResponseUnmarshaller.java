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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.GetEdgeTotalDeviceCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeTotalDeviceCountResponseUnmarshaller {

	public static GetEdgeTotalDeviceCountResponse unmarshall(GetEdgeTotalDeviceCountResponse getEdgeTotalDeviceCountResponse, UnmarshallerContext _ctx) {
		
		getEdgeTotalDeviceCountResponse.setRequestId(_ctx.stringValue("GetEdgeTotalDeviceCountResponse.RequestId"));
		getEdgeTotalDeviceCountResponse.setCode(_ctx.stringValue("GetEdgeTotalDeviceCountResponse.Code"));
		getEdgeTotalDeviceCountResponse.setHttpStatusCode(_ctx.integerValue("GetEdgeTotalDeviceCountResponse.HttpStatusCode"));
		getEdgeTotalDeviceCountResponse.setMessage(_ctx.stringValue("GetEdgeTotalDeviceCountResponse.Message"));
		getEdgeTotalDeviceCountResponse.setSuccess(_ctx.booleanValue("GetEdgeTotalDeviceCountResponse.Success"));
		getEdgeTotalDeviceCountResponse.setData(_ctx.longValue("GetEdgeTotalDeviceCountResponse.Data"));
	 
	 	return getEdgeTotalDeviceCountResponse;
	}
}