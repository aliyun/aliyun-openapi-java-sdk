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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.AddAiotDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.AddAiotDevicesResponse.AddAiotDeviceResultType;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAiotDevicesResponseUnmarshaller {

	public static AddAiotDevicesResponse unmarshall(AddAiotDevicesResponse addAiotDevicesResponse, UnmarshallerContext _ctx) {
		
		addAiotDevicesResponse.setRequestId(_ctx.stringValue("AddAiotDevicesResponse.RequestId"));
		addAiotDevicesResponse.setMessage(_ctx.stringValue("AddAiotDevicesResponse.Message"));
		addAiotDevicesResponse.setCode(_ctx.stringValue("AddAiotDevicesResponse.Code"));

		List<AddAiotDeviceResultType> resultList = new ArrayList<AddAiotDeviceResultType>();
		for (int i = 0; i < _ctx.lengthValue("AddAiotDevicesResponse.ResultList.Length"); i++) {
			AddAiotDeviceResultType addAiotDeviceResultType = new AddAiotDeviceResultType();
			addAiotDeviceResultType.setServerId(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerId"));
			addAiotDeviceResultType.setServerHostInternal(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerHostInternal"));
			addAiotDeviceResultType.setMessage(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].Message"));
			addAiotDeviceResultType.setUserId(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].UserId"));
			addAiotDeviceResultType.setDeviceId(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].DeviceId"));
			addAiotDeviceResultType.setServerIp(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerIp"));
			addAiotDeviceResultType.setServerIpInternal(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerIpInternal"));
			addAiotDeviceResultType.setServerWssPort(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerWssPort"));
			addAiotDeviceResultType.setId(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].Id"));
			addAiotDeviceResultType.setServerHost(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerHost"));
			addAiotDeviceResultType.setCode(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].Code"));
			addAiotDeviceResultType.setServerPort(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].ServerPort"));
			addAiotDeviceResultType.setPassword(_ctx.stringValue("AddAiotDevicesResponse.ResultList["+ i +"].Password"));

			resultList.add(addAiotDeviceResultType);
		}
		addAiotDevicesResponse.setResultList(resultList);
	 
	 	return addAiotDevicesResponse;
	}
}