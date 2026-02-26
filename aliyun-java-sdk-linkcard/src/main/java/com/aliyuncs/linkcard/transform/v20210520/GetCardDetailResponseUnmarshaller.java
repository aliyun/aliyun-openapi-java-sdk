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

package com.aliyuncs.linkcard.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkcard.model.v20210520.GetCardDetailResponse;
import com.aliyuncs.linkcard.model.v20210520.GetCardDetailResponse.Data;
import com.aliyuncs.linkcard.model.v20210520.GetCardDetailResponse.Data.CardInfo;
import com.aliyuncs.linkcard.model.v20210520.GetCardDetailResponse.Data.VsimCardInfo;
import com.aliyuncs.linkcard.model.v20210520.GetCardDetailResponse.Data.VsimCardInfo.TagDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCardDetailResponseUnmarshaller {

	public static GetCardDetailResponse unmarshall(GetCardDetailResponse getCardDetailResponse, UnmarshallerContext _ctx) {
		
		getCardDetailResponse.setRequestId(_ctx.stringValue("GetCardDetailResponse.RequestId"));
		getCardDetailResponse.setCode(_ctx.stringValue("GetCardDetailResponse.Code"));
		getCardDetailResponse.setErrorMessage(_ctx.stringValue("GetCardDetailResponse.ErrorMessage"));
		getCardDetailResponse.setSuccess(_ctx.booleanValue("GetCardDetailResponse.Success"));
		getCardDetailResponse.setLocalizedMessage(_ctx.stringValue("GetCardDetailResponse.LocalizedMessage"));

		Data data = new Data();

		VsimCardInfo vsimCardInfo = new VsimCardInfo();
		vsimCardInfo.setStatus(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Status"));
		vsimCardInfo.setDataType(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.DataType"));
		vsimCardInfo.setCardLimitSpeedThreshold(_ctx.integerValue("GetCardDetailResponse.Data.VsimCardInfo.CardLimitSpeedThreshold"));
		vsimCardInfo.setPeriodRestFlow(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.PeriodRestFlow"));
		vsimCardInfo.setDirectionalGroupName(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.DirectionalGroupName"));
		vsimCardInfo.setCredentialType(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.CredentialType"));
		vsimCardInfo.setPeriodAddFlow(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.PeriodAddFlow"));
		vsimCardInfo.setDirectionalGroupId(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.DirectionalGroupId"));
		vsimCardInfo.setPeriodSmsUse(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.PeriodSmsUse"));
		vsimCardInfo.setOsStatus(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.OsStatus"));
		vsimCardInfo.setNotifyId(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.NotifyId"));
		vsimCardInfo.setDataLevel(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.DataLevel"));
		vsimCardInfo.setAliyunOrderId(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.AliyunOrderId"));
		vsimCardInfo.setAliFee(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.AliFee"));
		vsimCardInfo.setActiveType(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.ActiveType"));
		vsimCardInfo.setIsAutoRecharge(_ctx.booleanValue("GetCardDetailResponse.Data.VsimCardInfo.IsAutoRecharge"));
		vsimCardInfo.setAutoLimitResume(_ctx.booleanValue("GetCardDetailResponse.Data.VsimCardInfo.AutoLimitResume"));
		vsimCardInfo.setCredentialInstanceId(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.CredentialInstanceId"));
		vsimCardInfo.setCredentialLimitSpeedThreshold(_ctx.integerValue("GetCardDetailResponse.Data.VsimCardInfo.CredentialLimitSpeedThreshold"));
		vsimCardInfo.setExpireTime(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.ExpireTime"));
		vsimCardInfo.setFlowThresholdUnit(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.FlowThresholdUnit"));
		vsimCardInfo.setApnName(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.ApnName"));
		vsimCardInfo.setActiveTime(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.ActiveTime"));
		vsimCardInfo.setCardLimitStopThreshold(_ctx.integerValue("GetCardDetailResponse.Data.VsimCardInfo.CardLimitStopThreshold"));
		vsimCardInfo.setIccid(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Iccid"));
		vsimCardInfo.setVendor(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Vendor"));
		vsimCardInfo.setPeriod(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Period"));
		vsimCardInfo.setPrivateNetworkSegment(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.PrivateNetworkSegment"));
		vsimCardInfo.setOpenAccountTime(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.OpenAccountTime"));
		vsimCardInfo.setCertifyType(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.CertifyType"));
		vsimCardInfo.setSimType(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.SimType"));
		vsimCardInfo.setCertifyStatus(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.CertifyStatus"));
		vsimCardInfo.setDeviceImei(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.DeviceImei"));
		vsimCardInfo.setVsimInstanceId(_ctx.integerValue("GetCardDetailResponse.Data.VsimCardInfo.VsimInstanceId"));
		vsimCardInfo.setAutoRebindReuse(_ctx.booleanValue("GetCardDetailResponse.Data.VsimCardInfo.AutoRebindReuse"));
		vsimCardInfo.setCredentialNo(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.CredentialNo"));
		vsimCardInfo.setCredentialLimitStopThreshold(_ctx.integerValue("GetCardDetailResponse.Data.VsimCardInfo.CredentialLimitStopThreshold"));
		vsimCardInfo.setOpenSms(_ctx.booleanValue("GetCardDetailResponse.Data.VsimCardInfo.OpenSms"));

		List<String> imsi1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCardDetailResponse.Data.VsimCardInfo.Imsi.Length"); i++) {
			imsi1.add(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Imsi["+ i +"]"));
		}
		vsimCardInfo.setImsi1(imsi1);

		List<String> msisdn2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCardDetailResponse.Data.VsimCardInfo.Msisdn.Length"); i++) {
			msisdn2.add(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Msisdn["+ i +"]"));
		}
		vsimCardInfo.setMsisdn2(msisdn2);

		List<String> ip3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCardDetailResponse.Data.VsimCardInfo.Ip.Length"); i++) {
			ip3.add(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.Ip["+ i +"]"));
		}
		vsimCardInfo.setIp3(ip3);

		List<TagDto> tagList = new ArrayList<TagDto>();
		for (int i = 0; i < _ctx.lengthValue("GetCardDetailResponse.Data.VsimCardInfo.TagList.Length"); i++) {
			TagDto tagDto = new TagDto();
			tagDto.setTagName(_ctx.stringValue("GetCardDetailResponse.Data.VsimCardInfo.TagList["+ i +"].TagName"));
			tagDto.setId(_ctx.longValue("GetCardDetailResponse.Data.VsimCardInfo.TagList["+ i +"].Id"));

			tagList.add(tagDto);
		}
		vsimCardInfo.setTagList(tagList);
		data.setVsimCardInfo(vsimCardInfo);

		List<CardInfo> listPsimCards = new ArrayList<CardInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetCardDetailResponse.Data.ListPsimCards.Length"); i++) {
			CardInfo cardInfo = new CardInfo();
			cardInfo.setStatus(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Status"));
			cardInfo.setPrivateNetworkSegment(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].PrivateNetworkSegment"));
			cardInfo.setOsStatus(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].OsStatus"));
			cardInfo.setCertifyStatus(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].CertifyStatus"));
			cardInfo.setApnName(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].ApnName"));
			cardInfo.setPeriodAddFlow(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].PeriodAddFlow"));
			cardInfo.setIccid(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Iccid"));
			cardInfo.setVendor(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Vendor"));
			cardInfo.setPeriodSmsUse(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].PeriodSmsUse"));
			cardInfo.setOpenSms(_ctx.booleanValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].OpenSms"));

			List<String> imsi = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Imsi.Length"); j++) {
				imsi.add(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Imsi["+ j +"]"));
			}
			cardInfo.setImsi(imsi);

			List<String> msisdn = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Msisdn.Length"); j++) {
				msisdn.add(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Msisdn["+ j +"]"));
			}
			cardInfo.setMsisdn(msisdn);

			List<String> ip = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Ip.Length"); j++) {
				ip.add(_ctx.stringValue("GetCardDetailResponse.Data.ListPsimCards["+ i +"].Ip["+ j +"]"));
			}
			cardInfo.setIp(ip);

			listPsimCards.add(cardInfo);
		}
		data.setListPsimCards(listPsimCards);
		getCardDetailResponse.setData(data);
	 
	 	return getCardDetailResponse;
	}
}