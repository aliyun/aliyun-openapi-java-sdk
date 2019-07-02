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

package com.aliyuncs.iotts.transform.v20181126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.ApplyStatusListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.CertifyPlanListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.CertifyTypeListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.ChipTypeListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.DeviceTypeListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.IntegrateTypeListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.LevelListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.PlatformListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.ProtocolListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.ProtocolOptsItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.ServiceTypeListItem;
import com.aliyuncs.iotts.model.v20181126.GetFieldOptionPassedResponse.Data.TerminalTypeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFieldOptionPassedResponseUnmarshaller {

	public static GetFieldOptionPassedResponse unmarshall(GetFieldOptionPassedResponse getFieldOptionPassedResponse, UnmarshallerContext _ctx) {
		
		getFieldOptionPassedResponse.setRequestId(_ctx.stringValue("GetFieldOptionPassedResponse.RequestId"));
		getFieldOptionPassedResponse.setCode(_ctx.integerValue("GetFieldOptionPassedResponse.Code"));

		Data data = new Data();

		List<ApplyStatusListItem> applyStatusList = new ArrayList<ApplyStatusListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.ApplyStatusList.Length"); i++) {
			ApplyStatusListItem applyStatusListItem = new ApplyStatusListItem();
			applyStatusListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.ApplyStatusList["+ i +"].Text"));
			applyStatusListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.ApplyStatusList["+ i +"].Value"));

			applyStatusList.add(applyStatusListItem);
		}
		data.setApplyStatusList(applyStatusList);

		List<ProtocolListItem> protocolList = new ArrayList<ProtocolListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.ProtocolList.Length"); i++) {
			ProtocolListItem protocolListItem = new ProtocolListItem();
			protocolListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.ProtocolList["+ i +"].Text"));
			protocolListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.ProtocolList["+ i +"].Value"));

			protocolList.add(protocolListItem);
		}
		data.setProtocolList(protocolList);

		List<TerminalTypeListItem> terminalTypeList = new ArrayList<TerminalTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.TerminalTypeList.Length"); i++) {
			TerminalTypeListItem terminalTypeListItem = new TerminalTypeListItem();
			terminalTypeListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.TerminalTypeList["+ i +"].Text"));
			terminalTypeListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.TerminalTypeList["+ i +"].Value"));

			terminalTypeList.add(terminalTypeListItem);
		}
		data.setTerminalTypeList(terminalTypeList);

		List<LevelListItem> levelList = new ArrayList<LevelListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.LevelList.Length"); i++) {
			LevelListItem levelListItem = new LevelListItem();
			levelListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.LevelList["+ i +"].Text"));
			levelListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.LevelList["+ i +"].Value"));

			levelList.add(levelListItem);
		}
		data.setLevelList(levelList);

		List<ServiceTypeListItem> serviceTypeList = new ArrayList<ServiceTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.ServiceTypeList.Length"); i++) {
			ServiceTypeListItem serviceTypeListItem = new ServiceTypeListItem();
			serviceTypeListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.ServiceTypeList["+ i +"].Text"));
			serviceTypeListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.ServiceTypeList["+ i +"].Value"));

			serviceTypeList.add(serviceTypeListItem);
		}
		data.setServiceTypeList(serviceTypeList);

		List<CertifyTypeListItem> certifyTypeList = new ArrayList<CertifyTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.CertifyTypeList.Length"); i++) {
			CertifyTypeListItem certifyTypeListItem = new CertifyTypeListItem();
			certifyTypeListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.CertifyTypeList["+ i +"].Text"));
			certifyTypeListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.CertifyTypeList["+ i +"].Value"));

			certifyTypeList.add(certifyTypeListItem);
		}
		data.setCertifyTypeList(certifyTypeList);

		List<PlatformListItem> platformList = new ArrayList<PlatformListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.PlatformList.Length"); i++) {
			PlatformListItem platformListItem = new PlatformListItem();
			platformListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.PlatformList["+ i +"].Text"));
			platformListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.PlatformList["+ i +"].Value"));

			platformList.add(platformListItem);
		}
		data.setPlatformList(platformList);

		List<ChipTypeListItem> chipTypeList = new ArrayList<ChipTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.ChipTypeList.Length"); i++) {
			ChipTypeListItem chipTypeListItem = new ChipTypeListItem();
			chipTypeListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.ChipTypeList["+ i +"].Text"));
			chipTypeListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.ChipTypeList["+ i +"].Value"));

			chipTypeList.add(chipTypeListItem);
		}
		data.setChipTypeList(chipTypeList);

		List<DeviceTypeListItem> deviceTypeList = new ArrayList<DeviceTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.DeviceTypeList.Length"); i++) {
			DeviceTypeListItem deviceTypeListItem = new DeviceTypeListItem();
			deviceTypeListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.DeviceTypeList["+ i +"].Text"));
			deviceTypeListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.DeviceTypeList["+ i +"].Value"));

			deviceTypeList.add(deviceTypeListItem);
		}
		data.setDeviceTypeList(deviceTypeList);

		List<CertifyPlanListItem> certifyPlanList = new ArrayList<CertifyPlanListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.CertifyPlanList.Length"); i++) {
			CertifyPlanListItem certifyPlanListItem = new CertifyPlanListItem();
			certifyPlanListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.CertifyPlanList["+ i +"].Text"));
			certifyPlanListItem.setValue(_ctx.integerValue("GetFieldOptionPassedResponse.Data.CertifyPlanList["+ i +"].Value"));

			certifyPlanList.add(certifyPlanListItem);
		}
		data.setCertifyPlanList(certifyPlanList);

		List<ProtocolOptsItem> protocolOpts = new ArrayList<ProtocolOptsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.ProtocolOpts.Length"); i++) {
			ProtocolOptsItem protocolOptsItem = new ProtocolOptsItem();
			protocolOptsItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.ProtocolOpts["+ i +"].Text"));
			protocolOptsItem.setValue(_ctx.stringValue("GetFieldOptionPassedResponse.Data.ProtocolOpts["+ i +"].Value"));

			protocolOpts.add(protocolOptsItem);
		}
		data.setProtocolOpts(protocolOpts);

		List<IntegrateTypeListItem> integrateTypeList = new ArrayList<IntegrateTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFieldOptionPassedResponse.Data.IntegrateTypeList.Length"); i++) {
			IntegrateTypeListItem integrateTypeListItem = new IntegrateTypeListItem();
			integrateTypeListItem.setText(_ctx.stringValue("GetFieldOptionPassedResponse.Data.IntegrateTypeList["+ i +"].Text"));
			integrateTypeListItem.setValue(_ctx.stringValue("GetFieldOptionPassedResponse.Data.IntegrateTypeList["+ i +"].Value"));

			integrateTypeList.add(integrateTypeListItem);
		}
		data.setIntegrateTypeList(integrateTypeList);
		getFieldOptionPassedResponse.setData(data);
	 
	 	return getFieldOptionPassedResponse;
	}
}