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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.GetUserInfoResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetUserInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInfoResponseUnmarshaller {

	public static GetUserInfoResponse unmarshall(GetUserInfoResponse getUserInfoResponse, UnmarshallerContext _ctx) {
		
		getUserInfoResponse.setRequestId(_ctx.stringValue("GetUserInfoResponse.RequestId"));
		getUserInfoResponse.setSuccess(_ctx.booleanValue("GetUserInfoResponse.Success"));
		getUserInfoResponse.setCode(_ctx.stringValue("GetUserInfoResponse.Code"));
		getUserInfoResponse.setMessage(_ctx.stringValue("GetUserInfoResponse.Message"));

		Data data = new Data();
		data.setCurrentStatus(_ctx.integerValue("GetUserInfoResponse.Data.CurrentStatus"));
		data.setAccountType(_ctx.integerValue("GetUserInfoResponse.Data.AccountType"));
		data.setProductType(_ctx.stringValue("GetUserInfoResponse.Data.ProductType"));
		data.setShowNewbieTask(_ctx.booleanValue("GetUserInfoResponse.Data.ShowNewbieTask"));
		data.setPoc(_ctx.booleanValue("GetUserInfoResponse.Data.Poc"));
		data.setRoleName(_ctx.stringValue("GetUserInfoResponse.Data.RoleName"));
		data.setLoginUserType(_ctx.integerValue("GetUserInfoResponse.Data.LoginUserType"));
		getUserInfoResponse.setData(data);
	 
	 	return getUserInfoResponse;
	}
}