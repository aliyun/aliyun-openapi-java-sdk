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
package com.aliyuncs.sas_api.transform.v20170705;

import com.aliyuncs.sas_api.model.v20170705.GetAccountProfileResponse;
import com.aliyuncs.sas_api.model.v20170705.GetAccountProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountProfileResponseUnmarshaller {

	public static GetAccountProfileResponse unmarshall(GetAccountProfileResponse getAccountProfileResponse, UnmarshallerContext context) {
		
		getAccountProfileResponse.setRequestId(context.stringValue("GetAccountProfileResponse.RequestId"));
		getAccountProfileResponse.setCode(context.integerValue("GetAccountProfileResponse.Code"));
		getAccountProfileResponse.setMessage(context.stringValue("GetAccountProfileResponse.Message"));
		getAccountProfileResponse.setSuccess(context.booleanValue("GetAccountProfileResponse.Success"));

		Data data = new Data();
		data.setIp(context.stringValue("GetAccountProfileResponse.Data.Ip"));
		data.setPhone(context.stringValue("GetAccountProfileResponse.Data.Phone"));
		data.setIpInfo(context.stringValue("GetAccountProfileResponse.Data.IpInfo"));
		data.setPhoneInfo(context.stringValue("GetAccountProfileResponse.Data.PhoneInfo"));
		getAccountProfileResponse.setData(data);
	 
	 	return getAccountProfileResponse;
	}
}