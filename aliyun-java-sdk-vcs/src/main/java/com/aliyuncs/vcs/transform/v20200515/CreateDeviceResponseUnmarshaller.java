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
import com.aliyuncs.vcs.model.v20200515.CreateDeviceResponse.Data.SubDeviceSipInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceResponseUnmarshaller {

	public static CreateDeviceResponse unmarshall(CreateDeviceResponse createDeviceResponse, UnmarshallerContext _ctx) {
		
		createDeviceResponse.setRequestId(_ctx.stringValue("CreateDeviceResponse.RequestId"));
		createDeviceResponse.setMessage(_ctx.stringValue("CreateDeviceResponse.Message"));
		createDeviceResponse.setCode(_ctx.stringValue("CreateDeviceResponse.Code"));

		Data data = new Data();
		data.setSipIp(_ctx.stringValue("CreateDeviceResponse.Data.SipIp"));
		data.setSipReaml(_ctx.stringValue("CreateDeviceResponse.Data.SipReaml"));
		data.setSipDeviceGbId(_ctx.stringValue("CreateDeviceResponse.Data.SipDeviceGbId"));
		data.setSipPort(_ctx.stringValue("CreateDeviceResponse.Data.SipPort"));
		data.setDeviceCode(_ctx.stringValue("CreateDeviceResponse.Data.DeviceCode"));
		data.setSipGbId(_ctx.stringValue("CreateDeviceResponse.Data.SipGbId"));
		data.setSipPassword(_ctx.stringValue("CreateDeviceResponse.Data.SipPassword"));

		List<SubDeviceSipInfoItem> subDeviceSipInfo = new ArrayList<SubDeviceSipInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDeviceResponse.Data.SubDeviceSipInfo.Length"); i++) {
			SubDeviceSipInfoItem subDeviceSipInfoItem = new SubDeviceSipInfoItem();
			subDeviceSipInfoItem.setSundayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].SundayCaptureStrategy"));
			subDeviceSipInfoItem.setChannelGbId(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].ChannelGbId"));
			subDeviceSipInfoItem.setMondayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].MondayCaptureStrategy"));
			subDeviceSipInfoItem.setFridayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].FridayCaptureStrategy"));
			subDeviceSipInfoItem.setTuesdayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].TuesdayCaptureStrategy"));
			subDeviceSipInfoItem.setWednesdayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].WednesdayCaptureStrategy"));
			subDeviceSipInfoItem.setThursdayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].ThursdayCaptureStrategy"));
			subDeviceSipInfoItem.setSaturdayCaptureStrategy(_ctx.stringValue("CreateDeviceResponse.Data.SubDeviceSipInfo["+ i +"].SaturdayCaptureStrategy"));

			subDeviceSipInfo.add(subDeviceSipInfoItem);
		}
		data.setSubDeviceSipInfo(subDeviceSipInfo);
		createDeviceResponse.setData(data);
	 
	 	return createDeviceResponse;
	}
}