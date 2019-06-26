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

	public static GetPassListResponse unmarshall(GetPassListResponse getPassListResponse, UnmarshallerContext context) {
		
		getPassListResponse.setRequestId(context.stringValue("GetPassListResponse.RequestId"));
		getPassListResponse.setCode(context.integerValue("GetPassListResponse.Code"));

		Data data = new Data();
		data.setTotal(context.longValue("GetPassListResponse.Data.Total"));
		data.setSwAuths(context.stringValue("GetPassListResponse.Data.SwAuths"));
		data.setSwSecurities(context.stringValue("GetPassListResponse.Data.SwSecurities"));
		data.setSwIsAt(context.integerValue("GetPassListResponse.Data.SwIsAt"));
		data.setSwIsOta(context.integerValue("GetPassListResponse.Data.SwIsOta"));
		data.setSwForms(context.stringValue("GetPassListResponse.Data.SwForms"));
		data.setSwCertifiedUrl(context.stringValue("GetPassListResponse.Data.SwCertifiedUrl"));
		data.setHwApplyType(context.stringValue("GetPassListResponse.Data.HwApplyType"));
		data.setFuncEnumIds(context.stringValue("GetPassListResponse.Data.FuncEnumIds"));
		data.setFuncInfo(context.stringValue("GetPassListResponse.Data.FuncInfo"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("GetPassListResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(context.longValue("GetPassListResponse.Data.List["+ i +"].Id"));
			listItem.setJobId(context.longValue("GetPassListResponse.Data.List["+ i +"].JobId"));
			listItem.setCertifyId(context.longValue("GetPassListResponse.Data.List["+ i +"].CertifyId"));
			listItem.setGmtCreate(context.longValue("GetPassListResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(context.longValue("GetPassListResponse.Data.List["+ i +"].GmtModified"));
			listItem.setCompany(context.stringValue("GetPassListResponse.Data.List["+ i +"].Company"));
			listItem.setBrand(context.stringValue("GetPassListResponse.Data.List["+ i +"].Brand"));
			listItem.setModel(context.stringValue("GetPassListResponse.Data.List["+ i +"].Model"));
			listItem.setProtocols(context.stringValue("GetPassListResponse.Data.List["+ i +"].Protocols"));
			listItem.setProtocolT(context.stringValue("GetPassListResponse.Data.List["+ i +"].ProtocolT"));
			listItem.setDeviceType(context.integerValue("GetPassListResponse.Data.List["+ i +"].DeviceType"));
			listItem.setDeviceTypeT(context.stringValue("GetPassListResponse.Data.List["+ i +"].DeviceTypeT"));
			listItem.setServiceType(context.integerValue("GetPassListResponse.Data.List["+ i +"].ServiceType"));
			listItem.setServiceTypeT(context.stringValue("GetPassListResponse.Data.List["+ i +"].ServiceTypeT"));
			listItem.setCertifyType(context.integerValue("GetPassListResponse.Data.List["+ i +"].CertifyType"));
			listItem.setCertifyTypeT(context.stringValue("GetPassListResponse.Data.List["+ i +"].CertifyTypeT"));
			listItem.setSuitId(context.integerValue("GetPassListResponse.Data.List["+ i +"].SuitId"));
			listItem.setDetectionIds(context.stringValue("GetPassListResponse.Data.List["+ i +"].DetectionIds"));
			listItem.setDetectionIdsT(context.stringValue("GetPassListResponse.Data.List["+ i +"].DetectionIdsT"));
			listItem.setHwChipBrand(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipBrand"));
			listItem.setHwChipModel(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipModel"));
			listItem.setHwChipArch(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipArch"));
			listItem.setHwChipFreq(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwChipFreq"));
			listItem.setHwRficModel(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwRficModel"));
			listItem.setHwRam(context.integerValue("GetPassListResponse.Data.List["+ i +"].HwRam"));
			listItem.setHwRom(context.integerValue("GetPassListResponse.Data.List["+ i +"].HwRom"));
			listItem.setHwFlash(context.integerValue("GetPassListResponse.Data.List["+ i +"].HwFlash"));
			listItem.setHwWorkVol(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwWorkVol"));
			listItem.setHwWorkTemp(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwWorkTemp"));
			listItem.setHwBaudrate(context.integerValue("GetPassListResponse.Data.List["+ i +"].HwBaudrate"));
			listItem.setHwPack(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwPack"));
			listItem.setHwSize(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwSize"));
			listItem.setHwBoardModel(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwBoardModel"));
			listItem.setHwNominalVol(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwNominalVol"));
			listItem.setHwPowerMode(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwPowerMode"));
			listItem.setSwOs(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwOs"));
			listItem.setSwOsVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwOsVersion"));
			listItem.setSwFirmVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwFirmVersion"));
			listItem.setSwChannels(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwChannels"));
			listItem.setSwGit(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwGit"));
			listItem.setSwEnv(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwEnv"));
			listItem.setUrlPhotoFace(context.stringValue("GetPassListResponse.Data.List["+ i +"].UrlPhotoFace"));
			listItem.setUrlPhotoBack(context.stringValue("GetPassListResponse.Data.List["+ i +"].UrlPhotoBack"));
			listItem.setUrlPhotoLink(context.stringValue("GetPassListResponse.Data.List["+ i +"].UrlPhotoLink"));
			listItem.setRoutineKey(context.stringValue("GetPassListResponse.Data.List["+ i +"].RoutineKey"));
			listItem.setGmtPass(context.longValue("GetPassListResponse.Data.List["+ i +"].GmtPass"));
			listItem.setBuyLink(context.stringValue("GetPassListResponse.Data.List["+ i +"].BuyLink"));
			listItem.setHwVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwVersion"));
			listItem.setChipType(context.integerValue("GetPassListResponse.Data.List["+ i +"].ChipType"));
			listItem.setChipTypeT(context.stringValue("GetPassListResponse.Data.List["+ i +"].ChipTypeT"));
			listItem.setSuitName(context.stringValue("GetPassListResponse.Data.List["+ i +"].SuitName"));
			listItem.setCertifyPlanT(context.stringValue("GetPassListResponse.Data.List["+ i +"].CertifyPlanT"));
			listItem.setLevel(context.integerValue("GetPassListResponse.Data.List["+ i +"].Level"));
			listItem.setLevelT(context.stringValue("GetPassListResponse.Data.List["+ i +"].LevelT"));
			listItem.setDeviceTypeType(context.stringValue("GetPassListResponse.Data.List["+ i +"].DeviceTypeType"));
			listItem.setFirmwareVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].FirmwareVersion"));
			listItem.setLogoUrl(context.stringValue("GetPassListResponse.Data.List["+ i +"].LogoUrl"));
			listItem.setSwProtocolType(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwProtocolType"));
			listItem.setSwModuleIo(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwModuleIo"));
			listItem.setTerminalType(context.integerValue("GetPassListResponse.Data.List["+ i +"].TerminalType"));
			listItem.setTerminalTypeT(context.stringValue("GetPassListResponse.Data.List["+ i +"].TerminalTypeT"));
			listItem.setRouterType(context.integerValue("GetPassListResponse.Data.List["+ i +"].RouterType"));
			listItem.setCertifyPlan(context.integerValue("GetPassListResponse.Data.List["+ i +"].CertifyPlan"));
			listItem.setCertifyPlanType(context.integerValue("GetPassListResponse.Data.List["+ i +"].CertifyPlanType"));
			listItem.setHwLoraFreqType(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraFreqType"));
			listItem.setHwLoraFreqRange(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraFreqRange"));
			listItem.setHwLoraAntBandwidth(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraAntBandwidth"));
			listItem.setHwLoraDuplexMode(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraDuplexMode"));
			listItem.setHwLoraRxCount(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraRxCount"));
			listItem.setHwLoraTxCount(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraTxCount"));
			listItem.setHwLoraClassMode(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraClassMode"));
			listItem.setHwLoraUseModel(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraUseModel"));
			listItem.setHwLoraIsRelay(context.stringValue("GetPassListResponse.Data.List["+ i +"].HwLoraIsRelay"));
			listItem.setSwLoraRuleVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraRuleVersion"));
			listItem.setSwLoraGwmpVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraGwmpVersion"));
			listItem.setSwLoraWanVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraWanVersion"));
			listItem.setSwLoraMac(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraMac"));
			listItem.setSwLoraKey(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwLoraKey"));
			listItem.setSwIotsdkVersion(context.stringValue("GetPassListResponse.Data.List["+ i +"].SwIotsdkVersion"));

			list.add(listItem);
		}
		data.setList(list);
		getPassListResponse.setData(data);
	 
	 	return getPassListResponse;
	}
}