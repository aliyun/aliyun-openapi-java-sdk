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

import com.aliyuncs.vcs.model.v20200515.CreateDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.CreateDeviceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.CreateDeviceResponse.Data.SubDeviceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceResponseUnmarshaller {

	public static CreateDeviceResponse unmarshall(CreateDeviceResponse createDeviceResponse, UnmarshallerContext _ctx) {
		
		createDeviceResponse.setRequestId(_ctx.stringValue("CreateDeviceResponse.RequestId"));
		createDeviceResponse.setCode(_ctx.stringValue("CreateDeviceResponse.Code"));
		createDeviceResponse.setMessage(_ctx.stringValue("CreateDeviceResponse.Message"));

		Data data = new Data();
		data.setServerId(_ctx.stringValue("CreateDeviceResponse.Data.ServerId"));
		data.setServerIp(_ctx.stringValue("CreateDeviceResponse.Data.ServerIp"));
		data.setServerRealm(_ctx.stringValue("CreateDeviceResponse.Data.ServerRealm"));
		data.setServerPort(_ctx.stringValue("CreateDeviceResponse.Data.ServerPort"));
		data.setDeviceId(_ctx.stringValue("CreateDeviceResponse.Data.DeviceId"));
		data.setPassword(_ctx.stringValue("CreateDeviceResponse.Data.Password"));

		List<SubDeviceInfoItem> subDeviceInfo = new ArrayList<SubDeviceInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDeviceResponse.Data.SubDeviceInfo.Length"); i++) {
			SubDeviceInfoItem subDeviceInfoItem = new SubDeviceInfoItem();
			subDeviceInfoItem.setSubDeviceId(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceInfo["+ i +"].SubDeviceId"));

			subDeviceInfo.add(subDeviceInfoItem);
		}
		data.setSubDeviceInfo(subDeviceInfo);
		createDeviceResponse.setData(data);
	 
	 	return createDeviceResponse;
	}
}