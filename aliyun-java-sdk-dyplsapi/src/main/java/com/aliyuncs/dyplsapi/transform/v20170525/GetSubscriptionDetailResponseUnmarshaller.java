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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.GetSubscriptionDetailResponse;
import com.aliyuncs.dyplsapi.model.v20170525.GetSubscriptionDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubscriptionDetailResponseUnmarshaller {

	public static GetSubscriptionDetailResponse unmarshall(GetSubscriptionDetailResponse getSubscriptionDetailResponse, UnmarshallerContext _ctx) {
		
		getSubscriptionDetailResponse.setRequestId(_ctx.stringValue("GetSubscriptionDetailResponse.RequestId"));
		getSubscriptionDetailResponse.setCode(_ctx.stringValue("GetSubscriptionDetailResponse.Code"));
		getSubscriptionDetailResponse.setMessage(_ctx.stringValue("GetSubscriptionDetailResponse.Message"));

		Data data = new Data();
		data.setSubsId(_ctx.longValue("GetSubscriptionDetailResponse.Data.SubsId"));
		data.setSecretNo(_ctx.stringValue("GetSubscriptionDetailResponse.Data.SecretNo"));
		data.setPhoneNo(_ctx.stringValue("GetSubscriptionDetailResponse.Data.PhoneNo"));
		data.setSwitchStatus(_ctx.integerValue("GetSubscriptionDetailResponse.Data.SwitchStatus"));
		data.setProvince(_ctx.stringValue("GetSubscriptionDetailResponse.Data.Province"));
		data.setCity(_ctx.stringValue("GetSubscriptionDetailResponse.Data.City"));
		data.setVendor(_ctx.stringValue("GetSubscriptionDetailResponse.Data.Vendor"));
		getSubscriptionDetailResponse.setData(data);
	 
	 	return getSubscriptionDetailResponse;
	}
}