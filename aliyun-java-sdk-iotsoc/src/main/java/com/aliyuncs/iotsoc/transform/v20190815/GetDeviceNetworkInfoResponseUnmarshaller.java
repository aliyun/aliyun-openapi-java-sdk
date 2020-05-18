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

package com.aliyuncs.iotsoc.transform.v20190815;

import com.aliyuncs.iotsoc.model.v20190815.GetDeviceNetworkInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceNetworkInfoResponseUnmarshaller {

	public static GetDeviceNetworkInfoResponse unmarshall(GetDeviceNetworkInfoResponse getDeviceNetworkInfoResponse, UnmarshallerContext _ctx) {
		
		getDeviceNetworkInfoResponse.setRequestId(_ctx.stringValue("GetDeviceNetworkInfoResponse.RequestId"));
		getDeviceNetworkInfoResponse.setCode(_ctx.stringValue("GetDeviceNetworkInfoResponse.Code"));
		getDeviceNetworkInfoResponse.setData(_ctx.stringValue("GetDeviceNetworkInfoResponse.Data"));
	 
	 	return getDeviceNetworkInfoResponse;
	}
}