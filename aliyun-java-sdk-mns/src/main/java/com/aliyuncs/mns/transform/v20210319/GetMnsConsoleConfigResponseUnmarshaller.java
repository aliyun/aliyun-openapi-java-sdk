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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.GetMnsConsoleConfigResponse;
import com.aliyuncs.mns.model.v20210319.GetMnsConsoleConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMnsConsoleConfigResponseUnmarshaller {

	public static GetMnsConsoleConfigResponse unmarshall(GetMnsConsoleConfigResponse getMnsConsoleConfigResponse, UnmarshallerContext _ctx) {
		
		getMnsConsoleConfigResponse.setRequestId(_ctx.stringValue("GetMnsConsoleConfigResponse.RequestId"));
		getMnsConsoleConfigResponse.setCode(_ctx.longValue("GetMnsConsoleConfigResponse.Code"));
		getMnsConsoleConfigResponse.setStatus(_ctx.stringValue("GetMnsConsoleConfigResponse.Status"));
		getMnsConsoleConfigResponse.setMessage(_ctx.stringValue("GetMnsConsoleConfigResponse.Message"));
		getMnsConsoleConfigResponse.setSuccess(_ctx.booleanValue("GetMnsConsoleConfigResponse.Success"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.UserId"));
		data.setBid(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.Bid"));
		data.setIsJst(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.IsJst"));
		data.setIsJbp(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.IsJbp"));
		data.setLoginLink(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.LoginLink"));
		data.setACCOUNT_PROFILE_URL(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.ACCOUNT_PROFILE_URL"));
		data.setBuyUrl(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.BuyUrl"));
		data.setBuyUrlEn(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.BuyUrlEn"));
		data.setBuyOSSUrl(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.BuyOSSUrl"));
		data.setBuyRAMUrl(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.BuyRAMUrl"));
		data.setBuySLSUrl(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.BuySLSUrl"));
		data.setMnsDescUrl(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.MnsDescUrl"));
		data.setMnsDescUrlEn(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.MnsDescUrlEn"));
		data.setMnsDescUrlJp(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.MnsDescUrlJp"));
		data.setAkUrl(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.AkUrl"));
		data.setIsChineseUser(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.IsChineseUser"));
		data.setIsJapanSite(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.IsJapanSite"));
		data.setHasPretendPermission(_ctx.booleanValue("GetMnsConsoleConfigResponse.Data.HasPretendPermission"));
		data.setPretendedUserId(_ctx.stringValue("GetMnsConsoleConfigResponse.Data.pretendedUserId"));
		getMnsConsoleConfigResponse.setData(data);
	 
	 	return getMnsConsoleConfigResponse;
	}
}