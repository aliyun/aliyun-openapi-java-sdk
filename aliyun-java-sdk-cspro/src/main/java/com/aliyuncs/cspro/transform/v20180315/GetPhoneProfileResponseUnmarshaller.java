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

import com.aliyuncs.cspro.model.v20180315.GetPhoneProfileResponse;
import com.aliyuncs.cspro.model.v20180315.GetPhoneProfileResponse.Data;
import com.aliyuncs.cspro.model.v20180315.GetPhoneProfileResponse.Data.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhoneProfileResponseUnmarshaller {

	public static GetPhoneProfileResponse unmarshall(GetPhoneProfileResponse getPhoneProfileResponse, UnmarshallerContext _ctx) {
		
		getPhoneProfileResponse.setRequestId(_ctx.stringValue("GetPhoneProfileResponse.RequestId"));
		getPhoneProfileResponse.setCode(_ctx.stringValue("GetPhoneProfileResponse.Code"));
		getPhoneProfileResponse.setMessage(_ctx.stringValue("GetPhoneProfileResponse.Message"));
		getPhoneProfileResponse.setSuccess(_ctx.booleanValue("GetPhoneProfileResponse.Success"));

		Data data = new Data();
		data.setPhone(_ctx.stringValue("GetPhoneProfileResponse.Data.Phone"));

		Info info = new Info();
		info.setIsVirtualOperator(_ctx.integerValue("GetPhoneProfileResponse.Data.Info.IsVirtualOperator"));
		info.setIsBlackPhone(_ctx.integerValue("GetPhoneProfileResponse.Data.Info.IsBlackPhone"));
		info.setIsBlackCampaign1d(_ctx.integerValue("GetPhoneProfileResponse.Data.Info.IsBlackCampaign1d"));
		info.setIsBlackCampaign7d(_ctx.integerValue("GetPhoneProfileResponse.Data.Info.IsBlackCampaign7d"));
		info.setIsBlackCampaign30d(_ctx.integerValue("GetPhoneProfileResponse.Data.Info.IsBlackCampaign30d"));
		info.setProvince(_ctx.stringValue("GetPhoneProfileResponse.Data.Info.Province"));
		info.setCity(_ctx.stringValue("GetPhoneProfileResponse.Data.Info.City"));
		info.setOperator(_ctx.stringValue("GetPhoneProfileResponse.Data.Info.Operator"));
		data.setInfo(info);
		getPhoneProfileResponse.setData(data);
	 
	 	return getPhoneProfileResponse;
	}
}