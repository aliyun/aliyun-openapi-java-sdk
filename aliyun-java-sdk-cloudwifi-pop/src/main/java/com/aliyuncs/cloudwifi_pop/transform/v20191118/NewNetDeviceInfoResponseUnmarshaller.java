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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudwifi_pop.model.v20191118.NewNetDeviceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class NewNetDeviceInfoResponseUnmarshaller {

	public static NewNetDeviceInfoResponse unmarshall(NewNetDeviceInfoResponse newNetDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		newNetDeviceInfoResponse.setRequestId(_ctx.stringValue("NewNetDeviceInfoResponse.RequestId"));
		newNetDeviceInfoResponse.setIsSuccess(_ctx.booleanValue("NewNetDeviceInfoResponse.IsSuccess"));
		newNetDeviceInfoResponse.setErrorCode(_ctx.integerValue("NewNetDeviceInfoResponse.ErrorCode"));
		newNetDeviceInfoResponse.setErrorMessage(_ctx.stringValue("NewNetDeviceInfoResponse.ErrorMessage"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("NewNetDeviceInfoResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("NewNetDeviceInfoResponse.Data["+ i +"]"));
		}
		newNetDeviceInfoResponse.setData(data);
	 
	 	return newNetDeviceInfoResponse;
	}
}