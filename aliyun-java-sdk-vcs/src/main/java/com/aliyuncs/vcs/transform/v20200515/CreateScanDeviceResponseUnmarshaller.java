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
import com.aliyuncs.vcs.model.v20200515.CreateScanDeviceResponse.Data.SubDeviceSipInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScanDeviceResponseUnmarshaller {

	public static CreateScanDeviceResponse unmarshall(CreateScanDeviceResponse createScanDeviceResponse, UnmarshallerContext _ctx) {
		
		createScanDeviceResponse.setRequestId(_ctx.stringValue("CreateScanDeviceResponse.RequestId"));
		createScanDeviceResponse.setMessage(_ctx.stringValue("CreateScanDeviceResponse.Message"));
		createScanDeviceResponse.setCode(_ctx.stringValue("CreateScanDeviceResponse.Code"));

		Data data = new Data();
		data.setSipReaml(_ctx.stringValue("CreateScanDeviceResponse.Data.SipReaml"));
		data.setSipIp(_ctx.stringValue("CreateScanDeviceResponse.Data.SipIp"));
		data.setCorpId(_ctx.stringValue("CreateScanDeviceResponse.Data.CorpId"));
		data.setDeviceSn(_ctx.stringValue("CreateScanDeviceResponse.Data.DeviceSn"));
		data.setSipDeviceGbId(_ctx.stringValue("CreateScanDeviceResponse.Data.SipDeviceGbId"));
		data.setDeviceCode(_ctx.stringValue("CreateScanDeviceResponse.Data.DeviceCode"));
		data.setSipPort(_ctx.stringValue("CreateScanDeviceResponse.Data.SipPort"));
		data.setSipGbId(_ctx.stringValue("CreateScanDeviceResponse.Data.SipGbId"));
		data.setSipPassword(_ctx.stringValue("CreateScanDeviceResponse.Data.SipPassword"));

		List<SubDeviceSipInfoItem> subDeviceSipInfo = new ArrayList<SubDeviceSipInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo.Length"); i++) {
			SubDeviceSipInfoItem subDeviceSipInfoItem = new SubDeviceSipInfoItem();
			subDeviceSipInfoItem.setSundayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].SundayCaptureStrategy"));
			subDeviceSipInfoItem.setMondayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].MondayCaptureStrategy"));
			subDeviceSipInfoItem.setChannelGbId(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].ChannelGbId"));
			subDeviceSipInfoItem.setFridayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].FridayCaptureStrategy"));
			subDeviceSipInfoItem.setTuesdayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].TuesdayCaptureStrategy"));
			subDeviceSipInfoItem.setWednesdayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].WednesdayCaptureStrategy"));
			subDeviceSipInfoItem.setThursdayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].ThursdayCaptureStrategy"));
			subDeviceSipInfoItem.setSaturdayCaptureStrategy(_ctx.stringValue("CreateScanDeviceResponse.Data.SubDeviceSipInfo["+ i +"].SaturdayCaptureStrategy"));

			subDeviceSipInfo.add(subDeviceSipInfoItem);
		}
		data.setSubDeviceSipInfo(subDeviceSipInfo);
		createScanDeviceResponse.setData(data);
	 
	 	return createScanDeviceResponse;
	}
}