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

import com.aliyuncs.vcs.model.v20200515.CreateScanDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.CreateScanDeviceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.CreateScanDeviceResponse.Data.SubDeviceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScanDeviceResponseUnmarshaller {

	public static CreateScanDeviceResponse unmarshall(CreateScanDeviceResponse createScanDeviceResponse, UnmarshallerContext _ctx) {
		
		createScanDeviceResponse.setRequestId(_ctx.stringValue("CreateScanDeviceResponse.RequestId"));
		createScanDeviceResponse.setMessage(_ctx.stringValue("CreateScanDeviceResponse.Message"));
		createScanDeviceResponse.setCode(_ctx.stringValue("CreateScanDeviceResponse.Code"));

		Data data = new Data();
		data.setServerIp(_ctx.stringValue("CreateScanDeviceResponse.Data.ServerIp"));
		data.setServerRealm(_ctx.stringValue("CreateScanDeviceResponse.Data.ServerRealm"));
		data.setServerPort(_ctx.stringValue("CreateScanDeviceResponse.Data.ServerPort"));
		data.setSipDeviceGbId(_ctx.stringValue("CreateScanDeviceResponse.Data.SipDeviceGbId"));
		data.setDeviceId(_ctx.stringValue("CreateScanDeviceResponse.Data.DeviceId"));
		data.setServerId(_ctx.stringValue("CreateScanDeviceResponse.Data.ServerId"));
		data.setPassword(_ctx.stringValue("CreateScanDeviceResponse.Data.Password"));
		data.setDeviceSn(_ctx.stringValue("CreateScanDeviceResponse.Data.DeviceSn"));
		data.setCorpId(_ctx.stringValue("CreateScanDeviceResponse.Data.CorpId"));

		List<SubDeviceInfoItem> subDeviceInfo = new ArrayList<SubDeviceInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateScanDeviceResponse.Data.SubDeviceInfo.Length"); i++) {
			SubDeviceInfoItem subDeviceInfoItem = new SubDeviceInfoItem();
			subDeviceInfoItem.setChannelDeviceId(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceInfo["+ i +"].ChannelDeviceId"));

			subDeviceInfo.add(subDeviceInfoItem);
		}
		data.setSubDeviceInfo(subDeviceInfo);
		createScanDeviceResponse.setData(data);
	 
	 	return createScanDeviceResponse;
	}
}