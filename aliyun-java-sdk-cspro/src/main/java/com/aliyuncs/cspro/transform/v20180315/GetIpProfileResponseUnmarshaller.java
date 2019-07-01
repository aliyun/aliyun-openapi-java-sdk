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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.GetIpProfileResponse;
import com.aliyuncs.cspro.model.v20180315.GetIpProfileResponse.Data;
import com.aliyuncs.cspro.model.v20180315.GetIpProfileResponse.Data.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIpProfileResponseUnmarshaller {

	public static GetIpProfileResponse unmarshall(GetIpProfileResponse getIpProfileResponse, UnmarshallerContext _ctx) {
		
		getIpProfileResponse.setRequestId(_ctx.stringValue("GetIpProfileResponse.RequestId"));
		getIpProfileResponse.setCode(_ctx.stringValue("GetIpProfileResponse.Code"));
		getIpProfileResponse.setMessage(_ctx.stringValue("GetIpProfileResponse.Message"));
		getIpProfileResponse.setSuccess(_ctx.booleanValue("GetIpProfileResponse.Success"));

		Data data = new Data();
		data.setIp(_ctx.stringValue("GetIpProfileResponse.Data.Ip"));

		Info info = new Info();
		info.setIsAbroad(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsAbroad"));
		info.setIsIdc(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsIdc"));
		info.setIsProxy(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsProxy"));
		info.setIsNat(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsNat"));
		info.setIsBase(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBase"));
		info.setIsTor(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsTor"));
		info.setIsBindDomain1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBindDomain1d"));
		info.setIsBindDomain7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBindDomain7d"));
		info.setIsBindDomain30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBindDomain30d"));
		info.setIsNetAttack1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsNetAttack1d"));
		info.setIsNetAttack7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsNetAttack7d"));
		info.setIsNetAttack30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsNetAttack30d"));
		info.setIsBotnet1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBotnet1d"));
		info.setIsBotnet7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBotnet7d"));
		info.setIsBotnet30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBotnet30d"));
		info.setIsC21d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsC21d"));
		info.setIsC27d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsC27d"));
		info.setIsC230d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsC230d"));
		info.setIsBlackCampaign1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBlackCampaign1d"));
		info.setIsBlackCampaign7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBlackCampaign7d"));
		info.setIsBlackCampaign30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsBlackCampaign30d"));
		info.setIsOpenCommonPort1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsOpenCommonPort1d"));
		info.setIsOpenCommonPort7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsOpenCommonPort7d"));
		info.setIsOpenCommonPort30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsOpenCommonPort30d"));
		info.setIsCheatflow1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsCheatflow1d"));
		info.setIsCheatflow7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsCheatflow7d"));
		info.setIsCheatflow30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsCheatflow30d"));
		info.setIsHijack1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsHijack1d"));
		info.setIsHijack7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsHijack7d"));
		info.setIsHijack30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsHijack30d"));
		info.setIsProxy1d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsProxy1d"));
		info.setIsProxy7d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsProxy7d"));
		info.setIsProxy30d(_ctx.integerValue("GetIpProfileResponse.Data.Info.IsProxy30d"));
		info.setCountry(_ctx.stringValue("GetIpProfileResponse.Data.Info.Country"));
		info.setProvince(_ctx.stringValue("GetIpProfileResponse.Data.Info.Province"));
		info.setCity(_ctx.stringValue("GetIpProfileResponse.Data.Info.City"));
		info.setIsp(_ctx.stringValue("GetIpProfileResponse.Data.Info.Isp"));
		info.setAsnId(_ctx.stringValue("GetIpProfileResponse.Data.Info.AsnId"));
		data.setInfo(info);
		getIpProfileResponse.setData(data);
	 
	 	return getIpProfileResponse;
	}
}