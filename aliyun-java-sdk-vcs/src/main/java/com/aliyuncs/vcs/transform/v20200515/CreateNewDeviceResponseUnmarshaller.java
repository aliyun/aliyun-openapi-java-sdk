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

import com.aliyuncs.vcs.model.v20200515.CreateNewDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.CreateNewDeviceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.CreateNewDeviceResponse.Data.SubDeviceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNewDeviceResponseUnmarshaller {

	public static CreateNewDeviceResponse unmarshall(CreateNewDeviceResponse createNewDeviceResponse, UnmarshallerContext _ctx) {
		
		createNewDeviceResponse.setRequestId(_ctx.stringValue("CreateNewDeviceResponse.RequestId"));
		createNewDeviceResponse.setCode(_ctx.stringValue("CreateNewDeviceResponse.Code"));
		createNewDeviceResponse.setMessage(_ctx.stringValue("CreateNewDeviceResponse.Message"));

		Data data = new Data();
		data.setSipRealm(_ctx.stringValue("CreateNewDeviceResponse.Data.SipRealm"));
		data.setServerIp(_ctx.stringValue("CreateNewDeviceResponse.Data.ServerIp"));
		data.setDeviceId(_ctx.stringValue("CreateNewDeviceResponse.Data.DeviceId"));
		data.setServerPort(_ctx.stringValue("CreateNewDeviceResponse.Data.ServerPort"));
		data.setServerId(_ctx.stringValue("CreateNewDeviceResponse.Data.ServerId"));
		data.setPassword(_ctx.stringValue("CreateNewDeviceResponse.Data.Password"));

		List<SubDeviceInfoItem> subDeviceInfo = new ArrayList<SubDeviceInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateNewDeviceResponse.Data.SubDeviceInfo.Length"); i++) {
			SubDeviceInfoItem subDeviceInfoItem = new SubDeviceInfoItem();
			subDeviceInfoItem.setChannelDeviceId(_ctx.stringValue("CreateNewDeviceResponse.Data.SubDeviceInfo["+ i +"].ChannelDeviceId"));

			subDeviceInfo.add(subDeviceInfoItem);
		}
		data.setSubDeviceInfo(subDeviceInfo);
		createNewDeviceResponse.setData(data);
	 
	 	return createNewDeviceResponse;
	}
}