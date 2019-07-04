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

import com.aliyuncs.iotts.model.v20181126.GetPassListResponse;
import com.aliyuncs.iotts.model.v20181126.GetPassListResponse.Data;
import com.aliyuncs.iotts.model.v20181126.GetPassListResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPassListResponseUnmarshaller {

	public static GetPassListResponse unmarshall(GetPassListResponse getPassListResponse, UnmarshallerContext _ctx) {
		
		getPassListResponse.setRequestId(_ctx.stringValue("GetPassListResponse.RequestId"));
		getPassListResponse.setCode(_ctx.integerValue("GetPassListResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetPassListResponse.Data.Total"));
		data.setSwAuths(_ctx.stringValue("GetPassListResponse.Data.SwAuths"));
		data.setSwSecurities(_ctx.stringValue("GetPassListResponse.Data.SwSecurities"));
		data.setSwIsAt(_ctx.integerValue("GetPassListResponse.Data.SwIsAt"));
		data.setSwIsOta(_ctx.integerValue("GetPassListResponse.Data.SwIsOta"));
		data.setSwForms(_ctx.stringValue("GetPassListResponse.Data.SwForms"));
		data.setSwCertifiedUrl(_ctx.stringValue("GetPassListResponse.Data.SwCertifiedUrl"));
		data.setHwApplyType(_ctx.stringValue("GetPassListResponse.Data.HwApplyType"));
		data.setFuncEnumIds(_ctx.stringValue("GetPassListResponse.Data.FuncEnumIds"));
		data.setFuncInfo(_ctx.stringValue("GetPassListResponse.Data.FuncInfo"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPassListResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("GetPassListResponse.Data.List["+ i +"].Id"));
			listItem.setJobId(_ctx.longValue("GetPassListResponse.Data.List["+ i +"].JobId"));
			listItem.setCertifyId(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].CertifyId"));
			listItem.setGmtCreate(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].GmtModified"));
			listItem.setCompany(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].Company"));
			listItem.setBrand(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].Brand"));
			listItem.setModel(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].Model"));
			listItem.setProtocols(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].Protocols"));
			listItem.setProtocolT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].ProtocolT"));
			listItem.setDeviceType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].DeviceType"));
			listItem.setDeviceTypeT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].DeviceTypeT"));
			listItem.setServiceType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].ServiceType"));
			listItem.setServiceTypeT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].ServiceTypeT"));
			listItem.setCertifyType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].CertifyType"));
			listItem.setCertifyTypeT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].CertifyTypeT"));
			listItem.setSuitId(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].SuitId"));
			listItem.setDetectionIds(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].DetectionIds"));
			listItem.setDetectionIdsT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].DetectionIdsT"));
			listItem.setHwChipBrand(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipBrand"));
			listItem.setHwChipModel(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipModel"));
			listItem.setHwChipArch(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipArch"));
			listItem.setHwChipFreq(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipFreq"));
			listItem.setHwRficModel(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwRficModel"));
			listItem.setHwRam(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].HwRam"));
			listItem.setHwRom(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].HwRom"));
			listItem.setHwFlash(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].HwFlash"));
			listItem.setHwWorkVol(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwWorkVol"));
			listItem.setHwWorkTemp(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwWorkTemp"));
			listItem.setHwBaudrate(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].HwBaudrate"));
			listItem.setHwPack(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwPack"));
			listItem.setHwSize(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwSize"));
			listItem.setHwBoardModel(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwBoardModel"));
			listItem.setHwNominalVol(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwNominalVol"));
			listItem.setHwPowerMode(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwPowerMode"));
			listItem.setSwOs(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwOs"));
			listItem.setSwOsVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwOsVersion"));
			listItem.setSwFirmVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwFirmVersion"));
			listItem.setSwChannels(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwChannels"));
			listItem.setSwGit(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwGit"));
			listItem.setSwEnv(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwEnv"));
			listItem.setUrlPhotoFace(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].UrlPhotoFace"));
			listItem.setUrlPhotoBack(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].UrlPhotoBack"));
			listItem.setUrlPhotoLink(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].UrlPhotoLink"));
			listItem.setRoutineKey(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].RoutineKey"));
			listItem.setGmtPass(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].GmtPass"));
			listItem.setBuyLink(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].BuyLink"));
			listItem.setHwVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwVersion"));
			listItem.setChipType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].ChipType"));
			listItem.setChipTypeT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].ChipTypeT"));
			listItem.setSuitName(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SuitName"));
			listItem.setCertifyPlanT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].CertifyPlanT"));
			listItem.setLevel(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].Level"));
			listItem.setLevelT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].LevelT"));
			listItem.setDeviceTypeType(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].DeviceTypeType"));
			listItem.setFirmwareVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].FirmwareVersion"));
			listItem.setLogoUrl(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].LogoUrl"));
			listItem.setSwProtocolType(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwProtocolType"));
			listItem.setSwModuleIo(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwModuleIo"));
			listItem.setTerminalType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].TerminalType"));
			listItem.setTerminalTypeT(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].TerminalTypeT"));
			listItem.setRouterType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].RouterType"));
			listItem.setCertifyPlan(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].CertifyPlan"));
			listItem.setCertifyPlanType(_ctx.integerValue("GetPassListResponse.Data.List["+ i +"].CertifyPlanType"));
			listItem.setHwLoraFreqType(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraFreqType"));
			listItem.setHwLoraFreqRange(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraFreqRange"));
			listItem.setHwLoraAntBandwidth(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraAntBandwidth"));
			listItem.setHwLoraDuplexMode(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraDuplexMode"));
			listItem.setHwLoraRxCount(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraRxCount"));
			listItem.setHwLoraTxCount(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraTxCount"));
			listItem.setHwLoraClassMode(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraClassMode"));
			listItem.setHwLoraUseModel(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraUseModel"));
			listItem.setHwLoraIsRelay(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraIsRelay"));
			listItem.setSwLoraRuleVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraRuleVersion"));
			listItem.setSwLoraGwmpVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraGwmpVersion"));
			listItem.setSwLoraWanVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraWanVersion"));
			listItem.setSwLoraMac(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraMac"));
			listItem.setSwLoraKey(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraKey"));
			listItem.setSwIotsdkVersion(_ctx.stringValue("GetPassListResponse.Data.List["+ i +"].SwIotsdkVersion"));

			list.add(listItem);
		}
		data.setList(list);
		getPassListResponse.setData(data);
	 
	 	return getPassListResponse;
	}
}