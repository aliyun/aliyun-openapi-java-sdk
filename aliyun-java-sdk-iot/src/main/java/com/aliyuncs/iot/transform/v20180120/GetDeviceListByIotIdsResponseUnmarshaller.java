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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetDeviceListByIotIdsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceListByIotIdsResponseUnmarshaller {

	public static GetDeviceListByIotIdsResponse unmarshall(GetDeviceListByIotIdsResponse getDeviceListByIotIdsResponse, UnmarshallerContext _ctx) {
		
		getDeviceListByIotIdsResponse.setRequestId(_ctx.stringValue("GetDeviceListByIotIdsResponse.RequestId"));
		getDeviceListByIotIdsResponse.setSuccess(_ctx.booleanValue("GetDeviceListByIotIdsResponse.Success"));
		getDeviceListByIotIdsResponse.setErrorMessage(_ctx.stringValue("GetDeviceListByIotIdsResponse.ErrorMessage"));
		getDeviceListByIotIdsResponse.setCode(_ctx.stringValue("GetDeviceListByIotIdsResponse.Code"));
		getDeviceListByIotIdsResponse.setData(_ctx.stringValue("GetDeviceListByIotIdsResponse.Data"));
	 
	 	return getDeviceListByIotIdsResponse;
	}
}