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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.GetCMSIdByForeignIdResponse;
import com.aliyuncs.scsp.model.v20200702.GetCMSIdByForeignIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCMSIdByForeignIdResponseUnmarshaller {

	public static GetCMSIdByForeignIdResponse unmarshall(GetCMSIdByForeignIdResponse getCMSIdByForeignIdResponse, UnmarshallerContext _ctx) {
		
		getCMSIdByForeignIdResponse.setRequestId(_ctx.stringValue("GetCMSIdByForeignIdResponse.RequestId"));
		getCMSIdByForeignIdResponse.setMessage(_ctx.stringValue("GetCMSIdByForeignIdResponse.Message"));
		getCMSIdByForeignIdResponse.setCode(_ctx.stringValue("GetCMSIdByForeignIdResponse.Code"));
		getCMSIdByForeignIdResponse.setSuccess(_ctx.booleanValue("GetCMSIdByForeignIdResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetCMSIdByForeignIdResponse.Data.Status"));
		data.setPhone(_ctx.stringValue("GetCMSIdByForeignIdResponse.Data.Phone"));
		data.setNick(_ctx.stringValue("GetCMSIdByForeignIdResponse.Data.Nick"));
		data.setUserId(_ctx.stringValue("GetCMSIdByForeignIdResponse.Data.UserId"));
		data.setAnonymity(_ctx.booleanValue("GetCMSIdByForeignIdResponse.Data.Anonymity"));
		data.setCustomerTypeId(_ctx.integerValue("GetCMSIdByForeignIdResponse.Data.CustomerTypeId"));
		data.setGender(_ctx.stringValue("GetCMSIdByForeignIdResponse.Data.Gender"));
		data.setAvatar(_ctx.stringValue("GetCMSIdByForeignIdResponse.Data.Avatar"));
		data.setForeignId(_ctx.stringValue("GetCMSIdByForeignIdResponse.Data.ForeignId"));
		getCMSIdByForeignIdResponse.setData(data);
	 
	 	return getCMSIdByForeignIdResponse;
	}
}